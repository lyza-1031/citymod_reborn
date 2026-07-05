package com.xbzstudio;

public class CityMod {
    public static final String MODID = "citymod";

    // Fabric 用这个方法
    public static void init() {
        ModBlocks.init();
        ModBlocks.BLOCKS.register();
        ModBlocks.ITEMS.register();
        ModCreativeTabs.TABS.register();
        ApplianceBlocks.BLOCKS.register();
        ApplianceBlocks.ITEMS.register();
    }
}