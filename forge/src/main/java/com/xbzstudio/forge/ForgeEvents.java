package com.xbzstudio.forge;

import com.xbzstudio.CityMod;
import com.xbzstudio.PlayerJoinHandler;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CityMod.MODID)
public class ForgeEvents {
    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        if (event.getEntity() instanceof ServerPlayer sp) {
            PlayerJoinHandler.onPlayerJoin(sp);
        }
    }
}