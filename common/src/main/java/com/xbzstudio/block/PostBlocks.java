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
    public static final RegistrySupplier<Block> Post1691 = registerPosts("post_1691",  PostShapes.Post1691);
    public static final RegistrySupplier<Block> Post1692 = registerPosts("post_1692",  PostShapes.Post1692);
    public static final RegistrySupplier<Block> Post1693 = registerPosts("post_1693",  PostShapes.Post1693);
    public static final RegistrySupplier<Block> Post1694 = registerPosts("post_1694",  PostShapes.Post1694);
    public static final RegistrySupplier<Block> Post1695 = registerPosts("post_1695",  PostShapes.Post1695);
    public static final RegistrySupplier<Block> Post1696 = registerPosts("post_1696",  PostShapes.Post1696);
    public static final RegistrySupplier<Block> Post1697 = registerPosts("post_1697",  PostShapes.Post1697);
    public static final RegistrySupplier<Block> Post1698 = registerPosts("post_1698",  PostShapes.Post1698);
    public static final RegistrySupplier<Block> Post431 = registerPosts("post_431",  PostShapes.Post431);
    public static final RegistrySupplier<Block> Post432 = registerPosts("post_432",  PostShapes.Post432);
    public static final RegistrySupplier<Block> Post433 = registerPosts("post_433",  PostShapes.Post433);



    private static RegistrySupplier<Block> registerPosts(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericPostBlock(shape));
    }
    public static void init() {
        for (RegistrySupplier<Block> block : BLOCKS) {
            ITEMS.register(block.getId().getPath(),
                    () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }
    
}