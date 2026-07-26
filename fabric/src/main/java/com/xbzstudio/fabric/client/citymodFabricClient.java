package com.xbzstudio.fabric.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.xbzstudio.block.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer; // ← 新的导入
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public final class citymodFabricClient implements ClientModInitializer {

    private static KeyMapping killItemsKey;

    @Override
    public void onInitializeClient() {
        System.setProperty("fabric.texture.size.limit", "4096");

        for (var def : BlockRegistry.BLOCKS) {
            Identifier loc = Identifier.fromNamespaceAndPath("citymod", def.id());
            Block block = BuiltInRegistries.BLOCK
                    .get(loc)
                    .map(Holder.Reference::value)
                    .orElse(Blocks.AIR);
            if (block == Blocks.AIR) continue;

            String id = def.id();
            if (id.contains("window") || id.contains("glass")) {
                BlockRenderLayerMap.putBlock(block, ChunkSectionLayer.TRANSLUCENT);
            } else if (id.contains("road")) {
                BlockRenderLayerMap.putBlock(block, ChunkSectionLayer.CUTOUT);
            } else {
                BlockRenderLayerMap.putBlock(block, ChunkSectionLayer.CUTOUT);
            }
        }

        killItemsKey = KeyBindingHelper.registerKeyBinding(new KeyMapping(
                "key.citymod.kill_items_key",
                InputConstants.KEY_DELETE,
                KeyMapping.Category.GAMEPLAY
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