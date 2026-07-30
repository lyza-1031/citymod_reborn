package com.xbzstudio.fabric;

import com.xbzstudio.CityMod;
import com.xbzstudio.PlayerJoinHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class citymodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
            PlayerJoinHandler.onPlayerJoin(handler.getPlayer());
        });
        CityMod.init();
    }
}