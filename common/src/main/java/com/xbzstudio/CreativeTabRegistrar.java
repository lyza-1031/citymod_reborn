package com.xbzstudio;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Function;

public class CreativeTabRegistrar {

    private static Block getBlock(String id) {
        return BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath("citymod", id))
                .map(Holder.Reference::value)
                .orElse(Blocks.AIR);
    }

    public static void register(Function<CreativeModeTab, Void> registry) {
        for (var tab : CreativeTabData.TABS) {
            CreativeModeTab creativeTab = CreativeModeTab.builder(CreativeModeTab.Row.TOP, CreativeTabData.TABS.indexOf(tab))
                    .title(tab.title())
                    .icon(() -> {
                        Block b = getBlock(tab.iconId());
                        return new ItemStack(b != Blocks.AIR ? b.asItem() : Items.STONE);
                    })
                    .displayItems((params, output) -> {
                        for (String id : tab.blockIds()) {
                            Block b = getBlock(id);
                            if (b != Blocks.AIR) output.accept(b.asItem());
                        }
                    })
                    .build();
            registry.apply(creativeTab);
        }
    }
}