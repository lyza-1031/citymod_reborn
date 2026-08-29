package com.xbzstudio.forge;

import com.xbzstudio.citymod.CityMod;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CityMod.MODID)
public class citymodForge {
    public citymodForge() {
        ModRegistry.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}