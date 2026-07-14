package com.xbzstudio.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.EnumMap;
import java.util.Map;

public class WindowsShapes {

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

    public static final Map<Direction, VoxelShape> WINS = createShape(
            box(0, 0, 14, 16, 16, 16),
            box(0, 0, 0, 16, 16, 2),
            box(14, 0, 0, 16, 16, 16),
            box(0, 0, 0, 2, 16, 16)
    );
    public static final Map<Direction, VoxelShape> WINMA = createShape(
            box(0, 0, 14, 16, 32, 16),
            box(0, 0, 0, 16, 32, 2),
            box(14, 0, 0, 16, 32, 16),
            box(0, 0, 0, 2, 32, 16)
    );
    public static final Map<Direction, VoxelShape> WINMB = createShape(
            box(0, 0, 14, 32, 16, 16),
            box(-16, 0, 0, 16, 16, 2),
            box(14, 0, -16, 16, 16, 16),
            box(0, 0, 0, 2, 16, 32)
    );
    public static final Map<Direction, VoxelShape> WINL = createShape(
            box(0, 0, 14, 32, 32, 16),
            box(-16, 0, 0, 16, 32, 2),
            box(14, 0, -16, 16, 32, 16),
            box(0, 0, 0, 2, 32, 32)
    );
}