package com.xbzstudio.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.EnumMap;
import java.util.Map;

public class CityShapes {

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

    // ==================== 电器形状 ==================== //

    public static final Map<Direction, VoxelShape> SpeedLimitSign = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
    public static final Map<Direction, VoxelShape> SpeedLimitSign2 = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
    public static final Map<Direction, VoxelShape> SpeedLimitSign3 = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
    public static final Map<Direction, VoxelShape> SpeedLimitSign4 = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
    public static final Map<Direction, VoxelShape> SpeedLimitSign5 = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
    public static final Map<Direction, VoxelShape> SpeedLimitSign6 = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
    public static final Map<Direction, VoxelShape> SpeedLimitSign7 = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
    public static final Map<Direction, VoxelShape> SpeedLimitSign8 = createShape(
            box(1, 2, 0, 15, 16, 0.125),
            box(1, 2, 15.875, 15, 16, 16),
            box(0, 2, 1, 0.125, 16, 15),
            box(15.875, 2, 1, 16, 16, 15)
    );
}
