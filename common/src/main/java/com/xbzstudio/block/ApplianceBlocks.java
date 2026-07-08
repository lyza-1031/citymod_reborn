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
    public static final RegistrySupplier<Block> AC_OUT_01 = registerAppliances("ac_out_hd_1", ApplianceShapes.AC_OUT_01);
    public static final RegistrySupplier<Block> AC_OUT_02 = registerAppliances("ac_out_hd_2", ApplianceShapes.AC_OUT_02);
    public static final RegistrySupplier<Block> AC_OUT_03 = registerAppliances("ac_out_hd_3", ApplianceShapes.AC_OUT_03);
    public static final RegistrySupplier<Block> AC_OUT_04 = registerAppliances("ac_out_hd_4", ApplianceShapes.AC_OUT_04);
    public static final RegistrySupplier<Block> AC_OUT_05 = registerAppliances("ac_out_hd_5", ApplianceShapes.AC_OUT_05);
    public static final RegistrySupplier<Block> AC_OUT_06 = registerAppliances("ac_out_hd_6", ApplianceShapes.AC_OUT_06);
    public static final RegistrySupplier<Block> BIG_AC_OUT_HD = registerAppliances("big_ac_out_hd",  ApplianceShapes.BIG_AC_OUT_HD);
    public static final RegistrySupplier<Block> CentreAirConditionOutside = registerAppliances("centre_air_condition_outside", ApplianceShapes.CentreAirConditionOutside);
    public static final RegistrySupplier<Block> AC_01 = registerAppliances("air_condition_hd_1",ApplianceShapes.AC_01);
    public static final RegistrySupplier<Block> AC_02 = registerAppliances("air_condition_hd_2",ApplianceShapes.AC_02);
    public static final RegistrySupplier<Block> AC_03 = registerAppliances("airconditionhd_3",ApplianceShapes.AC_03);
    public static final RegistrySupplier<Block> AC_04 = registerAppliances("airconditionhd_4",ApplianceShapes.AC_04);
    public static final RegistrySupplier<Block> OLD_AC_HD = registerAppliances("air_condition_old_hd",ApplianceShapes.OLD_AC_HD);
    public static final RegistrySupplier<Block> CAC_HD = registerAppliances("central_ac_hd",ApplianceShapes.CAC_HD);

    private static RegistrySupplier<Block> registerAppliances(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericMetalBlock(shape));
    }
    public static void init() {
        for (RegistrySupplier<Block> block : BLOCKS) {
            ITEMS.register(block.getId().getPath(),
                    () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }
}