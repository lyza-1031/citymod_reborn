package com.xbzstudio.citymod;

import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class BlockDef {
    private final String id;
    private final Function<Identifier, ? extends Block> factory;

    public BlockDef(String id, Function<Identifier, ? extends Block> factory) {
        this.id = id;
        this.factory = factory;
    }

    public String id() { return id; }
    public Function<Identifier, ? extends Block> factory() { return factory; }
}