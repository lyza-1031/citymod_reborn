package com.xbzstudio.neoforge;

import com.xbzstudio.CityMod;
import com.xbzstudio.PlayerJoinHandler;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = CityMod.MODID)
public class NeoForgeEvents {
    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof ServerPlayer sp) {
            PlayerJoinHandler.onPlayerJoin(sp);
        }
    }
}