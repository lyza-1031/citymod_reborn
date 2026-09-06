package com.xbzstudio.citymod;

import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public record BlockDef(String id, Supplier<Block> factory, String tooltipKey) {
    public BlockDef(String id, Supplier<Block> factory) {
        this(id, factory, null);
    }
}