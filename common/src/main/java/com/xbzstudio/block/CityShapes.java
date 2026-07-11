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
    public static final Map<Direction, VoxelShape> ModernFence = createShape(
            box(0, 0, 7, 16, 16, 9),
			box(0, 0, 7, 16, 16, 9),
			box(7, 0, 0, 9, 16, 16),
			box(7, 0, 0, 9, 16, 16)
    );
    public static final Map<Direction, VoxelShape> ModernFence2 = createShape(
            box(-7.25, 0, 7, 23.25, 18, 8.75),
            box(-7.25, 0, 7.25, 23.25, 18, 9),
		    box(7, 0, -7.25, 8.75, 18, 23.25),
			box(7.25, 0, -7.25, 9, 18, 23.25)
    );
    public static final Map<Direction, VoxelShape> ModernFence3 = createShape(
            box(-7, 0, 7, 23, 18, 8.75),
		    box(-7, 0, 7.25, 23, 18, 9),
			box(7, 0, -7, 8.75, 18, 23),
			box(7.25, 0, -7, 9, 18, 23)
    );
    public static final Map<Direction, VoxelShape> ModernIronFenceBlue = createShape(
            box(-16, 0, 7, 31, 32, 9),
			box(-15, 0, 7, 32, 32, 9),
			box(7, 0, -15, 9, 32, 32),
			box(7, 0, -16, 9, 32, 31)
    );
    public static final Map<Direction, VoxelShape> ModernIronFence = createShape(
            box(-16, 0, 7, 31, 32, 9),
            box(-15, 0, 7, 32, 32, 9),
            box(7, 0, -15, 9, 32, 32),
            box(7, 0, -16, 9, 32, 31)
    );
    public static final Map<Direction, VoxelShape> ModernIronFenceYellow = createShape(
            box(-16, 0, 7, 31, 32, 9),
            box(-15, 0, 7, 32, 32, 9),
            box(7, 0, -15, 9, 32, 32),
            box(7, 0, -16, 9, 32, 31)
    );
    public static final Map<Direction, VoxelShape> ModernIronFenceGreen = createShape(
            box(-16, 0, 7, 31, 32, 9),
            box(-15, 0, 7, 32, 32, 9),
            box(7, 0, -15, 9, 32, 32),
            box(7, 0, -16, 9, 32, 31)
    );
    public static final Map<Direction, VoxelShape> RestRoomSignMale = createShape(
            box(2, 5, 0, 14, 11, 1),
			box(2, 5, 15, 14, 11, 16),
			box(0, 5, 2, 1, 11, 14),
			box(15, 5, 2, 16, 11, 14)
    );
    public static final Map<Direction, VoxelShape> RestRoomSignFeMale = createShape(
            box(2, 5, 0, 14, 11, 1),
            box(2, 5, 15, 14, 11, 16),
            box(0, 5, 2, 1, 11, 14),
            box(15, 5, 2, 16, 11, 14)
    );
    public static final Map<Direction, VoxelShape> RestRoomSignThird = createShape(
            box(2, 5, 0, 14, 11, 1),
            box(2, 5, 15, 14, 11, 16),
            box(0, 5, 2, 1, 11, 14),
            box(15, 5, 2, 16, 11, 14)
    );
}
