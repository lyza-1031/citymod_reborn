package com.xbzstudio.citymod.block.genericblocks;

import com.xbzstudio.citymod.block.TooltipBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class GenericSlabBlock extends SlabBlock implements TooltipBlock {
    private final String tooltipKey;

    public GenericSlabBlock(Identifier id) {
        this(id, null);
    }

    public GenericSlabBlock(Identifier id, String tooltipKey) {
        super(Properties.of()
                .mapColor(MapColor.STONE)
                .sound(SoundType.STONE)
                .strength(1f, 10f)
                .noOcclusion()
                .setId(ResourceKey.create(Registries.BLOCK, id)));
        this.tooltipKey = tooltipKey;
    }

    @Override
    public String getTooltipKey() {
        return tooltipKey;
    }
}
