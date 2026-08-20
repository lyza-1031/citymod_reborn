package com.xbzstudio.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.EnumMap;
import java.util.Map;

public class PostShapes {

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


    public static final Map<Direction, VoxelShape> Post169 = createShape(
            box(-16, 0.1, 0, 32, 32, 0.05),
            box(-16, 0.1, 15.95, 32, 32, 16),
            box(0, 0.1, -16, 0.05, 32, 32),
            box(15.95, 0.1, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> Post43 = createShape(
            box(-12, 0.1, 0, 28, 30, 0.05),
            box(-12, 0.1, 15.95, 28, 30, 16),
            box(0, 0.1, -12, 0.05, 30, 28),
            box(15.95, 0.1, -12, 16, 30, 28)
    );
}