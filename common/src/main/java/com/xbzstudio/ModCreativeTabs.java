package com.xbzstudio;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import dev.architectury.registry.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create("citymod", Registries.CREATIVE_MODE_TAB);

    private static Block blk(String id) {
        return BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath("citymod", id));
    }

    static {
        for (var tab : CreativeTabData.TABS) {
            TABS.register(tab.id(),
                    () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, CreativeTabData.TABS.indexOf(tab))
                            .title(tab.title())
                            .icon(() -> new ItemStack(blk(tab.iconId()).asItem()))
                            .displayItems((params, output) -> {
                                for (String id : tab.blockIds()) {
                                    Block b = blk(id);
                                    if (b != Blocks.AIR) output.accept(b.asItem());
                                }
                            })
                            .build()
            );
        }
    }
}