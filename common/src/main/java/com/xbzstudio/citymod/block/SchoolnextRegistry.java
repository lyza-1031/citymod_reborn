package com.xbzstudio.citymod.block;

import com.xbzstudio.citymod.BlockDef;
import com.xbzstudio.citymod.block.genericblocks.*;
import com.xbzstudio.citymod.block.shapes.*;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SchoolnextRegistry {
//中国式学校合并预留
    public static final List<BlockDef> BLOCKS = new ArrayList<>();

    static {
        Schoolreg("schooltestblock", () -> new GenericSignBlock(BlockShapes.DEFAULT,"tooltip.citymod.schoolcompat"));
    }

    private static void Schoolreg(String id, Supplier<Block> factory) {
        BLOCKS.add(new BlockDef(id, factory));
    }
}
