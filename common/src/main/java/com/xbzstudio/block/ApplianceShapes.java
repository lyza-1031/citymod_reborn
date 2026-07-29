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
    public static final Map<Direction, VoxelShape> MicroWaveOven = createShape(
            box(-2, 0, 0, 19, 11, 8),
            box(-3, 0, 8, 18, 11, 16),
            box(0, 0, -3, 8, 11, 18),
            box(8, 0, -2, 16, 11, 19)
    );
    public static final Map<Direction, VoxelShape> Fridge1 = createShape(
            box(0, -16, 0, 32, 32, 16),
            box(-16, -16, 0, 16, 32, 16),
            box(0, -16, -16, 16, 32, 16),
            box(0, -16, 0, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> Fridge2 = createShape(
            box(0, -16, 0, 32, 32, 16),
            box(-16, -16, 0, 16, 32, 16),
            box(0, -16, -16, 16, 32, 16),
            box(0, -16, 0, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> Old_Fridge = createShape(
            box(0, -16, 0, 16, 32, 16),
            box(0, -16, 0, 16, 32, 16),
            box(0, -16, 0, 16, 32, 16),
            box(0, -16, 0, 16, 32, 16)
    );
    public static final Map<Direction, VoxelShape> Freezer = createShape(
            box(-16, -16, 0, 16, 16, 16),
            box(0, -16, 0, 32, 16, 16),
            box(0, -16, 0, 16, 16, 32),
            box(0, -16, -16, 16, 16, 16)
    );
    public static final Map<Direction, VoxelShape> GASWATERHEATER = createShape(
            box(0, 0, 0, 16, 20, 7),
			box(0, 0, 9, 16, 20, 16),
			box(0, 0, 0, 7, 20, 16),
			box(9, 0, 0, 16, 20, 16)
    );
    public static final Map<Direction, VoxelShape> ELECTRICWATERHEATER = createShape(
            box(-8, -2, 0, 24, 16, 18),
			box(-8, -2, -2, 24, 16, 16),
			box(0, -2, -8, 18, 16, 24),
			box(-2, -2, -8, 16, 16, 24)
    );
    public static final Map<Direction, VoxelShape> SOLARWATERHEATER = createShape(
            box(-16, 0, -16, 16, 32, 16),
			box(0, 0, 0, 32, 32, 32),
			box(-16, 0, 0, 16, 32, 32),
			box(0, 0, -16, 32, 32, 16)
    );
    public static final Map<Direction, VoxelShape> Old_Monitor = createShape(
            // SOUTH (default)
            Shapes.or(
                    box(12, 0, 8, 17, 0.1, 13),
                    box(13.5, 0.1, 9.25, 15, 0.85, 12),
                    box(1.5, 0, 3.75, 14.5, 13, 7),
                    box(-1, 0, 9, 11, 0.6, 13)
            ),
            // NORTH
            Shapes.or(
                    box(-1, 0, 3, 4, 0.1, 8),
                    box(1, 0.1, 4, 2.5, 0.85, 6.75),
                    box(1.5, 0, 9, 14.5, 13, 12.25),
                    box(5, 0, 3, 17, 0.6, 7)
            ),
            // EAST
            Shapes.or(
                    box(8, 0, -1, 13, 0.1, 4),
                    box(9.25, 0.1, 1, 12, 0.85, 2.5),
                    box(3.75, 0, 1.5, 7, 13, 14.5),
                    box(9, 0, 5, 13, 0.6, 17)
            ),
            // WEST
            Shapes.or(
                    box(3, 0, 12, 8, 0.1, 17),
                    box(4, 0.1, 13.5, 6.75, 0.85, 15),
                    box(9, 0, 1.5, 12.25, 13, 14.5),
                    box(3, 0, -1, 7, 0.6, 11)
            )
    );
    public static final Map<Direction, VoxelShape> OLD_MAINUNIT = createShape(
            box(5.3, 0, 2, 10.75, 11, 14.25),
			box(5.25, 0, 1.75, 10.7, 11, 14),
			box(2, 0, 5.25, 14.25, 11, 10.7),
			box(1.75, 0, 5.3, 14, 11, 10.75)
    );
    public static final Map<Direction, VoxelShape> Monitor2010 = createShape(
            Shapes.or(box(12, 0, 8, 17, 0.1, 13),
                    box(13.5, 0.1, 9.25, 15, 0.85, 12),
                    box(0, 0, 3.75, 17, 13, 7),
                    box(-1, 0, 9, 11, 0.6, 13)),
            Shapes.or(box(-1, 0, 3, 4, 0.1, 8),
                    box(1, 0.1, 4, 2.5, 0.85, 6.75),
                    box(-1, 0, 9, 16, 13, 12.25),
                    box(5, 0, 3, 17, 0.6, 7)),
            Shapes.or(box(8, 0, -1, 13, 0.1, 4),
                    box(9.25, 0.1, 1, 12, 0.85, 2.5),
                    box(3.75, 0, -1, 7, 13, 16),
                    box(9, 0, 5, 13, 0.6, 17)),
            Shapes.or(box(3, 0, 12, 8, 0.1, 17),
                    box(4, 0.1, 13.5, 6.75, 0.85, 15),
                    box(9, 0, 0, 12.25, 13, 17),
                    box(3, 0, -1, 7, 0.6, 11))
    );
    public static final Map<Direction, VoxelShape> MAINUNIT2010 = createShape(
            box(5.3, 0, 2, 10.75, 13, 14.25),
			box(5.25, 0, 1.75, 10.7, 13, 14),
			box(2, 0, 5.25, 14.25, 13, 10.7),
			box(1.75, 0, 5.3, 14, 13, 10.75)
    );
    public static final Map<Direction, VoxelShape> ModernMonitor = createShape(
            Shapes.or(box(12, 0, 8, 17, 0.1, 13),
                    box(13.5, 0.1, 9.25, 15, 0.85, 12),
                    box(0, 0, 3.75, 17, 13, 7),
                    box(-1, 0, 9, 11, 0.6, 13)),
            Shapes.or(box(-1, 0, 3, 4, 0.1, 8),
                    box(1, 0.1, 4, 2.5, 0.85, 6.75),
                    box(-1, 0, 9, 16, 13, 12.25),
                    box(5, 0, 3, 17, 0.6, 7)),
            Shapes.or(box(8, 0, -1, 13, 0.1, 4),
                    box(9.25, 0.1, 1, 12, 0.85, 2.5),
                    box(3.75, 0, -1, 7, 13, 16),
                    box(9, 0, 5, 13, 0.6, 17)),
            Shapes.or(box(3, 0, 12, 8, 0.1, 17),
                    box(4, 0.1, 13.5, 6.75, 0.85, 15),
                    box(9, 0, 0, 12.25, 13, 17),
                    box(3, 0, -1, 7, 0.6, 11))
    );
    public static final Map<Direction, VoxelShape> MODERMMAINUNIT = createShape(
            box(5.3, 0, 2, 10.75, 13, 14.25),
            box(5.25, 0, 1.75, 10.7, 13, 14),
            box(2, 0, 5.25, 14.25, 13, 10.7),
            box(1.75, 0, 5.3, 14, 13, 10.75)
    );
    public static final Map<Direction, VoxelShape> AIOPC = createShape(
            Shapes.or(box(12, 0, 8, 17, 0.1, 13),
                    box(13.5, 0.1, 9.25, 15, 0.85, 12),
                    box(0, 0, 3.75, 17, 13, 7),
                    box(-1, 0, 9, 11, 0.6, 13)),
            Shapes.or(box(-1, 0, 3, 4, 0.1, 8),
                    box(1, 0.1, 4, 2.5, 0.85, 6.75),
                    box(-1, 0, 9, 16, 13, 12.25),
                    box(5, 0, 3, 17, 0.6, 7)),
            Shapes.or(box(8, 0, -1, 13, 0.1, 4),
                    box(9.25, 0.1, 1, 12, 0.85, 2.5),
                    box(3.75, 0, -1, 7, 13, 16),
                    box(9, 0, 5, 13, 0.6, 17)),
            Shapes.or(box(3, 0, 12, 8, 0.1, 17),
                    box(4, 0.1, 13.5, 6.75, 0.85, 15),
                    box(9, 0, 0, 12.25, 13, 17),
                    box(3, 0, -1, 7, 0.6, 11))
    );
    public static final Map<Direction, VoxelShape> LAPTOP = createShape(
            box(1, 0, 2, 15, 0.75, 12),
                   box(1, 0, 4, 15, 0.75, 14),
                   box(2, 0, 1, 12, 0.75, 15),
                   box(4, 0, 1, 14, 0.75, 15)
    );
    public static final Map<Direction, VoxelShape> LAPTOP_ON = createShape(
               Shapes.or(box(1, 0.175, 2.125, 15, 10.175, 2.375), box(1, 0, 2.2, 15, 0.5, 11.95)),
               Shapes.or(box(1, 0.175, 13.625, 15, 10.175, 13.875), box(1, 0, 4.05, 15, 0.5, 13.8)),
                Shapes.or(box(2.125, 0.175, 1, 2.375, 10.175, 15), box(2.2, 0, 1, 11.95, 0.5, 15)),
                Shapes.or(box(13.625, 0.175, 1, 13.875, 10.175, 15), box(4.05, 0, 1, 13.8, 0.5, 15))
    );
    public static final Map<Direction, VoxelShape> AC2080 = createShape(
            box(-5, -16, 3, 21, 32, 13),
            box(-5, -16, 3, 21, 32, 13),
            box(3, -16, -5, 13, 32, 21),
            box(3, -16, -5, 13, 32, 21)
    );
    public static final Map<Direction, VoxelShape> AC_40HX = createShape(
            box(-5, -16, 3, 21, 20, 13),
            box(-5, -16, 3, 21, 20, 13),
            box(3, -16, -5, 13, 20, 21),
            box(3, -16, -5, 13, 20, 21)
    );
    public static final Map<Direction, VoxelShape> WardrobeL = createShape(
            box(0, -16, 0, 32, 32, 16),
            box(-16, -16, 0, 16, 32, 16),
            box(0, -16, -16, 16, 32, 16),
            box(0, -16, 0, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> WardrobeM = createShape(
        box(0, -16, 0, 16, 32, 16),
        box(0, -16, 0, 16, 32, 16),
        box(0, -16, 0, 16, 32, 16),
        box(0, -16, 0, 16, 32, 16)
    );
    public static final Map<Direction, VoxelShape> WardrobeS = createShape(
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16)
    );
    public static final Map<Direction, VoxelShape> ExpressBox = createShape(
            box(-16, -16, 0, 16, 32, 14),
			box(0, -16, 2, 32, 32, 16),
			box(0, -16, 0, 14, 32, 32),
			box(2, -16, -16, 16, 32, 16)
    );
    public static final Map<Direction, VoxelShape> EOLACIN = createShape(
            box(2, 0, 1, 14, 32, 6.25),
            box(2, 0, 9.75, 14, 32, 15),
            box(1, 0, 2, 6.25, 32, 14),
            box(9.75, 0, 2, 15, 32, 14)
    );
    public static final Map<Direction, VoxelShape> EOLCAC = createShape(
            box(-4, 15, -4, 20, 16, 20),
			    box(-4, 15, -4, 20, 16, 20),
			    box(-4, 15, -4, 20, 16, 20),
			    box(-4, 15, -4, 20, 16, 20)
    );
    public static final Map<Direction, VoxelShape> OldTVTable = createShape(
            box(-9, 0, -1, 25, 16, 16),
			box(-9, 0, 0, 25, 16, 17),
			box(-1, 0, -9, 16, 16, 25),
			box(0, 0, -9, 17, 16, 25)
    );
    public static final Map<Direction, VoxelShape> OldCalendar = createShape(
            box(-8, 0, 0, 24, 20, 1),
			 box(-8, 0, 15, 24, 20, 16),
			box(0, 0, -8, 1, 20, 24),
			box(15, 0, -8, 16, 20, 24)
    );
    public static final Map<Direction, VoxelShape> TELEVISION = createShape(
            Shapes.or(box(-16, 0, 1.25, 32, 2, 2), box(-16, 29, 1.25, 32, 30, 2), box(-16, 2, 1.25, -15, 29, 2), box(31, 2, 1.25, 32, 29, 2), box(-15, 2, 1.25, 31, 29, 1.75), box(-16, 0, 1, 32, 30, 1.25), box(-12, 2, 0, 28, 28, 1)),
            Shapes.or(box(-16, 0, 14, 32, 2, 14.75), box(-16, 29, 14, 32, 30, 14.75), box(31, 2, 14, 32, 29, 14.75), box(-16, 2, 14, -15, 29, 14.75), box(-15, 2, 14.25, 31, 29, 14.75), box(-16, 0, 14.75, 32, 30, 15), box(-12, 2, 15, 28, 28, 16)),
            Shapes.or(box(1.25, 0, -16, 2, 2, 32), box(1.25, 29, -16, 2, 30, 32), box(1.25, 2, 31, 2, 29, 32), box(1.25, 2, -16, 2, 29, -15), box(1.25, 2, -15, 1.75, 29, 31), box(1, 0, -16, 1.25, 30, 32), box(0, 2, -12, 1, 28, 28)),
            Shapes.or(box(14, 0, -16, 14.75, 2, 32), box(14, 29, -16, 14.75, 30, 32), box(14, 2, -16, 14.75, 29, -15), box(14, 2, 31, 14.75, 29, 32), box(14.25, 2, -15, 14.75, 29, 31), box(14.75, 0, -16, 15, 30, 32), box(15, 2, -12, 16, 28, 28))
    );
    public static final Map<Direction, VoxelShape> WASHINGMACHINEA = createShape(
            box(-4, 0, 0, 20, 24, 20),
            box(-4, 0, -4, 20, 24, 16),
            box(0, 0, -4, 20, 24, 20),
            box(-4, 0, -4, 16, 24, 20)
    );
    public static final Map<Direction, VoxelShape> WASHINGMACHINEB = createShape(
            box(0, 0, 0, 16, 19, 16),
            box(0, 0, 0, 16, 19, 16),
            box(0, 0, 0, 16, 19, 16),
            box(0, 0, 0, 16, 19, 16)
    );
}
