package com.xbzstudio.fabric.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.xbzstudio.block.BlockRegistry;
import com.xbzstudio.network.KillItemsPacket;
import dev.architectury.networking.NetworkManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public final class citymodFabricClient implements ClientModInitializer {

    private static KeyMapping killItemsKey;

    @Override
    public void onInitializeClient() {
        System.setProperty("fabric.texture.size.limit", "4096");

        for (var def : BlockRegistry.BLOCKS) {
            Block block = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("citymod", def.id()));
            if (block == Blocks.AIR) continue;
            String id = def.id();
            if (id.contains("window") || id.contains("glass")) {
                BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent());
            } else if (id.contains("road")) {
                BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
            } else {
                BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutoutMipped());
            }
        }

        killItemsKey = KeyBindingHelper.registerKeyBinding(new KeyMapping(
                "key.citymod.kill_items_key",
                InputConstants.KEY_DELETE,
                "key.categories.citymod"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (killItemsKey.consumeClick() && client.player != null) {
                client.player.connection.sendCommand("kill @e[type=item]");
                client.player.displayClientMessage(
                        Component.translatable("message.citymod.kill_items"), true);
            }
        });
    }
}