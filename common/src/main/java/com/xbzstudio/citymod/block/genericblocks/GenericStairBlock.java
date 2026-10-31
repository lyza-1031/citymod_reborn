package com.xbzstudio.citymod.block.genericblocks;

import com.xbzstudio.citymod.block.TooltipBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GenericStairBlock extends StairBlock implements TooltipBlock {
    private final String tooltipKey;

    public GenericStairBlock(Identifier id, BlockState baseState) {
        this(id, baseState, null);
    }

    public GenericStairBlock(Identifier id, BlockState baseState, String tooltipKey) {
        super(baseState, Properties.of()
                .mapColor(baseState.getMapColor(null, null))
                .sound(SoundType.STONE)
                .strength(1f, 10f)
                .noOcclusion()
                .isRedstoneConductor((bs, br, bp) -> false)
                .setId(ResourceKey.create(Registries.BLOCK, id)));
        this.tooltipKey = tooltipKey;
    }

    @Override
    public String getTooltipKey() {
        return tooltipKey;
    }
}
