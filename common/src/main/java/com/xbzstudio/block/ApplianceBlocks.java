package com.xbzstudio.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class ApplianceBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create("citymod", Registries.ITEM);

    // ==================== 方块 ====================
    public static final RegistrySupplier<Block> AC_OUT_01 = registerAppliances("ac_out_hd_1", ApplianceShapes.AC_OUT_01);
    public static final RegistrySupplier<Block> AC_OUT_02 = registerAppliances("ac_out_hd_2", ApplianceShapes.AC_OUT_02);
    public static final RegistrySupplier<Block> AC_OUT_03 = registerAppliances("ac_out_hd_3", ApplianceShapes.AC_OUT_03);
    public static final RegistrySupplier<Block> AC_OUT_04 = registerAppliances("ac_out_hd_4", ApplianceShapes.AC_OUT_04);
    public static final RegistrySupplier<Block> AC_OUT_05 = registerAppliances("ac_out_hd_5", ApplianceShapes.AC_OUT_05);
    public static final RegistrySupplier<Block> AC_OUT_06 = registerAppliances("ac_out_hd_6", ApplianceShapes.AC_OUT_06);
    public static final RegistrySupplier<Block> AC2080 = registerAppliances("ac_out_nvidia", ApplianceShapes.AC2080);
    public static final RegistrySupplier<Block> AC_INTEL = registerAppliances("ac_out_intel", ApplianceShapes.AC_OUT_06);
    public static final RegistrySupplier<Block> ACAMD = registerAppliances("ac_out_amd", ApplianceShapes.AC2080);
    public static final RegistrySupplier<Block> AC_630 = registerAppliances("ac_out_fake", ApplianceShapes.AC_OUT_05);
    public static final RegistrySupplier<Block> AC_40hx = registerAppliances("ac_out_40_hx", ApplianceShapes.AC_40HX);
    public static final RegistrySupplier<Block> BIG_AC_OUT_HD = registerAppliances("big_ac_out_hd",  ApplianceShapes.BIG_AC_OUT_HD);
    public static final RegistrySupplier<Block> CentreAirConditionOutside = registerAppliances("centre_air_condition_outside", ApplianceShapes.CentreAirConditionOutside);
    public static final RegistrySupplier<Block> AC_01 = registerAppliances("air_condition_hd_1",ApplianceShapes.AC_01);
    public static final RegistrySupplier<Block> AC_02 = registerAppliances("air_condition_hd_2",ApplianceShapes.AC_02);
    public static final RegistrySupplier<Block> AC_03 = registerAppliances("airconditionhd_3",ApplianceShapes.AC_03);
    public static final RegistrySupplier<Block> AC_04 = registerAppliances("airconditionhd_4",ApplianceShapes.AC_04);
    public static final RegistrySupplier<Block> OLD_AC_HD = registerAppliances("air_condition_old_hd",ApplianceShapes.OLD_AC_HD);
    public static final RegistrySupplier<Block> CAC_HD = registerAppliances("central_ac_hd",ApplianceShapes.CAC_HD);
    public static final RegistrySupplier<Block> MicroWaveOven = registerAppliances("micro_wave_oven",ApplianceShapes.MicroWaveOven);
    public static final RegistrySupplier<Block> Fridge1 = registerAppliances("fridge_1",ApplianceShapes.Fridge1);
    public static final RegistrySupplier<Block> Fridge2 = registerAppliances("fridge_2",ApplianceShapes.Fridge2);
    public static final RegistrySupplier<Block> Old_Fridge = registerAppliances("old_fridge",ApplianceShapes.Old_Fridge);
    public static final RegistrySupplier<Block> Freezer = registerAppliances("freezer",ApplianceShapes.Freezer);
    public static final RegistrySupplier<Block> GASWATERHEATER = registerAppliances("gas_water_heater",ApplianceShapes.GASWATERHEATER);
    public static final RegistrySupplier<Block> ELECTRICWATERHEATER = registerAppliances("electric_water_heater",ApplianceShapes.ELECTRICWATERHEATER);
    public static final RegistrySupplier<Block> SOLARWATERHEATER = registerAppliances("solarwaterheater",ApplianceShapes.SOLARWATERHEATER);
    public static final RegistrySupplier<Block> Old_Monitor = registerScreen("old_monitor_off",ApplianceShapes.Old_Monitor);
    public static final RegistrySupplier<Block> OLD_MAINUNIT = registerAppliances("old_mainunit",ApplianceShapes.OLD_MAINUNIT);
    public static final RegistrySupplier<Block> Monitor2010 = registerScreen("monitor_2010off",ApplianceShapes.Monitor2010);
    public static final RegistrySupplier<Block> MAINUNIT2010 = registerAppliances("mainunit_2010",ApplianceShapes.MAINUNIT2010);
    public static final RegistrySupplier<Block> ModernMonitor = registerScreen("modern_monitor_off",ApplianceShapes.ModernMonitor);
    public static final RegistrySupplier<Block> MODERNMAINUNIT = registerAppliances("main_unit_modern",ApplianceShapes.MODERMMAINUNIT);
    public static final RegistrySupplier<Block> AIOPC = registerScreen("all_in_one_pc",ApplianceShapes.AIOPC);
    public static final RegistrySupplier<Block> LAPTOP = registerScreen("laptop", ApplianceShapes.LAPTOP, ApplianceShapes.LAPTOP_ON);
    public static final RegistrySupplier<Block> LAPTOP_ON = registerLight("laptop_poweron",ApplianceShapes.LAPTOP_ON);
    public static final RegistrySupplier<Block> Old_Monitor_On = registerLight("old_monitor_on",ApplianceShapes.Old_Monitor);
    public static final RegistrySupplier<Block> Monitor2010ON = registerLight("monitor_2010_on",ApplianceShapes.Monitor2010);
    public static final RegistrySupplier<Block> ModernMonitorOn = registerLight("modern_monitor_on",ApplianceShapes.ModernMonitor);
    public static final RegistrySupplier<Block> AIOPCON = registerLight("all_in_one_pc_on",ApplianceShapes.AIOPC);

    private static RegistrySupplier<Block> registerAppliances(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericMetalBlock(shape));
    }
    private static RegistrySupplier<Block> registerLight(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericLightBlock(shape));
    }
    private static RegistrySupplier<Block> registerScreen(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new Power(shape));
    }
    private static RegistrySupplier<Block> registerScreen(String id, Map<Direction, VoxelShape> shapeOff, Map<Direction, VoxelShape> shapeOn) {
        return BLOCKS.register(id, () -> new Power(shapeOff, shapeOn));
    }
    public static void init() {
        for (RegistrySupplier<Block> block : BLOCKS) {
            ITEMS.register(block.getId().getPath(),
                    () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }
}