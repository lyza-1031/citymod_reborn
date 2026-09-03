package com.xbzstudio.citymod;

import com.xbzstudio.citymod.block.BlockRegistry;
import com.xbzstudio.citymod.network.KillItemsPacket;
import dev.architectury.networking.NetworkManager;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class CityMod {
    public static final String MODID = "citymod";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MODID, Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MODID, Registries.ITEM);


    public static void init() {
        for (var def : BlockRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            RegistrySupplier<Block> block = BLOCKS.register(def.id(), factory);
            ITEMS.register(def.id(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
        BLOCKS.register();
        ITEMS.register();
        ModCreativeTabs.TABS.register();
    }
}