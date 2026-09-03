package com.xbzstudio.neoforge;

import com.mojang.blaze3d.platform.InputConstants;
import com.xbzstudio.citymod.network.KillItemsPacket;
import dev.architectury.networking.NetworkManager;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.InputEvent;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.RenderTypeHelper;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = "citymod", bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ClientSetup {

    public static final KeyMapping KILL_ITEMS_KEY = new KeyMapping(
            "key.citymod.kill_items_key",
            InputConstants.KEY_DELETE,
            "key.categories.citymod"
    );

    /*@SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            for (RegistryObject<Block> block : ModRegistry.getApplianceBlocks()) {
                ItemBlockRenderTypes.setRenderLayer(block.get(), RenderType.cutoutMipped());
            }
        });
    }*/

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(KILL_ITEMS_KEY);
    }

    @EventBusSubscriber(modid = "citymod", value = Dist.CLIENT)
    public static class KeyEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player != null && KILL_ITEMS_KEY.consumeClick()) {
                PacketDistributor.sendToServer(new KillItemsPacket());
                mc.player.displayClientMessage(
                        Component.translatable("message.citymod.kill_items"), true);
            }
        }
    }
}