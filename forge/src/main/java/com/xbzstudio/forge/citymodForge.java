package com.xbzstudio.forge;

import com.xbzstudio.CityMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CityMod.MODID)
public class citymodForge {
    public citymodForge() {
        ModRegistry.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}