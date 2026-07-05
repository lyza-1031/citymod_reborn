package com.xbzstudio;

import com.xbzstudio.block.ApplianceShapes;
import com.xbzstudio.block.GenericMetalBlock;
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

    // ==================== BlockItem ====================
    public static final RegistrySupplier<Item> AC_OUT_01_ITEM = ITEMS.register("ac_out_hd_1", () -> new BlockItem(AC_OUT_01.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_02_ITEM = ITEMS.register("ac_out_hd_2", () -> new BlockItem(AC_OUT_02.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_03_ITEM = ITEMS.register("ac_out_hd_3", () -> new BlockItem(AC_OUT_03.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> AC_OUT_04_ITEM = ITEMS.register("ac_out_hd_4", () -> new BlockItem(AC_OUT_04.get(), new Item.Properties()));

    public static void init() {
        // BlockItem 已注册，这里空着
    }
}