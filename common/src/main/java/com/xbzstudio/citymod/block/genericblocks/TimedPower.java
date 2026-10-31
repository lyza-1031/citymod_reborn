package com.xbzstudio.citymod.block.genericblocks;

import com.xbzstudio.citymod.block.TooltipBlock;

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

public class TimedPower extends Block implements SimpleWaterloggedBlock, TooltipBlock {
    public static final Property<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty FLASHING = BooleanProperty.create("flashing");

    private final Map<Direction, VoxelShape> shapesOff;
    private final Map<Direction, VoxelShape> shapesOn;
    private final String tooltipKey;

    public TimedPower(Identifier id,Map<Direction, VoxelShape> shapesOff, Map<Direction, VoxelShape> shapesOn, String tooltipKey) {
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
        this.tooltipKey = tooltipKey;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false)
                .setValue(POWERED, false)
                .setValue(FLASHING, false));
    }

    public TimedPower(Identifier id,Map<Direction, VoxelShape> shapes) {
        this(id,shapes, shapes, null);
    }

    public TimedPower(Identifier id,Map<Direction, VoxelShape> shapes, String tooltipKey) {
        this(id,shapes, shapes, tooltipKey);
    }

    public TimedPower(Identifier id,Map<Direction, VoxelShape> shapesOff, Map<Direction, VoxelShape> shapesOn) {
        this(id,shapesOff, shapesOn, null);
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

        // 时间参数 (单位：tick，20 tick = 1秒)
        long GREEN_TIME = 27 * 20;
        long YELLOW_TIME = 3 * 20;
        long HALF_CYCLE = GREEN_TIME + YELLOW_TIME;
        long CYCLE = HALF_CYCLE * 2;

        long cyclePos = gameTime % CYCLE;

        boolean shouldBePowered = false;
        boolean shouldBeFlashing = false;

        boolean isEW = (state.getValue(FACING) == Direction.EAST || state.getValue(FACING) == Direction.WEST);
        if (cyclePos < GREEN_TIME) {
            shouldBePowered = isEW;
        }
        else if (cyclePos < HALF_CYCLE) {
            if (isEW) {
                shouldBePowered = false;
                shouldBeFlashing = true;
            } else {
                shouldBePowered = false;
            }
        }
        else if (cyclePos < HALF_CYCLE + GREEN_TIME) {
            shouldBePowered = !isEW;
        }
        else {
            if (!isEW) {
                shouldBePowered = false;
                shouldBeFlashing = true;
            } else {
                shouldBePowered = false;
            }
        }

        if (state.getValue(POWERED) != shouldBePowered || state.getValue(FLASHING) != shouldBeFlashing) {
            level.setBlock(pos, state.setValue(POWERED, shouldBePowered).setValue(FLASHING, shouldBeFlashing), Block.UPDATE_ALL);
        }

        level.scheduleTick(pos, this, 20);
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

    @Override
    public String getTooltipKey() {
        return tooltipKey;
    }
}