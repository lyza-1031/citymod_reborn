package com.xbzstudio.citymod.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.EnumMap;
import java.util.Map;

public class VehicleShapes {

    public static Map<Direction, VoxelShape> createShape(
            VoxelShape south, VoxelShape north, VoxelShape east, VoxelShape west) {
        Map<Direction, VoxelShape> shapes = new EnumMap<>(Direction.class);
        shapes.put(Direction.SOUTH, south);
        shapes.put(Direction.NORTH, north);
        shapes.put(Direction.EAST, east);
        shapes.put(Direction.WEST, west);
        return shapes;
    }

    private static VoxelShape box(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Block.box(x1, y1, z1, x2, y2, z2);
    }

    // ==================== 路牌形状 ====================

    public static final Map<Direction, VoxelShape> BikeWhite = createShape(
            box(0, 0, -4, 16, 16, 20),
			box(0, 0, -4, 16, 16, 20),
			box(-4, 0, 0, 20, 16, 16),
			box(-4, 0, 0, 20, 16, 16)
    );
    public static final Map<Direction, VoxelShape> BikeBlack = createShape(
            box(0, 0, -4, 16, 16, 20),
            box(0, 0, -4, 16, 16, 20),
            box(-4, 0, 0, 20, 16, 16),
            box(-4, 0, 0, 20, 16, 16)
    );
    public static final Map<Direction, VoxelShape> ElectricMotorBlack = createShape(
            box(0, 0, -4, 16, 16, 20),
            box(0, 0, -4, 16, 16, 20),
            box(-4, 0, 0, 20, 16, 16),
            box(-4, 0, 0, 20, 16, 16)
    );
    public static final Map<Direction, VoxelShape> ElectricMotorWhite = createShape(
            box(0, 0, -4, 16, 16, 20),
            box(0, 0, -4, 16, 16, 20),
            box(-4, 0, 0, 20, 16, 16),
            box(-4, 0, 0, 20, 16, 16)
    );
    public static final Map<Direction, VoxelShape> ScooterWhite = createShape(
            box(4, 0, -4, 12, 3.5, 20),
			box(4, 0, -4, 12, 3.5, 20),
			box(-4, 0, 4, 20, 3.5, 12),
			box(-4, 0, 4, 20, 3.5, 12)
    );
    public static final Map<Direction, VoxelShape> ScooterBlack = createShape(
            box(4, 0, -4, 12, 3.5, 20),
            box(4, 0, -4, 12, 3.5, 20),
            box(-4, 0, 4, 20, 3.5, 12),
            box(-4, 0, 4, 20, 3.5, 12)
    );
}
