package com.xbzstudio.forge;

import com.xbzstudio.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "citymod");
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "citymod");
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "citymod");

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
    public static final RegistryObject<Block> EXPRESSWAY_EXIT_SIGN =registerSign("expressway_exit_sign",BlockShapes.EXPRESSWAY_EXIT_SIGN);
    public static final RegistryObject<Block> EXPR_T_IPS =registerSign("expr_t_ips",BlockShapes.EXPR_T_IPS);
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
    public static final RegistryObject<Block> OVER_PASS_5 = registerSign("over_pass_5", BlockShapes.OVER_PASS_5);
    public static final RegistryObject<Block> YELLOW_SIGN_2 = registerSign("yellow_sign_2", BlockShapes.YELLOW_SIGN_2);
    public static final RegistryObject<Block> ROADSCREEN = registerSign("road_screen", BlockShapes.ROADSCREEN);
    public static final RegistryObject<Block> AC_OUT_01 = registerAppliance("ac_out_hd_1", ApplianceShapes.AC_OUT_01);
    public static final RegistryObject<Block> AC_OUT_02 = registerAppliance("ac_out_hd_2", ApplianceShapes.AC_OUT_02);
    public static final RegistryObject<Block> AC_OUT_03 = registerAppliance("ac_out_hd_3", ApplianceShapes.AC_OUT_03);
    public static final RegistryObject<Block> AC_OUT_04 = registerAppliance("ac_out_hd_4", ApplianceShapes.AC_OUT_04);
    public static final RegistryObject<Block> AC_OUT_05 = registerAppliance("ac_out_hd_5", ApplianceShapes.AC_OUT_05);
    public static final RegistryObject<Block> AC_OUT_06 = registerAppliance("ac_out_hd_6", ApplianceShapes.AC_OUT_06);
    public static final RegistryObject<Block> BIG_AC_OUT_HD = registerAppliance("big_ac_out_hd", ApplianceShapes.BIG_AC_OUT_HD);
    public static final RegistryObject<Block> CentreAirConditionOutside = registerAppliance("centre_air_condition_outside", ApplianceShapes.CentreAirConditionOutside);
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
    // ==================== BlockItems ====================
    public static final RegistryObject<Item> EXPR_1_ITEM = registerItem("expr_1", EXPR_1);
    public static final RegistryObject<Item> EXPR_2_ITEM = registerItem("expr_2", EXPR_2);
    public static final RegistryObject<Item> EXPR_3_ITEM = registerItem("expr_3", EXPR_3);
    public static final RegistryObject<Item> EXPR_4_ITEM = registerItem("expr_4", EXPR_4);
    public static final RegistryObject<Item> EXPR_5_ITEM = registerItem("expr_5", EXPR_5);
    public static final RegistryObject<Item> EXPR_5a_ITEM = registerItem("expr_5a", EXPR_5a);
    public static final RegistryObject<Item> EXPR_5b_ITEM = registerItem("expr_5b", EXPR_5b);
    public static final RegistryObject<Item> EXPR_5c_ITEM = registerItem("expr_5c", EXPR_5c);
    public static final RegistryObject<Item> EXPR_5_d_ITEM = registerItem("expr_5_d", EXPR_5_d);
    public static final RegistryObject<Item> EXPR_5_e_ITEM = registerItem("expr_5_e", EXPR_5_e);
    public static final RegistryObject<Item> EXPR_5_f_ITEM = registerItem("expr_5_f", EXPR_5_f);
    public static final RegistryObject<Item> SERVICE_AREA_SIGN_ITEM = registerItem("service_area_sign",SERVICE_AREA_SIGN);
    public static final RegistryObject<Item> OVERPASS_SIGN_ITEM = registerItem("overpass_sign",OVERPASS_SIGN);
    public static final RegistryObject<Item> OVERPASS_SIGN_2_ITEM = registerItem("overpass_sign_2", OVERPASS_SIGN_2);
    public static final RegistryObject<Item> OVERPASS_SIGN_3_ITEM = registerItem("overpass_sign_3", OVERPASS_SIGN_3);
    public static final RegistryObject<Item> OVER_PASS_SIGN_4_ITEM = registerItem("over_pass_sign_4", OVER_PASS_SIGN_4);
    public static final RegistryObject<Item> ROAD_6_ITEM = registerItem("road_6", ROAD_6);
    public static final RegistryObject<Item> ROAD_11_ITEM = registerItem("road_11", ROAD_11);
    public static final RegistryObject<Item> EXPR_SIGN_LARGE_ITEM = registerItem("expr_sign_large", EXPR_SIGN_LARGE);
    public static final RegistryObject<Item> EXPRESSWAY_EXIT_SIGN_ITEM =registerItem("expressway_exit_sign",EXPRESSWAY_EXIT_SIGN);
    public static final RegistryObject<Item> EXPR_T_IPS_ITEM =registerItem("expr_t_ips",EXPR_T_IPS);
    public static final RegistryObject<Item> TRAFFIC_SIGN_ITEM = registerItem("traffic_sign", TRAFFIC_SIGN);
    public static final RegistryObject<Item> TRAFFIC_SIGN_L_ITEM = registerItem("traffic_sign_l", TRAFFIC_SIGN_L);
    public static final RegistryObject<Item> TRAFFIC_SIGN_R_ITEM = registerItem("traffic_sign_r", TRAFFIC_SIGN_R);
    public static final RegistryObject<Item> TRAFFIC_SIGN_T_ITEM = registerItem("traffic_sign_t", TRAFFIC_SIGN_T);
    public static final RegistryObject<Item> TRAFFIC_SIGN_1_ITEM = registerItem("traffic_sign_1", TRAFFIC_SIGN_1);
    public static final RegistryObject<Item> TRAFFIC_SIGN_2_ITEM = registerItem("traffic_sign_2", TRAFFIC_SIGN_2);
    public static final RegistryObject<Item> ROAD_1_ITEM = registerItem("road_1", ROAD_1);
    public static final RegistryObject<Item> ROAD_2_ITEM = registerItem("road_2", ROAD_2);
    public static final RegistryObject<Item> ROAD_3_ITEM = registerItem("road_3", ROAD_3);
    public static final RegistryObject<Item> ROAD_4_ITEM = registerItem("road_4", ROAD_4);
    public static final RegistryObject<Item> ROAD_5_ITEM = registerItem("road_5", ROAD_5);
    public static final RegistryObject<Item> ROAD_12_ITEM = registerItem("road_12", ROAD_12);
    public static final RegistryObject<Item> OVER_PASS_5_ITEM = registerItem("over_pass_5", OVER_PASS_5);
    public static final RegistryObject<Item> YELLOW_SIGN_2_ITEM = registerItem("yellow_sign_2", YELLOW_SIGN_2);
    public static final RegistryObject<Item> ROADSCREEN_ITEM = registerItem("road_screen", ROADSCREEN);
    public static final RegistryObject<Item> AC_OUT_01_ITEM = registerItem("ac_out_hd_1", AC_OUT_01);
    public static final RegistryObject<Item> AC_OUT_02_ITEM = registerItem("ac_out_hd_2", AC_OUT_02);
    public static final RegistryObject<Item> AC_OUT_03_ITEM = registerItem("ac_out_hd_3", AC_OUT_03);
    public static final RegistryObject<Item> AC_OUT_04_ITEM = registerItem("ac_out_hd_4", AC_OUT_04);
    public static final RegistryObject<Item> AC_OUT_05_ITEM = registerItem("ac_out_hd_5", AC_OUT_05);
    public static final RegistryObject<Item> AC_OUT_06_ITEM = registerItem("ac_out_hd_6", AC_OUT_06);
    public static final RegistryObject<Item> BIG_AC_OUT_HD_ITEM = registerItem("big_ac_out_hd", BIG_AC_OUT_HD);
    public static final RegistryObject<Item> CentreAirConditionOutside_ITEM = registerItem("centre_air_condition_outside",CentreAirConditionOutside);
    public static final RegistryObject<Item> POST_1691_ITEM = registerItem("post_1691", POST_1691);
    public static final RegistryObject<Item> POST_1692_ITEM = registerItem("post_1692", POST_1692);
    public static final RegistryObject<Item> POST_1693_ITEM = registerItem("post_1693", POST_1693);
    public static final RegistryObject<Item> POST_1694_ITEM = registerItem("post_1694", POST_1694);
    public static final RegistryObject<Item> POST_1695_ITEM = registerItem("post_1695", POST_1695);
    public static final RegistryObject<Item> POST_1696_ITEM = registerItem("post_1696", POST_1696);
    public static final RegistryObject<Item> POST_1697_ITEM = registerItem("post_1697", POST_1697);
    public static final RegistryObject<Item> POST_1698_ITEM = registerItem("post_1698", POST_1698);
    public static final RegistryObject<Item> POST_431_ITEM = registerItem("post_431", POST_431);
    public static final RegistryObject<Item> POST_432_ITEM = registerItem("post_432", POST_432);
    public static final RegistryObject<Item> POST_433_ITEM = registerItem("post_433", POST_433);
    // ==================== 创造标签页 ====================
    public static final RegistryObject<CreativeModeTab> TRAFFIC = TABS.register("traffic",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.traffic"))
                    .icon(() -> new ItemStack(TRAFFIC_SIGN_ITEM.get()))
                    .displayItems((params, output) -> {
                        output.accept(EXPR_1.get().asItem());
                        output.accept(EXPR_2.get().asItem());
                        output.accept(EXPR_3.get().asItem());
                        output.accept(EXPR_4.get().asItem());
                        output.accept(EXPR_5.get().asItem());
                        output.accept(EXPR_5a.get().asItem());
                        output.accept(EXPR_5b.get().asItem());
                        output.accept(EXPR_5c.get().asItem());
                        output.accept(EXPR_5_d.get().asItem());
                        output.accept(EXPR_5_e.get().asItem());
                        output.accept(EXPR_5_f.get().asItem());
                        output.accept(SERVICE_AREA_SIGN.get().asItem());
                        output.accept(OVERPASS_SIGN.get().asItem());
                        output.accept(OVERPASS_SIGN_2.get().asItem());
                        output.accept(OVERPASS_SIGN_3.get().asItem());
                        output.accept(OVER_PASS_SIGN_4.get().asItem());
                        output.accept(ROAD_6.get().asItem());
                        output.accept(ROAD_11.get().asItem());
                        output.accept(EXPR_SIGN_LARGE.get().asItem());
                        output.accept(EXPRESSWAY_EXIT_SIGN.get().asItem());
                        output.accept(EXPR_T_IPS.get().asItem());
                        output.accept(TRAFFIC_SIGN.get().asItem());
                        output.accept(TRAFFIC_SIGN_L.get().asItem());
                        output.accept(TRAFFIC_SIGN_R.get().asItem());
                        output.accept(TRAFFIC_SIGN_T.get().asItem());
                        output.accept(TRAFFIC_SIGN_1.get().asItem());
                        output.accept(TRAFFIC_SIGN_2.get().asItem());
                        output.accept(ROAD_1.get().asItem());
                        output.accept(ROAD_2.get().asItem());
                        output.accept(ROAD_3.get().asItem());
                        output.accept(ROAD_4.get().asItem());
                        output.accept(ROAD_5.get().asItem());
                        output.accept(ROAD_12.get().asItem());
                        output.accept(OVER_PASS_5.get().asItem());
                        output.accept(YELLOW_SIGN_2.get().asItem());
                        output.accept(ROADSCREEN.get().asItem());
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> CITY = TABS.register(
            "city",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
                    .title(Component.translatable("item_group.citymod.urban_facilities"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> HA = TABS.register(
            "household_appliances",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 2)
                    .title(Component.translatable("item_group.citymod.household_appliances"))
                    .icon(() -> new ItemStack(AC_OUT_03_ITEM.get()))
                    .displayItems((params, output) -> {
                        output.accept(AC_OUT_01_ITEM.get());
                        output.accept(AC_OUT_02_ITEM.get());
                        output.accept(AC_OUT_03_ITEM.get());
                        output.accept(AC_OUT_04_ITEM.get());
                        output.accept(AC_OUT_05_ITEM.get());
                        output.accept(AC_OUT_06_ITEM.get());
                        output.accept(BIG_AC_OUT_HD_ITEM.get());
                        output.accept(CentreAirConditionOutside_ITEM.get());
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> FIRE = TABS.register(
            "firefighting",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 3)
                    .title(Component.translatable("item_group.citymod.firefighting"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> posts = TABS.register(
            "posts",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 4)
                    .title(Component.translatable("item_group.citymod.posts"))
                    .icon(() -> new ItemStack(POST_1691_ITEM.get()))
                    .displayItems((params, output) -> {
                        output.accept(POST_1691_ITEM.get());
                        output.accept(POST_1692_ITEM.get());
                        output.accept(POST_1693_ITEM.get());
                        output.accept(POST_1694_ITEM.get());
                        output.accept(POST_1695_ITEM.get());
                        output.accept(POST_1696_ITEM.get());
                        output.accept(POST_1697_ITEM.get());
                        output.accept(POST_1698_ITEM.get());
                        output.accept(POST_431_ITEM.get());
                        output.accept(POST_432_ITEM.get());
                        output.accept(POST_433_ITEM.get());
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> MW = TABS.register(
            "modern_windows",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 5)
                    .title(Component.translatable("item_group.citymod.modern_windows"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> VEHICLE = TABS.register(
            "vehicle",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 6)
                    .title(Component.translatable("item_group.citymod.vehicle"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistryObject<CreativeModeTab> OTHER = TABS.register(
            "other",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 7)
                    .title(Component.translatable("item_group.citymod.other"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    // ==================== 快捷方法 ====================
    private static RegistryObject<Block> registerSign(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericSignBlock(shape));
    }

    private static RegistryObject<Block> registerAppliance(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericMetalBlock(shape));
    }

    private static RegistryObject<Item> registerItem(String id, RegistryObject<Block> block) {
        return ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        TABS.register(bus);
    }
}