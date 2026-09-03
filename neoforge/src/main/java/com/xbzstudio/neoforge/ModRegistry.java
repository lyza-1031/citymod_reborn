package com.xbzstudio.neoforge;

import com.xbzstudio.citymod.CityMod;
import com.xbzstudio.citymod.CreativeTabData;
import com.xbzstudio.citymod.block.BlockRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.*;
import java.util.function.Supplier;

public class ModRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CityMod.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CityMod.MODID);
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CityMod.MODID);

    public static final Map<String, net.neoforged.neoforge.registries.DeferredHolder<Block, Block>> BLOCK_MAP = new LinkedHashMap<>();

    @SuppressWarnings("unchecked")
    public static void register(IEventBus bus) {
        for (var def : BlockRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            var block = BLOCKS.register(def.id(), factory);
            BLOCK_MAP.put(def.id(), block);
        }
        for (var entry : BLOCK_MAP.entrySet()) {
            ITEMS.register(entry.getKey(),
                    () -> new BlockItem(entry.getValue().get(), new Item.Properties()));
        }
        BLOCKS.register(bus);
        ITEMS.register(bus);

        for (var tab : CreativeTabData.TABS) {
            TABS.register(tab.id(),
                    () -> CreativeModeTab.builder()
                            .title(tab.title())
                            .icon(() -> {
                                var b = BLOCK_MAP.get(tab.iconId());
                                return new ItemStack(b != null ? b.get().asItem() : Items.STONE);
                            })
                            .displayItems((params, output) -> {
                                for (String id : tab.blockIds()) {
                                    var b = BLOCK_MAP.get(id);
                                    if (b != null) output.accept(b.get().asItem());
                                }
                            })
                            .build()
            );
        }
        TABS.register(bus);
    }
}