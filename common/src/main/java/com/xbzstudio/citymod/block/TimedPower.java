package com.xbzstudio.citymod.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.*;

import java.util.List;
import java.util.Map;

public class TimedPower extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty FLASHING = BooleanProperty.create("flashing");

    private final Map<Direction, VoxelShape> shapesOff;
    private final Map<Direction, VoxelShape> shapesOn;
    private final String tooltipKey;

    public TimedPower(Map<Direction, VoxelShape> shapes, String tooltipKey) {
        this(shapes, shapes, tooltipKey);
    }
    public TimedPower(Map<Direction, VoxelShape> shapesOff, Map<Direction, VoxelShape> shapesOn, String tooltipKey) {
        super(BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .sound(SoundType.METAL)
                .strength(1f, 1f)
                .lightLevel(state -> 15)
                .hasPostProcess((state, world, pos) -> state.getValue(POWERED) || state.getValue(FLASHING))
                .noOcclusion()
                .randomTicks()
                .isRedstoneConductor((bs, br, bp) -> false)
                .isSuffocating((bs, br, bp) -> false)
                .isViewBlocking((bs, br, bp) -> false));
        this.shapesOff = shapesOff;
        this.shapesOn = shapesOn;
        this.tooltipKey = tooltipKey;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false)
                .setValue(POWERED, false)
                .setValue(FLASHING, false));
    }

    @Override
    public void appendHoverText(ItemStack stack, BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
        if (tooltipKey != null && !tooltipKey.isEmpty()) {
            tooltip.add(Component.translatable(tooltipKey).withStyle(ChatFormatting.GRAY));
        }
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Map<Direction, VoxelShape> shapes = state.getValue(POWERED) || state.getValue(FLASHING) ? shapesOn : shapesOff;
        return shapes.getOrDefault(state.getValue(FACING), Shapes.empty());
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluid = context.getLevel().getFluidState(context.getClickedPos());
        Direction facing = context.getHorizontalDirection().getOpposite();
        Level level = context.getLevel();
        boolean powered;
        if (!level.isClientSide()) {
            long phase = (level.getGameTime() / 600) % 2;
            powered = (facing == Direction.EAST || facing == Direction.WEST) ^ (phase == 1);
        } else {
            powered = (facing == Direction.EAST || facing == Direction.WEST);
        }
        return this.defaultBlockState()
                .setValue(FACING, facing)
                .setValue(WATERLOGGED, fluid.getType() == Fluids.WATER)
                .setValue(POWERED, powered)
                .setValue(FLASHING, false);
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean moved) {
        if (!level.isClientSide() && oldState.isAir()) {
            level.scheduleTick(pos, this, 2);
        }
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        long gameTime = level.getGameTime();
        long phase = (gameTime / 600) % 2;
        boolean shouldBePowered = (state.getValue(FACING) == Direction.EAST ||
                state.getValue(FACING) == Direction.WEST) ^ (phase == 1);

        if (state.getValue(FLASHING)) {
            level.setBlock(pos, state.setValue(FLASHING, false).setValue(POWERED, shouldBePowered),
                    Block.UPDATE_ALL);
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        } else if (state.getValue(POWERED) && !shouldBePowered) {
            level.setBlock(pos, state.setValue(FLASHING, true).setValue(POWERED, false),
                    Block.UPDATE_ALL);
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
            level.scheduleTick(pos, this, 60);
            return;
        } else if (!state.getValue(POWERED) && shouldBePowered) {
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
            level.setBlock(pos, state.setValue(POWERED, true), Block.UPDATE_ALL);
        }

        long remainder = gameTime % 600;
        int next = (int) (600 - remainder);
        if (next <= 0) next = 600;
        level.scheduleTick(pos, this, next);
    }
    @Override
    public float getShadeBrightness(BlockState state, BlockGetter world, BlockPos pos) {
        return 1.0F;
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }


    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, POWERED, FLASHING);
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
}