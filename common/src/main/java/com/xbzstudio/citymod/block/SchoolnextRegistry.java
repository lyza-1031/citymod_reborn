package com.xbzstudio.citymod.block;

import com.xbzstudio.citymod.BlockDef;
import com.xbzstudio.citymod.block.genericblocks.*;
import com.xbzstudio.citymod.block.shapes.*;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.phys.shapes.Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class SchoolnextRegistry {
//中国式学校合并预留
    public static final List<BlockDef> BLOCKS = new ArrayList<>();

    static {
        Schoolreg("schooltestblock", () -> new GenericSignBlock(BlockShapes.DEFAULT,"tooltip.citymod.schoolcompat"));
    }
    private static void Schoolreg(String id, Supplier<Block> factory) {
        BLOCKS.add(new BlockDef("schoolnext", id, factory, null));
    }
}