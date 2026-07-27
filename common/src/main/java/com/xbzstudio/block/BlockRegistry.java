package com.xbzstudio.block;

import com.xbzstudio.BlockDef;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
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



    public static final List<BlockDef> BLOCKS = new ArrayList<>();

    static {
        // ==================== 路牌 ====================
        reg("expr_1", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_1));
        reg("expr_2", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_2));
        reg("expr_3", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_3));
        reg("expr_4", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_4));
        reg("expr_5", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5));
        reg("expr_5a", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5a));
        reg("expr_5b", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5b));
        reg("expr_5c", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5c));
        reg("expr_5_d", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5_d));
        reg("expr_5_e", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5_e));
        reg("expr_5_f", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5_f));
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
        reg("expr_sign_large", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_SIGN_LARGE));
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
        reg("scenic_spot_sign", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_1));
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
        reg("expr_5g", (id) -> new GenericSignBlock(id,BlockShapes.EXPR_5_f));
        reg("bluesign", (id) -> new GenericSignBlock(id,CityShapes.Direction_Sign));
        reg("greensign2", (id) -> new GenericSignBlock(id,CityShapes.Direction_Sign));
        reg("whitesign3", (id) -> new GenericSignBlock(id,BlockShapes.Hsign));
        reg("expressway_fence", (id) -> new GenericSignBlock(id,BlockShapes.ExprFence));
        reg("expressway_fence_green", (id) -> new GenericSignBlock(id,BlockShapes.ExprFence));
        reg("expressway_fence_joint", (id) -> new GenericSignBlock(id,BlockShapes.ExprFenceJ));
        reg("expressway_fence_green_joint", (id) -> new GenericSignBlock(id,BlockShapes.ExprFenceJ));
        reg("vehicle_dstance_confirmation_sign", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("vehicle_distance_confirmation_sign_b", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        reg("vehicle_distance_confirmation_sign_c", (id) -> new GenericSignBlock(id,BlockShapes.SIGNMINI));
        //消防
        reg("fireextinguisherbox", (id) -> new GenericMetalBlock(id,CityShapes.Fireextinguisherbox));
        reg("water_tank", (id) -> new GenericSignBlock(id,CityShapes.Concretebarrierfenced));
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
        // ==================== 电器 ====================
        reg("ac_out_hd_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_01));
        reg("ac_out_hd_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_02));
        reg("ac_out_hd_3", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_03));
        reg("ac_out_hd_4", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_04));
        reg("ac_out_hd_5", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_05));
        reg("ac_out_hd_6", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_06));
        reg("air_condition_old_hd", (id) -> new GenericMetalBlock(id,ApplianceShapes.OLD_AC_HD));
        reg("big_ac_out_hd", (id) -> new GenericMetalBlock(id,ApplianceShapes.BIG_AC_OUT_HD));
        reg("centre_air_condition_outside", (id) -> new GenericMetalBlock(id,ApplianceShapes.CentreAirConditionOutside));
        reg("air_condition_hd_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_01));
        reg("air_condition_hd_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_02));
        reg("airconditionhd_3", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_03));
        reg("airconditionhd_4", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_04));
        reg("central_ac_hd", (id) -> new GenericMetalBlock(id,ApplianceShapes.CAC_HD));
        reg("micro_wave_oven", (id) -> new GenericMetalBlock(id,ApplianceShapes.MicroWaveOven));
        reg("fridge_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.Fridge1));
        reg("fridge_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.Fridge2));
        reg("old_fridge", (id) -> new GenericMetalBlock(id,ApplianceShapes.Old_Fridge));
        reg("old_tv_table", (id) -> new GenericMetalBlock(id,ApplianceShapes.OldTVTable));
        reg("freezer", (id) -> new GenericMetalBlock(id,ApplianceShapes.Freezer));
        reg("gas_water_heater", (id) -> new GenericMetalBlock(id,ApplianceShapes.GASWATERHEATER));
        reg("electric_water_heater", (id) -> new GenericMetalBlock(id,ApplianceShapes.ELECTRICWATERHEATER));
        reg("solarwaterheater", (id) -> new GenericMetalBlock(id,ApplianceShapes.SOLARWATERHEATER));
        reg("old_mainunit", (id) -> new GenericMetalBlock(id,ApplianceShapes.OLD_MAINUNIT));
        reg("mainunit_2010", (id) -> new GenericMetalBlock(id,ApplianceShapes.MAINUNIT2010));
        reg("main_unit_modern", (id) -> new GenericMetalBlock(id,ApplianceShapes.MODERMMAINUNIT));
        reg("express_box_1", (id) -> new GenericMetalBlock(id,ApplianceShapes.ExpressBox));
        reg("express_box_2", (id) -> new GenericMetalBlock(id,ApplianceShapes.ExpressBox));
        reg("old_mirror", (id) -> new GenericMetalBlock(id,BlockShapes.FREESIGN));
        reg("old_calendar", (id) -> new GenericMetalBlock(id,ApplianceShapes.OldCalendar));
        reg("television", (id) -> new Power(id,ApplianceShapes.TELEVISION));

        // 显示器（带开关）
        reg("old_monitor_off", (id) -> new Power(id,ApplianceShapes.Old_Monitor));
        reg("monitor_2010off", (id) -> new Power(id,ApplianceShapes.Monitor2010));
        reg("modern_monitor_off", (id) -> new Power(id,ApplianceShapes.ModernMonitor));
        reg("all_in_one_pc", (id) -> new Power(id,ApplianceShapes.AIOPC));
        reg("laptop", (id) -> new Power(id,ApplianceShapes.LAPTOP));

        // 已废弃
        reg("laptop_poweron", (id) -> new GenericLightBlock(id,ApplianceShapes.LAPTOP_ON));
        reg("old_monitor_on", (id) -> new GenericLightBlock(id,ApplianceShapes.Old_Monitor));
        reg("monitor_2010_on", (id) -> new GenericLightBlock(id,ApplianceShapes.Monitor2010));
        reg("modern_monitor_on", (id) -> new GenericLightBlock(id,ApplianceShapes.ModernMonitor));
        reg("all_in_one_pc_on", (id) -> new GenericLightBlock(id,ApplianceShapes.AIOPC));
        reg("air_conditioning", (id) -> new GenericMetalBlock(id,ApplianceShapes.EOLACIN));
        reg("hanging_air_conditioning", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_02));
        reg("air_conditioning_external_unit", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_01));
        reg("large_air_conditioning_external_unit", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_02));
        reg("centr_alir_conditioning", (id) -> new GenericMetalBlock(id,ApplianceShapes.EOLCAC));
        reg("road_sign", (id) -> new GenericSignBlock(id,CityShapes.RoadSign));
        reg("television_power_on", (id) -> new GenericLightBlock(id,ApplianceShapes.TELEVISION));
        // 家具
        reg("oldwardrobe", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeM));
        reg("oldwardrobesmall", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeS));
        reg("oldwardrobecorner", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeM));
        reg("modernwardrobe", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeM));
        reg("modernwardrobeup", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeS));
        reg("modernwardrobeb", (id) -> new GenericMetalBlock(id,ApplianceShapes.WardrobeL));

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

        // 海报
        reg("post_1691", (id) -> new GenericSignBlock(id,PostShapes.Post1691));
        reg("post_1692", (id) -> new GenericSignBlock(id,PostShapes.Post1692));
        reg("post_1693", (id) -> new GenericSignBlock(id,PostShapes.Post1693));
        reg("post_1694", (id) -> new GenericSignBlock(id,PostShapes.Post1694));
        reg("post_1695", (id) -> new GenericSignBlock(id,PostShapes.Post1695));
        reg("post_1696", (id) -> new GenericSignBlock(id,PostShapes.Post1696));
        reg("post_1697", (id) -> new GenericSignBlock(id,PostShapes.Post1697));
        reg("post_1698", (id) -> new GenericSignBlock(id,PostShapes.Post1698));
        reg("post_431", (id) -> new GenericSignBlock(id,PostShapes.Post431));
        reg("post_432", (id) -> new GenericSignBlock(id,PostShapes.Post432));
        reg("post_433", (id) -> new GenericSignBlock(id,PostShapes.Post433));

        // 其他
        reg("ac_out_nvidia", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC2080));
        reg("ac_out_intel", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_06));
        reg("ac_out_amd", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC2080));
        reg("ac_out_fake", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_OUT_05));
        reg("ac_out_40_hx", (id) -> new GenericMetalBlock(id,ApplianceShapes.AC_40HX));
        reg("internet_famous_road_sign", (id) -> new GenericSignBlock(id,BlockShapes.IFRS));
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
    }

    private static void reg(String id, Function<Identifier, ? extends Block> factory) {
        BLOCKS.add(new BlockDef(id, factory));
    }
}