package com.xbzstudio.citymod.block.genericblocks;

import com.xbzstudio.citymod.block.TooltipBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GenericNormalBlock extends Block implements TooltipBlock {
    private final String tooltipKey;

    public GenericNormalBlock(Identifier id) {
        this(id, null);
    }

    public GenericNormalBlock(Identifier id, String tooltipKey) {
        super(Properties.of()
                .mapColor(MapColor.STONE)
                .sound(SoundType.STONE)
                .strength(1f, 1f)
                .setId(ResourceKey.create(Registries.BLOCK, id)));
        this.tooltipKey = tooltipKey;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public float getShadeBrightness(BlockState state, BlockGetter world, BlockPos pos) {
        return 1.0F;
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter world, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    @Override
    public String getTooltipKey() {
        return tooltipKey;
    }
}
