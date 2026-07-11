package com.xbzstudio;

import com.xbzstudio.block.*;

public class CityMod {
    public static final String MODID = "citymod";

    // Fabric 用这个方法
    public static void init() {
        ModBlocks.init();
        ApplianceBlocks.init();
        PostBlocks.init();
        CityBlocks.init();
        VehicleBlocks.init();
        ModBlocks.BLOCKS.register();
        ModBlocks.ITEMS.register();
        ModCreativeTabs.TABS.register();
        ApplianceBlocks.BLOCKS.register();
        ApplianceBlocks.ITEMS.register();
        PostBlocks.BLOCKS.register();
        PostBlocks.ITEMS.register();
        CityBlocks.BLOCKS.register();
        CityBlocks.ITEMS.register();
        VehicleBlocks.BLOCKS.register();
        VehicleBlocks.ITEMS.register();
    }
}