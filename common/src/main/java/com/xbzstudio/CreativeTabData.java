package com.xbzstudio;

import com.xbzstudio.block.BlockShapes;
import com.xbzstudio.block.CityShapes;
import com.xbzstudio.block.GenericMetalBlock;
import com.xbzstudio.block.GenericSignBlock;
import net.minecraft.network.chat.Component;

import java.util.List;

public class CreativeTabData {

    public record TabDef(String id, Component title, String iconId, List<String> blockIds) {}

    public static final List<String> TRAFFIC_IDS = List.of(
            "expr_1", "expr_2", "expr_3", "expr_4", "expr_5",
            "expr_5a", "expr_5b", "expr_5c", "expr_5_d", "expr_5_e", "expr_5_f","expr_5g",
            "service_area_sign", "overpass_sign", "overpass_sign_2", "overpass_sign_3",
            "over_pass_sign_4","road_11","tollgate_sign","green_sign","greensign2","expr_sign_large", "expressway_exit_sign", "expr_t_ips","mediumsign_green","sign_mini_green",
            "vehicle_dstance_confirmation_sign","vehicle_distance_confirmation_sign_b","vehicle_distance_confirmation_sign_c","diversion_b","diversion_sign","scenic_spot_sign",
            "road_1", "road_2", "road_3", "road_4", "road_5", "road_6","road_8",  "road_12",
            "traffic_sign", "traffic_sign_l", "traffic_sign_r", "traffic_sign_t","over_pass_5","mediumsign_blue","bluesign","sign_mini_blue",
            "traffic_sign_1", "traffic_sign_2", "yellow_sign_2","yellow_sign","mediumsign_yellow","sign_mini_yellow",
            "road_screen", "free_road_sign", "free_expressway_sign",
            "white_sign2","white_sign","whitesign3","mediumsign_white","sign_mini_white",
            "orangesign","orangesign_2","mediumsign_orange","sign_mini_orange","sign_mini_red",
            "pole", "pole_joint", "pole_joint_double", "pole_joint_l",
            "pole_horizontal", "pole_expr", "pole_expr_right", "pole_exprmid",
            "pole_fine_d", "polefine_joint_d",
            "warn_pole","road_light_down","lamppost","light_pole_with_flag",
            "direction_sign", "direction_sign_left", "direction_sign_right",
            "direction_sign_left_straight", "direction_sign_right_straight",
            "direction_sign_left_right", "direction_sign_left_turnoff",
            "direction_signturnoff", "direction_straight_turnoff",
            "all_direction_sign", "variable_lanes", "bus_lane", "bike_lane",
            "road_block", "road_white_connect", "road_yellow", "road_yellow_double",
            "road_yellow_connect", "road_zebra_crossing","whiteline_block","yellowline_block","double_yellowline_block",
            "road_diamond","road_straight","roadblock_block_oblique","roadblock_oblique","roadblock_yellow_oblique","roadblock_double_oblique","zebracrossing_oblique",
            "road_light","street_light","street_light_b","street_light_c","street_light_d",
            "separationpost","separationpostb","separationpostc",
            "expressway_fence","expressway_fence_joint","expressway_fence_green","expressway_fence_green_joint","expresswayfence2","expresswayfence2_r",
            "tunnel_sign_1","tunnel_sign_2",
            "traffic_light_round_green","traffic_light_s_green","traffic_light_l_green","traffic_light_r_green","pedestrian_traffic_light_r"
    );

