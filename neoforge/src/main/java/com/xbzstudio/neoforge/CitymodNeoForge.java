package com.xbzstudio.neoforge;

import com.xbzstudio.citymod.CityMod;
import com.xbzstudio.citymod.network.KillItemsPacket;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;

@Mod(CityMod.MODID)
public class CitymodNeoForge {
    public CitymodNeoForge(IEventBus modEventBus, ModContainer container) {
        ModRegistry.register(modEventBus);
        modEventBus.addListener((RegisterPayloadHandlersEvent event) -> {
            event.registrar("1")
                    .playToServer(KillItemsPacket.TYPE, KillItemsPacket.CODEC, NetworkHandler::handle);
        });
    }
}