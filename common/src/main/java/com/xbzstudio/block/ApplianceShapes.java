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
    public static final Map<Direction, VoxelShape> AC_OUT_05 = createShape(
            box(-5, 0, 3, 21, 20, 13),
            box(-5, 0, 3, 21, 20, 13),
            box(3, 0, -5, 13, 20, 21),
            box(3, 0, -5, 13, 20, 21)
    );
    public static final Map<Direction, VoxelShape> AC_OUT_06 = createShape(
            box(-5, 0, 3, 21, 18, 13),
            box(-5, 0, 3, 21, 18, 13),
            box(3, 0, -5, 13, 18, 21),
            box(3, 0, -5, 13, 18, 21)
    );
    public static final Map<Direction, VoxelShape> BIG_AC_OUT_HD = createShape(
            box(-8, -16, 2, 23, 31, 16),
            box(-7, -16, 0, 24, 31, 14),
            box(2, -16, -7, 16, 31, 24),
            box(0, -16, -8, 14, 31, 23)
    );
    public static final Map<Direction, VoxelShape> CentreAirConditionOutside = createShape(
            box(-8, -16, -8, 24, 32, 24),
            box(-8, -16, -8, 24, 32, 24),
            box(-8, -16, -8, 24, 32, 24),
            box(-8, -16, -8, 24, 32, 24)
    );
    public static final Map<Direction, VoxelShape> AC_01 = createShape(
            box(0, -16, 0, 16, 24, 8),
            box(0, -16, 8, 16, 24, 16),
            box(0, -16, 0, 8, 24, 16),
            box(8, -16, 0, 16, 24, 16)
    );
    public static final Map<Direction, VoxelShape> AC_02 = createShape(
            box(-6, 2, 0, 22, 15, 8),
            box(-6, 2, 8, 22, 15, 16),
            box(0, 2, -6, 8, 15, 22),
            box(8, 2, -6, 16, 15, 22)
    );
    public static final Map<Direction, VoxelShape> AC_03 = createShape(
            box(-6, 2, 0, 22, 15, 8),
            box(-6, 2, 8, 22, 15, 16),
            box(0, 2, -6, 8, 15, 22),
            box(8, 2, -6, 16, 15, 22)
    );
    public static final Map<Direction, VoxelShape> AC_04 = createShape(
            box(0, -16, 0, 16, 24, 8),
            box(0, -16, 8, 16, 24, 16),
            box(0, -16, 0, 8, 24, 16),
            box(8, -16, 0, 16, 24, 16)
    );
    public static final Map<Direction, VoxelShape> OLD_AC_HD = createShape(
            box(0, -16, 0, 16, 24, 8),
            box(0, -16, 8, 16, 24, 16),
            box(0, -16, 0, 8, 24, 16),
            box(8, -16, 0, 16, 24, 16)
    );
    public static final Map<Direction, VoxelShape> CAC_HD = createShape(
            box(0, 14, 0, 16, 32, 16),
            box(0, 14, 0, 16, 32, 16),
            box(0, 14, 0, 16, 32, 16),
            box(0, 14, 0, 16, 32, 16)
    );
}