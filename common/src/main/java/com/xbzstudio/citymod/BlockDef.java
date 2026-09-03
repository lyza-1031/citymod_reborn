package com.xbzstudio.citymod;

import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class BlockDef {
    private final String id;
    private final Supplier<Block> factory;

    public BlockDef(String id, Supplier<Block> factory) {
        this.id = id;
        this.factory = factory;
    }

    public String id() { return id; }
    public Supplier<Block> factory() { return factory; }
}