package com.xbzstudio.citymod;

import com.xbzstudio.citymod.block.BlockRegistry;
import com.xbzstudio.citymod.block.SchoolnextRegistry;
import com.xbzstudio.citymod.entity.ModEntities;
import com.xbzstudio.citymod.network.KillItemsPacket;
import dev.architectury.networking.NetworkManager;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class CityMod {
    public static final String MODID = "citymod";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MODID, Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MODID, Registries.ITEM);

    public static final DeferredRegister<Block> SCHOOLNEXT_BLOCKS = DeferredRegister.create("schoolnext", Registries.BLOCK);
    public static final DeferredRegister<Item> SCHOOLNEXT_ITEMS = DeferredRegister.create("schoolnext", Registries.ITEM);

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(MODID, Registries.ENTITY_TYPE);


    public static void init() {
        for (var def : BlockRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            RegistrySupplier<Block> block = BLOCKS.register(def.id(), factory);
            ITEMS.register(def.id(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
        for (var def : SchoolnextRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            RegistrySupplier<Block> block = SCHOOLNEXT_BLOCKS.register(def.id(), factory);
            SCHOOLNEXT_ITEMS.register(def.id(), () -> new BlockItem(block.get(), new Item.Properties()));
        }
        ENTITY_TYPES.register("seat", () -> ModEntities.SEAT);
        BLOCKS.register();
        ITEMS.register();
        SCHOOLNEXT_BLOCKS.register();
        SCHOOLNEXT_ITEMS.register();
        ENTITY_TYPES.register();
        ModCreativeTabs.TABS.register();
    }
}
