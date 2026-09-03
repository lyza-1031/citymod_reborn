package com.xbzstudio.citymod;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class CreativeTabRegistrar {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(CityMod.MODID, Registries.CREATIVE_MODE_TAB);

    private static Block getBlock(String id) {
        return BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath("citymod", id))
                .map(Holder.Reference::value)
                .orElse(Blocks.AIR);
    }

    public static void register() {
        for (var tab : CreativeTabData.TABS) {
            TABS.register(tab.id(), () -> CreativeTabRegistry.create(
                    tab.title(),
                    () -> {
                        Block b = getBlock(tab.iconId());
                        return new ItemStack(b != Blocks.AIR ? b.asItem() : Items.STONE);
                    }
            ));
        }
    }
}