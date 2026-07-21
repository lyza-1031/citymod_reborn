package com.xbzstudio.network;

import com.xbzstudio.CityMod;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record KillItemsPacket() implements CustomPacketPayload {
    public static final Type<KillItemsPacket> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(CityMod.MODID, "kill_items"));

    @Override
    public Type<? extends CustomPacketPayload> type() { return TYPE; }

    public static final StreamCodec<FriendlyByteBuf, KillItemsPacket> CODEC = new StreamCodec<>() {
        @Override
        public void encode(FriendlyByteBuf buf, KillItemsPacket packet) {
        }

        @Override
        public KillItemsPacket decode(FriendlyByteBuf buf) {
            return new KillItemsPacket();
        }
    };
}