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

    public record BlockDef(String id, Supplier<Block> factory) {}

    public static final List<BlockDef> BLOCKS = new ArrayList<>();

    static {
        // ==================== 路牌 ====================
        reg("expr_1", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_1));
        reg("expr_2", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_2));
        reg("expr_3", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_3));
        reg("expr_4", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_4));
        reg("expr_5", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_5));
        reg("expr_5a", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_5a));
        reg("expr_5b", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_5b));
        reg("expr_5c", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_5c));
        reg("expr_5_d", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_5_d));
        reg("expr_5_e", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_5_e));
        reg("expr_5_f", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_5_f));
        reg("service_area_sign", () -> (Block) new GenericSignBlock(BlockShapes.SERVICE_AREA_SIGN));
        reg("overpass_sign", () -> (Block) new GenericSignBlock(BlockShapes.OVERPASS_SIGN));
        reg("overpass_sign_2", () -> (Block) new GenericSignBlock(BlockShapes.OVERPASS_SIGN_2));
        reg("overpass_sign_3", () -> (Block) new GenericSignBlock(BlockShapes.OVERPASS_SIGN_3));
        reg("over_pass_sign_4", () -> (Block) new GenericSignBlock(BlockShapes.OVER_PASS_SIGN_4));
        reg("over_pass_5", () -> (Block) new GenericSignBlock(BlockShapes.OVER_PASS_5));
        reg("road_1", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_1));
        reg("road_2", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_2));
        reg("road_3", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_3));
        reg("road_4", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_4));
        reg("road_5", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_5));
        reg("road_6", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_6));
        reg("road_11", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_11));
        reg("road_12", () -> (Block) new GenericSignBlock(BlockShapes.ROAD_12));
        reg("expr_sign_large", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_SIGN_LARGE));
        reg("expressway_exit_sign", () -> (Block) new GenericSignBlock(BlockShapes.EXPRESSWAY_EXIT_SIGN));
        reg("expr_t_ips", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_T_IPS));
        reg("traffic_sign", () -> (Block) new GenericSignBlock(BlockShapes.TRAFFIC_SIGN));
        reg("traffic_sign_l", () -> (Block) new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_L));
        reg("traffic_sign_r", () -> (Block) new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_R));
        reg("traffic_sign_t", () -> (Block) new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_T));
        reg("traffic_sign_1", () -> (Block) new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_1));
        reg("traffic_sign_2", () -> (Block) new GenericSignBlock(BlockShapes.TRAFFIC_SIGN_2));
        reg("yellow_sign_2", () -> (Block) new GenericSignBlock(BlockShapes.YELLOW_SIGN_2));
        reg("road_screen", () -> (Block) new GenericSignBlock(BlockShapes.ROADSCREEN));
        reg("free_road_sign", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));
        reg("free_expressway_sign", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));
        reg("scenic_spot_sign", () -> (Block) new GenericSignBlock(BlockShapes.EXPR_1));
        reg("sign", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));
        reg("left_sign", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));
        reg("right_sign", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));
        reg("pedestrians", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));
        reg("parking", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));
        reg("noparking_sign", () -> (Block) new GenericSignBlock(BlockShapes.FREESIGN));

        // 杆子
        reg("pole", () -> (Block) new GenericSignBlock(BlockShapes.POLE));
        reg("pole_joint", () -> (Block) new GenericSignBlock(BlockShapes.POLE_JOINT));
        reg("pole_joint_double", () -> (Block) new GenericSignBlock(BlockShapes.POLE_JOINT_D));
        reg("pole_joint_l", () -> (Block) new GenericSignBlock(BlockShapes.POLE_JOINT_L));
        reg("pole_horizontal", () -> (Block) new GenericSignBlock(BlockShapes.POLE_H));
        reg("pole_expr", () -> (Block) new GenericSignBlock(BlockShapes.POLE_EXPR_L));
        reg("pole_expr_right", () -> (Block) new GenericSignBlock(BlockShapes.POLE_EXPR_R));
        reg("pole_exprmid", () -> (Block) new GenericSignBlock(BlockShapes.POLE_EXPR_M));
        reg("pole_fine_d", () -> (Block) new GenericSignBlock(BlockShapes.POLEFINE_D));
        reg("polefine_joint_d", () -> (Block) new GenericSignBlock(BlockShapes.POLEFINE_JOINT_D));

        // 方向牌
        reg("direction_sign", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_right", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left_straight", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_right_straight", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left_right", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_sign_left_turnoff", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_signturnoff", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("direction_straight_turnoff", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("all_direction_sign", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("variable_lanes", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("bus_lane", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));
        reg("bike_lane", () -> (Block) new GenericMetalBlock(CityShapes.Direction_Sign));

        // 交通标线
        reg("road_block", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_white_connect", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_yellow", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_yellow_double", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_yellow_connect", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_zebra_crossing", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("manhole_cover_a", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("manhole_cover_b", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_diamond", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));
        reg("road_straight", () -> (Block) new GenericMetalBlock(BlockShapes.TRAFFICLINE));

        // 城市设施
        reg("speed_limit_sign", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_1", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_2", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_3", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_4", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_5", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_6", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_7", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("speed_limit_sign_8", () -> (Block) new GenericMetalBlock(CityShapes.SpeedLimitSign));
        reg("glass_fence", () -> (Block) new GenericMetalBlock(CityShapes.GlassFence));
        reg("modern_fence", () -> (Block) new GenericMetalBlock(CityShapes.ModernFence));
        reg("modern_fence_2", () -> (Block) new GenericMetalBlock(CityShapes.ModernFence2));
        reg("modern_fence_3", () -> (Block) new GenericMetalBlock(CityShapes.ModernFence3));
        reg("modern_ironfence", () -> (Block) new GenericMetalBlock(CityShapes.ModernIronFence));
        reg("moderniron_fence_yellow", () -> (Block) new GenericMetalBlock(CityShapes.ModernIronFenceYellow));
        reg("moderniron_fence_green", () -> (Block) new GenericMetalBlock(CityShapes.ModernIronFenceGreen));
        reg("moderniron_fence_blue", () -> (Block) new GenericMetalBlock(CityShapes.ModernIronFenceBlue));
        reg("concretebarrierfenced", () -> (Block) new GenericMetalBlock(CityShapes.Concretebarrierfenced));
        reg("fireextinguisherbox", () -> (Block) new GenericMetalBlock(CityShapes.Fireextinguisherbox));
        reg("restroom_sign", () -> (Block) new GenericMetalBlock(CityShapes.RestRoomSignMale));
        reg("rest_room_sign_female", () -> (Block) new GenericMetalBlock(CityShapes.RestRoomSignFeMale));
        reg("restroom_sign_third", () -> (Block) new GenericMetalBlock(CityShapes.RestRoomSignThird));
        reg("ac_cover", () -> (Block) new GenericMetalBlock(CityShapes.ACCOVER));
        reg("ac_cover_light", () -> (Block) new GenericMetalBlock(CityShapes.ACCOVER));
        reg("blue_shop_sign", () -> (Block) new GenericMetalBlock(CityShapes.ShopSign));
        reg("red_shop_sign", () -> (Block) new GenericMetalBlock(CityShapes.ShopSign));
        reg("blue_shop_sign_joint", () -> (Block) new GenericMetalBlock(CityShapes.ShopSignJ));
        reg("red_shop_sign_joint", () -> (Block) new GenericMetalBlock(CityShapes.ShopSignJ));
        reg("trash_bin", () -> (Block) new GenericMetalBlock(CityShapes.Trashbin));
        reg("roadsign_a", () -> (Block) new GenericMetalBlock(BlockShapes.FREESIGN));
        reg("roadsign_b", () -> (Block) new GenericMetalBlock(BlockShapes.FREESIGN));
        reg("barrier_gate_down", () -> (Block) new GenericMetalBlock(CityShapes.Barrier_gate_down));
        reg("barrier_gate_up", () -> (Block) new GenericMetalBlock(CityShapes.Barrier_gate_up));
        reg("barrier_gate_main_down", () -> (Block) new GenericMetalBlock(CityShapes.Barrier_gate_main_down));
        reg("barrier_gate_main_up", () -> (Block) new GenericMetalBlock(CityShapes.Barrier_gate_main_up));
        // ==================== 电器 ====================
        reg("ac_out_hd_1", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_01));
        reg("ac_out_hd_2", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_02));
        reg("ac_out_hd_3", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_03));
        reg("ac_out_hd_4", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_04));
        reg("ac_out_hd_5", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_05));
        reg("ac_out_hd_6", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_06));
        reg("air_condition_old_hd", () -> (Block) new GenericMetalBlock(ApplianceShapes.OLD_AC_HD));
        reg("big_ac_out_hd", () -> (Block) new GenericMetalBlock(ApplianceShapes.BIG_AC_OUT_HD));
        reg("centre_air_condition_outside", () -> (Block) new GenericMetalBlock(ApplianceShapes.CentreAirConditionOutside));
        reg("air_condition_hd_1", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_01));
        reg("air_condition_hd_2", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_02));
        reg("airconditionhd_3", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_03));
        reg("airconditionhd_4", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_04));
        reg("central_ac_hd", () -> (Block) new GenericMetalBlock(ApplianceShapes.CAC_HD));
        reg("micro_wave_oven", () -> (Block) new GenericMetalBlock(ApplianceShapes.MicroWaveOven));
        reg("fridge_1", () -> (Block) new GenericMetalBlock(ApplianceShapes.Fridge1));
        reg("fridge_2", () -> (Block) new GenericMetalBlock(ApplianceShapes.Fridge2));
        reg("old_fridge", () -> (Block) new GenericMetalBlock(ApplianceShapes.Old_Fridge));
        reg("freezer", () -> (Block) new GenericMetalBlock(ApplianceShapes.Freezer));
        reg("gas_water_heater", () -> (Block) new GenericMetalBlock(ApplianceShapes.GASWATERHEATER));
        reg("electric_water_heater", () -> (Block) new GenericMetalBlock(ApplianceShapes.ELECTRICWATERHEATER));
        reg("solarwaterheater", () -> (Block) new GenericMetalBlock(ApplianceShapes.SOLARWATERHEATER));
        reg("old_mainunit", () -> (Block) new GenericMetalBlock(ApplianceShapes.OLD_MAINUNIT));
        reg("mainunit_2010", () -> (Block) new GenericMetalBlock(ApplianceShapes.MAINUNIT2010));
        reg("main_unit_modern", () -> (Block) new GenericMetalBlock(ApplianceShapes.MODERMMAINUNIT));
        reg("express_box_1", () -> (Block) new GenericMetalBlock(ApplianceShapes.ExpressBox));
        reg("express_box_2", () -> (Block) new GenericMetalBlock(ApplianceShapes.ExpressBox));

        // 显示器（带开关）
        reg("old_monitor_off", () -> (Block) new Power(ApplianceShapes.Old_Monitor));
        reg("monitor_2010off", () -> (Block) new Power(ApplianceShapes.Monitor2010));
        reg("modern_monitor_off", () -> (Block) new Power(ApplianceShapes.ModernMonitor));
        reg("all_in_one_pc", () -> (Block) new Power(ApplianceShapes.AIOPC));
        reg("laptop", () -> (Block) new Power(ApplianceShapes.LAPTOP,ApplianceShapes.LAPTOP_ON));

        // 已废弃
        reg("laptop_poweron", () -> (Block) new GenericLightBlock(ApplianceShapes.LAPTOP_ON));
        reg("old_monitor_on", () -> (Block) new GenericLightBlock(ApplianceShapes.Old_Monitor));
        reg("monitor_2010_on", () -> (Block) new GenericLightBlock(ApplianceShapes.Monitor2010));
        reg("modern_monitor_on", () -> (Block) new GenericLightBlock(ApplianceShapes.ModernMonitor));
        reg("all_in_one_pc_on", () -> (Block) new GenericLightBlock(ApplianceShapes.AIOPC));
        reg("air_conditioning", () -> (Block) new GenericMetalBlock(ApplianceShapes.EOLACIN));
        reg("hanging_air_conditioning", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_02));
        reg("air_conditioning_external_unit", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_01));
        reg("large_air_conditioning_external_unit", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_02));
        reg("centr_alir_conditioning", () -> (Block) new GenericMetalBlock(ApplianceShapes.EOLCAC));
        reg("road_sign", () -> (Block) new GenericSignBlock(CityShapes.RoadSign));
        // 家具
        reg("oldwardrobe", () -> (Block) new GenericMetalBlock(ApplianceShapes.WardrobeM));
        reg("oldwardrobesmall", () -> (Block) new GenericMetalBlock(ApplianceShapes.WardrobeS));
        reg("oldwardrobecorner", () -> (Block) new GenericMetalBlock(ApplianceShapes.WardrobeM));
        reg("modernwardrobe", () -> (Block) new GenericMetalBlock(ApplianceShapes.WardrobeM));
        reg("modernwardrobeup", () -> (Block) new GenericMetalBlock(ApplianceShapes.WardrobeS));
        reg("modernwardrobeb", () -> (Block) new GenericMetalBlock(ApplianceShapes.WardrobeL));

        // 载具
        reg("bikeblack", () -> (Block) new GenericMetalBlock(VehicleShapes.BikeBlack));
        reg("bike", () -> (Block) new GenericMetalBlock(VehicleShapes.BikeWhite));
        reg("electric_motorcycle", () -> (Block) new GenericMetalBlock(VehicleShapes.ElectricMotorWhite));
        reg("electric_motorcycle_black", () -> (Block) new GenericMetalBlock(VehicleShapes.ElectricMotorBlack));
        reg("scooter_white", () -> (Block) new GenericMetalBlock(VehicleShapes.ScooterWhite));
        reg("scooter_black", () -> (Block) new GenericMetalBlock(VehicleShapes.ScooterBlack));

        // 窗户
        reg("window_small_white", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_a_white", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_b_white", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_white", () -> (Block) new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_small_black", () -> (Block) new GenericGlassBlock(WindowsShapes.WINS));
        reg("window_medium_a_black", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_b_black", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_black", () -> (Block) new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_small_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINS));
        reg("window_medium_a_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_medium_b_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_small_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINS));
        reg("window_medium_a_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMA));
        reg("window_mediub_b_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMB));
        reg("window_large_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINL));
        reg("window_corner_white_small", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_black_small", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_small_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_small_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_corner_white_large", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_corner_black_large", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_corner_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_corner_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("w_indow_oblique_white", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINSC));
        reg("window_oblique_large_white", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_oblique_large", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_oblique_large_blue", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("window_oblique_large_green", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("style_iron_window_corner", () -> (Block) new GenericGlassBlock(WindowsShapes.WINLC));
        reg("style_iron_window", () -> (Block) new GenericGlassBlock(WindowsShapes.WINMA));
        reg("wooden_window", () -> (Block) new GenericGlassBlock(WindowsShapes.WINCS));
        reg("old_window", () -> (Block) new GenericGlassBlock(WindowsShapes.WINCS));
        reg("security_window_small", () -> (Block) new GenericGlassBlock(WindowsShapes.WINCS));
        reg("security_window_small_2", () -> (Block) new GenericGlassBlock(WindowsShapes.WINCMB));
        reg("security_window_medium", () -> (Block) new GenericGlassBlock(WindowsShapes.WINCMA));
        reg("security_window_large", () -> (Block) new GenericGlassBlock(WindowsShapes.WINCL));

        // 海报
        reg("post_1691", () -> (Block) new GenericSignBlock(PostShapes.Post1691));
        reg("post_1692", () -> (Block) new GenericSignBlock(PostShapes.Post1692));
        reg("post_1693", () -> (Block) new GenericSignBlock(PostShapes.Post1693));
        reg("post_1694", () -> (Block) new GenericSignBlock(PostShapes.Post1694));
        reg("post_1695", () -> (Block) new GenericSignBlock(PostShapes.Post1695));
        reg("post_1696", () -> (Block) new GenericSignBlock(PostShapes.Post1696));
        reg("post_1697", () -> (Block) new GenericSignBlock(PostShapes.Post1697));
        reg("post_1698", () -> (Block) new GenericSignBlock(PostShapes.Post1698));
        reg("post_431", () -> (Block) new GenericSignBlock(PostShapes.Post431));
        reg("post_432", () -> (Block) new GenericSignBlock(PostShapes.Post432));
        reg("post_433", () -> (Block) new GenericSignBlock(PostShapes.Post433));

        // 其他
        reg("ac_out_nvidia", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC2080));
        reg("ac_out_intel", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_06));
        reg("ac_out_amd", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC2080));
        reg("ac_out_fake", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_OUT_05));
        reg("ac_out_40_hx", () -> (Block) new GenericMetalBlock(ApplianceShapes.AC_40HX));
        reg("internet_famous_road_sign", () -> (Block) new GenericSignBlock(BlockShapes.IFRS));
        //多方向
        reg("central_air_conditioning", () ->(Block) new GenericMultiFaceBlock(new java.util.function.Function<BlockState, VoxelShape>() {
            @Override
            public VoxelShape apply(BlockState state) {
                Direction facing = state.getValue(GenericMultiFaceBlock.FACING);
                AttachFace face = state.getValue(GenericMultiFaceBlock.FACE);

                if (facing == Direction.SOUTH) {
                    if (face == AttachFace.FLOOR) return Block.box(-10, 0, 4, 26, 1, 12);
                    if (face == AttachFace.WALL) return Block.box(-10, 4, 0, 26, 12, 1);
                    if (face == AttachFace.CEILING) return Block.box(-10, 15, 4, 26, 16, 12);
                }
                if (facing == Direction.NORTH) {
                    if (face == AttachFace.FLOOR) return Block.box(-10, 0, 4, 26, 1, 12);
                    if (face == AttachFace.WALL) return Block.box(-10, 4, 15, 26, 12, 16);
                    if (face == AttachFace.CEILING) return Block.box(-10, 15, 4, 26, 16, 12);
                }
                if (facing == Direction.EAST) {
                    if (face == AttachFace.FLOOR) return Block.box(4, 0, -10, 12, 1, 26);
                    if (face == AttachFace.WALL) return Block.box(0, 4, -10, 1, 12, 26);
                    if (face == AttachFace.CEILING) return Block.box(4, 15, -10, 12, 16, 26);
                }
                if (facing == Direction.WEST) {
                    if (face == AttachFace.FLOOR) return Block.box(4, 0, -10, 12, 1, 26);
                    if (face == AttachFace.WALL) return Block.box(15, 4, -10, 16, 12, 26);
                    if (face == AttachFace.CEILING) return Block.box(4, 15, -10, 12, 16, 26);
                }
                return Block.box(0, 0, 0, 16, 16, 16);
            }
        }));
    }
    private static void reg(String id, Supplier<? extends Block> factory) {
        BLOCKS.add(new BlockDef(id, factory::get));
    }
}