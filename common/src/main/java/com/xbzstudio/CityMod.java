package com.xbzstudio;

import com.xbzstudio.block.*;
import com.xbzstudio.network.KillItemsPacket;
import dev.architectury.networking.NetworkChannel;
import net.minecraft.resources.ResourceLocation;

public class CityMod {
    public static final String MODID = "citymod";
    public static final NetworkChannel CHANNEL = NetworkChannel.create(new ResourceLocation(MODID, "main"));

    static {
        CHANNEL.register(KillItemsPacket.class, KillItemsPacket::encode, KillItemsPacket::new, KillItemsPacket::handle);
    }

    public static void init() {
        ModBlocks.init();
        ApplianceBlocks.init();
        PostBlocks.init();
        CityBlocks.init();
        VehicleBlocks.init();
        WindowsBlocks.init();

        ModBlocks.BLOCKS.register();
        ModBlocks.ITEMS.register();
        ApplianceBlocks.BLOCKS.register();
        ApplianceBlocks.ITEMS.register();
        PostBlocks.BLOCKS.register();
        PostBlocks.ITEMS.register();
        CityBlocks.BLOCKS.register();
        CityBlocks.ITEMS.register();
        VehicleBlocks.BLOCKS.register();
        VehicleBlocks.ITEMS.register();
        WindowsBlocks.BLOCKS.register();
        WindowsBlocks.ITEMS.register();

        ModCreativeTabs.TABS.register();
    }
}