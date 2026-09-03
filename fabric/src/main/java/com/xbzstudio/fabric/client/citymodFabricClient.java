package com.xbzstudio.citymod.fabric.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.xbzstudio.citymod.block.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.KeyMapping;
//import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
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

/*        for (var def : BlockRegistry.BLOCKS) {
            Identifier loc = Identifier.fromNamespaceAndPath("citymod", def.id());
            Block block = BuiltInRegistries.BLOCK
                    .get(loc)
                    .map(Holder.Reference::value)
                    .orElse(Blocks.AIR);
            if (block == Blocks.AIR) continue;

            String id = def.id();
            if (id.contains("window") || id.contains("glass")) {
                BlockRenderLayerMap.INSTANCE.putBlock(block, ChunkSectionLayer.TRANSLUCENT);
            } else if (id.contains("road")) {
                BlockRenderLayerMap.INSTANCE.putBlock(block, ChunkSectionLayer.CUTOUT);
            } else {
                BlockRenderLayerMap.INSTANCE.putBlock(block, ChunkSectionLayer.CUTOUT);
            }
        }*/

        killItemsKey = KeyMappingHelper.registerKeyMapping(new KeyMapping(
                "key.citymod.kill_items_key",
                InputConstants.KEY_DELETE,
                KeyMapping.Category.GAMEPLAY
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (killItemsKey.consumeClick() && client.player != null) {
                client.player.connection.sendCommand("kill @e[type=item]");
        }
    });
    }
}