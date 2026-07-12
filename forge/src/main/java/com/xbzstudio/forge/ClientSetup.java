package com.xbzstudio.forge;

import com.xbzstudio.block.Power;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = "citymod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // ApplianceBlocks 用 cutoutMipped
            for (RegistryObject<Block> block : ModRegistry.getApplianceBlocks()) {
                ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutoutMipped());
            }
        });
    }
}