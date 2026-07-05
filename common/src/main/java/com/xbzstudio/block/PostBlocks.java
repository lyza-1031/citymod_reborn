package com.xbzstudio.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class PostBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create("citymod", Registries.ITEM);

    // ==================== 方块 ====================
    public static final RegistrySupplier<Block> Post1691 = BLOCKS.register("post_1691", () -> new GenericPostBlock(PostShapes.Post1691));
    public static final RegistrySupplier<Block> Post1692 = BLOCKS.register("post_1692", () -> new GenericPostBlock(PostShapes.Post1692));
    public static final RegistrySupplier<Block> Post1693 = BLOCKS.register("post_1693", () -> new GenericPostBlock(PostShapes.Post1693));
    public static final RegistrySupplier<Block> Post1694 = BLOCKS.register("post_1694", () -> new GenericPostBlock(PostShapes.Post1694));
    public static final RegistrySupplier<Block> Post1695 = BLOCKS.register("post_1695", () -> new GenericPostBlock(PostShapes.Post1695));
    public static final RegistrySupplier<Block> Post1696 = BLOCKS.register("post_1696", () -> new GenericPostBlock(PostShapes.Post1696));
    public static final RegistrySupplier<Block> Post1697 = BLOCKS.register("post_1697", () -> new GenericPostBlock(PostShapes.Post1697));
    public static final RegistrySupplier<Block> Post1698 = BLOCKS.register("post_1698", () -> new GenericPostBlock(PostShapes.Post1698));
    public static final RegistrySupplier<Block> Post431 = BLOCKS.register("post_431", () -> new GenericPostBlock(PostShapes.Post431));
    public static final RegistrySupplier<Block> Post432 = BLOCKS.register("post_432", () -> new GenericPostBlock(PostShapes.Post432));
    public static final RegistrySupplier<Block> Post433 = BLOCKS.register("post_433", () -> new GenericPostBlock(PostShapes.Post433));

    // ==================== BlockItem ====================
    public static final RegistrySupplier<Item> Post1691_ITEM = ITEMS.register("post_1691", () -> new BlockItem(Post1691.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post1692_ITEM = ITEMS.register("post_1692", () -> new BlockItem(Post1692.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post1693_ITEM = ITEMS.register("post_1693", () -> new BlockItem(Post1693.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post1694_ITEM = ITEMS.register("post_1694", () -> new BlockItem(Post1694.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post1695_ITEM = ITEMS.register("post_1695", () -> new BlockItem(Post1695.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post1696_ITEM = ITEMS.register("post_1696", () -> new BlockItem(Post1696.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post1697_ITEM = ITEMS.register("post_1697", () -> new BlockItem(Post1697.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post1698_ITEM = ITEMS.register("post_1698", () -> new BlockItem(Post1698.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post431_ITEM = ITEMS.register("post_431", () -> new BlockItem(Post431.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post432_ITEM = ITEMS.register("post_432", () -> new BlockItem(Post432.get(), new Item.Properties()));
    public static final RegistrySupplier<Item> Post433_ITEM = ITEMS.register("post_433", () -> new BlockItem(Post433.get(), new Item.Properties()));



    public static void init() {
    }
}