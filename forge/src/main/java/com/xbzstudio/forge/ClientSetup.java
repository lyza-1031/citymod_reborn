package com.xbzstudio.forge;

import com.mojang.blaze3d.platform.InputConstants;
import com.xbzstudio.citymod.CityMod;
import com.xbzstudio.citymod.network.KillItemsPacket;
import dev.architectury.networking.NetworkManager;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = "citymod", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

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

    @Mod.EventBusSubscriber(modid = "citymod", value = Dist.CLIENT)
    public static class KeyEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player != null && KILL_ITEMS_KEY.consumeClick()) {
                CityMod.CHANNEL.sendToServer(new KillItemsPacket());
                mc.player.displayClientMessage(
                        Component.translatable("message.citymod.kill_items"), true);
            }
        }
    }
}