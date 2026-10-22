package com.xbzstudio.forge;

import com.xbzstudio.citymod.CityMod;
import com.xbzstudio.citymod.CreativeTabData;
import com.xbzstudio.citymod.block.BlockRegistry;
import com.xbzstudio.citymod.block.SchoolnextRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModRegistry {

    public static final DeferredRegister<Block> CITY_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "citymod");
    public static final DeferredRegister<Item> CITY_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "citymod");

    public static final DeferredRegister<Block> SCHOOLNEXT_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "schoolnext");
    public static final DeferredRegister<Item> SCHOOLNEXT_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "schoolnext");

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CityMod.MODID);

    public static final Map<String, RegistryObject<Block>> BLOCK_MAP = new LinkedHashMap<>();

    @SuppressWarnings("unchecked")
    public static void register(IEventBus bus) {
        for (var def : BlockRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            RegistryObject<Block> block = CITY_BLOCKS.register(def.id(), factory);
            BLOCK_MAP.put(def.id(), block);
        }

        for (var def : SchoolnextRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            RegistryObject<Block> block = SCHOOLNEXT_BLOCKS.register(def.id(), factory);

            BLOCK_MAP.put("schoolnext:" + def.id(), block);
            BLOCK_MAP.putIfAbsent(def.id(), block);
        }

        for (var def : BlockRegistry.BLOCKS) {
            CITY_ITEMS.register(def.id(), () -> new BlockItem(BLOCK_MAP.get(def.id()).get(), new Item.Properties()));
        }

        for (var def : SchoolnextRegistry.BLOCKS) {
            SCHOOLNEXT_ITEMS.register(def.id(), () -> new BlockItem(BLOCK_MAP.get("schoolnext:" + def.id()).get(), new Item.Properties()));
        }

        CITY_BLOCKS.register(bus);
        CITY_ITEMS.register(bus);
        SCHOOLNEXT_BLOCKS.register(bus);
        SCHOOLNEXT_ITEMS.register(bus);

        for (var tab : CreativeTabData.TABS) {
            TABS.register(tab.id(),
                    () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, CreativeTabData.TABS.indexOf(tab))
                            .title(tab.title())
                            .icon(() -> {
                                RegistryObject<Block> b = BLOCK_MAP.get(tab.iconId());
                                return new ItemStack(b != null ? b.get().asItem() : Items.STONE);
                            })
                            .displayItems((params, output) -> {
                                for (String id : tab.blockIds()) {
                                    RegistryObject<Block> b = BLOCK_MAP.get(id);
                                    if (b != null) output.accept(b.get().asItem());
                                }
                            })
                            .build()
            );
        }
        TABS.register(bus);
    }
}