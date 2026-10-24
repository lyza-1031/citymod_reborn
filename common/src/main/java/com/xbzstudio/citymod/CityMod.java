package com.xbzstudio.citymod;

import com.xbzstudio.citymod.block.BlockRegistry;
import com.xbzstudio.citymod.block.SchoolnextRegistry; // 引入学校注册类
import com.xbzstudio.citymod.entity.ModEntities;
import com.xbzstudio.citymod.network.KillItemsPacket;
import dev.architectury.networking.NetworkChannel;
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
    public static final NetworkChannel CHANNEL = NetworkChannel.create(new ResourceLocation(MODID, "main"));

    public static final DeferredRegister<Block> CITY_BLOCKS = DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> CITY_ITEMS = DeferredRegister.create("citymod", Registries.ITEM);

    public static final DeferredRegister<Block> SCHOOLNEXT_BLOCKS = DeferredRegister.create("schoolnext", Registries.BLOCK);
    public static final DeferredRegister<Item> SCHOOLNEXT_ITEMS = DeferredRegister.create("schoolnext", Registries.ITEM);

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(MODID, Registries.ENTITY_TYPE);

    static {
        CHANNEL.register(KillItemsPacket.class, KillItemsPacket::encode, KillItemsPacket::new, KillItemsPacket::handle);
    }

    public static void init() {
        for (var def : BlockRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            RegistrySupplier<Block> block;
                block = CITY_BLOCKS.register(def.id(), factory);
                CITY_ITEMS.register(def.id(), () -> new BlockItem(block.get(), new Item.Properties()));
        }

        for (var def : SchoolnextRegistry.BLOCKS) {
            Supplier<Block> factory = (Supplier<Block>) def.factory();
            RegistrySupplier<Block> block = SCHOOLNEXT_BLOCKS.register(def.id(), factory);
            SCHOOLNEXT_ITEMS.register(def.id(), () -> new BlockItem(block.get(), new Item.Properties()));
        }

        ENTITY_TYPES.register("seat", () -> ModEntities.SEAT);
        CITY_BLOCKS.register();
        CITY_ITEMS.register();
        SCHOOLNEXT_BLOCKS.register();
        SCHOOLNEXT_ITEMS.register();

        ENTITY_TYPES.register();

        ModCreativeTabs.TABS.register();
    }
}