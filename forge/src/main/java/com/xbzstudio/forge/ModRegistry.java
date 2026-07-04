package com.xbzstudio.forge;

import com.xbzstudio.block.*;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

    // ==================== 创造标签页 ====================
    public static final RegistryObject<CreativeModeTab> TRAFFIC = TABS.register("traffic",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("item_group.citymod.traffic"))
                    .icon(() -> new ItemStack(Items.WATER_BUCKET))
                    .displayItems((params, output) -> {
                        output.accept(EXPR_1.get());
                        output.accept(EXPR_2.get());
                        output.accept(EXPR_3.get());
                        output.accept(EXPR_4.get());
                        output.accept(EXPR_5.get());
                        output.accept(EXPR_5a.get());
                        output.accept(EXPR_5b.get());
                        output.accept(EXPR_5c.get());
                        output.accept(EXPR_5_d.get());
                        output.accept(EXPR_5_e.get());
                        output.accept(EXPR_5_f.get());
                        output.accept(SERVICE_AREA_SIGN.get());
                        output.accept(OVERPASS_SIGN.get());
                        output.accept(OVERPASS_SIGN_2.get());
                        output.accept(OVERPASS_SIGN_3.get());
                        output.accept(OVER_PASS_SIGN_4.get());
                        output.accept(ROAD_6.get());
                        output.accept(ROAD_11.get());
                        output.accept(EXPR_SIGN_LARGE.get());
                        output.accept(EXPRESSWAY_EXIT_SIGN.get());
                        output.accept(EXPR_T_IPS.get());
                        output.accept(TRAFFIC_SIGN.get());
                        output.accept(TRAFFIC_SIGN_L.get());
                        output.accept(TRAFFIC_SIGN_R.get());
                        output.accept(TRAFFIC_SIGN_T.get());
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
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
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
    public static final RegistryObject<CreativeModeTab> POST = TABS.register(
            "posts",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 4)
                    .title(Component.translatable("item_group.citymod.posts"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
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

    private static RegistryObject<Item> registerItem(String id, RegistryObject<Block> block) {
        return ITEMS.register(id, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        TABS.register(bus);
    }
}