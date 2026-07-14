package com.xbzstudio.forge;

import java.util.List;
import com.xbzstudio.block.*;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "citymod");
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "citymod");
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "citymod");

    private static final Map<String, RegistryObject<Block>> ALL_BLOCKS = new LinkedHashMap<>();

    // ==================== 路牌 ====================
    public static final RegistryObject<Block> EXPR_1 = registerSign("expr_1", BlockShapes.EXPR_1);
    public static final RegistryObject<Block> EXPR_2 = registerSign("expr_2", BlockShapes.EXPR_2);
    public static final RegistryObject<Block> EXPR_3 = registerSign("expr_3", BlockShapes.EXPR_3);
    public static final RegistryObject<Block> EXPR_4 = registerSign("expr_4", BlockShapes.EXPR_4);
    public static final RegistryObject<Block> EXPR_5 = registerSign("expr_5", BlockShapes.EXPR_5);
    public static final RegistryObject<Block> EXPR_5a = registerSign("expr_5a", BlockShapes.EXPR_5a);
    public static final RegistryObject<Block> EXPR_5b = registerSign("expr_5b", BlockShapes.EXPR_5b);
    public static final RegistryObject<Block> EXPR_5c = registerSign("expr_5c", BlockShapes.EXPR_5c);
    public static final RegistryObject<Block> EXPR_5_d = registerSign("expr_5_d", BlockShapes.EXPR_5_d);
    public static final RegistryObject<Block> EXPR_5_e = registerSign("expr_5_e", BlockShapes.EXPR_5_e);
    public static final RegistryObject<Block> EXPR_5_f = registerSign("expr_5_f", BlockShapes.EXPR_5_f);
    public static final RegistryObject<Block> SERVICE_AREA_SIGN = registerSign("service_area_sign", BlockShapes.SERVICE_AREA_SIGN);
    public static final RegistryObject<Block> OVERPASS_SIGN = registerSign("overpass_sign", BlockShapes.OVERPASS_SIGN);
    public static final RegistryObject<Block> OVERPASS_SIGN_2 = registerSign("overpass_sign_2", BlockShapes.OVERPASS_SIGN_2);
    public static final RegistryObject<Block> OVERPASS_SIGN_3 = registerSign("overpass_sign_3", BlockShapes.OVERPASS_SIGN_3);
    public static final RegistryObject<Block> OVER_PASS_SIGN_4 = registerSign("over_pass_sign_4", BlockShapes.OVER_PASS_SIGN_4);
    public static final RegistryObject<Block> ROAD_6 = registerSign("road_6", BlockShapes.ROAD_6);
    public static final RegistryObject<Block> ROAD_11 = registerSign("road_11", BlockShapes.ROAD_11);
    public static final RegistryObject<Block> EXPR_SIGN_LARGE = registerSign("expr_sign_large", BlockShapes.EXPR_SIGN_LARGE);
    public static final RegistryObject<Block> EXPRESSWAY_EXIT_SIGN = registerSign("expressway_exit_sign", BlockShapes.EXPRESSWAY_EXIT_SIGN);
    public static final RegistryObject<Block> EXPR_T_IPS = registerSign("expr_t_ips", BlockShapes.EXPR_T_IPS);
    public static final RegistryObject<Block> TRAFFIC_SIGN = registerSign("traffic_sign", BlockShapes.TRAFFIC_SIGN);
    public static final RegistryObject<Block> TRAFFIC_SIGN_L = registerSign("traffic_sign_l", BlockShapes.TRAFFIC_SIGN_L);
    public static final RegistryObject<Block> TRAFFIC_SIGN_R = registerSign("traffic_sign_r", BlockShapes.TRAFFIC_SIGN_R);
    public static final RegistryObject<Block> TRAFFIC_SIGN_T = registerSign("traffic_sign_t", BlockShapes.TRAFFIC_SIGN_T);
    public static final RegistryObject<Block> TRAFFIC_SIGN_1 = registerSign("traffic_sign_1", BlockShapes.TRAFFIC_SIGN_1);
    public static final RegistryObject<Block> TRAFFIC_SIGN_2 = registerSign("traffic_sign_2", BlockShapes.TRAFFIC_SIGN_2);
    public static final RegistryObject<Block> ROAD_1 = registerSign("road_1", BlockShapes.ROAD_1);
    public static final RegistryObject<Block> ROAD_2 = registerSign("road_2", BlockShapes.ROAD_2);
    public static final RegistryObject<Block> ROAD_3 = registerSign("road_3", BlockShapes.ROAD_3);
    public static final RegistryObject<Block> ROAD_4 = registerSign("road_4", BlockShapes.ROAD_4);
    public static final RegistryObject<Block> ROAD_5 = registerSign("road_5", BlockShapes.ROAD_5);
    public static final RegistryObject<Block> ROAD_12 = registerSign("road_12", BlockShapes.ROAD_12);
    public static final RegistryObject<Block> FREESIGN = registerSign("free_road_sign", BlockShapes.FREESIGN);
    public static final RegistryObject<Block> FREEExprSIGN = registerSign("free_expressway_sign", BlockShapes.FREESIGN);
    public static final RegistryObject<Block> OVER_PASS_5 = registerSign("over_pass_5", BlockShapes.OVER_PASS_5);
    public static final RegistryObject<Block> YELLOW_SIGN_2 = registerSign("yellow_sign_2", BlockShapes.YELLOW_SIGN_2);
    public static final RegistryObject<Block> ROADSCREEN = registerSign("road_screen", BlockShapes.ROADSCREEN);
    public static final RegistryObject<Block> POLE = registerSign("pole", BlockShapes.POLE);
    public static final RegistryObject<Block> POLE_JOINT_ = registerSign("pole_joint", BlockShapes.POLE_JOINT);
    public static final RegistryObject<Block> POLE_JOINT_D = registerSign("pole_joint_double", BlockShapes.POLE_JOINT_D);
    public static final RegistryObject<Block> POLE_JOINT_L = registerSign("pole_joint_l", BlockShapes.POLE_JOINT_L);
    public static final RegistryObject<Block> POLE_H = registerSign("pole_horizontal", BlockShapes.POLE_H);
    public static final RegistryObject<Block> POLE_EXPR_L = registerSign("pole_expr", BlockShapes.POLE_EXPR_L);
    public static final RegistryObject<Block> POLE_EXPR_R = registerSign("pole_expr_right", BlockShapes.POLE_EXPR_R);
    public static final RegistryObject<Block> POLE_EXPR_M = registerSign("pole_exprmid", BlockShapes.POLE_EXPR_M);
    public static final RegistryObject<Block> POLEFINE_D = registerSign("pole_fine_d", BlockShapes.POLEFINE_D);
    public static final RegistryObject<Block> POLEFINE_JOINT_D = registerSign("polefine_joint_d", BlockShapes.POLEFINE_JOINT_D);
    // ==================== 城市 ====================
    public static final RegistryObject<Block> SpeedLimitSign = registerAppliance("speed_limit_sign_1", CityShapes.SpeedLimitSign);
    public static final RegistryObject<Block> SpeedLimitSign2 = registerAppliance("speed_limit_sign_2", CityShapes.SpeedLimitSign2);
    public static final RegistryObject<Block> SpeedLimitSign3 = registerAppliance("speed_limit_sign_3", CityShapes.SpeedLimitSign3);
    public static final RegistryObject<Block> SpeedLimitSign4 = registerAppliance("speed_limit_sign_4", CityShapes.SpeedLimitSign4);
    public static final RegistryObject<Block> SpeedLimitSign5 = registerAppliance("speed_limit_sign_5", CityShapes.SpeedLimitSign5);
    public static final RegistryObject<Block> SpeedLimitSign6 = registerAppliance("speed_limit_sign_6", CityShapes.SpeedLimitSign8);
    public static final RegistryObject<Block> SpeedLimitSign7 = registerAppliance("speed_limit_sign_7", CityShapes.SpeedLimitSign7);
    public static final RegistryObject<Block> SpeedLimitSign8 = registerAppliance("speed_limit_sign_8", CityShapes.SpeedLimitSign8);
    public static final RegistryObject<Block> ModernFence = registerAppliance("modern_fence",  CityShapes.ModernFence);
    public static final RegistryObject<Block> ModernFence2 = registerAppliance("modern_fence_2",  CityShapes.ModernFence2);
    public static final RegistryObject<Block> ModernFence3 = registerAppliance("modern_fence_3",  CityShapes.ModernFence3);
    public static final RegistryObject<Block> ModernIronFence = registerAppliance("modern_ironfence",  CityShapes.ModernIronFence);
    public static final RegistryObject<Block> ModernIronFenceYellow = registerAppliance("moderniron_fence_yellow",  CityShapes.ModernIronFenceYellow);
    public static final RegistryObject<Block> ModernIronFenceGreen = registerAppliance("moderniron_fence_green",  CityShapes.ModernIronFenceGreen);
    public static final RegistryObject<Block> ModernIronFenceBlue = registerAppliance("moderniron_fence_blue",  CityShapes.ModernIronFenceBlue);
    public static final RegistryObject<Block> RestRoomSignMale = registerAppliance("restroom_sign",  CityShapes.RestRoomSignMale);
    public static final RegistryObject<Block> RestRoomSignFeMale = registerAppliance("rest_room_sign_female",  CityShapes.RestRoomSignFeMale);
    public static final RegistryObject<Block> RestRoomSignThird = registerAppliance("restroom_sign_third",  CityShapes.RestRoomSignThird);
    public static final RegistryObject<Block> ACCOVER = registerAppliance("ac_cover",  CityShapes.ACCOVER);
    public static final RegistryObject<Block> ACCOVERLIGHT = registerAppliance("ac_cover_light",  CityShapes.ACCOVER);

    // ==================== 电器 ====================
    public static final RegistryObject<Block> AC_OUT_01 = registerAppliance("ac_out_hd_1", ApplianceShapes.AC_OUT_01);
    public static final RegistryObject<Block> AC_OUT_02 = registerAppliance("ac_out_hd_2", ApplianceShapes.AC_OUT_02);
    public static final RegistryObject<Block> AC_OUT_03 = registerAppliance("ac_out_hd_3", ApplianceShapes.AC_OUT_03);
    public static final RegistryObject<Block> AC_OUT_04 = registerAppliance("ac_out_hd_4", ApplianceShapes.AC_OUT_04);
    public static final RegistryObject<Block> AC_OUT_05 = registerAppliance("ac_out_hd_5", ApplianceShapes.AC_OUT_05);
    public static final RegistryObject<Block> AC_OUT_06 = registerAppliance("ac_out_hd_6", ApplianceShapes.AC_OUT_06);
    public static final RegistryObject<Block> BIG_AC_OUT_HD = registerAppliance("big_ac_out_hd", ApplianceShapes.BIG_AC_OUT_HD);
    public static final RegistryObject<Block> CentreAirConditionOutside = registerAppliance("centre_air_condition_outside", ApplianceShapes.CentreAirConditionOutside);
    public static final RegistryObject<Block> AC_01 = registerAppliance("air_condition_hd_1", ApplianceShapes.AC_01);
    public static final RegistryObject<Block> AC_02 = registerAppliance("air_condition_hd_2", ApplianceShapes.AC_02);
    public static final RegistryObject<Block> AC_03 = registerAppliance("airconditionhd_3", ApplianceShapes.AC_03);
    public static final RegistryObject<Block> AC_04 = registerAppliance("airconditionhd_4", ApplianceShapes.AC_04);
    public static final RegistryObject<Block> CAC_HD = registerAppliance("central_ac_hd", ApplianceShapes.CAC_HD);
    public static final RegistryObject<Block> MicroWaveOven = registerAppliance("micro_wave_oven", ApplianceShapes.MicroWaveOven);
    public static final RegistryObject<Block> Fridge1 = registerAppliance("fridge_1", ApplianceShapes.Fridge1);
    public static final RegistryObject<Block> Fridge2 = registerAppliance("fridge_2", ApplianceShapes.Fridge2);
    public static final RegistryObject<Block> Old_Fridge = registerAppliance("old_fridge", ApplianceShapes. Old_Fridge);
    public static final RegistryObject<Block> Freezer = registerAppliance("freezer", ApplianceShapes. Freezer);
    public static final RegistryObject<Block> GASWATERHEATER = registerAppliance("gas_water_heater", ApplianceShapes. GASWATERHEATER);
    public static final RegistryObject<Block> ELECTRICWATERHEATER = registerAppliance("electric_water_heater", ApplianceShapes. ELECTRICWATERHEATER);
    public static final RegistryObject<Block> SOLARWATERHEATER = registerAppliance("solarwaterheater", ApplianceShapes. SOLARWATERHEATER);
    public static final RegistryObject<Block> Old_Mainunit = registerAppliance("old_mainunit", ApplianceShapes.OLD_MAINUNIT);
    public static final RegistryObject<Block> Mainunit2010 = registerAppliance("mainunit_2010", ApplianceShapes.MAINUNIT2010);
    public static final RegistryObject<Block> ModernMainunit = registerAppliance("main_unit_modern", ApplianceShapes.MODERMMAINUNIT);
    public static final RegistryObject<Block> Old_Monitor = registerScreen("old_monitor_off", ApplianceShapes.Old_Monitor);
    public static final RegistryObject<Block> Monitor2010 = registerScreen("monitor_2010off", ApplianceShapes.Monitor2010);
    public static final RegistryObject<Block> ModernMonitor = registerScreen("modern_monitor_off", ApplianceShapes.ModernMonitor);
    public static final RegistryObject<Block> AIOPC = registerScreen("all_in_one_pc", ApplianceShapes.AIOPC);
    public static final RegistryObject<Block> LAPTOP = registerScreen("laptop", ApplianceShapes.LAPTOP, ApplianceShapes.LAPTOP_ON);
    // ==================== 废弃 ====================
    public static final RegistryObject<Block> LAPTOP_ON = registerLight("laptop_poweron",ApplianceShapes.LAPTOP_ON);
    public static final RegistryObject<Block> Old_Monitor_On = registerLight("old_monitor_on",ApplianceShapes.Old_Monitor);
    public static final RegistryObject<Block> Monitor2010ON = registerLight("monitor_2010_on",ApplianceShapes.Monitor2010);
    public static final RegistryObject<Block> ModernMonitorOn = registerLight("modern_monitor_on",ApplianceShapes.ModernMonitor);
    public static final RegistryObject<Block> AIOPCON = registerLight("all_in_one_pc_on",ApplianceShapes.AIOPC);
    // ==================== 载具 ====================
    public static final RegistryObject<Block> BikeBlack = registerAppliance("bikeblack", VehicleShapes.BikeBlack );
    public static final RegistryObject<Block> BikeWhite = registerAppliance("bike", VehicleShapes.BikeWhite );
    public static final RegistryObject<Block> ElectricMotorWhite = registerAppliance("electric_motorcycle", VehicleShapes.ElectricMotorWhite );
    public static final RegistryObject<Block> ElectricMotorBlack = registerAppliance("electric_motorcycle_black", VehicleShapes.ElectricMotorBlack );
    public static final RegistryObject<Block> ScooterWhite = registerAppliance("scooter_white", VehicleShapes.ScooterWhite );
    public static final RegistryObject<Block> ScooterBlack = registerAppliance("scooter_black", VehicleShapes.ScooterBlack );
    // ==================== 窗户 ====================
    public static final RegistryObject<Block> WSW= registerWindow("window_small_white",  WindowsShapes.WINMA);
    public static final RegistryObject<Block> WMAW= registerWindow("window_medium_a_white",  WindowsShapes.WINMA);
    public static final RegistryObject<Block> WMBW= registerWindow("window_medium_b_white",  WindowsShapes.WINMB);
    public static final RegistryObject<Block> WLW= registerWindow("window_large_white",  WindowsShapes.WINL);
    public static final RegistryObject<Block> WSK= registerWindow("window_small_black",  WindowsShapes.WINS);
    public static final RegistryObject<Block> WMAK= registerWindow("window_medium_a_black",  WindowsShapes.WINMA);
    public static final RegistryObject<Block> WMBK= registerWindow("window_medium_b_black",  WindowsShapes.WINMB);
    public static final RegistryObject<Block> WLK= registerWindow("window_large_black",  WindowsShapes.WINL);
    public static final RegistryObject<Block> WSB= registerWindow("window_small_blue",  WindowsShapes.WINS);
    public static final RegistryObject<Block> WMAB= registerWindow("window_medium_a_blue",  WindowsShapes.WINMA);
    public static final RegistryObject<Block> WMBB= registerWindow("window_medium_b_blue",  WindowsShapes.WINMB);
    public static final RegistryObject<Block> WLB= registerWindow("window_large_blue",  WindowsShapes.WINL);
    public static final RegistryObject<Block> WSG= registerWindow("window_small_green",  WindowsShapes.WINS);
    public static final RegistryObject<Block> WMAG= registerWindow("window_medium_a_green",  WindowsShapes.WINMA);
    public static final RegistryObject<Block> WMBG= registerWindow("window_mediub_b_green",  WindowsShapes.WINMB);
    public static final RegistryObject<Block> WLG= registerWindow("window_large_green",  WindowsShapes.WINL);
    // ==================== 海报 ====================
    public static final RegistryObject<Block> POST_1691 = registerSign("post_1691", PostShapes.Post1691);
    public static final RegistryObject<Block> POST_1692 = registerSign("post_1692", PostShapes.Post1692);
    public static final RegistryObject<Block> POST_1693 = registerSign("post_1693", PostShapes.Post1693);
    public static final RegistryObject<Block> POST_1694 = registerSign("post_1694", PostShapes.Post1694);
    public static final RegistryObject<Block> POST_1695 = registerSign("post_1695", PostShapes.Post1695);
    public static final RegistryObject<Block> POST_1696 = registerSign("post_1696", PostShapes.Post1696);
    public static final RegistryObject<Block> POST_1697 = registerSign("post_1697", PostShapes.Post1697);
    public static final RegistryObject<Block> POST_1698 = registerSign("post_1698", PostShapes.Post1698);
    public static final RegistryObject<Block> POST_431 = registerSign("post_431", PostShapes.Post431);
    public static final RegistryObject<Block> POST_432 = registerSign("post_432", PostShapes.Post432);
    public static final RegistryObject<Block> POST_433 = registerSign("post_433", PostShapes.Post433);
    // ==================== 其他 ====================
    public static final RegistryObject<Block> AC2080 = registerAppliance("ac_out_nvidia", ApplianceShapes.AC2080);
    public static final RegistryObject<Block> AC_INTEL = registerAppliance("ac_out_intel", ApplianceShapes.AC_OUT_06);
    public static final RegistryObject<Block> ACAMD = registerAppliance("ac_out_amd", ApplianceShapes.AC2080);
    public static final RegistryObject<Block> AC_630 = registerAppliance("ac_out_fake", ApplianceShapes.AC_OUT_05);
    public static final RegistryObject<Block> AC_40hx = registerAppliance("ac_out_40_hx", ApplianceShapes.AC_40HX);

    static {
        for (var entry : ALL_BLOCKS.entrySet()) {
            String id = entry.getKey();
            RegistryObject<Block> block = entry.getValue();
            ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }

    // ==================== 创造标签 ====================
    public static final RegistryObject<CreativeModeTab> TRAFFIC = TABS.register("traffic",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.traffic"))
                    .icon(() -> new ItemStack(TRAFFIC_SIGN.get().asItem()))
                    .displayItems((params, output) -> {
                        addAll(output,
                                EXPR_1, EXPR_2, EXPR_3, EXPR_4, EXPR_5,
                                EXPR_5a, EXPR_5b, EXPR_5c, EXPR_5_d, EXPR_5_e, EXPR_5_f,
                                SERVICE_AREA_SIGN, OVERPASS_SIGN, OVERPASS_SIGN_2, OVERPASS_SIGN_3, OVER_PASS_SIGN_4,
                                ROAD_6, ROAD_11, EXPR_SIGN_LARGE, EXPRESSWAY_EXIT_SIGN, EXPR_T_IPS,
                                TRAFFIC_SIGN, TRAFFIC_SIGN_L, TRAFFIC_SIGN_R, TRAFFIC_SIGN_T,
                                TRAFFIC_SIGN_1, TRAFFIC_SIGN_2,
                                ROAD_1, ROAD_2, ROAD_3, ROAD_4, ROAD_5, ROAD_12,
                                OVER_PASS_5, YELLOW_SIGN_2, ROADSCREEN,
                                FREESIGN,FREEExprSIGN,
                                POLE,POLE_JOINT_L,POLE_JOINT_,POLE_JOINT_D,POLE_H,POLE_EXPR_L,POLE_EXPR_R,POLE_EXPR_M,POLEFINE_D,POLEFINE_JOINT_D
                        );
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> CITY = TABS.register("city",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.urban_facilities"))
                    .icon(() -> new ItemStack(SpeedLimitSign.get().asItem()))
                    .displayItems((params, output) -> {
                        addAll(output,
                               SpeedLimitSign4,SpeedLimitSign6,SpeedLimitSign5,SpeedLimitSign8,SpeedLimitSign7,SpeedLimitSign,SpeedLimitSign2,SpeedLimitSign3,
                               ModernFence, ModernFence2, ModernFence3,ModernIronFence,ModernIronFenceYellow,ModernIronFenceGreen,ModernIronFenceBlue,
                               RestRoomSignMale,RestRoomSignFeMale,RestRoomSignThird,
                               ACCOVER,ACCOVERLIGHT
                        );
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> HA = TABS.register("household_appliances",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.household_appliances"))
                    .icon(() -> new ItemStack(AC_OUT_03.get().asItem()))
                    .displayItems((params, output) -> {
                        addAll(output,
                                AC_OUT_01, AC_OUT_02, AC_OUT_03, AC_OUT_04,
                                AC_OUT_05, AC_OUT_06, BIG_AC_OUT_HD, CentreAirConditionOutside,
                                AC_01,AC_02,AC_03,AC_04,CAC_HD,
                                MicroWaveOven,Fridge1,Fridge2,Old_Fridge,Freezer,
                                GASWATERHEATER,ELECTRICWATERHEATER,SOLARWATERHEATER,
                                Old_Monitor,Monitor2010,ModernMonitor,AIOPC,Old_Mainunit,Mainunit2010,ModernMainunit,
                                LAPTOP
                        );
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> FIRE = TABS.register("firefighting",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.firefighting"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> POSTS = TABS.register("posts",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.posts"))
                    .icon(() -> new ItemStack(POST_1691.get().asItem()))
                    .displayItems((params, output) -> {
                        addAll(output,
                                POST_1691, POST_1692, POST_1693, POST_1694,
                                POST_1695, POST_1696, POST_1697, POST_1698,
                                POST_431, POST_432, POST_433
                        );
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> MW = TABS.register("modern_windows",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.modern_windows"))
                    .icon(() -> new ItemStack(WLW.get().asItem()))
                    .displayItems((params, output) -> {
                        addAll(output,
                                WSW,WMAW,WMBW,WLW,WSK,WMAK,WMBK,WLK,WSB,WMAB,WMBB,WLB,WSG,WMAG,WMBG,WLG
                        );
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> VEHICLE = TABS.register("vehicle",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.vehicle"))
                    .icon(() -> new ItemStack(BikeBlack.get().asItem()))
                    .displayItems((params, output) -> {
                        addAll(output,
                                BikeBlack,BikeWhite,ElectricMotorBlack,ElectricMotorWhite,ScooterWhite,ScooterBlack
                        );
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> OTHER = TABS.register("other",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.other"))
                    .icon(() -> new ItemStack(AC_INTEL.get().asItem()))
                    .displayItems((params, output) -> {
                        addAll(output,
                                AC2080,ACAMD,AC_INTEL,AC_630,AC_40hx
                        );
                    })
                    .build()
    );

    // ==================== 快捷方法 ====================
    private static RegistryObject<Block> registerSign(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        RegistryObject<Block> block = BLOCKS.register(id, () -> new GenericSignBlock(shape));
        ALL_BLOCKS.put(id, block);
        return block;
    }
    private static RegistryObject<Block> registerWindow(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        RegistryObject<Block> block = BLOCKS.register(id, () -> new GenericGlassBlock(shape));
        ALL_BLOCKS.put(id, block);
        return block;
    }
    // 普通方块
    private static RegistryObject<Block> registerAppliance(String id, Map<Direction, VoxelShape> shape) {
        RegistryObject<Block> block = BLOCKS.register(id, () -> new GenericMetalBlock(shape));
        ALL_BLOCKS.put(id, block);
        return block;
    }
    private static RegistryObject<Block> registerLight(String id, Map<Direction, VoxelShape> shape) {
        RegistryObject<Block> block = BLOCKS.register(id, () -> new GenericLightBlock(shape));
        ALL_BLOCKS.put(id, block);
        return block;
    }
    // 屏幕方块
    private static RegistryObject<Block> registerScreen(String id, Map<Direction, VoxelShape> shape) {
        RegistryObject<Block> block = BLOCKS.register(id, () -> new Power(shape));
        ALL_BLOCKS.put(id, block);
        return block;
    }
    private static RegistryObject<Block> registerScreen(String id, Map<Direction, VoxelShape> shapeOff, Map<Direction, VoxelShape> shapeOn) {
        RegistryObject<Block> block = BLOCKS.register(id, () -> new Power(shapeOff, shapeOn));
        ALL_BLOCKS.put(id, block);  // ← 加这行
        return block;
    }
    @SafeVarargs
    private static void addAll(CreativeModeTab.Output output, RegistryObject<Block>... blocks) {
        for (RegistryObject<Block> block : blocks) {
            output.accept(block.get().asItem());
        }
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        TABS.register(bus);
    }
    public static List<RegistryObject<Block>> getApplianceBlocks() {
        return List.of(AC_OUT_01, AC_OUT_02, AC_OUT_03, AC_OUT_04,
                AC_OUT_05, AC_OUT_06, BIG_AC_OUT_HD, CentreAirConditionOutside,
                AC_01,AC_02,AC_03,AC_04,CAC_HD,
                MicroWaveOven,Fridge1,Fridge2,Old_Fridge,Freezer,
                GASWATERHEATER,ELECTRICWATERHEATER,SOLARWATERHEATER,
                Old_Monitor,Old_Mainunit);
    }
}