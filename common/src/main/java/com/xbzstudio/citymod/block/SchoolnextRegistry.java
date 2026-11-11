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
        Schoolreg("computer",() -> new Power(ApplianceShapes.Old_Monitor,true));
        Schoolreg("computer_power_on",() -> new GenericLightBlock(ApplianceShapes.Old_Monitor));
        Schoolreg("main_unit",() -> new GenericMetalBlock(ApplianceShapes.OLD_MAINUNIT));
        Schoolreg("white_board",() -> new GenericSignBlock(BlockShapes.ROADSCREEN));
        Schoolreg("electronic_whiteboard",() -> new Power(BlockShapes.ROADSCREEN,true));
        Schoolreg("electronic_whiteboard_power_on",() -> new GenericLightBlock(BlockShapes.ROADSCREEN));
        Schoolreg("loud_speaker",() -> new GenericMetalBlock(CityShapes.Fireextinguisherbox));
        Schoolreg("desk",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("chair",() -> new GenericChairBlock(BlockShapes.DEFAULT,0.4));
        Schoolreg("redflag",() -> new GenericSignBlock(BlockShapes.FREESIGN));
        Schoolreg("blackflag",() -> new GenericSignBlock(BlockShapes.FREESIGN));
        Schoolreg("certificate_of_merit",() -> new GenericSignBlock(BlockShapes.FREESIGN));
        Schoolreg("bulletin_board",() -> new GenericSignBlock(PostShapes.Post43));
        Schoolreg("code_for_students",() -> new GenericSignBlock(CityShapes.Direction_Sign));
        Schoolreg("visual_acuity_chart",() -> new GenericSignBlock(CityShapes.Direction_Sign));
        Schoolreg("podium",() -> new GenericMetalBlock(ApplianceShapes.PODIUM));
        Schoolreg("red_music_chair",() -> new GenericChairBlock(BlockShapes.DEFAULT,0.5));
        Schoolreg("orange_music_chair",() -> new GenericChairBlock(BlockShapes.DEFAULT,0.5));
        Schoolreg("yellow_music_chair",() -> new GenericChairBlock(BlockShapes.DEFAULT,0.5));
        Schoolreg("green_music_chair",() -> new GenericChairBlock(BlockShapes.DEFAULT,0.5));
        Schoolreg("blue_music_chair",() -> new GenericChairBlock(BlockShapes.DEFAULT,0.5));
        //瓷砖
        Schoolreg("tile",GenericNormalBlock::new);
        Schoolreg("tile_2",GenericNormalBlock::new);
        Schoolreg("tile_3",GenericNormalBlock::new);
        Schoolreg("tile_4",GenericNormalBlock::new);
        Schoolreg("tile_5",GenericNormalBlock::new);
        Schoolreg("black_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("blueconcretewall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("green_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("yellow_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("orange_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("cyan_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("dark_blue_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("brown_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("gray_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("light_gray_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("light_blue_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("lime_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("magenta_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("red_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("pink_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("purple_concrete_wall",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        //其他
        Schoolreg("error",() -> new GenericLightBlock(BlockShapes.DEFAULT,"tooltip.citymod.source"));
    }
    private static void Schoolreg(String id, Supplier<Block> factory) {
        BLOCKS.add(new BlockDef("schoolnext", id, factory, null));
    }
}