package com.xbzstudio.forge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("citymod")
@SuppressWarnings("removal")
public class citymodForge {
    public citymodForge() {
        ModRegistry.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}