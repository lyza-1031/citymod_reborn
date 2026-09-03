package com.xbzstudio.citymod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import java.util.Map;

public class TimedPower extends Block implements SimpleWaterloggedBlock {
    public static final Property<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty FLASHING = BooleanProperty.create("flashing");

    private final Map<Direction, VoxelShape> shapesOff;
    private final Map<Direction, VoxelShape> shapesOn;

    public TimedPower(Identifier id,Map<Direction, VoxelShape> shapesOff, Map<Direction, VoxelShape> shapesOn) {
        super(Properties.of()
                .mapColor(MapColor.METAL)
                .sound(SoundType.METAL)
                .strength(1f, 1f)
                .lightLevel(state -> 15)
                .noOcclusion()
                .randomTicks()
                .isRedstoneConductor((bs, br, bp) -> false)
                .isSuffocating((bs, br, bp) -> false)
                .isViewBlocking((bs, br, bp) -> false)
                .setId(ResourceKey.create(Registries.BLOCK, id)));
        this.shapesOff = shapesOff;
        this.shapesOn = shapesOn;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false)
                .setValue(POWERED, false)
                .setValue(FLASHING, false));
    }

    public TimedPower(Identifier id,Map<Direction, VoxelShape> shapes) {
        this(id,shapes, shapes);
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

    public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }


    @Override
    public BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess tickAccess,
                                  BlockPos pos, Direction direction, BlockPos neighborPos,
                                  BlockState neighborState, RandomSource random) {
        if (state.getValue(WATERLOGGED)) {
            tickAccess.scheduleTick(pos, Fluids.WATER, 5);
        }
        return super.updateShape(state, level, tickAccess, pos, direction, neighborPos, neighborState, random);
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