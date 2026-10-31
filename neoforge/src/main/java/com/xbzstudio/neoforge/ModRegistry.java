package com.xbzstudio.citymod.neoforge;

import com.xbzstudio.citymod.CityMod;
import com.xbzstudio.citymod.CreativeTabData;
import com.xbzstudio.citymod.ModBlockItem;
import com.xbzstudio.citymod.block.BlockRegistry;
import com.xbzstudio.citymod.block.SchoolnextRegistry;
import com.xbzstudio.citymod.entity.ModEntities;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.*;

public class ModRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CityMod.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CityMod.MODID);
    public static final DeferredRegister<Block> SCHOOLNEXT_BLOCKS =
            DeferredRegister.create(Registries.BLOCK, "schoolnext");
    public static final DeferredRegister<Item> SCHOOLNEXT_ITEMS =
            DeferredRegister.create(Registries.ITEM, "schoolnext");
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, CityMod.MODID);
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CityMod.MODID);

    public static final Map<String, DeferredHolder<Block, Block>> BLOCK_MAP = new LinkedHashMap<>();

    public static void register(IEventBus bus) {
        for (var def : BlockRegistry.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath(CityMod.MODID, def.id());
            DeferredHolder<Block, Block> blockHolder = BLOCKS.register(def.id(), () -> def.factory().apply(id));
            BLOCK_MAP.put(def.id(), blockHolder);
        }
        for (var def : SchoolnextRegistry.BLOCKS) {
            Identifier id = Identifier.fromNamespaceAndPath("schoolnext", def.id());
            DeferredHolder<Block, Block> blockHolder = SCHOOLNEXT_BLOCKS.register(def.id(), () -> def.factory().apply(id));
            BLOCK_MAP.put("schoolnext:" + def.id(), blockHolder);
            BLOCK_MAP.putIfAbsent(def.id(), blockHolder);
        }
        for (var def : BlockRegistry.BLOCKS) {
            String id = def.id();
            Identifier location = Identifier.fromNamespaceAndPath(CityMod.MODID, id);
            ITEMS.register(id, () -> {
                Item.Properties props = new Item.Properties();
                props.setId(ResourceKey.create(Registries.ITEM, location));
                return new ModBlockItem(BLOCK_MAP.get(id).get(), props, id);
            });
        }
        for (var def : SchoolnextRegistry.BLOCKS) {
            String id = def.id();
            Identifier location = Identifier.fromNamespaceAndPath("schoolnext", id);
            SCHOOLNEXT_ITEMS.register(id, () -> {
                Item.Properties props = new Item.Properties();
                props.setId(ResourceKey.create(Registries.ITEM, location));
                return new ModBlockItem(BLOCK_MAP.get("schoolnext:" + id).get(), props, id);
            });
        }
        ENTITY_TYPES.register("seat", () -> ModEntities.SEAT);
        BLOCKS.register(bus);
        ITEMS.register(bus);
        SCHOOLNEXT_BLOCKS.register(bus);
        SCHOOLNEXT_ITEMS.register(bus);
        ENTITY_TYPES.register(bus);

        // 4. 注册创造模式标签页
        for (var tab : CreativeTabData.TABS) {
            TABS.register(tab.id(),
                    () -> CreativeModeTab.builder()
                            .title(tab.title())
                            .icon(() -> {
                                var blockHolder = BLOCK_MAP.get(tab.iconId());
                                return new ItemStack(blockHolder != null ? blockHolder.get().asItem() : Items.STONE);
                            })
                            .displayItems((params, output) -> {
                                for (String blockId : tab.blockIds()) {
                                    var blockHolder = BLOCK_MAP.get(blockId);
                                    if (blockHolder != null) {
                                        output.accept(blockHolder.get().asItem());
                                    }
                                }
                            })
                            .build()
            );
        }
        TABS.register(bus);
    }
}
