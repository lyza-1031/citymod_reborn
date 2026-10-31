package com.xbzstudio.citymod.block;

import com.xbzstudio.citymod.BlockDef;
import com.xbzstudio.citymod.block.genericblocks.*;
import com.xbzstudio.citymod.block.shapes.*;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.phys.shapes.Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

public class BlockRegistry {

    public static final List<BlockDef> BLOCKS = new ArrayList<>();

    static {
        // ==================== 路牌 ====================
        reg("expr_1", (id) -> new GenericSignBlock(id,BlockShapes.EXPR));
        reg("expr_2", (id) -> new GenericSignBlock(id,BlockShapes.EXPR));
        reg("expr_3", (id) -> new GenericSignBlock(id,BlockShapes.EXPR));
        reg("expr_4", (id) -> new GenericSignBlock(id,BlockShapes.EXPR));
        reg("expr_5", (id) -> new GenericSignBlock(id,BlockShapes.EXPR));
        reg("expr_5a", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_S));
        reg("expr_5b", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_S));
        reg("expr_5c", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_S));
        reg("expr_5_d", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_S));
        reg("expr_5_e", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_S));
        reg("expr_5_f", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_S));
        reg("service_area_sign", (id) -> new GenericSignBlock(id,BlockShapes.SERVICE_AREA_SIGN));
        reg("overpass_sign", (id) -> new GenericSignBlock(id,BlockShapes.OVERPASS_SIGN));
        reg("overpass_sign_2", (id) -> new GenericSignBlock(id,BlockShapes.OVERPASS_SIGN_2));
        reg("overpass_sign_3", (id) -> new GenericSignBlock(id,BlockShapes.OVERPASS_SIGN_3));
        reg("over_pass_sign_4", (id) -> new GenericSignBlock(id,BlockShapes.OVER_PASS_SIGN_4));
        reg("over_pass_5", (id) -> new GenericSignBlock(id,BlockShapes.OVER_PASS_5));
        reg("road_1", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_1));
        reg("road_2", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_2));
        reg("road_3", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_3));
        reg("road_4", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_4));
        reg("road_5", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_5));
        reg("road_6", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_6));
        reg("road_11", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_11));
        reg("road_12", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_12));
        reg("expr_sign_large", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_SIGN_LARGE, "tooltip.citymod.tall"));
        reg("expressway_exit_sign", (id) -> new GenericSignBlock(id,BlockShapes.EXPRESSWAY_EXIT_SIGN));
        reg("expr_t_ips", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_T_IPS));
        reg("traffic_sign", (id) -> new GenericSignBlock(id,BlockShapes.TRAFFIC_SIGN));
        reg("traffic_sign_l", (id) -> new GenericSignBlock(id,BlockShapes.TRAFFIC_SIGN_L));
        reg("traffic_sign_r", (id) -> new GenericSignBlock(id,BlockShapes.TRAFFIC_SIGN_R));
        reg("traffic_sign_t", (id) -> new GenericSignBlock(id,BlockShapes.TRAFFIC_SIGN_T));
        reg("traffic_sign_1", (id) -> new GenericSignBlock(id,BlockShapes.TRAFFIC_SIGN_1));
        reg("traffic_sign_2", (id) -> new GenericSignBlock(id,BlockShapes.TRAFFIC_SIGN_2));
        reg("yellow_sign_2", (id) -> new GenericSignBlock(id,BlockShapes.YELLOW_SIGN_2));
        reg("road_screen", (id) -> new GenericSignBlock(id,BlockShapes.ROADSCREEN));
        reg("free_road_sign", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("free_expressway_sign", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("scenic_spot_sign", (id) -> new GenericSignBlock(id,BlockShapes.EXPR));
        reg("sign", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("left_sign", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("right_sign", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("pedestrians", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("parking", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("noparking_sign", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("white_sign", (id) -> new GenericSignBlock(id,BlockShapes.Hsign));
        reg("green_sign", (id) -> new GenericSignBlock(id,BlockShapes.Hsign));
        reg("yellow_sign", (id) -> new GenericSignBlock(id,CityShapes.Direction_Sign));
        reg("orangesign", (id) -> new GenericSignBlock(id,CityShapes.Direction_Sign));
        reg("orangesign_2", (id) -> new GenericSignBlock(id,BlockShapes.YELLOW_SIGN_2));
        reg("mediumsign_green", (id) -> new GenericSignBlock(id,BlockShapes.MediumSign));
        reg("mediumsign_blue", (id) -> new GenericSignBlock(id,BlockShapes.MediumSign));
        reg("mediumsign_white", (id) -> new GenericSignBlock(id,BlockShapes.MediumSign));
        reg("mediumsign_yellow", (id) -> new GenericSignBlock(id,BlockShapes.MediumSign));
        reg("mediumsign_orange", (id) -> new GenericSignBlock(id,BlockShapes.MediumSign));
        reg("sign_mini_green", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("sign_mini_blue", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("sign_mini_white", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("sign_mini_yellow", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("sign_mini_orange", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("sign_mini_red", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("white_sign2", (id) -> new GenericSignBlock(id,BlockShapes.YELLOW_SIGN_2));
        reg("expr_5g", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_S));
        reg("bluesign", (id) -> new GenericSignBlock(id,CityShapes.Direction_Sign));
        reg("greensign2", (id) -> new GenericSignBlock(id,CityShapes.Direction_Sign));
        reg("whitesign3", (id) -> new GenericSignBlock(id,CityShapes.Direction_Sign));
        reg("expressway_fence", (id) -> new GenericSignBlock(id,BlockShapes.ExprFence));
        reg("expressway_fence_green", (id) -> new GenericSignBlock(id,BlockShapes.ExprFence));
        reg("expressway_fence_joint", (id) -> new GenericSignBlock(id,BlockShapes.ExprFenceJ));
        reg("expressway_fence_green_joint", (id) -> new GenericSignBlock(id,BlockShapes.ExprFenceJ));
        reg("vehicle_dstance_confirmation_sign", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("vehicle_distance_confirmation_sign_b", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("vehicle_distance_confirmation_sign_c", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("tunnel_sign_1", (id) -> new GenericLightBlock(id,BlockShapes.DEFAULT));
        reg("tunnel_sign_2", (id) -> new GenericLightBlock(id,BlockShapes.DEFAULT));
        reg("tollgate_sign", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_4));
        reg("road_8", (id) -> new GenericSignBlock(id,BlockShapes.ROAD_4));
        reg("stone_ball", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("expresswayfence2", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("expresswayfence2_r", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("median_strip_1", (id) -> new GenericSignBlock(id,BlockShapes.Median_Strip_1));
        //消防
        reg("fireextinguisherbox", (id) -> new GenericMetalBlock(id,CityShapes.Fireextinguisherbox));
        reg("water_tank", (id) -> new GenericSignBlock(id,CityShapes.Concretebarrierfenced));
        reg("nozzle_1", (id) -> new GenericSignBlock(id,CityShapes.NOZZLE));
        reg("nozzle_2", (id) -> new GenericSignBlock(id,CityShapes.NOZZLE2));
        // 杆子
        reg("pole", (id) -> new GenericSignBlock(id,BlockShapes.POLE));
        reg("pole_joint", (id) -> new GenericSignBlock(id,BlockShapes.POLE_JOINT));
        reg("pole_joint_double", (id) -> new GenericSignBlock(id,BlockShapes.POLE_JOINT_D));
        reg("pole_joint_l", (id) -> new GenericSignBlock(id,BlockShapes.POLE_JOINT_L));
        reg("pole_horizontal", (id) -> new GenericSignBlock(id,BlockShapes.POLE_H));
        reg("pole_expr", (id) -> new GenericSignBlock(id,BlockShapes.POLE_EXPR_L));
        reg("pole_expr_right", (id) -> new GenericSignBlock(id,BlockShapes.POLE_EXPR_R));
        reg("pole_exprmid", (id) -> new GenericSignBlock(id,BlockShapes.POLE_EXPR_M));
        reg("pole_fine_d", (id) -> new GenericSignBlock(id,BlockShapes.POLEFINE_D));
        reg("polefine_joint_d", (id) -> new GenericSignBlock(id,BlockShapes.POLEFINE_JOINT_D));
        reg("pole_fine", (id) -> new GenericSignBlock(id,BlockShapes.POLEFINE));
        reg("road_light_down", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        reg("lamppost", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        reg("separationpost", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        reg("separationpostb", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        reg("separationpostc", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        reg("light_pole_with_flag", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        reg("pole_warn", (id) -> new GenericSignBlock(id,BlockShapes.POLE));
        reg("pole_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE));
        reg("pole_joint_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE_JOINT));
        reg("pole_joint_double_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE_JOINT_D));
        reg("pole_joint_l_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE_JOINT_L));
        reg("pole_horizontal_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE_H));
        reg("pole_expr_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE_EXPR_L));
        reg("pole_expr_right_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE_EXPR_R));
        reg("pole_exprmid_w", (id) -> new GenericSignBlock(id,BlockShapes.POLE_EXPR_M));
        reg("pole_fine_d_w", (id) -> new GenericSignBlock(id,BlockShapes.POLEFINE_D));
        reg("polefine_joint_d_w", (id) -> new GenericSignBlock(id,BlockShapes.POLEFINE_JOINT_D));
        reg("railway_pole_joint", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        reg("railway_pole_joint_d", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));
        //reg("light_pole_with_flag_w", (id) -> new GenericSignBlock(id,BlockShapes.LAMPPOST));

        // 方向牌
        reg("direction_sign", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_sign_left", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_sign_right", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_sign_left_straight", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_sign_right_straight", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_sign_left_right", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_sign_left_turnoff", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_signturnoff", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("direction_straight_turnoff", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("all_direction_sign", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("variable_lanes", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("bus_lane", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("bike_lane", (id) -> new GenericMetalBlock(id,CityShapes.Direction_Sign));
        reg("diversion_b", (id) -> new GenericMetalBlock(id,BlockShapes.FREESIGN));
        reg("diversion_sign", (id) -> new GenericMetalBlock(id,BlockShapes.FREESIGN));
        //路灯
        reg("road_light", (id) -> new GenericLightBlock(id,BlockShapes.ROADLIGHT));
        reg("street_light", (id) -> new GenericLightBlock(id,BlockShapes.STREETLIGHT));
        reg("street_light_b", (id) -> new GenericLightBlock(id,BlockShapes.STREETLIGHTB));
        reg("street_light_c", (id) -> new GenericLightBlock(id,BlockShapes.STREETLIGHTC));
        reg("street_light_d", (id) -> new GenericLightBlock(id,BlockShapes.STREETLIGHTD));
        // 交通标线
        reg("road_block", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_white_connect", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_yellow", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_yellow_double", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_yellow_connect", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_zebra_crossing", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("manhole_cover_a", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("manhole_cover_b", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_diamond", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_straight", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("roadblock_oblique", (id) -> new GenericMetalBlock(id,BlockShapes.LineO));
        reg("roadblock_yellow_oblique", (id) -> new GenericMetalBlock(id,BlockShapes.LineO));
        reg("roadblock_double_oblique", (id) -> new GenericMetalBlock(id,BlockShapes.LineO));
        reg("zebracrossing_oblique", (id) -> new GenericMetalBlock(id,BlockShapes.LineO));
        reg("whiteline_block", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("yellowline_block", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("double_yellowline_block", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("road_block_side", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("road_yellow_side", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE));
        reg("whitelineside_block", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("yellowlineside_block", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));

        // 城市设施
        reg("speed_limit_sign", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_1", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_2", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_3", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_4", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_5", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_6", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_7", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_8", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_9", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("speed_limit_sign0", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("glass_fence", (id) -> new GenericMetalBlock(id,CityShapes.GlassFence));
        reg("modern_fence", (id) -> new GenericMetalBlock(id,CityShapes.ModernFence));
        reg("modern_fence_2", (id) -> new GenericMetalBlock(id,CityShapes.ModernFence2));
        reg("modern_fence_3", (id) -> new GenericMetalBlock(id,CityShapes.ModernFence3));
        reg("modern_ironfence", (id) -> new GenericMetalBlock(id,CityShapes.ModernIronFence));
        reg("moderniron_fence_yellow", (id) -> new GenericMetalBlock(id,CityShapes.ModernIronFenceYellow));
        reg("moderniron_fence_green", (id) -> new GenericMetalBlock(id,CityShapes.ModernIronFenceGreen));
        reg("moderniron_fence_blue", (id) -> new GenericMetalBlock(id,CityShapes.ModernIronFenceBlue));
        reg("concretebarrierfenced", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("restroom_sign", (id) -> new GenericMetalBlock(id,CityShapes.RestRoomSignMale));
        reg("rest_room_sign_female", (id) -> new GenericMetalBlock(id,CityShapes.RestRoomSignFeMale));
        reg("restroom_sign_third", (id) -> new GenericMetalBlock(id,CityShapes.RestRoomSignThird));
        reg("ac_cover", (id) -> new GenericMetalBlock(id,CityShapes.ACCOVER));
        reg("ac_cover_light", (id) -> new GenericMetalBlock(id,CityShapes.ACCOVER));
        reg("blue_shop_sign", (id) -> new GenericMetalBlock(id,CityShapes.ShopSign));
        reg("red_shop_sign", (id) -> new GenericMetalBlock(id,CityShapes.ShopSign));
        reg("blue_shop_sign_joint", (id) -> new GenericMetalBlock(id,CityShapes.ShopSignJ));
        reg("red_shop_sign_joint", (id) -> new GenericMetalBlock(id,CityShapes.ShopSignJ));
        reg("trash_bin", (id) -> new GenericMetalBlock(id,CityShapes.Trashbin));
        reg("roadsign_a", (id) -> new GenericMetalBlock(id,BlockShapes.FREESIGN));
        reg("roadsign_b", (id) -> new GenericMetalBlock(id,BlockShapes.FREESIGN));
        reg("barrier_gate_down", (id) -> new GenericMetalBlock(id,CityShapes.Barrier_gate_down));
        reg("barrier_gate_up", (id) -> new GenericMetalBlock(id,CityShapes.Barrier_gate_up));
        reg("barrier_gate_main_down", (id) -> new GenericMetalBlock(id,CityShapes.Barrier_gate_main_down));
        reg("barrier_gate_main_up", (id) -> new GenericMetalBlock(id,CityShapes.Barrier_gate_main_up));
        reg("concrete_wall_std", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("concrete_wall_warn", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("restroom_sign_public", (id) -> new GenericMetalBlock(id,CityShapes.RestRoomSignMale));
        reg("safety_wall_green", (id) -> new GenericMetalBlock(id,CityShapes.SAFETYWALL));
        reg("safety_wall_blue", (id) -> new GenericMetalBlock(id,CityShapes.SAFETYWALL));
        reg("safety_wall_alert", (id) -> new GenericMetalBlock(id,CityShapes.SAFETYWALL));
        reg("safety_wall_corner_green", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("safety_wall_corner_blue", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("safety_wall_corner_alert", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("powerbox", (id) -> new GenericMetalBlock(id,CityShapes.PWRBOX1));
        reg("power_box_2", (id) -> new GenericMetalBlock(id,CityShapes.PWRBOX2));
        reg("power_box_3", (id) -> new GenericMetalBlock(id,CityShapes.PWRBOX3));
        reg("power_box_4", (id) -> new GenericMetalBlock(id,CityShapes.PWRBOX4));
        reg("power_box_5", (id) -> new GenericMetalBlock(id,CityShapes.PWRBOX5));
        reg("ac_bracket", (id) -> new GenericMetalBlock(id,CityShapes.ACBRACKET));
        reg("bracket", (id) -> new GenericMetalBlock(id,CityShapes.ACBRACKET));
        reg("school_sign", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("no_honking_sign", (id) -> new GenericMetalBlock(id,CityShapes.SpeedLimitSign));
        reg("governmentsign", (id) -> new GenericMetalBlock(id,CityShapes.GSign, "tooltip.citymod.tall"));
        reg("sign_board", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("construction_warning", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("step_fence", (id) -> new GenericMetalBlock(id,CityShapes.StepFence));
        reg("stone_table", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("stone_chair", (id) -> new GenericChairBlock(id,CityShapes.StoneChair,0.4));
        reg("speed_bump", (id) -> new GenericMetalBlock(id,CityShapes.SpeedBump));
        reg("network_box", (id) -> new GenericSignBlock(id,BlockShapes.FREESIGN));
        reg("milk_box", (id) -> new GenericSignBlock(id,CityShapes.PWRBOX3));
        reg("awning_top", (id) -> new GenericSignBlock(id,CityShapes.StoneChair));
        reg("awning_edge", (id) -> new GenericSignBlock(id,CityShapes.StoneChair));
        reg("awning_edge2", (id) -> new GenericSignBlock(id,CityShapes.StoneChair));
        // ==================== 景观 ====================
        reg("blacktile", GenericNormalBlock::new);
        reg("blacktile_stair", (id) -> new GenericStairBlock(id, Blocks.STONE.defaultBlockState()));
        reg("blacktile_slab", GenericSlabBlock::new);
        reg("bluetile", GenericNormalBlock::new);
        reg("bluetile_stair", (id) -> new GenericStairBlock(id, Blocks.STONE.defaultBlockState()));
        reg("bluetile_slab", GenericSlabBlock::new);
        reg("high_bar", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT, "tooltip.citymod.tall"));
        reg("high_bar2", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT, "tooltip.citymod.tall"));
        reg("double_bar", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT, "tooltip.citymod.tall"));
        reg("tennis_table", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        // ==================== 电器 ====================
        reg("ac_out_hd_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_01));
        reg("ac_out_hd_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_02));
        reg("ac_out_hd_3", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_03));
        reg("ac_out_hd_4", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_04));
        reg("ac_out_hd_5", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_05));
        reg("ac_out_hd_6", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_06));
        reg("air_condition_old_hd", (id) -> new GenericMetalBlock(id,ApplianceShapes.OLD_AC_HD, "tooltip.citymod.tall"));
        reg("big_ac_out_hd", (id) -> new GenericMetalBlock(id,ApplianceShapes.BIG_AC_OUT_HD, "tooltip.citymod.tall"));
        reg("centre_air_condition_outside", (id) -> new GenericMetalBlock(id,ApplianceShapes.CentreAirConditionOutside, "tooltip.citymod.tall"));
        reg("air_condition_hd_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_01, "tooltip.citymod.tall"));
        reg("air_condition_hd_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_02));
        reg("airconditionhd_3", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_03));
        reg("airconditionhd_4", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_04, "tooltip.citymod.tall"));
        reg("central_ac_hd", (id) -> new GenericMetalBlock(id,ApplianceShapes.CAC_HD));
        reg("micro_wave_oven", (id) -> new GenericMetalBlock(id,ApplianceShapes.MicroWaveOven));
        reg("fridge_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.Fridge1, "tooltip.citymod.tall"));
        reg("fridge_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.Fridge2, "tooltip.citymod.tall"));
        reg("old_fridge", (id) -> new GenericMetalBlock(id,ApplianceShapes.Old_Fridge));
        reg("old_tv_table", (id) -> new GenericMetalBlock(id,ApplianceShapes.OldTVTable));
        reg("freezer", (id) -> new GenericMetalBlock(id,ApplianceShapes.Freezer));
        reg("gas_water_heater", (id) -> new GenericMetalBlock(id,ApplianceShapes.GASWATERHEATER));
        reg("electric_water_heater", (id) -> new GenericMetalBlock(id,ApplianceShapes.ELECTRICWATERHEATER));
        reg("solarwaterheater", (id) -> new GenericMetalBlock(id,ApplianceShapes.SOLARWATERHEATER));
        reg("old_mainunit", (id) -> new GenericMetalBlock(id,ApplianceShapes.OLD_MAINUNIT));
        reg("mainunit_2010", (id) -> new GenericMetalBlock(id,ApplianceShapes.MAINUNIT2010));
        reg("main_unit_modern", (id) -> new GenericMetalBlock(id,ApplianceShapes.MODERMMAINUNIT));
        reg("express_box_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.ExpressBox, "tooltip.citymod.tall"));
        reg("express_box_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.ExpressBox, "tooltip.citymod.tall"));
        reg("old_mirror", (id) -> new GenericMetalBlock(id,BlockShapes.FREESIGN));
        reg("old_calendar", (id) -> new GenericMetalBlock(id,ApplianceShapes.OldCalendar));
        reg("television", (id) -> new Power(id,ApplianceShapes.TELEVISION, "tooltip.citymod.powerable", true));
        reg("printer", (id) -> new GenericMetalBlock(id,CityShapes.StoneChair));
        reg("extractor", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("trimcover", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("washingmachine", (id) -> new GenericMetalBlock(id,ApplianceShapes.WASHINGMACHINEA));
        reg("washine_machine_b", (id) -> new GenericMetalBlock(id,ApplianceShapes.WASHINGMACHINEB));
        reg("crt_tv", (id) -> new Power(id,ApplianceShapes.CRTTV, "tooltip.citymod.powerable", true));
        reg("treadmill", (id) -> new GenericMetalBlock(id,ApplianceShapes.TREADMILL));
        reg("tv_hd", (id) -> new Power(id,ApplianceShapes.TVHD, "tooltip.citymod.powerable", true));
        reg("sausage_cooker", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("ac_modern", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_02));
        reg("ac_out_modern", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_06));
        reg("ac_out_modern2", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_06));
        reg("solarwaterheaterred", (id) -> new GenericMetalBlock(id,ApplianceShapes.SOLARWATERHEATER));
        reg("game_pc_black", (id) -> new GenericGlassBlock(id,ApplianceShapes.MODERMMAINUNIT));
        reg("game_pc_white", (id) -> new GenericGlassBlock(id,ApplianceShapes.MODERMMAINUNIT));
        reg("electronic_scale", (id) -> new GenericGlassBlock(id,BlockShapes.TRAFFICLINE));
        reg("ac_modern_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeM, "tooltip.citymod.tall"));
        reg("water_dispenser", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        reg("bucket", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("oven", (id) -> new GenericSignBlock(id,ApplianceShapes.MicroWaveOven));
        reg("fan", (id) -> new GenericSignBlock(id,CityShapes.Concretebarrierfenced));
        reg("fan2", (id) -> new GenericSignBlock(id,ApplianceShapes.FAN2));
        reg("cable_box", (id) -> new GenericSignBlock(id,ApplianceShapes.STB));
        reg("router_black", (id) -> new GenericSignBlock(id,ApplianceShapes.STB));
        reg("router_white", (id) -> new GenericSignBlock(id,ApplianceShapes.STB));
        reg("gas_stove", (id) -> new GenericSignBlock(id,ApplianceShapes.GAS_STOVE));
        //灯具
        reg("toplamp1", (id) -> new GenericLightBlock(id,BlockShapes.TOPLAMPS));
        reg("toplamp2", (id) -> new GenericLightBlock(id,BlockShapes.TOPLAMPS));
        reg("toplamp3", (id) -> new GenericLightBlock(id,BlockShapes.TOPLAMPS));
        reg("toplamp4", (id) -> new GenericLightBlock(id,BlockShapes.TOPLAMPS));
        reg("desklamp", (id) -> new GenericLightBlock(id,ApplianceShapes.DESKLAMP));
        reg("desklamp2", (id) -> new GenericLightBlock(id,BlockShapes.DEFAULT));
        reg("floorlamp1", (id) -> new GenericLightBlock(id,ApplianceShapes.WardrobeM, "tooltip.citymod.tall"));
        reg("chandelier1", (id) -> new GenericLightBlock(id,BlockShapes.DEFAULT));
        reg("chandelier2", (id) -> new GenericLightBlock(id,BlockShapes.DEFAULT));
        reg("chandelier3", (id) -> new GenericLightBlock(id,BlockShapes.DEFAULT));
        reg("chandelier4", (id) -> new GenericLightBlock(id,BlockShapes.DEFAULT));
        reg("chandelier5", (id) -> new GenericLightBlock(id,ApplianceShapes.CLAMP5));
        //公交站台
        reg("busstop1", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOP1, "tooltip.citymod.tall"));
        reg("busstop2", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOP1, "tooltip.citymod.lcgy"));
        reg("busstop3", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOPM, "tooltip.citymod.lcgy"));
        reg("busstop_m", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOPM, "tooltip.citymod.tall"));
        reg("busstop_ad", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOPAD, "tooltip.citymod.tall"));
        reg("busstop_ad1", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOPAD, "tooltip.citymod.tall"));
        reg("busstop_pole", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOPPOLE, "tooltip.citymod.tall"));
        reg("busstop_top", (id) -> new GenericMetalBlock(id,BlockShapes.BUSSTOP_top));
        reg("busstop_chair", (id) -> new GenericChairBlock(id,BlockShapes.BUSCHAIR,0.4));
        // 显示器（带开关）
        reg("old_monitor_off", (id) -> new Power(id,ApplianceShapes.Old_Monitor, "tooltip.citymod.powerable", true));
        reg("monitor_2010off", (id) -> new Power(id,ApplianceShapes.Monitor2010, "tooltip.citymod.powerable", true));
        reg("modern_monitor_off", (id) -> new Power(id,ApplianceShapes.ModernMonitor, "tooltip.citymod.powerable", true));
        reg("all_in_one_pc", (id) -> new Power(id,ApplianceShapes.AIOPC, "tooltip.citymod.powerable", true));
        reg("laptop", (id) -> new Power(id,ApplianceShapes.LAPTOP, ApplianceShapes.LAPTOP_ON, "tooltip.citymod.powerable", true));
        reg("gaming_laptop_off", (id) -> new Power(id,ApplianceShapes.LAPTOP, ApplianceShapes.LAPTOP_ON, "tooltip.citymod.powerable", true));
        reg("large_screen_black", (id) -> new Power(id,ApplianceShapes.LARGESCREEN, "tooltip.citymod.powerable", true));
        reg("large_screen_white", (id) -> new Power(id,ApplianceShapes.LARGESCREEN, "tooltip.citymod.powerable", true));
        reg("gaming_pc_white", (id) -> new GenericGlassBlock(id,ApplianceShapes.GAMINGPC));
        reg("gaming_pcblack", (id) -> new GenericGlassBlock(id,ApplianceShapes.GAMINGPC));
        reg("game_monitor_black_off", (id) -> new Power(id,ApplianceShapes.GAMEMONITOR, "tooltip.citymod.powerable", true));
        reg("game_monitor_white_off", (id) -> new Power(id,ApplianceShapes.GAMEMONITOR, "tooltip.citymod.powerable", true));
        reg("game_monitor_black_std", (id) -> new Power(id,ApplianceShapes.GAMEMONITOR, "tooltip.citymod.powerable", true));
        reg("game_monitor_white_std", (id) -> new Power(id,ApplianceShapes.GAMEMONITOR, "tooltip.citymod.powerable", true));
        reg("small_tv", (id) -> new Power(id,ApplianceShapes.GAMEMONITOR, "tooltip.citymod.powerable", true));
        //家具
        reg("computer_desk_black", (id) -> new GenericMetalBlock(id,ApplianceShapes.PCDESK));
        reg("computer_desk_white", (id) -> new GenericMetalBlock(id,ApplianceShapes.PCDESK));
        reg("office_desk", (id) -> new GenericGlassBlock(id,ApplianceShapes.PCDESK));
        reg("office_chair_black", (id) -> new GenericChairBlock(id,CityShapes.StoneChair,0.4));
        reg("office_chair_white", (id) -> new GenericChairBlock(id,CityShapes.StoneChair,0.4));
        reg("plastic_chair_red", (id) -> new GenericChairBlock(id,BlockShapes.TALLCHAIR, "tooltip.citymod.nohead",0.4));
        reg("plastic_chair_blue", (id) -> new GenericChairBlock(id,BlockShapes.TALLCHAIR, "tooltip.citymod.nohead",0.4));
        reg("monitor_bracket_black", (id) -> new GenericSignBlock(id,ApplianceShapes.MONITORBRACKET));
        reg("monitor_bracket_white", (id) -> new GenericSignBlock(id,ApplianceShapes.MONITORBRACKET));
        reg("monitor_light_black", (id) -> new GenericLightBlock(id,ApplianceShapes.MONITORLIGHT));
        reg("monitor_light_white", (id) -> new GenericLightBlock(id,ApplianceShapes.MONITORLIGHT));
        reg("monitor_light_black_std", (id) -> new GenericLightBlock(id,ApplianceShapes.MONITORLIGHT));
        reg("monitor_light_white_std", (id) -> new GenericLightBlock(id,ApplianceShapes.MONITORLIGHT));
        reg("kitchen_chair", (id) -> new GenericChairBlock(id,BlockShapes.TALLCHAIR,0.4));
        reg("kitchen_desk", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("old_chair", (id) -> new GenericChairBlock(id,BlockShapes.TALLCHAIR,0.4));
        reg("tvcabinet_a", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("tvcabinet_b", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("tvcabinet_c", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("tvcabinet_d", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("tvcabinet_e", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("coffee_table", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("tvcabinet_dark", (id) -> new GenericSignBlock(id,BlockShapes.DEFAULT));
        reg("bathroom_wardrobe_big", (id) -> new GenericSignBlock(id,ApplianceShapes.PCDESK));
        reg("bathroom_wardrobe", (id) -> new GenericSignBlock(id,ApplianceShapes.Freezer));
        reg("modern_mirror_big", (id) -> new GenericLightBlock(id,PostShapes.Post169));
        reg("modern_mirror", (id) -> new GenericLightBlock(id,BlockShapes.MediumSign));
        reg("ironbed", (id) -> new GenericMetalBlock(id,ApplianceShapes.PCDESK));
        reg("ironbed2", (id) -> new GenericChairBlock(id,ApplianceShapes.IRONBED,0.4));
        reg("ironbed3", (id) -> new GenericChairBlock(id,ApplianceShapes.IRONBED2,0.4));
        reg("ironbed4", (id) -> new GenericChairBlock(id,ApplianceShapes.IRONBED,0.4));
        reg("ironbed_b", (id) -> new GenericMetalBlock(id,ApplianceShapes.PCDESK));
        reg("ironbed_b2", (id) -> new GenericChairBlock(id,ApplianceShapes.IRONBED,0.4));
        reg("ironbed_b3", (id) -> new GenericChairBlock(id,ApplianceShapes.IRONBED2,0.4));
        reg("ironbed_b4", (id) -> new GenericChairBlock(id,ApplianceShapes.IRONBED,0.4));
        reg("wood_wardrobe", (id) -> new GenericSignBlock(id,ApplianceShapes.Freezer));
        reg("wood_wardrobe_big", (id) -> new GenericSignBlock(id,ApplianceShapes.BIGWARDROBE));
        reg("wood_wardrobe_side", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("wood_wardrobe_side_b", (id) -> new GenericMetalBlock(id,CityShapes.Concretebarrierfenced));
        reg("wooden_desk", (id) -> new GenericSignBlock(id,ApplianceShapes.PCDESK));
        reg("wooden_shelf", (id) -> new GenericSignBlock(id,ApplianceShapes.BIGWARDROBE));
        reg("gas_tank", (id) -> new GenericMetalBlock(id,BlockShapes.DEFAULT));
        // 已废弃
        reg("laptop_poweron", (id) -> new GenericLightBlock(id,ApplianceShapes.LAPTOP_ON, "tooltip.citymod.old"));
        reg("old_monitor_on", (id) -> new GenericLightBlock(id,ApplianceShapes.Old_Monitor, "tooltip.citymod.old"));
        reg("monitor_2010_on", (id) -> new GenericLightBlock(id,ApplianceShapes.Monitor2010, "tooltip.citymod.old"));
        reg("modern_monitor_on", (id) -> new GenericLightBlock(id,ApplianceShapes.ModernMonitor, "tooltip.citymod.old"));
        reg("all_in_one_pc_on", (id) -> new GenericLightBlock(id,ApplianceShapes.AIOPC, "tooltip.citymod.old"));
        reg("air_conditioning", (id) -> new GenericMetalBlock(id,ApplianceShapes.EOLACIN, "tooltip.citymod.old"));
        reg("hanging_air_conditioning", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_02, "tooltip.citymod.old"));
        reg("air_conditioning_external_unit", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_01, "tooltip.citymod.old"));
        reg("large_air_conditioning_external_unit", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_02, "tooltip.citymod.old"));
        reg("centr_alir_conditioning", (id) -> new GenericMetalBlock(id,ApplianceShapes.EOLCAC, "tooltip.citymod.old"));
        reg("road_sign", (id) -> new GenericSignBlock(id,CityShapes.RoadSign, "tooltip.citymod.old"));
        reg("television_power_on", (id) -> new GenericLightBlock(id,ApplianceShapes.TELEVISION, "tooltip.citymod.old"));
        reg("old_ac_in", (id) -> new GenericMetalBlock(id,ApplianceShapes.EOLACIN, "tooltip.citymod.old"));
        reg("old_ac_in_b", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_02, "tooltip.citymod.old"));
        reg("old_ac_in_c", (id) -> new GenericMetalBlock(id,ApplianceShapes.EOLACIN, "tooltip.citymod.old"));
        reg("air_condition_b", (id) -> new GenericMetalBlock(id,ApplianceShapes.EOLACIN, "tooltip.citymod.old"));
        reg("screen_black_on", (id) -> new GenericLightBlock(id,ApplianceShapes.LARGESCREEN, "tooltip.citymod.old"));
        reg("screen_white_on", (id) -> new GenericLightBlock(id,ApplianceShapes.LARGESCREEN, "tooltip.citymod.old"));
        reg("crt_tv_on", (id) -> new GenericLightBlock(id,ApplianceShapes.CRTTV, "tooltip.citymod.old"));
        reg("old_ac_out", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_02, "tooltip.citymod.old"));
        // 家具
        reg("oldwardrobe", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeM, "tooltip.citymod.tall"));
        reg("oldwardrobesmall", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeS));
        reg("oldwardrobecorner", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeM, "tooltip.citymod.tall"));
        reg("modernwardrobe", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeM, "tooltip.citymod.tall"));
        reg("modernwardrobeup", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeS));
        reg("modernwardrobeb", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeL, "tooltip.citymod.tall"));
        //红绿灯
        reg("pedestrian_traffic_light_r", (id) -> new TimedPower(id,BlockShapes.PTrafficLight, "tooltip.citymod.tall_trafficlight"));
        reg("traffic_light_round_green", (id) -> new TimedPower(id,BlockShapes.TrafficLight, "tooltip.citymod.trafficlight"));
        reg("traffic_light_s_green", (id) -> new TimedPower(id,BlockShapes.TrafficLight, "tooltip.citymod.trafficlight"));
        reg("traffic_light_l_green", (id) -> new TimedPower(id,BlockShapes.TrafficLight, "tooltip.citymod.trafficlight"));
        reg("traffic_light_r_green", (id) -> new TimedPower(id,BlockShapes.TrafficLight, "tooltip.citymod.trafficlight"));
        //reg("traffictimescreengreen",()->new TimedPower((id,BlockShapes.FREESIGN)));
        // 载具
        reg("bikeblack", (id) -> new GenericMetalBlock(id,VehicleShapes.BikeBlack));
        reg("bike", (id) -> new GenericMetalBlock(id,VehicleShapes.BikeWhite));
        reg("electric_motorcycle", (id) -> new GenericMetalBlock(id,VehicleShapes.ElectricMotorWhite));
        reg("electric_motorcycle_black", (id) -> new GenericMetalBlock(id,VehicleShapes.ElectricMotorBlack));
        reg("scooter_white", (id) -> new GenericMetalBlock(id,VehicleShapes.ScooterWhite));
        reg("scooter_black", (id) -> new GenericMetalBlock(id,VehicleShapes.ScooterBlack));

        // 窗户
        reg("window_small_white", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMA));
        reg("window_medium_a_white", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMA));
        reg("window_medium_b_white", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMB));
        reg("window_large_white", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));
        reg("window_small_black", (id) -> new GenericGlassBlock(id,WindowsShapes.WINS));
        reg("window_medium_a_black", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMA));
        reg("window_medium_b_black", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMB));
        reg("window_large_black", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));
        reg("window_small_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINS));
        reg("window_medium_a_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMA));
        reg("window_medium_b_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMB));
        reg("window_large_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));
        reg("window_small_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINS));
        reg("window_medium_a_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMA));
        reg("window_mediub_b_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMB));
        reg("window_large_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));
        reg("window_corner_white_small", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_corner_black_small", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_corner_small_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_corner_small_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_corner_white_large", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("window_corner_black_large", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("window_corner_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("window_corner_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("w_indow_oblique_white", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_oblique", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_oblique_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_oblique_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINSC));
        reg("window_oblique_large_white", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("window_oblique_large", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("window_oblique_large_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("window_oblique_large_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("style_iron_window_corner", (id) -> new GenericGlassBlock(id,WindowsShapes.WINLC));
        reg("style_iron_window", (id) -> new GenericGlassBlock(id,WindowsShapes.WINMA));
        reg("wooden_window", (id) -> new GenericGlassBlock(id,WindowsShapes.WINCS));
        reg("old_window", (id) -> new GenericGlassBlock(id,WindowsShapes.WINCS));
        reg("security_window_small", (id) -> new GenericGlassBlock(id,WindowsShapes.WINCS));
        reg("security_window_small_2", (id) -> new GenericGlassBlock(id,WindowsShapes.WINCMB));
        reg("security_window_medium", (id) -> new GenericGlassBlock(id,WindowsShapes.WINCMA));
        reg("security_window_large", (id) -> new GenericGlassBlock(id,WindowsShapes.WINCL));
        reg("window_largeb_black", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));
        reg("window_largeb_blue", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));
        reg("window_largeb_green", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));
        reg("window_largeb_white", (id) -> new GenericGlassBlock(id,WindowsShapes.WINL));

        // 海报
        reg("post_1691", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1692", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1693", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1694", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1695", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1696", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1697", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1698", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_1699", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_16910", (id) -> new GenericSignBlock(id,PostShapes.Post169));
        reg("post_431", (id) -> new GenericSignBlock(id,PostShapes.Post43));
        reg("post_432", (id) -> new GenericSignBlock(id,PostShapes.Post43));
        reg("post_433", (id) -> new GenericSignBlock(id,PostShapes.Post43));
        reg("post_434", (id) -> new GenericSignBlock(id,PostShapes.Post43));

        // 其他
        reg("ac_out_nvidia", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC2080));
        reg("ac_out_intel", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_06));
        reg("ac_out_amd", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC2080));
        reg("ac_out_fake", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_05));
        reg("ac_out_40_hx", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_40HX));
        reg("blackwell_6000", (id) -> new GenericMetalBlock(id,ApplianceShapes.BIG_AC_OUT_HD));
        reg("ac_out_690", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_04));
        reg("internet_famous_road_sign", (id) -> new GenericSignBlock(id,BlockShapes.IFRS));
        reg("anniversary", (id) -> new GenericLightBlock(id,BlockShapes.EXPR));
        reg("hdd", (id) -> new GenericMetalBlock(id,BlockShapes.TRAFFICLINE, "tooltip.citymod.hdd"));
        reg("dma", (id) -> new GenericMetalBlock(id,BlockShapes.FREESIGN, "tooltip.citymod.dma"));
        //多方向
        reg("central_air_conditioning", (id) -> new GenericMultiFaceBlock(id,state -> {
            Direction facing = state.getValue(GenericMultiFaceBlock.FACING);
            AttachFace face = state.getValue(GenericMultiFaceBlock.FACE);

            return switch (facing) {
                case SOUTH -> switch (face) {
                    case FLOOR -> Block.box(-10, 0, 4, 26, 1, 12);
                    case WALL -> Block.box(-10, 4, 0, 26, 12, 1);
                    case CEILING -> Block.box(-10, 15, 4, 26, 16, 12);
                };
                case NORTH -> switch (face) {
                    case FLOOR -> Block.box(-10, 0, 4, 26, 1, 12);
                    case WALL -> Block.box(-10, 4, 15, 26, 12, 16);
                    case CEILING -> Block.box(-10, 15, 4, 26, 16, 12);
                };
                case EAST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, -10, 12, 1, 26);
                    case WALL -> Block.box(0, 4, -10, 1, 12, 26);
                    case CEILING -> Block.box(4, 15, -10, 12, 16, 26);
                };
                case WEST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, -10, 12, 1, 26);
                    case WALL -> Block.box(15, 4, -10, 16, 12, 26);
                    case CEILING -> Block.box(4, 15, -10, 12, 16, 26);
                };
                default -> Block.box(0, 0, 0, 16, 16, 16);
            };
        }));
        reg("ac_airvent_hd", (id) -> new GenericMultiFaceBlock(id,state -> {
            Direction facing = state.getValue(GenericMultiFaceBlock.FACING);
            AttachFace face = state.getValue(GenericMultiFaceBlock.FACE);

            return switch (facing) {
                case SOUTH -> switch (face) {
                    case FLOOR -> Block.box(0, 0, 4, 16, 1, 12);
                    case WALL -> Block.box(0, 4, 0, 16, 12, 1);
                    case CEILING -> Block.box(0, 15, 4, 16, 16, 12);
                };
                case NORTH -> switch (face) {
                    case FLOOR -> Block.box(0, 0, 4, 16, 1, 12);
                    case WALL -> Block.box(0, 4, 15, 16, 12, 16);
                    case CEILING -> Block.box(0, 15, 4, 16, 16, 12);
                };
                case EAST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, 0, 12, 1, 16);
                    case WALL -> Block.box(0, 4, 0, 1, 12, 16);
                    case CEILING -> Block.box(4, 15, 0, 12, 16, 16);
                };
                case WEST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, 0, 12, 1, 16);
                    case WALL -> Block.box(15, 4, 0, 16, 12, 16);
                    case CEILING -> Block.box(4, 15, 0, 12, 16, 16);
                };
                default -> Block.box(0, 0, 0, 16, 16, 16);
            };
        }));
        reg("ac_airvent_hd_l", (id) -> new GenericMultiFaceBlock(id,state -> {
            Direction facing = state.getValue(GenericMultiFaceBlock.FACING);
            AttachFace face = state.getValue(GenericMultiFaceBlock.FACE);

            return switch (facing) {
                case SOUTH -> switch (face) {
                    case FLOOR -> Block.box(0, 0, 4, 16, 1, 12);
                    case WALL -> Block.box(0, 4, 0, 16, 12, 1);
                    case CEILING -> Block.box(0, 15, 4, 16, 16, 12);
                };
                case NORTH -> switch (face) {
                    case FLOOR -> Block.box(0, 0, 4, 16, 1, 12);
                    case WALL -> Block.box(0, 4, 15, 16, 12, 16);
                    case CEILING -> Block.box(0, 15, 4, 16, 16, 12);
                };
                case EAST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, 0, 12, 1, 16);
                    case WALL -> Block.box(0, 4, 0, 1, 12, 16);
                    case CEILING -> Block.box(4, 15, 0, 12, 16, 16);
                };
                case WEST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, 0, 12, 1, 16);
                    case WALL -> Block.box(15, 4, 0, 16, 12, 16);
                    case CEILING -> Block.box(4, 15, 0, 12, 16, 16);
                };
                default -> Block.box(0, 0, 0, 16, 16, 16);
            };
        }));
        reg("ac_airvent_hd_r", (id) -> new GenericMultiFaceBlock(id,state -> {
            Direction facing = state.getValue(GenericMultiFaceBlock.FACING);
            AttachFace face = state.getValue(GenericMultiFaceBlock.FACE);

            return switch (facing) {
                case SOUTH -> switch (face) {
                    case FLOOR -> Block.box(0, 0, 4, 16, 1, 12);
                    case WALL -> Block.box(0, 4, 0, 16, 12, 1);
                    case CEILING -> Block.box(0, 15, 4, 16, 16, 12);
                };
                case NORTH -> switch (face) {
                    case FLOOR -> Block.box(0, 0, 4, 16, 1, 12);
                    case WALL -> Block.box(0, 4, 15, 16, 12, 16);
                    case CEILING -> Block.box(0, 15, 4, 16, 16, 12);
                };
                case EAST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, 0, 12, 1, 16);
                    case WALL -> Block.box(0, 4, 0, 1, 12, 16);
                    case CEILING -> Block.box(4, 15, 0, 12, 16, 16);
                };
                case WEST -> switch (face) {
                    case FLOOR -> Block.box(4, 0, 0, 12, 1, 16);
                    case WALL -> Block.box(15, 4, 0, 16, 12, 16);
                    case CEILING -> Block.box(4, 15, 0, 12, 16, 16);
                };
                default -> Block.box(0, 0, 0, 16, 16, 16);
            };
        }));
        reg("water_pipe", (id) -> new GenericAxisBlock(id,Map.of(
                Direction.Axis.X, Block.box(0, 7, 7, 16, 9, 9),
                Direction.Axis.Y, Block.box(7, 0, 7, 9, 16, 9),
                Direction.Axis.Z, Block.box(7, 7, 0, 9, 9, 16)
        )));
        reg("water_pipe_red", (id) -> new GenericAxisBlock(id,Map.of(
                Direction.Axis.X, Block.box(0, 7, 7, 16, 9, 9),
                Direction.Axis.Y, Block.box(7, 0, 7, 9, 16, 9),
                Direction.Axis.Z, Block.box(7, 7, 0, 9, 9, 16)
        )));
        reg("railway_pole", (id) -> new GenericAxisBlock(id,Map.of(
                Direction.Axis.X, Block.box(0, 5, 5, 16, 11, 11),
                Direction.Axis.Y, Block.box(5, 0, 5, 11, 16, 11),
                Direction.Axis.Z, Block.box(5, 5, 0, 11, 11, 16)
        )));
        reg("water_pipe_joint", (id) -> new GenericDirectionBlock(id));
        reg("water_pipe_joint_red", GenericDirectionBlock::new);
        reg("water_pipe_joint_r", (id) -> new GenericDirectionBlock(id));
        reg("water_pipe_joint_red_r", (id) -> new GenericDirectionBlock(id));
    }

    private static void reg(String id, Function<Identifier, ? extends Block> factory) {
        BLOCKS.add(new BlockDef(id, factory));
    }
}