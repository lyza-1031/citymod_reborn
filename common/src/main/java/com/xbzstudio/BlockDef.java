package com.xbzstudio;

import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public record BlockDef(String id, Supplier<? extends Block> factory) {}