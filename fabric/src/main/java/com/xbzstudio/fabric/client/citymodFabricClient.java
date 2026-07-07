package com.xbzstudio.fabric.client;

import com.xbzstudio.block.ApplianceBlocks;
import com.xbzstudio.block.CityBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public final class citymodFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (var block : ApplianceBlocks.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutoutMipped());
        }
        for (var block : CityBlocks.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutoutMipped());
        }
    }
}