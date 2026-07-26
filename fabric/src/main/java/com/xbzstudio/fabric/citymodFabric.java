package com.xbzstudio.fabric;

import com.xbzstudio.CityMod;
import net.fabricmc.api.ModInitializer;

public class citymodFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CityMod.init();
    }
}