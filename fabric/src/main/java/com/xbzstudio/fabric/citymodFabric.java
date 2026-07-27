package com.xbzstudio.fabric;

import com.xbzstudio.CityMod;
import com.xbzstudio.PlayerJoinHandler;
import net.fabricmc.api.ModInitializer;

public class citymodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CityMod.init();
        net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            PlayerJoinHandler.onPlayerJoin(handler.getPlayer());
        });
    }
}