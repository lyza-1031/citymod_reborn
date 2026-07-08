package com.xbzstudio;

import com.xbzstudio.block.ApplianceBlocks;
import com.xbzstudio.block.CityBlocks;
import com.xbzstudio.block.ModBlocks;
import com.xbzstudio.block.PostBlocks;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create("citymod", Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> CITY_TAB = TABS.register(
            "traffic",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("item_group.citymod.traffic"))
                    .icon(() -> new ItemStack(ModBlocks.TRAFFIC_SIGN.get().asItem()))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.EXPR_1.get().asItem());
                        output.accept(ModBlocks.EXPR_2.get().asItem());
                        output.accept(ModBlocks.EXPR_3.get().asItem());
                        output.accept(ModBlocks.EXPR_4.get().asItem());
                        output.accept(ModBlocks.EXPR_5.get().asItem());
                        output.accept(ModBlocks.EXPR_5a.get().asItem());
                        output.accept(ModBlocks.EXPR_5b.get().asItem());
                        output.accept(ModBlocks.EXPR_5c.get().asItem());
                        output.accept(ModBlocks.EXPR_5_d.get().asItem());
                        output.accept(ModBlocks.EXPR_5_e.get().asItem());
                        output.accept(ModBlocks.EXPR_5_f.get().asItem());
                        output.accept(ModBlocks.SERVICE_AREA_SIGN.get().asItem());
                        output.accept(ModBlocks.OVERPASS_SIGN.get().asItem());
                        output.accept(ModBlocks.OVERPASS_SIGN_2.get().asItem());
                        output.accept(ModBlocks.OVERPASS_SIGN_3.get().asItem());
                        output.accept(ModBlocks.OVER_PASS_SIGN_4.get().asItem());
                        output.accept(ModBlocks.ROAD_6.get().asItem());
                        output.accept(ModBlocks.ROAD_11.get().asItem());
                        output.accept(ModBlocks.EXPR_SIGN_LARGE.get().asItem());
                        output.accept(ModBlocks.EXPRESSWAY_EXIT_SIGN.get().asItem());
                        output.accept(ModBlocks.EXPR_T_IPS.get().asItem());
                        output.accept(ModBlocks.TRAFFIC_SIGN.get().asItem());
                        output.accept(ModBlocks.TRAFFIC_SIGN_L.get().asItem());
                        output.accept(ModBlocks.TRAFFIC_SIGN_R.get().asItem());
                        output.accept(ModBlocks.TRAFFIC_SIGN_T.get().asItem());
                        output.accept(ModBlocks.TRAFFIC_SIGN_1.get().asItem());
                        output.accept(ModBlocks.TRAFFIC_SIGN_2.get().asItem());
                        output.accept(ModBlocks.ROAD_1.get().asItem());
                        output.accept(ModBlocks.ROAD_2.get().asItem());
                        output.accept(ModBlocks.ROAD_3.get().asItem());
                        output.accept(ModBlocks.ROAD_4.get().asItem());
                        output.accept(ModBlocks.ROAD_5.get().asItem());
                        output.accept(ModBlocks.OVER_PASS_5.get().asItem());
                        output.accept(ModBlocks.ROAD_12.get().asItem());
                        output.accept(ModBlocks.YELLOW_SIGN_2.get().asItem());
                        output.accept(ModBlocks.ROADSCREEN.get().asItem());
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> CITY = TABS.register(
            "city",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
                    .title(Component.translatable("item_group.citymod.urban_facilities"))
                    .icon(() -> new ItemStack(CityBlocks.SpeedLimitSign.get().asItem()))
                    .displayItems((params, output) -> {
                        output.accept(CityBlocks.SpeedLimitSign4.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign6.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign5.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign8.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign7.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign2.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign3.get().asItem());

                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> HA = TABS.register(
            "household_appliances",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 2)
                    .title(Component.translatable("item_group.citymod.household_appliances"))
                    .icon(() -> new ItemStack(ApplianceBlocks.AC_OUT_03.get().asItem()))

                    .displayItems((params, output) -> {
                        output.accept(ApplianceBlocks.AC_OUT_01.get().asItem());
                        output.accept(ApplianceBlocks.AC_OUT_02.get().asItem());
                        output.accept(ApplianceBlocks.AC_OUT_03.get().asItem());
                        output.accept(ApplianceBlocks.AC_OUT_04.get().asItem());
                        output.accept(ApplianceBlocks.AC_OUT_05.get().asItem());
                        output.accept(ApplianceBlocks.AC_OUT_06.get().asItem());
                        output.accept(ApplianceBlocks.BIG_AC_OUT_HD.get().asItem());
                        output.accept(ApplianceBlocks.CentreAirConditionOutside.get().asItem());
                        output.accept(ApplianceBlocks.AC_01.get().asItem());
                        output.accept(ApplianceBlocks.AC_02.get().asItem());
                        output.accept(ApplianceBlocks.AC_03.get().asItem());
                        output.accept(ApplianceBlocks.AC_04.get().asItem());
                        output.accept(ApplianceBlocks.OLD_AC_HD.get().asItem());
                        output.accept(ApplianceBlocks.CAC_HD.get().asItem());
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
                    .icon(() -> new ItemStack(PostBlocks.Post1691.get().asItem()))
                    .displayItems((params, output) -> {
                        output.accept(PostBlocks.Post1691.get().asItem());
                        output.accept(PostBlocks.Post1692.get().asItem());
                        output.accept(PostBlocks.Post1693.get().asItem());
                        output.accept(PostBlocks.Post1694.get().asItem());
                        output.accept(PostBlocks.Post1695.get().asItem());
                        output.accept(PostBlocks.Post1696.get().asItem());
                        output.accept(PostBlocks.Post1697.get().asItem());
                        output.accept(PostBlocks.Post1698.get().asItem());
                        output.accept(PostBlocks.Post431.get().asItem());
                        output.accept(PostBlocks.Post432.get().asItem());
                        output.accept(PostBlocks.Post433.get().asItem());
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