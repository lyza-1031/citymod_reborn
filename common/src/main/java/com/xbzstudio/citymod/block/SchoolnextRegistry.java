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
        Schoolreg("black_board",() -> new GenericSignBlock(BlockShapes.EXPR));
        Schoolreg("light",() -> new GenericLightBlock(BlockShapes.TOPLAMPS));
        Schoolreg("electronic_whiteboard",() -> new Power(BlockShapes.ROADSCREEN,true));
        Schoolreg("electronic_whiteboard_power_on",() -> new GenericLightBlock(BlockShapes.ROADSCREEN));
        Schoolreg("loud_speaker",() -> new GenericMetalBlock(CityShapes.Fireextinguisherbox));
        Schoolreg("desk",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("projector",() -> new GenericSignBlock(BlockShapes.DEFAULT));
        Schoolreg("chair",() -> new GenericChairBlock(BlockShapes.DEFAULT,0.4));
        Schoolreg("redflag",() -> new GenericSignBlock(BlockShapes.FREESIGN));
        Schoolreg("text_a",() -> new GenericSignBlock(BlockShapes.FREESIGN));
        Schoolreg("text_b",() -> new GenericSignBlock(BlockShapes.FREESIGN));
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
        Schoolreg("air_condition_inside",() -> new Power(ApplianceShapes.AC_04,false));
        Schoolreg("slant_air_condition",() -> new Power(ApplianceShapes.AC_04,false));
        Schoolreg("air_condition_outside",() -> new GenericMetalBlock(ApplianceShapes.AC_OUT_06));
        //线路管道
        Schoolreg("pipe",() -> new GenericSignBlock(ApplianceShapes.PIPE));
        Schoolreg("pipe_b",() -> new GenericSignBlock(ApplianceShapes.PIPE_B));
        Schoolreg("pipe_c",() -> new GenericSignBlock(ApplianceShapes.PIPE_C));
        Schoolreg("pipe_d",() -> new GenericSignBlock(ApplianceShapes.PIPE_D));
        Schoolreg("pipe_e",() -> new GenericSignBlock(ApplianceShapes.PIPE));
        //栅栏
        Schoolreg("ironfence",() -> new GenericMetalBlock(CityShapes.IRONFENCE));
        Schoolreg("tall_iron_fence",() -> new GenericMetalBlock(CityShapes.TALL_IRON_FENCE));
        Schoolreg("slabfence",() -> new GenericMetalBlock(CityShapes.SLABFENCE));
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
        //高墙
        Schoolreg("tall_wall",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tall_wall_light_blue",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_black",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_blue",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_brown",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_cyan",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_dark_blue",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_gray",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_green",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_light_gray",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_lime",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_magenta",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_orange",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_pink",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_purple",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_red",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("tallwall_yellow",() -> new GenericSignBlock(CityShapes.TALL_WALL));
        Schoolreg("wall_corner",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_light_blue",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_black",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_blue",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_brown",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_cyan",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_dark_blue",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_gray",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_green",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_light_gray",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_lime",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_magenta",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_orange",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_pink",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_purple",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_red",() -> new GenericSignBlock(CityShapes.wall_corner));
        Schoolreg("wall_corner_yellow",() -> new GenericSignBlock(CityShapes.wall_corner));
        //其他
        Schoolreg("error",() -> new GenericLightBlock(BlockShapes.DEFAULT,"tooltip.citymod.source"));
    }
    private static void Schoolreg(String id, Supplier<Block> factory) {
        BLOCKS.add(new BlockDef("schoolnext", id, factory, null));
    }
}