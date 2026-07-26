package com.xbzstudio.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.minecraft.world.phys.shapes.Shapes.box;

public class BlockRegistry {

    public record BlockDef(String id, Supplier<? extends Block> factory) {}

    public static final List<BlockDef> BLOCKS = new ArrayList<>();

    static {
        // ==================== 路牌 ====================
        reg("expr_1", () -> new GenericSignBlock(BlockShapes.EXPR_1));
        reg("expr_2", () -> new GenericSignBlock(BlockShapes.EXPR_2));
        reg("expr_3", () -> new GenericSignBlock(BlockShapes.EXPR_3));
        reg("expr_4", () -> new GenericSignBlock(BlockShapes.EXPR_4));
        reg("expr_5", () -> new GenericSignBlock(BlockShapes.EXPR_5));
        reg("expr_5a", () -> new GenericSignBlock(BlockShapes.EXPR_5a));
        reg("expr_5b", () -> new GenericSignBlock(BlockShapes.EXPR_5b));
        reg("expr_5c", () -> new GenericSignBlock(BlockShapes.EXPR_5c));
        reg("expr_5_d", () -> new GenericSignBlock(BlockShapes.EXPR_5_d));
        reg("expr_5_e", () -> new GenericSignBlock(BlockShapes.EXPR_5_e));
        reg("expr_5_f", () -> new GenericSignBlock(BlockShapes.EXPR_5_f));
        reg("service_area_sign", () -> new GenericSignBlock(BlockShapes.SERVICE_AREA_SIGN));
        reg("overpass_sign", () -> new GenericSignBlock(BlockShapes.OVERPASS_SIGN));
        reg("overpass_sign_2", () -> new GenericSignBlock(BlockShapes.OVERPASS_SIGN_2));
        reg("overpass_sign_3", () -> new GenericSignBlock(BlockShapes.OVERPASS_SIGN_3));
        reg("over_pass_sign_4", () -> new GenericSignBlock(BlockShapes.OVER_PASS_SIGN_4));
        reg("over_pass_5", () -> new GenericSignBlock(BlockShapes.OVER_PASS_5));
        reg("road_1", () -> new GenericSignBlock(BlockShapes.ROAD_1));
        reg("road_2", () -> new GenericSignBlock(BlockShapes.ROAD_2));
        reg("road_3", () -> new GenericSignBlock(BlockShapes.ROAD_3));
        reg("road_4", () -> new GenericSignBlock(BlockShapes.ROAD_4));
        reg("road_5", () -> new GenericSignBlock(BlockShapes.ROAD_5));
        reg("road_6", () -> new GenericSignBlock(BlockShapes.ROAD_6));
        reg("road_11", () -> new GenericSignBlock(BlockShapes.ROAD_11));
        reg("road_12", () -> new GenericSignBlock(BlockShapes.ROAD_12));
        reg("expr_sign_large", () -> new GenericSignBlock(BlockShapes.EXPR_SIGN_LARGE));
        reg("expressway_exit_sign", () -> new GenericSignBlock(BlockShapes.EXPRESSWAY_EXIT_SIGN));
        reg("expr_t_ips", () -> new GenericSignBlock(BlockShapes.EXPR_T_IPS));
        reg("traffic_sign", () -> new GenericSignBlock(BlockShapes.TRAFFIC_SIGN));
        reg("traffic_sign_l", () -> new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_L));
        reg("traffic_sign_r", () -> new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_R));
        reg("traffic_sign_t", () -> new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_T));
        reg("traffic_sign_1", () -> new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_1));
        reg("traffic_sign_2", () -> new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_2));
        reg("yellow_sign_2", () -> new GenericSignBlock(BlockShapes.YELLOW_SIGN_2));
        reg("road_screen", () -> new GenericSignBlock(BlockShapes.ROADSCREEN));
        reg("free_road_sign", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("free_expressway_sign", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("scenic_spot_sign", () -> new GenericSignBlock(BlockShapes.EXPR_1));
        reg("sign", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("left_sign", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("right_sign", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("pedestrians", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("parking", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("noparking_sign", () -> new GenericSignBlock(BlockShapes.FREESIGN));
        reg("white_sign", () -> new GenericSignBlock(BlockShapes.Hsign));
        reg("green_sign", () -> new GenericSignBlock(BlockShapes.Hsign));
        reg("yellow_sign", () -> new GenericSignBlock(CityShapes.Direction_Sign));
        reg("orangesign", () -> new GenericSignBlock(CityShapes.Direction_Sign));
        reg("orangesign_2", () -> new GenericSignBlock(BlockShapes.YELLOW_SIGN_2));
        reg("mediumsign_green", () -> new GenericSignBlock(BlockShapes.MediumSign));
        reg("mediumsign_blue", () -> new GenericSignBlock(BlockShapes.MediumSign));
        reg("mediumsign_white", () -> new GenericSignBlock(BlockShapes.MediumSign));
        reg("mediumsign_yellow", () -> new GenericSignBlock(BlockShapes.MediumSign));
        reg("mediumsign_orange", () -> new GenericSignBlock(BlockShapes.MediumSign));
        reg("sign_mini_green", () -> new GenericSignBlock(BlockShapes.SIGNMINI));
        reg("sign_mini_blue", () -> new GenericSignBlock(BlockShapes.SIGNMINI));
        reg("sign_mini_white", () -> new GenericSignBlock(BlockShapes.SIGNMINI));
        reg("sign_mini_yellow", () -> new GenericSignBlock(BlockShapes.SIGNMINI));
        reg("sign_mini_orange", () -> new GenericSignBlock(BlockShapes.SIGNMINI));
        reg("sign_mini_red", () -> new GenericSignBlock(BlockShapes.SIGNMINI));
        reg("white_sign2", () -> new GenericSignBlock(BlockShapes.YELLOW_SIGN_2));
        reg("expr_5g", () -> new GenericSignBlock(BlockShapes.EXPR_5_f));
        reg("bluesign", () -> new GenericSignBlock(CityShapes.Direction_Sign));
        reg("greensign2", () -> new GenericSignBlock(CityShapes.Direction_Sign));
        reg("whitesign3", () -> new GenericSignBlock(BlockShapes.Hsign));
        //消防
        reg("fireextinguisherbox", () -> new GenericMetalBlock(CityShapes.Fireextinguisherbox));
        reg("water_tank", () -> new GenericSignBlock(CityShapes.Concretebarrierfenced));
        // 杆子
        reg("pole", () -> new GenericSignBlock(BlockShapes.POLE));
        reg("pole_joint", () -> new GenericSignBlock(BlockShapes.POLE_JOINT));
        reg("pole_joint_double", () -> new GenericSignBlock(BlockShapes.POLE_JOINT_D));
        reg("pole_joint_l", () -> new GenericSignBlock(BlockShapes.POLE_JOINT_L));
        reg("pole_horizontal", () -> new GenericSignBlock(BlockShapes.POLE_H));
        reg("pole_expr", () -> new GenericSignBlock(BlockShapes.POLE_EXPR_L));
        reg("pole_expr_right", () -> new GenericSignBlock(BlockShapes.POLE_EXPR_R));
        reg("pole_exprmid", () -> new GenericSignBlock(BlockShapes.POLE_EXPR_M));
        reg("pole_fine_d", () -> new GenericSignBlock(BlockShapes.POLEFINE_D));
        reg("polefine_joint_d", () -> new GenericSignBlock(BlockShapes.POLEFINE_JOINT_D));
        reg("pole_fine", () -> new GenericSignBlock(BlockShapes.POLEFINE));
        reg("road_light_down", () -> new GenericSignBlock(BlockShapes.LAMPPOST));
        reg("lamppost", () -> new GenericSignBlock(BlockShapes.LAMPPOST));
        reg("separationpost", () -> new GenericSignBlock(BlockShapes.LAMPPOST));
        reg("separationpostb", () -> new GenericSignBlock(BlockShapes.LAMPPOST));
        reg("separationpostc", () -> new GenericSignBlock(BlockShapes.LAMPPOST));
        // 方向牌
        reg("direction_sign", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_right", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left_straight", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_right_straight", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left_right", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left_turnoff", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_signturnoff", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_straight_turnoff", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("all_direction_sign", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("variable_lanes", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("bus_lane", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("bike_lane", () -> new GenericMetalBlock(CityShapes.Direction_Sign));
        //路灯
        reg("road_light", () -> new GenericLightBlock(BlockShapes.ROADLIGHT));
        reg("street_light", () -> new GenericLightBlock(BlockShapes.STREETLIGHT));
        reg("street_light_b", () -> new GenericLightBlock(BlockShapes.STREETLIGHTB));
        reg("street_light_c", () -> new GenericLightBlock(BlockShapes.STREETLIGHTC));
        reg("street_light_d", () -> new GenericLightBlock(BlockShapes.STREETLIGHTD));
        // 交通标线
        reg("road_block", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_white_connect", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_yellow", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_yellow_double", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_yellow_connect", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_zebra_crossing", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("manhole_cover_a", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("manhole_cover_b", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_diamond", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_straight", () -> new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("roadblock_oblique", () -> new GenericMetalBlock(BlockShapes.LineO));
        reg("roadblock_yellow_oblique", () -> new GenericMetalBlock(BlockShapes.LineO));
        reg("roadblock_double_oblique", () -> new GenericMetalBlock(BlockShapes.LineO));
        reg("zebracrossing_oblique", () -> new GenericMetalBlock(BlockShapes.LineO));

        // 城市设施
        reg("speed_limit_sign", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_1", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_2", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_3", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_4", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_5", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_6", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_7", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_8", () -> new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("glass_fence", () -> new GenericMetalBlock(CityShapes.GlassFence));
        reg("modern_fence", () -> new GenericMetalBlock(CityShapes.ModernFence));
        reg("modern_fence_2", () -> new GenericMetalBlock(CityShapes.ModernFence2));
        reg("modern_fence_3", () -> new GenericMetalBlock(CityShapes.ModernFence3));
        reg("modern_ironfence", () -> new GenericMetalBlock(CityShapes.ModernIronFence));
        reg("moderniron_fence_yellow", () -> new GenericMetalBlock(CityShapes.ModernIronFenceYellow));
        reg("moderniron_fence_green", () -> new GenericMetalBlock(CityShapes.ModernIronFenceGreen));
        reg("moderniron_fence_blue", () -> new GenericMetalBlock(CityShapes.ModernIronFenceBlue));
        reg("concretebarrierfenced", () -> new GenericMetalBlock(CityShapes.Concretebarrierfenced));
        reg("restroom_sign", () -> new GenericMetalBlock(CityShapes.RestRoomSignMale));
        reg("rest_room_sign_female", () -> new GenericMetalBlock(CityShapes.RestRoomSignFeMale));
        reg("restroom_sign_third", () -> new GenericMetalBlock(CityShapes.RestRoomSignThird));
        reg("ac_cover", () -> new GenericMetalBlock(CityShapes.ACCOVER));
        reg("ac_cover_light", () -> new GenericMetalBlock(CityShapes.ACCOVER));
        reg("blue_shop_sign", () -> new GenericMetalBlock(CityShapes.ShopSign));
        reg("red_shop_sign", () -> new GenericMetalBlock(CityShapes.ShopSign));
        reg("blue_shop_sign_joint", () -> new GenericMetalBlock(CityShapes.ShopSignJ));
        reg("red_shop_sign_joint", () -> new GenericMetalBlock(CityShapes.ShopSignJ));
        reg("trash_bin", () -> new GenericMetalBlock(CityShapes.Trashbin));
        reg("roadsign_a", () -> new GenericMetalBlock(BlockShapes.FREESIGN));
        reg("roadsign_b", () -> new GenericMetalBlock(BlockShapes.FREESIGN));
        reg("barrier_gate_down", () -> new GenericMetalBlock(CityShapes.Barrier_gate_down));
        reg("barrier_gate_up", () -> new GenericMetalBlock(CityShapes.Barrier_gate_up));
        reg("barrier_gate_main_down", () -> new GenericMetalBlock(CityShapes.Barrier_gate_main_down));
        reg("barrier_gate_main_up", () -> new GenericMetalBlock(CityShapes.Barrier_gate_main_up));
        reg("concrete_wall_std", () -> new GenericMetalBlock(CityShapes.Concretebarrierfenced));
        reg("concrete_wall_warn", () -> new GenericMetalBlock(CityShapes.Concretebarrierfenced));
        reg("restroom_sign_public", () -> new GenericMetalBlock(CityShapes.RestRoomSignMale));
        reg("safety_wall_green", () -> new GenericMetalBlock(CityShapes.SAFETYWALL));
        reg("safety_wall_blue", () -> new GenericMetalBlock(CityShapes.SAFETYWALL));
        reg("safety_wall_alert", () -> new GenericMetalBlock(CityShapes.SAFETYWALL));
        reg("safety_wall_corner_green", () -> new GenericMetalBlock(CityShapes.Concretebarrierfenced));
        reg("safety_wall_corner_blue", () -> new GenericMetalBlock(CityShapes.Concretebarrierfenced));
        reg("safety_wall_corner_alert", () -> new GenericMetalBlock(CityShapes.Concretebarrierfenced));
        reg("powerbox", () -> new GenericMetalBlock(CityShapes.PWRBOX1));
        reg("power_box_2", () -> new GenericMetalBlock(CityShapes.PWRBOX2));
        reg("power_box_3", () -> new GenericMetalBlock(CityShapes.PWRBOX3));
        reg("power_box_4", () -> new GenericMetalBlock(CityShapes.PWRBOX4));
        reg("power_box_5", () -> new GenericMetalBlock(CityShapes.PWRBOX5));
        // ==================== 电器 ====================
        reg("ac_out_hd_1", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_01));
        reg("ac_out_hd_2", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_02));
        reg("ac_out_hd_3", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_03));
        reg("ac_out_hd_4", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_04));
        reg("ac_out_hd_5", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_05));
        reg("ac_out_hd_6", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_06));
        reg("air_condition_old_hd", () -> new GenericMetalBlock(ApplianceShapes.OLD_AC_HD));
        reg("big_ac_out_hd", () -> new GenericMetalBlock(ApplianceShapes.BIG_AC_OUT_HD));
        reg("centre_air_condition_outside", () -> new GenericMetalBlock(ApplianceShapes.CentreAirConditionOutside));
        reg("air_condition_hd_1", () -> new GenericMetalBlock(ApplianceShapes.AC_01));
        reg("air_condition_hd_2", () -> new GenericMetalBlock(ApplianceShapes.AC_02));
        reg("airconditionhd_3", () -> new GenericMetalBlock(ApplianceShapes.AC_03));
        reg("airconditionhd_4", () -> new GenericMetalBlock(ApplianceShapes.AC_04));
        reg("central_ac_hd", () -> new GenericMetalBlock(ApplianceShapes.CAC_HD));
        reg("micro_wave_oven", () -> new GenericMetalBlock(ApplianceShapes.MicroWaveOven));
        reg("fridge_1", () -> new GenericMetalBlock(ApplianceShapes.Fridge1));
        reg("fridge_2", () -> new GenericMetalBlock(ApplianceShapes.Fridge2));
        reg("old_fridge", () -> new GenericMetalBlock(ApplianceShapes.Old_Fridge));
        reg("old_tv_table", () -> new GenericMetalBlock(ApplianceShapes.OldTVTable));
        reg("freezer", () -> new GenericMetalBlock(ApplianceShapes.Freezer));
        reg("gas_water_heater", () -> new GenericMetalBlock(ApplianceShapes.GASWATERHEATER));
        reg("electric_water_heater", () -> new GenericMetalBlock(ApplianceShapes.ELECTRICWATERHEATER));
        reg("solarwaterheater", () -> new GenericMetalBlock(ApplianceShapes.SOLARWATERHEATER));
        reg("old_mainunit", () -> new GenericMetalBlock(ApplianceShapes.OLD_MAINUNIT));
        reg("mainunit_2010", () -> new GenericMetalBlock(ApplianceShapes.MAINUNIT2010));
        reg("main_unit_modern", () -> new GenericMetalBlock(ApplianceShapes.MODERMMAINUNIT));
        reg("express_box_1", () -> new GenericMetalBlock(ApplianceShapes.ExpressBox));
        reg("express_box_2", () -> new GenericMetalBlock(ApplianceShapes.ExpressBox));
        reg("old_mirror", () -> new GenericMetalBlock(BlockShapes.FREESIGN));
        reg("old_calendar", () -> new GenericMetalBlock(ApplianceShapes.OldCalendar));
        reg("television", () -> new Power(ApplianceShapes.TELEVISION));

        // 显示器（带开关）
        reg("old_monitor_off", () -> new Power(ApplianceShapes.Old_Monitor));
        reg("monitor_2010off", () -> new Power(ApplianceShapes.Monitor2010));
        reg("modern_monitor_off", () -> new Power(ApplianceShapes.ModernMonitor));
        reg("all_in_one_pc", () -> new Power(ApplianceShapes.AIOPC));
        reg("laptop", () -> new Power(ApplianceShapes.LAPTOP));

        // 已废弃
        reg("laptop_poweron", () -> new GenericLightBlock(ApplianceShapes.LAPTOP_ON));
        reg("old_monitor_on", () -> new GenericLightBlock(ApplianceShapes.Old_Monitor));
        reg("monitor_2010_on", () -> new GenericLightBlock(ApplianceShapes.Monitor2010));
        reg("modern_monitor_on", () -> new GenericLightBlock(ApplianceShapes.ModernMonitor));
        reg("all_in_one_pc_on", () -> new GenericLightBlock(ApplianceShapes.AIOPC));
        reg("air_conditioning", () -> new GenericMetalBlock(ApplianceShapes.EOLACIN));
        reg("hanging_air_conditioning", () -> new GenericMetalBlock(ApplianceShapes.AC_02));
        reg("air_conditioning_external_unit", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_01));
        reg("large_air_conditioning_external_unit", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_02));
        reg("centr_alir_conditioning", () -> new GenericMetalBlock(ApplianceShapes.EOLCAC));
        reg("road_sign", () -> new GenericSignBlock(CityShapes.RoadSign));
        reg("television_power_on", () -> new GenericLightBlock(ApplianceShapes.TELEVISION));
        // 家具
        reg("oldwardrobe", () -> new GenericMetalBlock(ApplianceShapes.WardrobeM));
        reg("oldwardrobesmall", () -> new GenericMetalBlock(ApplianceShapes.WardrobeS));
        reg("oldwardrobecorner", () -> new GenericMetalBlock(ApplianceShapes.WardrobeM));
        reg("modernwardrobe", () -> new GenericMetalBlock(ApplianceShapes.WardrobeM));
        reg("modernwardrobeup", () -> new GenericMetalBlock(ApplianceShapes.WardrobeS));
        reg("modernwardrobeb", () -> new GenericMetalBlock(ApplianceShapes.WardrobeL));

        // 载具
        reg("bikeblack", () -> new GenericMetalBlock(VehicleShapes.BikeBlack));
        reg("bike", () -> new GenericMetalBlock(VehicleShapes.BikeWhite));
        reg("electric_motorcycle", () -> new GenericMetalBlock(VehicleShapes.ElectricMotorWhite));
        reg("electric_motorcycle_black", () -> new GenericMetalBlock(VehicleShapes.ElectricMotorBlack));
        reg("scooter_white", () -> new GenericMetalBlock(VehicleShapes.ScooterWhite));
        reg("scooter_black", () -> new GenericMetalBlock(VehicleShapes.ScooterBlack));

        // 窗户
        reg("window_small_white", () -> new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_a_white", () -> new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_b_white", () -> new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_white", () -> new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_small_black", () -> new GenericGlassBlock(WindowsShapes.WINS));
        reg("window_medium_a_black", () -> new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_b_black", () -> new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_black", () -> new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_small_blue", () -> new GenericGlassBlock(WindowsShapes.WINS));
        reg("window_medium_a_blue", () -> new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_b_blue", () -> new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_blue", () -> new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_small_green", () -> new GenericGlassBlock(WindowsShapes.WINS));
        reg("window_medium_a_green", () -> new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_mediub_b_green", () -> new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_green", () -> new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_corner_white_small", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_black_small", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_small_blue", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_small_green", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_white_large", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_corner_black_large", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_corner_blue", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_corner_green", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("w_indow_oblique_white", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique_blue", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique_green", () -> new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique_large_white", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_oblique_large", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_oblique_large_blue", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_oblique_large_green", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("style_iron_window_corner", () -> new GenericGlassBlock(WindowsShapes.WINLC));
        reg("style_iron_window", () -> new GenericGlassBlock(WindowsShapes.WINMA));
        reg("wooden_window", () -> new GenericGlassBlock(WindowsShapes.WINCS));
        reg("old_window", () -> new GenericGlassBlock(WindowsShapes.WINCS));
        reg("security_window_small", () -> new GenericGlassBlock(WindowsShapes.WINCS));
        reg("security_window_small_2", () -> new GenericGlassBlock(WindowsShapes.WINCMB));
        reg("security_window_medium", () -> new GenericGlassBlock(WindowsShapes.WINCMA));
        reg("security_window_large", () -> new GenericGlassBlock(WindowsShapes.WINCL));

        // 海报
        reg("post_1691", () -> new GenericSignBlock(PostShapes.Post1691));
        reg("post_1692", () -> new GenericSignBlock(PostShapes.Post1692));
        reg("post_1693", () -> new GenericSignBlock(PostShapes.Post1693));
        reg("post_1694", () -> new GenericSignBlock(PostShapes.Post1694));
        reg("post_1695", () -> new GenericSignBlock(PostShapes.Post1695));
        reg("post_1696", () -> new GenericSignBlock(PostShapes.Post1696));
        reg("post_1697", () -> new GenericSignBlock(PostShapes.Post1697));
        reg("post_1698", () -> new GenericSignBlock(PostShapes.Post1698));
        reg("post_431", () -> new GenericSignBlock(PostShapes.Post431));
        reg("post_432", () -> new GenericSignBlock(PostShapes.Post432));
        reg("post_433", () -> new GenericSignBlock(PostShapes.Post433));

        // 其他
        reg("ac_out_nvidia", () -> new GenericMetalBlock(ApplianceShapes.AC2080));
        reg("ac_out_intel", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_06));
        reg("ac_out_amd", () -> new GenericMetalBlock(ApplianceShapes.AC2080));
        reg("ac_out_fake", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_05));
        reg("ac_out_40_hx", () -> new GenericMetalBlock(ApplianceShapes.AC_40HX));
        reg("internet_famous_road_sign", () -> new GenericSignBlock(BlockShapes.IFRS));
        //多方向
        reg("central_air_conditioning", () -> new GenericMultiFaceBlock(state -> {
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
    }

    private static void reg(String id, Supplier<? extends Block> factory) {
        BLOCKS.add(new BlockDef(id, factory));
    }
}