package com.xbzstudio.citymod;

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
        if (id.contains(":")) {
            String[] parts = id.split(":", 2);
            Block b = BuiltInRegistries.BLOCK.get(new ResourceLocation(parts[0], parts[1]));
            return b == null ? Blocks.AIR : b;
        }

        Block b = BuiltInRegistries.BLOCK.get(new ResourceLocation("citymod", id));
        if (b != Blocks.AIR) return b;

        return BuiltInRegistries.BLOCK.get(new ResourceLocation("schoolnext", id));
    }

    static {
        for (var tab : CreativeTabData.TABS) {
            TABS.register(tab.id(),
                    () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, CreativeTabData.TABS.indexOf(tab))
                            .title(tab.title())
                            .icon(() -> {
                                Block b = blk(tab.iconId());
                                return new ItemStack(b != Blocks.AIR ? b.asItem() : Items.STONE);
                            })
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