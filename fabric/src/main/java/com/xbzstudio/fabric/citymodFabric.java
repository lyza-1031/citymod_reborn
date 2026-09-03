package com.xbzstudio.fabric;

import com.xbzstudio.citymod.CityMod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class citymodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CityMod.init();
    }
}