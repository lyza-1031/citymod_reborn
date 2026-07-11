package com.xbzstudio.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class VehicleBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create("citymod", Registries.ITEM);

    // ==================== 载具 ====================
    public static final RegistrySupplier<Block> BikeWhite = registerVehicle("bike", VehicleShapes.BikeWhite);
    public static final RegistrySupplier<Block> BikeBlack = registerVehicle("bikeblack", VehicleShapes.BikeBlack);
    public static final RegistrySupplier<Block> ElectricMotorBlack = registerVehicle("electric_motorcycle_black", VehicleShapes.ElectricMotorBlack);
    public static final RegistrySupplier<Block> ElectricMotorWhite = registerVehicle("electric_motorcycle", VehicleShapes.ElectricMotorWhite);
    public static final RegistrySupplier<Block> ScooterWhite = registerVehicle("scooter_white", VehicleShapes.ScooterWhite);
    public static final RegistrySupplier<Block> ScooterBlack = registerVehicle("scooter_black", VehicleShapes.ScooterBlack);

    private static RegistrySupplier<Block> registerVehicle(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericSignBlock(shape));
    }

    // 初始化 BlockItems
    public static void init() {
        for (RegistrySupplier<Block> block : BLOCKS) {
            ITEMS.register(block.getId().getPath(),
                    () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }
}
