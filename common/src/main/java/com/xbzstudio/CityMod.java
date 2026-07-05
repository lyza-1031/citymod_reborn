package com.xbzstudio;

import com.xbzstudio.block.ApplianceBlocks;
import com.xbzstudio.block.ModBlocks;
import com.xbzstudio.block.PostBlocks;

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
        PostBlocks.BLOCKS.register();
        PostBlocks.ITEMS.register();
    }
}