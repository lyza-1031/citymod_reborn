package com.xbzstudio;

import com.xbzstudio.block.*;
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
                        output.accept(ModBlocks.FREESIGN.get().asItem());
                        output.accept(ModBlocks.FREEExprSIGN.get().asItem());
                        output.accept(ModBlocks.ROADSCREEN.get().asItem());
                        output.accept(CityBlocks.DSign.get().asItem());
                        output.accept(CityBlocks.DSignL.get().asItem());
                        output.accept(CityBlocks.DSignR.get().asItem());
                        output.accept(CityBlocks.DSignT.get().asItem());
                        output.accept(CityBlocks.DSignLS.get().asItem());
                        output.accept(CityBlocks.DSignRS.get().asItem());
                        output.accept(CityBlocks.DSignLR.get().asItem());
                        output.accept(CityBlocks.DSignLT.get().asItem());
                        output.accept(CityBlocks.DSignST.get().asItem());
                        output.accept(CityBlocks.DSignA.get().asItem());
                        output.accept(CityBlocks.DSignV.get().asItem());
                        output.accept(CityBlocks.DSignB.get().asItem());
                        output.accept(CityBlocks.DSignBK.get().asItem());
                        output.accept(ModBlocks.POLE.get().asItem());
                        output.accept(ModBlocks.POLE_JOINT_D.get().asItem());
                        output.accept(ModBlocks.POLE_JOINT.get().asItem());
                        output.accept(ModBlocks.POLE_JOINT_L.get().asItem());
                        output.accept(ModBlocks.POLE_H.get().asItem());
                        output.accept(ModBlocks.POLE_EXPR_L.get().asItem());
                        output.accept(ModBlocks.POLE_EXPR_R.get().asItem());
                        output.accept(ModBlocks.POLE_EXPR_M.get().asItem());
                        output.accept(ModBlocks.POLEFINE_D.get().asItem());
                        output.accept(ModBlocks.POLEFINE_JOINT_D.get().asItem());
                        //标线
                        output.accept(ModBlocks.LineW.get().asItem());
                        output.accept(ModBlocks.LineWC.get().asItem());
                        output.accept(ModBlocks.LineZ.get().asItem());
                        output.accept(ModBlocks.LineY.get().asItem());
                        output.accept(ModBlocks.LineYD.get().asItem());
                        output.accept(ModBlocks.LineYC.get().asItem());
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
                        output.accept(CityBlocks.SpeedLimitSign1.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign2.get().asItem());
                        output.accept(CityBlocks.SpeedLimitSign3.get().asItem());
                        output.accept(CityBlocks.ModernFence.get().asItem());
                        output.accept(CityBlocks.ModernFence2.get().asItem());
                        output.accept(CityBlocks.ModernFence3.get().asItem());
                        output.accept(CityBlocks.ModernIronFence.get().asItem());
                        output.accept(CityBlocks.ModernIronFenceYellow.get().asItem());
                        output.accept(CityBlocks.ModernIronFenceGreen.get().asItem());
                        output.accept(CityBlocks.ModernIronFenceBlue.get().asItem());
                        output.accept(CityBlocks.RestRoomSignMale.get().asItem());
                        output.accept(CityBlocks.RestRoomSignFeMale.get().asItem());
                        output.accept(CityBlocks.RestRoomSignThird.get().asItem());
                        output.accept(CityBlocks.ACCOVER.get().asItem());
                        output.accept(CityBlocks.ACCOVERLIGHT.get().asItem());
                        output.accept(WindowsBlocks.SWS.get().asItem());
                        output.accept(WindowsBlocks.SWMA.get().asItem());
                        output.accept(WindowsBlocks.SWMB.get().asItem());
                        output.accept(WindowsBlocks.SWL.get().asItem());
                        output.accept(CityBlocks.SHOPSIGNBLUE.get().asItem());
                        output.accept(CityBlocks.SHOPSIGNBLUEJ.get().asItem());
                        output.accept(CityBlocks.SHOPSIGNRED.get().asItem());
                        output.accept(CityBlocks.SHOPSIGNREDJ.get().asItem());
                        output.accept(CityBlocks.MH1.get().asItem());
                        output.accept(CityBlocks.MH2.get().asItem());
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
                        output.accept(ApplianceBlocks.MicroWaveOven.get().asItem());
                        output.accept(ApplianceBlocks.Fridge1.get().asItem());
                        output.accept(ApplianceBlocks.Fridge2.get().asItem());
                        output.accept(ApplianceBlocks.Old_Fridge.get().asItem());
                        output.accept(ApplianceBlocks.Freezer.get().asItem());
                        output.accept(ApplianceBlocks.GASWATERHEATER.get().asItem());
                        output.accept(ApplianceBlocks.ELECTRICWATERHEATER.get().asItem());
                        output.accept(ApplianceBlocks.SOLARWATERHEATER.get().asItem());
                        output.accept(ApplianceBlocks.Old_Monitor.get().asItem());
                        output.accept(ApplianceBlocks.Monitor2010.get().asItem());
                        output.accept(ApplianceBlocks.OLD_MAINUNIT.get().asItem());
                        output.accept(ApplianceBlocks.MAINUNIT2010.get().asItem());
                        output.accept(ApplianceBlocks.ModernMonitor.get().asItem());
                        output.accept(ApplianceBlocks.MODERNMAINUNIT.get().asItem());
                        output.accept(ApplianceBlocks.AIOPC.get().asItem());
                        output.accept(ApplianceBlocks.LAPTOP.get().asItem());
                        output.accept(ApplianceBlocks.OWardrobeS.get().asItem());
                        output.accept(ApplianceBlocks.OWardrobeM.get().asItem());
                        output.accept(ApplianceBlocks.OWardrobeC.get().asItem());
                        output.accept(ApplianceBlocks.MWardrobeS.get().asItem());
                        output.accept(ApplianceBlocks.MWardrobeM.get().asItem());
                        output.accept(ApplianceBlocks.MWardrobeL.get().asItem());
                        output.accept(ApplianceBlocks.EXPRESSBOX.get().asItem());
                        output.accept(ApplianceBlocks.EXPRESSBOX2.get().asItem());
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
                    .icon(() -> new ItemStack(WindowsBlocks.WLW.get().asItem()))
                    .displayItems((params, output) -> {
                        output.accept(WindowsBlocks.WSW.get().asItem());
                        output.accept(WindowsBlocks.WMAW.get().asItem());
                        output.accept(WindowsBlocks.WMBW.get().asItem());
                        output.accept(WindowsBlocks.WLW.get().asItem());
                        output.accept(WindowsBlocks.WSCW.get().asItem());
                        output.accept(WindowsBlocks.WLCW.get().asItem());
                        output.accept(WindowsBlocks.WSOW.get().asItem());
                        output.accept(WindowsBlocks.WLOW.get().asItem());
                        output.accept(WindowsBlocks.WSK.get().asItem());
                        output.accept(WindowsBlocks.WMAK.get().asItem());
                        output.accept(WindowsBlocks.WMBK.get().asItem());
                        output.accept(WindowsBlocks.WLK.get().asItem());
                        output.accept(WindowsBlocks.WSCK.get().asItem());
                        output.accept(WindowsBlocks.WLCK.get().asItem());
                        output.accept(WindowsBlocks.WSOK.get().asItem());
                        output.accept(WindowsBlocks.WLOK.get().asItem());
                        output.accept(WindowsBlocks.WSB.get().asItem());
                        output.accept(WindowsBlocks.WMAB.get().asItem());
                        output.accept(WindowsBlocks.WMBB.get().asItem());
                        output.accept(WindowsBlocks.WLB.get().asItem());
                        output.accept(WindowsBlocks.WSCB.get().asItem());
                        output.accept(WindowsBlocks.WLCB.get().asItem());
                        output.accept(WindowsBlocks.WSOB.get().asItem());
                        output.accept(WindowsBlocks.WLOB.get().asItem());
                        output.accept(WindowsBlocks.WSG.get().asItem());
                        output.accept(WindowsBlocks.WMAG.get().asItem());
                        output.accept(WindowsBlocks.WMBG.get().asItem());
                        output.accept(WindowsBlocks.WLG.get().asItem());
                        output.accept(WindowsBlocks.WSCG.get().asItem());
                        output.accept(WindowsBlocks.WLCG.get().asItem());
                        output.accept(WindowsBlocks.WSOG.get().asItem());
                        output.accept(WindowsBlocks.WLOG.get().asItem());
                        output.accept(WindowsBlocks.SIWC.get().asItem());
                        output.accept(WindowsBlocks.SIW.get().asItem());
                        output.accept(WindowsBlocks.WW.get().asItem());
                        output.accept(WindowsBlocks.OW.get().asItem());
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> VEHICLE = TABS.register(
            "vehicle",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 6)
                    .title(Component.translatable("item_group.citymod.vehicle"))
                    .icon(() -> new ItemStack(VehicleBlocks.BikeBlack.get().asItem()))
                    .displayItems((params, output) -> {
                        output.accept(VehicleBlocks.BikeWhite.get().asItem());
                        output.accept(VehicleBlocks.BikeBlack.get().asItem());
                        output.accept(VehicleBlocks.ElectricMotorBlack.get().asItem());
                        output.accept(VehicleBlocks.ElectricMotorWhite.get().asItem());
                        output.accept(VehicleBlocks.ScooterWhite.get().asItem());
                        output.accept(VehicleBlocks.ScooterBlack.get().asItem());
                    })
                    .build()
    );
    public static final RegistrySupplier<CreativeModeTab> OTHER = TABS.register(
            "other",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 7)
                    .title(Component.translatable("item_group.citymod.other"))
                    .icon(() -> new ItemStack(ApplianceBlocks.AC_INTEL.get().asItem()))
                    .displayItems((params, output) -> {
                        output.accept(ApplianceBlocks.AC2080.get().asItem());
                        output.accept(ApplianceBlocks.ACAMD.get().asItem());
                        output.accept(ApplianceBlocks.AC_INTEL.get().asItem());
                        output.accept(ApplianceBlocks.AC_630.get().asItem());
                        output.accept(ApplianceBlocks.AC_40hx.get().asItem());
                    })
                    .build()
    );
}