package com.xbzstudio.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.EnumMap;
import java.util.Map;

public class ApplianceShapes {

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

    public static final Map<Direction, VoxelShape> AC_OUT_01 = createShape(
            box(-5, 0, 3, 21, 16, 13),
            box(-5, 0, 3, 21, 16, 13),
            box(3, 0, -5, 13, 16, 21),
            box(3, 0, -5, 13, 16, 21)
    );
    public static final Map<Direction, VoxelShape> AC_OUT_02 = createShape(
            box(-5, 0, 3, 21, 32, 13),
            box(-5, 0, 3, 21, 32, 13),
            box(3, 0, -5, 13, 32, 21),
            box(3, 0, -5, 13, 32, 21)
    );
    public static final Map<Direction, VoxelShape> AC_OUT_03 = createShape(
            box(-5, 0, 3, 21, 16, 13),
            box(-5, 0, 3, 21, 16, 13),
            box(3, 0, -5, 13, 16, 21),
            box(3, 0, -5, 13, 16, 21)
    );
    public static final Map<Direction, VoxelShape> AC_OUT_04 = createShape(
            box(-5, 0, 3, 21, 32, 13),
            box(-5, 0, 3, 21, 32, 13),
            box(3, 0, -5, 13, 32, 21),
            box(3, 0, -5, 13, 32, 21)
    );
}
;