package com.xbzstudio.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class WindowsBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create("citymod", Registries.ITEM);

    // ==================== 方块 ====================
    public static final RegistrySupplier<Block> WSW= registerWindows("window_small_white",  WindowsShapes.WINS);
    public static final RegistrySupplier<Block> WMAW= registerWindows("window_medium_a_white",  WindowsShapes.WINMA);
    public static final RegistrySupplier<Block> WMBW= registerWindows("window_medium_b_white",  WindowsShapes.WINMB);
    public static final RegistrySupplier<Block> WLW= registerWindows("window_large_white",  WindowsShapes.WINL);
    public static final RegistrySupplier<Block> WSK= registerWindows("window_small_black",  WindowsShapes.WINS);
    public static final RegistrySupplier<Block> WMAK= registerWindows("window_medium_a_black",  WindowsShapes.WINMA);
    public static final RegistrySupplier<Block> WMBK= registerWindows("window_medium_b_black",  WindowsShapes.WINMB);
    public static final RegistrySupplier<Block> WLK= registerWindows("window_large_black",  WindowsShapes.WINL);
    public static final RegistrySupplier<Block> WSB= registerWindows("window_small_blue",  WindowsShapes.WINS);
    public static final RegistrySupplier<Block> WMAB= registerWindows("window_medium_a_blue",  WindowsShapes.WINMA);
    public static final RegistrySupplier<Block> WMBB= registerWindows("window_medium_b_blue",  WindowsShapes.WINMB);
    public static final RegistrySupplier<Block> WLB= registerWindows("window_large_blue",  WindowsShapes.WINL);
    public static final RegistrySupplier<Block> WSG= registerWindows("window_small_green",  WindowsShapes.WINS);
    public static final RegistrySupplier<Block> WMAG= registerWindows("window_medium_a_green",  WindowsShapes.WINMA);
    public static final RegistrySupplier<Block> WMBG= registerWindows("window_mediub_b_green",  WindowsShapes.WINMB);
    public static final RegistrySupplier<Block> WLG= registerWindows("window_large_green",  WindowsShapes.WINL);

    private static RegistrySupplier<Block> registerWindows(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericGlassBlock(shape));
    }
    public static void init() {
        for (RegistrySupplier<Block> block : BLOCKS) {
            ITEMS.register(block.getId().getPath(),
                    () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }
    
}