    public static final List<String> CITY_IDS = List.of(
            "speed_limit_sign", "speed_limit_sign_1", "speed_limit_sign_2",
            "speed_limit_sign_3", "speed_limit_sign_4", "speed_limit_sign_5",
            "speed_limit_sign_6", "speed_limit_sign_7", "speed_limit_sign_8","pole_fine",
            "glass_fence","modern_fence", "modern_fence_2", "modern_fence_3","step_fence",
            "modern_ironfence", "moderniron_fence_yellow",
            "moderniron_fence_green", "moderniron_fence_blue",
            "concretebarrierfenced","concrete_wall_std","concrete_wall_warn",
            "restroom_sign", "rest_room_sign_female", "restroom_sign_third","restroom_sign_public",
            "ac_cover", "ac_cover_light",
            "security_window_small", "security_window_small_2",
            "security_window_medium", "security_window_large",
            "blue_shop_sign", "blue_shop_sign_joint",
            "red_shop_sign", "red_shop_sign_joint",
            "manhole_cover_a", "manhole_cover_b",
            "trash_bin",
            "roadsign_a","roadsign_b",
            "barrier_gate_down","barrier_gate_up","barrier_gate_main_down","barrier_gate_main_up",
            "sign","right_sign","left_sign","pedestrians","parking","noparking_sign","no_honking_sign","school_sign",
            "safety_wall_green","safety_wall_blue","safety_wall_alert",
            "safety_wall_corner_green","safety_wall_corner_blue","safety_wall_corner_alert",
            "powerbox","power_box_2","power_box_3","power_box_4","power_box_5","speed_bump",
            "ac_bracket","bracket",
            "construction_warning","sign_board","governmentsign",
            "stone_table","stone_chair","stone_ball"
    );
    public static final List<String> FireFighting_IDS = List.of(
            "fireextinguisherbox","water_tank","water_pipe","water_pipe_red","nozzle_1","nozzle_2",
            "water_pipe_joint","water_pipe_joint_r","water_pipe_joint_red","water_pipe_joint_red_r"
    );
    public static final List<String> HA_IDS = List.of(
            "ac_out_hd_1", "ac_out_hd_2", "ac_out_hd_3", "ac_out_hd_4",
            "ac_out_hd_5", "ac_out_hd_6",
            "big_ac_out_hd", "centre_air_condition_outside",
            "air_condition_hd_1", "air_condition_hd_2",
            "airconditionhd_3", "airconditionhd_4",
            "air_condition_old_hd", "central_ac_hd","ac_airvent_hd",
            "micro_wave_oven", "fridge_1", "fridge_2",  "freezer",
            "gas_water_heater", "electric_water_heater", "solarwaterheater",
            "old_monitor_off", "monitor_2010off", "old_mainunit",
            "mainunit_2010", "modern_monitor_off", "main_unit_modern",
            "all_in_one_pc", "laptop","large_screen_black","gaming_pcblack","large_screen_white","gaming_pc_white","printer","television","crt_tv",
            "oldwardrobe", "oldwardrobesmall", "oldwardrobecorner",
            "modernwardrobe", "modernwardrobeup", "modernwardrobeb",
            "express_box_1", "express_box_2",
            "old_tv_table","old_fridge","old_mirror","old_calendar",
            "extractor","trimcover","washingmachine","washine_machine_b"
    );

    public static final List<String> POST_IDS = List.of(
            "post_1691", "post_1692", "post_1693", "post_1694",
            "post_1695", "post_1696", "post_1697", "post_1698",
            "post_431", "post_432", "post_433"
    );

    public static final List<String> WINDOW_IDS = List.of(
            "window_small_white", "window_medium_a_white", "window_medium_b_white", "window_large_white",
            "window_corner_white_small", "window_corner_white_large",
            "w_indow_oblique_white", "window_oblique_large_white",
            "window_small_black", "window_medium_a_black", "window_medium_b_black", "window_large_black",
            "window_corner_black_small", "window_corner_black_large",
            "window_oblique", "window_oblique_large",
            "window_small_blue", "window_medium_a_blue", "window_medium_b_blue", "window_large_blue",
            "window_corner_small_blue", "window_corner_blue",
            "window_oblique_blue", "window_oblique_large_blue",
            "window_small_green", "window_medium_a_green", "window_mediub_b_green", "window_large_green",
            "window_corner_small_green", "window_corner_green",
            "window_oblique_green", "window_oblique_large_green",
            "style_iron_window_corner", "style_iron_window",
            "wooden_window", "old_window"
    );
    public static final List<String> VEHICLE_IDS = List.of(
            "bike", "bikeblack",
            "electric_motorcycle", "electric_motorcycle_black",
            "scooter_white", "scooter_black"
    );

    public static final List<String> OTHER_IDS = List.of(
            "ac_out_nvidia", "ac_out_amd", "ac_out_intel",
            "ac_out_fake", "ac_out_40_hx","blackwell_6000","internet_famous_road_sign"
    );
    public static final List<TabDef> TABS = List.of(
            new TabDef("traffic", Component.translatable("item_group.citymod.traffic"), "traffic_sign", TRAFFIC_IDS),
            new TabDef("city", Component.translatable("item_group.citymod.urban_facilities"), "speed_limit_sign", CITY_IDS),
            new TabDef("household_appliances", Component.translatable("item_group.citymod.household_appliances"), "ac_out_hd_3", HA_IDS),
            new TabDef("posts", Component.translatable("item_group.citymod.posts"), "post_1691", POST_IDS),
            new TabDef("modern_windows", Component.translatable("item_group.citymod.modern_windows"), "window_large_white", WINDOW_IDS),
            new TabDef("vehicle", Component.translatable("item_group.citymod.vehicle"), "bikeblack", VEHICLE_IDS),
            new TabDef("firefighting", Component.translatable("item_group.citymod.firefighting"), "fireextinguisherbox", FireFighting_IDS),
            new TabDef("other", Component.translatable("item_group.citymod.other"), "ac_out_intel", OTHER_IDS)
    );
}