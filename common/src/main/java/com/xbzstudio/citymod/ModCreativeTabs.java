package com.xbzstudio.citymod;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create("citymod", Registries.CREATIVE_MODE_TAB);

    private static Block blk(String id) {
        return BuiltInRegistries.BLOCK.get(Identifier.fromNamespaceAndPath("citymod", id))
                .map(Holder.Reference::value)
                .orElse(Blocks.AIR);
    }

    static {
        for (var tab : CreativeTabData.TABS) {
            TABS.register(tab.id(), () -> CreativeTabRegistry.create(
                    tab.title(),
                    () -> new ItemStack(blk(tab.iconId()).asItem())
            ));
        }
    }

    public static void appendItems() {
        for (var tab : CreativeTabData.TABS) {
            ResourceKey<CreativeModeTab> tabKey = ResourceKey.create(
                    Registries.CREATIVE_MODE_TAB,
                    Identifier.fromNamespaceAndPath("citymod", tab.id())
            );
            var items = tab.blockIds().stream()
                    .map(ModCreativeTabs::blk)
                    .filter(b -> b != Blocks.AIR)
                    .toArray(Block[]::new);

            // 使用 append，参数为 ResourceKey 和 ItemLike...
            CreativeTabRegistry.append(tabKey, items);
        }
    }
}