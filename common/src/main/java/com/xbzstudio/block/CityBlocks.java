package com.xbzstudio.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CityBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create("citymod", Registries.ITEM);

    // ==================== 方块 ====================
    public static final RegistrySupplier<Block> SpeedLimitSign = registerCities("speed_limit_sign_1",  CityShapes.SpeedLimitSign);
    public static final RegistrySupplier<Block> SpeedLimitSign2 = registerCities("speed_limit_sign_2",  CityShapes.SpeedLimitSign2);
    public static final RegistrySupplier<Block> SpeedLimitSign3 = registerCities("speed_limit_sign_3",  CityShapes.SpeedLimitSign3);
    public static final RegistrySupplier<Block> SpeedLimitSign4 = registerCities("speed_limit_sign_4",  CityShapes.SpeedLimitSign4);
    public static final RegistrySupplier<Block> SpeedLimitSign5 = registerCities("speed_limit_sign_5",  CityShapes.SpeedLimitSign5);
    public static final RegistrySupplier<Block> SpeedLimitSign6 = registerCities("speed_limit_sign_6",  CityShapes.SpeedLimitSign6);
    public static final RegistrySupplier<Block> SpeedLimitSign7 = registerCities("speed_limit_sign_7",  CityShapes.SpeedLimitSign7);
    public static final RegistrySupplier<Block> SpeedLimitSign8 = registerCities("speed_limit_sign_8",  CityShapes.SpeedLimitSign8);
    public static final RegistrySupplier<Block> ModernFence = registerCities("modern_fence",  CityShapes.ModernFence);
    public static final RegistrySupplier<Block> ModernFence2 = registerCities("modern_fence_2",  CityShapes.ModernFence2);
    public static final RegistrySupplier<Block> ModernFence3 = registerCities("modern_fence_3",  CityShapes.ModernFence3);
    public static final RegistrySupplier<Block> ModernIronFence = registerCities("modern_ironfence",  CityShapes.ModernIronFence);
    public static final RegistrySupplier<Block> ModernIronFenceYellow = registerCities("moderniron_fence_yellow",  CityShapes.ModernIronFenceYellow);
    public static final RegistrySupplier<Block> ModernIronFenceGreen = registerCities("moderniron_fence_green",  CityShapes.ModernIronFenceGreen);
    public static final RegistrySupplier<Block> ModernIronFenceBlue = registerCities("moderniron_fence_blue",  CityShapes.ModernIronFenceBlue);
    public static final RegistrySupplier<Block> RestRoomSignMale = registerCities("restroom_sign",  CityShapes.RestRoomSignMale);
    public static final RegistrySupplier<Block> RestRoomSignFeMale = registerCities("rest_room_sign_female",  CityShapes.RestRoomSignFeMale);
    public static final RegistrySupplier<Block> RestRoomSignThird = registerCities("restroom_sign_third",  CityShapes.RestRoomSignThird);
    public static final RegistrySupplier<Block> ACCOVER = registerCities("ac_cover",  CityShapes.ACCOVER);
    public static final RegistrySupplier<Block> ACCOVERLIGHT = registerCities("ac_cover_light",  CityShapes.ACCOVER);
    public static final RegistrySupplier<Block> SHOPSIGNBLUE = registerCities("blue_shop_sign",  CityShapes.ShopSign);
    public static final RegistrySupplier<Block> SHOPSIGNRED = registerCities("red_shop_sign",  CityShapes.ShopSign);
    public static final RegistrySupplier<Block> SHOPSIGNBLUEJ = registerCities("blue_shop_sign_joint",  CityShapes.ShopSignJ);
    public static final RegistrySupplier<Block> SHOPSIGNREDJ = registerCities("red_shop_sign_joint",  CityShapes.ShopSignJ);

    private static RegistrySupplier<Block> registerCities(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericMetalBlock(shape));
    }
    public static void init() {
        for (RegistrySupplier<Block> block : BLOCKS) {
            ITEMS.register(block.getId().getPath(),
                    () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }
    
}