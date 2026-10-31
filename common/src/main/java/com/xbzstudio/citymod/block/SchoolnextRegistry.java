package com.xbzstudio.citymod.block;

import com.xbzstudio.citymod.BlockDef;
import com.xbzstudio.citymod.block.genericblocks.*;
import com.xbzstudio.citymod.block.shapes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SchoolnextRegistry {
//中国式学校合并预留
    public static final List<BlockDef> BLOCKS = new ArrayList<>();

    static {
        Schoolreg("schooltestblock", (id) -> new GenericSignBlock(id, BlockShapes.DEFAULT));
    }

    private static void Schoolreg(String id, Function<Identifier, ? extends Block> factory) {
        BLOCKS.add(new BlockDef(id, factory));
    }
}
