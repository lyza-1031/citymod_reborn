package com.xbzstudio.fabric.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.xbzstudio.CityMod;
import com.xbzstudio.block.ApplianceBlocks;
import com.xbzstudio.block.CityBlocks;
import com.xbzstudio.block.WindowsBlocks;
import com.xbzstudio.network.KillItemsPacket;
import dev.architectury.networking.NetworkManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;

public final class citymodFabricClient implements ClientModInitializer {

    private static KeyMapping killItemsKey;

    @Override
    public void onInitializeClient() {
        System.setProperty("fabric.texture.size.limit", "4096");

        // 渲染层
        for (var block : ApplianceBlocks.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutoutMipped());
        }
        for (var block : CityBlocks.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutoutMipped());
        }
        for (var block : WindowsBlocks.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.translucent());
        }

        // 按键绑定
        killItemsKey = KeyBindingHelper.registerKeyBinding(new KeyMapping(
                "key.citymod.kill_items_key",
                InputConstants.KEY_DELETE,
                "key.categories.citymod"
        ));

        // 按键事件
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (killItemsKey.consumeClick() && client.player != null) {
                CityMod.CHANNEL.sendToServer(new KillItemsPacket());
                client.player.displayClientMessage(
                        Component.translatable("message.citymod.kill_items"), true);
            }
        });
    }
}