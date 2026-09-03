package com.xbzstudio.citymod.neoforge;

import com.xbzstudio.citymod.KillItems;
import com.xbzstudio.citymod.network.KillItemsPacket;
import net.minecraft.server.level.ServerLevel;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

public class NetworkHandler {
    public static void handle(KillItemsPacket msg, IPayloadContext ctx) {
        ctx.enqueueWork(() -> {
            var player = ctx.player();
            if (player instanceof net.minecraft.server.level.ServerPlayer sp) {
                KillItems.execute((ServerLevel) sp.level(), sp.getX(), sp.getY(), sp.getZ());
            }
        });
    }

    public static void register(PayloadRegistrar registrar) {
        registrar.playToServer(KillItemsPacket.TYPE, KillItemsPacket.CODEC, NetworkHandler::handle);
    }
}