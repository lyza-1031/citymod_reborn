package com.xbzstudio.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import java.util.EnumMap;
import java.util.Map;

public class BlockShapes {

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

    public static final Map<Direction, VoxelShape> EXPR_1 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );

    public static final Map<Direction, VoxelShape> EXPR_2 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );

    public static final Map<Direction, VoxelShape> EXPR_3 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );

    public static final Map<Direction, VoxelShape> EXPR_4 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> EXPR_5 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> EXPR_5a = createShape(
            box(-11, 0, 0, 27, 32, 1),
            box(-11, 0, 15, 27, 32, 16),
            box(0, 0, -11, 1, 32, 27),
            box(15, 0, -11, 16, 32, 27)
    );
    public static final Map<Direction, VoxelShape> EXPR_5b = createShape(
            box(-11, 0, 0, 27, 32, 1),
            box(-11, 0, 15, 27, 32, 16),
            box(0, 0, -11, 1, 32, 27),
            box(15, 0, -11, 16, 32, 27)
    );
    public static final Map<Direction, VoxelShape> EXPR_5c = createShape(
            box(-11, 0, 0, 27, 32, 1),
            box(-11, 0, 15, 27, 32, 16),
            box(0, 0, -11, 1, 32, 27),
            box(15, 0, -11, 16, 32, 27)
    );
    public static final Map<Direction, VoxelShape> EXPR_5_d = createShape(
            box(-11, 0, 0, 27, 32, 1),
            box(-11, 0, 15, 27, 32, 16),
            box(0, 0, -11, 1, 32, 27),
            box(15, 0, -11, 16, 32, 27)
    );
    public static final Map<Direction, VoxelShape> EXPR_5_e = createShape(
            box(-11, 0, 0, 27, 32, 1),
            box(-11, 0, 15, 27, 32, 16),
            box(0, 0, -11, 1, 32, 27),
            box(15, 0, -11, 16, 32, 27)
    );
    public static final Map<Direction, VoxelShape> EXPR_5_f = createShape(
            box(-11, 0, 0, 27, 32, 1),
            box(-11, 0, 15, 27, 32, 16),
            box(0, 0, -11, 1, 32, 27),
            box(15, 0, -11, 16, 32, 27)
    );
    public static final Map<Direction, VoxelShape> SERVICE_AREA_SIGN = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> OVERPASS_SIGN = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> OVERPASS_SIGN_2 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> OVERPASS_SIGN_3 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> OVER_PASS_SIGN_4 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> OVER_PASS_5 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_1 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_2 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_3 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_4 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_5 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_6 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_11 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROAD_12 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> EXPR_SIGN_LARGE = createShape(
            box(-10.5, -16, 0, 26.5, 32, 1),
            box(-10.5, -16, 15, 26.5, 32, 16),
            box(0, -16, -10.5, 1, 32, 26.5),
            box(15, -16, -10.5, 16, 32, 26.5)
    );
    public static final Map<Direction, VoxelShape> EXPRESSWAY_EXIT_SIGN = createShape(
            // SOUTH
            Shapes.or(
                    box(-12, -16, 0, 28, 16, 1),
                    box(13, 17, 0, 28, 25, 1),
                    box(16, 13, -1, 17.5, 23, 0),
                    box(23, 13, -1, 24.5, 23, 0)
            ),
            // NORTH
            Shapes.or(
                    box(-12, -16, 15, 28, 16, 16),
                    box(-12, 17, 15, 3, 25, 16),
                    box(-1.5, 13, 16, 0, 23, 17),
                    box(-8.5, 13, 16, -7, 23, 17)
            ),
            // EAST
            Shapes.or(
                    box(0, -16, -12, 1, 16, 28),
                    box(0, 17, -12, 1, 25, 3),
                    box(-1, 13, -1.5, 0, 23, 0),
                    box(-1, 13, -8.5, 0, 23, -7)
            ),
            // WEST
            Shapes.or(
                    box(15, -16, -12, 16, 16, 28),
                    box(15, 17, 13, 16, 25, 28),
                    box(16, 13, 16, 17, 23, 17.5),
                    box(16, 13, 23, 17, 23, 24.5)
            )
    );
    public static final Map<Direction, VoxelShape> EXPR_T_IPS = createShape(
            box(-12, -16, 0, 28, 16, 1),
            box(-12, -16, 15, 28, 16, 16),
            box(0, -16, -12, 1, 16, 28),
            box(15, -16, -12, 16, 16, 28)
    );
    public static final Map<Direction, VoxelShape> TRAFFIC_SIGN = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> TRAFFIC_SIGN_L = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> TRAFFIC_SIGN_R = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> TRAFFIC_SIGN_T = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> TRAFFIC_SIGN_1 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> TRAFFIC_SIGN_2 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> YELLOW_SIGN_2 = createShape(
            box(-16, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 32, 32, 16),
            box(0, 0, -16, 1, 32, 32),
            box(15, 0, -16, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> ROADSCREEN = createShape(
            box(-16, 0, 0, 32, 32, 6),
            box(-16, 0, 10, 32, 32, 16),
            box(0, 0, -16, 6, 32, 32),
            box(10, 0, -16, 16, 32, 32)
    );
}
;