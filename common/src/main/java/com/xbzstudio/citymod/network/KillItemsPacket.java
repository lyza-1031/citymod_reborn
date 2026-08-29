package com.xbzstudio.citymod.network;

import com.xbzstudio.citymod.KillItems;
import dev.architectury.networking.NetworkManager;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

import java.util.function.Supplier;

public class KillItemsPacket {

    public KillItemsPacket() {
    }

    public KillItemsPacket(FriendlyByteBuf buf) {
    }

    public void encode(FriendlyByteBuf buf) {
    }

    public static void handle(KillItemsPacket message, Supplier<NetworkManager.PacketContext> ctxSupplier) {
        NetworkManager.PacketContext ctx = ctxSupplier.get();
        ctx.queue(() -> {
            Player player = ctx.getPlayer();
            if (player instanceof ServerPlayer serverPlayer) {
                KillItems.execute(serverPlayer.serverLevel(), player.getX(), player.getY(), player.getZ());
            }
        });
    }
}