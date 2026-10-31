package com.xbzstudio.citymod.block.genericblocks;

import com.xbzstudio.citymod.block.TooltipBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GenericDirectionBlock extends Block implements TooltipBlock {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.FACING;

    private final String tooltipKey;

    public GenericDirectionBlock(Identifier id) {
        this(id, null);
    }

    public GenericDirectionBlock(Identifier id, String tooltipKey) {
        super(Properties.of()
                .mapColor(MapColor.STONE)
                .sound(SoundType.METAL)
                .strength(1f, 1f)
                .noOcclusion()
                .setId(ResourceKey.create(Registries.BLOCK, id))
        );
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
        this.tooltipKey = tooltipKey;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.block();
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.block();
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Shapes.block();
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getClickedFace().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
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