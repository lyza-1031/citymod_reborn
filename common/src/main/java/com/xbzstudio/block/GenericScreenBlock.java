package com.xbzstudio.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class GenericScreenBlock extends Block implements SimpleWaterloggedBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    private final Map<Direction, VoxelShape> shapes;

    public GenericScreenBlock(Map<Direction, VoxelShape> shapes) {
        super(Properties.of()
                .mapColor(MapColor.STONE)
                .sound(SoundType.METAL)
                .strength(1f, 1f)
                .noOcclusion()
                .lightLevel(state -> state.getValue(POWERED) ? 12 : 0)  // 发光等级设置
                .isRedstoneConductor((bs, br, bp) -> false)
                .isSuffocating((bs, br, bp) -> false)
                .isViewBlocking((bs, br, bp) -> false));
        this.shapes = shapes;
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false)
                .setValue(POWERED, false));  // 默认关闭
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return shapes.getOrDefault(state.getValue(FACING), Shapes.empty());
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
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
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER)
                .setValue(POWERED, false);  // 放置时默认关闭
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState,
                                  LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
    }

    // 添加红石交互方法
    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (world.isClientSide()) {
            return;
        }

        boolean hasPower = world.hasNeighborSignal(pos);
        if (hasPower != state.getValue(POWERED)) {
            world.setBlock(pos, state.setValue(POWERED, hasPower), 3);
        }
    }

    @Override
    public void onPlace(BlockState state, Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        if (!oldState.is(state.getBlock())) {
            boolean hasPower = world.hasNeighborSignal(pos);
            if (hasPower != state.getValue(POWERED)) {
                world.setBlock(pos, state.setValue(POWERED, hasPower), 3);
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, POWERED);  // 添加 POWERED
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