package com.xbzstudio.citymod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Function;

public class CreativeTabRegistrar {

    public static void register(Function<CreativeModeTab, Void> registry) {
        for (var tab : CreativeTabData.TABS) {
            CreativeModeTab creativeTab = CreativeModeTab.builder(CreativeModeTab.Row.TOP, CreativeTabData.TABS.indexOf(tab))
                    .title(tab.title())
                    .icon(() -> {
                        Block b = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("citymod", tab.iconId()));
                        return new ItemStack(b != Blocks.AIR ? b.asItem() : Items.STONE);
                    })
                    .displayItems((params, output) -> {
                        for (String id : tab.blockIds()) {
                            Block b = BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("citymod", id));
                            if (b != Blocks.AIR) output.accept(b.asItem());
                        }
                    })
                    .build();
            registry.apply(creativeTab);
        }
    }
}