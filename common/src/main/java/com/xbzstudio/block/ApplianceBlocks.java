package com.xbzstudio.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ApplianceBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create("citymod", Registries.ITEM);

    // ==================== 方块 ====================
    public static final RegistrySupplier<Block> AC_OUT_01 = BLOCKS.register("ac_out_hd_1", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_01));
    public static final RegistrySupplier<Block> AC_OUT_02 = BLOCKS.register("ac_out_hd_2", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_02));
    public static final RegistrySupplier<Block> AC_OUT_03 = BLOCKS.register("ac_out_hd_3", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_03));
    public static final RegistrySupplier<Block> AC_OUT_04 = BLOCKS.register("ac_out_hd_4", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_04));
    public static final RegistrySupplier<Block> AC_OUT_05 = BLOCKS.register("ac_out_hd_5", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_05));
    public static final RegistrySupplier<Block> AC_OUT_06 = BLOCKS.register("ac_out_hd_6", () -> new GenericMetalBlock(ApplianceShapes.AC_OUT_06));
    public static final RegistrySupplier<Block> BIG_AC_OUT_HD = BLOCKS.register("big_ac_out_hd",  () -> new GenericMetalBlock(ApplianceShapes.BIG_AC_OUT_HD));
    public static final RegistrySupplier<Block> CentreAirConditionOutside = BLOCKS.register("centre_air_condition_outside", () -> new GenericMetalBlock(ApplianceShapes.CentreAirConditionOutside));
    // ==================== BlockItem ====================
    public static final RegistrySupplier<Item> AC_OUT_01_ITEM = ITEMS.register("ac_out_hd_1", () -> new BlockItem(AC_OUT_01.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_02_ITEM = ITEMS.register("ac_out_hd_2", () -> new BlockItem(AC_OUT_02.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_03_ITEM = ITEMS.register("ac_out_hd_3", () -> new BlockItem(AC_OUT_03.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_04_ITEM = ITEMS.register("ac_out_hd_4", () -> new BlockItem(AC_OUT_04.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_05_ITEM = ITEMS.register("ac_out_hd_5", () -> new BlockItem(AC_OUT_05.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_06_ITEM = ITEMS.register("ac_out_hd_6", () -> new BlockItem(AC_OUT_06.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> BIG_AC_OUT_HD_ITEM = ITEMS.register("big_ac_out_hd", () -> new BlockItem(BIG_AC_OUT_HD.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> CentreAirConditionOutside_ITEM = ITEMS.register("centre_air_condition_outside", () -> new BlockItem(CentreAirConditionOutside.get(), new Item.Properties()));


    public static void init() {
        // BlockItem 已注册，这里空着
    }
}