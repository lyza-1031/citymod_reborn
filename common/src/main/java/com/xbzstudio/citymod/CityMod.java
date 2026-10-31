package com.xbzstudio.citymod;

import com.xbzstudio.citymod.block.BlockRegistry;
import com.xbzstudio.citymod.block.SchoolnextRegistry;
import com.xbzstudio.citymod.entity.ModEntities;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CityMod {
    public static final String MODID = "citymod";

    public static void init() {
        for (var def : BlockRegistry.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath(MODID, def.id());
            Registry.register(BuiltInRegistries.BLOCK, id, def.factory().apply(id));
        }
        for (var def : BlockRegistry.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath(MODID, def.id());
            Block block = BuiltInRegistries.BLOCK.get(id)
                    .map(Holder.Reference::value)
                    .orElseThrow(() -> new IllegalStateException("Block not found: " + id));

            Item.Properties props = new Item.Properties();
            props.setId(ResourceKey.create(Registries.ITEM, id));
            Registry.register(BuiltInRegistries.ITEM, id, new ModBlockItem(block, props, def.id()));
        }
        for (var def : SchoolnextRegistry.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath("schoolnext", def.id());
            Registry.register(BuiltInRegistries.BLOCK, id, def.factory().apply(id));
        }
        for (var def : SchoolnextRegistry.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath("schoolnext", def.id());
            Block block = BuiltInRegistries.BLOCK.get(id)
                    .map(Holder.Reference::value)
                    .orElseThrow(() -> new IllegalStateException("Block not found: " + id));

            Item.Properties props = new Item.Properties();
            props.setId(ResourceKey.create(Registries.ITEM, id));
            Registry.register(BuiltInRegistries.ITEM, id, new ModBlockItem(block, props, def.id()));
        }
        Identifier seatId = Identifier.fromNamespaceAndPath(MODID, "seat");
        Registry.register(BuiltInRegistries.ENTITY_TYPE, seatId, ModEntities.SEAT);
        ModCreativeTabs.TABS.register();
        ModCreativeTabs.appendItems();
    }
}
