package com.xbzstudio.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
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
    public static final Map<Direction, VoxelShape> ACCOVER = createShape(
            box(-4, 0, -2, 18, 16, 2),
            box(-4, 0, 14, 18, 16, 18),
            box(-2, 0, -4, 2, 16, 18),
			box(14, 0, -4, 18, 16, 18)
    );
    public static final Map<Direction, VoxelShape> ShopSign = createShape(
            box(0, 0, 14, 16, 15, 16),
			box(0, 0, 0, 16, 15, 2),
			box(14, 0, 0, 16, 15, 16),
			box(0, 0, 0, 2, 15, 16)
    );
    public static final Map<Direction, VoxelShape> ShopSignJ = createShape(
            Shapes.or(box(0, 0, 14, 16, 15, 16),
                    box(12, 0, 12, 14, 15, 14),
                    box(12, 0, 0, 14, 2, 12),
                    box(2, 0, 0, 4, 2, 12),
                    box(2.001, -1.79189, 4.24364, 3.999, 14.29799, 5.24164),
                    box(12.001, -1.79189, 4.24364, 13.999, 14.29799, 5.24164),
                    box(2, 0, 12, 4, 15, 14)),
			Shapes.or(box(0, 0, 0, 16, 15, 2),
                    box(2, 0, 2, 4, 15, 4),
                    box(2, 0, 4, 4, 2, 16),
                    box(12, 0, 4, 14, 2, 16),
                    box(12.001, -1.79189, 10.75836, 13.999, 14.29799, 11.75636),
                    box(2.001, -1.79189, 10.75836, 3.999, 14.29799, 11.75636),
                    box(12, 0, 2, 14, 15, 4)),
			Shapes.or(box(14, 0, 0, 16, 15, 16),
                    box(12, 0, 2, 14, 15, 4),
                    box(0, 0, 2, 12, 2, 4),
                    box(0, 0, 12, 12, 2, 14),
                    box(4.24364, -1.79189, 12.001, 5.24164, 14.29799, 13.999),
                    box(4.24364, -1.79189, 2.001, 5.24164, 14.29799, 3.999),
                    box(12, 0, 12, 14, 15, 14)),
			Shapes.or(box(0, 0, 0, 2, 15, 16),
                    box(2, 0, 12, 4, 15, 14),
                    box(4, 0, 12, 16, 2, 14),
                    box(4, 0, 2, 16, 2, 4),
                    box(10.75836, -1.79189, 2.001, 11.75636, 14.29799, 3.999),
                    box(10.75836, -1.79189, 12.001, 11.75636, 14.29799, 13.999),
                    box(2, 0, 2, 4, 15, 4))
    );
    public static final Map<Direction, VoxelShape> Direction_Sign = createShape(
            box(0, 2, 0, 16, 32, 1),
            box(0, 2, 15, 16, 32, 16),
            box(0, 2, 0, 1, 32, 16),
            box(15, 2, 0, 16, 32, 16)
    );
    public static final Map<Direction, VoxelShape> Trashbin = createShape(
            box(-3, 0, 2, 19, 22, 15),
			    box(-3, 0, 1, 19, 22, 14),
			    box(2, 0, -3, 15, 22, 19),
			    box(1, 0, -3, 14, 22, 19)
    );
    public static final Map<Direction, VoxelShape> GlassFence = createShape(
            box(0, 0, 7, 16, 14, 9),
            box(0, 0, 7, 16, 14, 9),
            box(7, 0, 0, 9, 14, 16),
            box(7, 0, 0, 9, 14, 16)
    );
    public static final Map<Direction, VoxelShape> Concretebarrierfenced = createShape(
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16)
    );
    public static final Map<Direction, VoxelShape> Fireextinguisherbox = createShape(
            box(2, 0, 0, 14, 16, 4),
			box(2, 0, 12, 14, 16, 16),
			box(0, 0, 2, 4, 16, 14),
			box(12, 0, 2, 16, 16, 14)
    );
    public static final Map<Direction, VoxelShape> RoadSign = createShape(
            Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(-1, 24, 8.75, 17, 32, 9.025)),
       Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(-1, 24, 6.975, 17, 32, 7.25)),
        Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(8.75, 24, -1, 9.025, 32, 17)),
        Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(6.975, 24, -1, 7.25, 32, 17))
    );
    public static final Map<Direction, VoxelShape> Barrier_gate_down = createShape(
            box(0, 10, 12, 16, 14, 14.5),
			box(0, 10, 1.5, 16, 14, 4),
			box(12, 10, 0, 14.5, 14, 16),
			box(1.5, 10, 0, 4, 14, 16)
    );
    public static final Map<Direction, VoxelShape> Barrier_gate_up = createShape(
            box(6, 0, 12, 10, 16, 14.5),
			box(6, 0, 1.5, 10, 16, 4),
			box(12, 0, 6, 14.5, 16, 10),
			box(1.5, 0, 6, 4, 16, 10)
    );
    public static final Map<Direction, VoxelShape> Barrier_gate_main_down = createShape(
            Shapes.or(box(4, 0, 4, 12, 18, 12), box(8, 10, 12, 16, 14, 14.5)),
			Shapes.or(box(4, 0, 4, 12, 18, 12), box(0, 10, 1.5, 8, 14, 4)),
			Shapes.or(box(4, 0, 4, 12, 18, 12), box(12, 10, 0, 14.5, 14, 8)),
			Shapes.or(box(4, 0, 4, 12, 18, 12), box(1.5, 10, 8, 4, 14, 16))
    );
    public static final Map<Direction, VoxelShape> Barrier_gate_main_up = createShape(
            Shapes.or(box(4, 0, 4, 12, 18, 12), box(8, 10, 12, 12, 16, 14.5)),
			Shapes.or(box(4, 0, 4, 12, 18, 12), box(4, 10, 1.5, 8, 16, 4)),
			Shapes.or(box(4, 0, 4, 12, 18, 12), box(12, 10, 4, 14.5, 16, 8)),
			Shapes.or(box(4, 0, 4, 12, 18, 12), box(1.5, 10, 8, 4, 16, 12))
    );
    public static final Map<Direction, VoxelShape> SAFETYWALL = createShape(
            box(0, 0, 8, 16, 16, 16),
            box(0, 0, 0, 16, 16, 8),
            box(8, 0, 0, 16, 16, 16),
            box(0, 0, 0, 8, 16, 16)
    );
    public static final Map<Direction, VoxelShape> PWRBOX1 = createShape(
            box(0.5, 0, 0, 15.5, 22, 6),
            box(0.5, 0, 10, 15.5, 22, 16),
            box(0, 0, 0.5, 6, 22, 15.5),
            box(10, 0, 0.5, 16, 22, 15.5)
    );
    public static final Map<Direction, VoxelShape> PWRBOX2 = createShape(
            box(0.5, 0, 0, 15.5, 31, 6),
            box(0.5, 0, 10, 15.5, 31, 16),
            box(0, 0, 0.5, 6, 31, 15.5),
            box(10, 0, 0.5, 16, 31, 15.5)
    );
    public static final Map<Direction, VoxelShape> PWRBOX3 = createShape(
            box(2.5, 4, 0, 13.5, 20, 6),
            box(2.5, 4, 10, 13.5, 20, 16),
            box(0, 4, 2.5, 6, 20, 13.5),
            box(10, 4, 2.5, 16, 20, 13.5)
    );
    public static final Map<Direction, VoxelShape> PWRBOX4 = createShape(
            box(0.5, 2, 0, 15.5, 21, 6),
            box(0.5, 2, 10, 15.5, 21, 16),
            box(0, 2, 0.5, 6, 21, 15.5),
            box(10, 2, 0.5, 16, 21, 15.5)
    );
    public static final Map<Direction, VoxelShape> PWRBOX5 = createShape(
            box(2.5, 5, 0, 13.5, 19, 6),
            box(2.5, 5, 10, 13.5, 19, 16),
            box(0, 5, 2.5, 6, 19, 13.5),
            box(10, 5, 2.5, 16, 19, 13.5)
    );
}
