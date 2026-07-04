package com.xbzstudio;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create("citymod", Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> CITY_TAB = TABS.register(
            "traffic",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("item_group.citymod.traffic"))
                    .icon(() -> new ItemStack(Items.WATER_BUCKET))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.EXPR_1.get());
                        output.accept(ModBlocks.EXPR_2.get());
                        output.accept(ModBlocks.EXPR_3.get());
                        output.accept(ModBlocks.EXPR_4.get());
                        output.accept(ModBlocks.EXPR_5.get());
                        output.accept(ModBlocks.EXPR_5a.get());
                        output.accept(ModBlocks.EXPR_5b.get());
                        output.accept(ModBlocks.EXPR_5c.get());
                        output.accept(ModBlocks.EXPR_5_d.get());
                        output.accept(ModBlocks.EXPR_5_e.get());
                        output.accept(ModBlocks.EXPR_5_f.get());
                        output.accept(ModBlocks.SERVICE_AREA_SIGN.get());
                        output.accept(ModBlocks.OVERPASS_SIGN.get());
                        output.accept(ModBlocks.OVERPASS_SIGN_2.get());
                        output.accept(ModBlocks.OVERPASS_SIGN_3.get());
                        output.accept(ModBlocks.OVER_PASS_SIGN_4.get());
                        output.accept(ModBlocks.ROAD_6.get());
                        output.accept(ModBlocks.ROAD_11.get());
                        output.accept(ModBlocks.EXPR_SIGN_LARGE.get());
                        output.accept(ModBlocks.EXPRESSWAY_EXIT_SIGN.get());
                        output.accept(ModBlocks.EXPR_T_IPS.get());
                        output.accept(ModBlocks.TRAFFIC_SIGN.get());
                        output.accept(ModBlocks.TRAFFIC_SIGN_L.get());
                        output.accept(ModBlocks.TRAFFIC_SIGN_R.get());
                        output.accept(ModBlocks.TRAFFIC_SIGN_T.get());
                    })
            .build()
    );
    public static final RegistrySupplier<CreativeModeTab> CITY = TABS.register(
            "city",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
                    .title(Component.translatable("item_group.citymod.urban_facilities"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> HA = TABS.register(
            "household_appliances",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 2)
                    .title(Component.translatable("item_group.citymod.household_appliances"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> FIRE = TABS.register(
            "firefighting",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 3)
                    .title(Component.translatable("item_group.citymod.firefighting"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> POST = TABS.register(
            "posts",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 4)
                    .title(Component.translatable("item_group.citymod.posts"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> MW = TABS.register(
            "modern_windows",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 5)
                    .title(Component.translatable("item_group.citymod.modern_windows"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> VEHICLE = TABS.register(
            "vehicle",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 6)
                    .title(Component.translatable("item_group.citymod.vehicle"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> OTHER = TABS.register(
            "other",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 7)
                    .title(Component.translatable("item_group.citymod.other"))
                    .icon(() -> new ItemStack(Blocks.OAK_PLANKS))
                    .displayItems((params, output) -> {
                        output.accept(Blocks.COMMAND_BLOCK);
                    })
                    .build()
    );
}