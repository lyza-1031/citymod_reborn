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
    public static final Map<Direction, VoxelShape> DEFAULT = createShape(
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16),
            box(0, 0, 0, 16, 16, 16)
    );
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
    public static final Map<Direction, VoxelShape> POLE = createShape(
            box(5, 0, 11, 11, 16, 17),
			box(5, 0, -1, 11, 16, 5),
			box(11, 0, 5, 17, 16, 11),
			box(-1, 0, 5, 5, 16, 11)
    );
    public static final Map<Direction, VoxelShape> POLE_JOINT_D = createShape(
            // SOUTH
            Shapes.or(
                    box(0, 5.5, 11.5, 16, 10.5, 16.5),
                    box(5, 0, 11, 11, 16, 17)
            ),
            // NORTH
            Shapes.or(
                    box(0, 5.5, -0.5, 16, 10.5, 4.5),
                    box(5, 0, -1, 11, 16, 5)
            ),
            // EAST
            Shapes.or(
                    box(11.5, 5.5, 0, 16.5, 10.5, 16),
                    box(11, 0, 5, 17, 16, 11)
            ),
            // WEST
            Shapes.or(
                    box(-0.5, 5.5, 0, 4.5, 10.5, 16),
                    box(-1, 0, 5, 5, 16, 11)
            )
    );
    public static final Map<Direction, VoxelShape> POLE_JOINT_L = createShape(
            // SOUTH
            Shapes.or(
                    box(0, 5.5, 11.5, 9, 10.5, 16.5),
                    box(5, 0, 11, 11, 16, 17)
            ),
            // NORTH
            Shapes.or(
                    box(8, 5.5, -0.5, 16, 10.5, 4.5),
                    box(5, 0, -1, 11, 16, 5)
            ),
            // EAST
            Shapes.or(
                    box(11.5, 5.5, 7, 16.5, 10.5, 16),
                    box(11, 0, 5, 17, 16, 11)
            ),
            // WEST
            Shapes.or(
                    box(-0.5, 5.5, 0, 4.5, 10.5, 9),
                    box(-1, 0, 5, 5, 16, 11)
            )
    );
    public static final Map<Direction, VoxelShape> POLE_JOINT = createShape(
            // SOUTH
            Shapes.or(
                    box(7, 5.5, 11.5, 16, 10.5, 16.5),
                    box(5, 0, 11, 11, 16, 17)
            ),
            // NORTH
            Shapes.or(
                    box(0, 5.5, -0.5, 9, 10.5, 4.5),
                    box(5, 0, -1, 11, 16, 5)
            ),
            // EAST
            Shapes.or(
                    box(11.5, 5.5, 0, 16.5, 10.5, 9),
                    box(11, 0, 5, 17, 16, 11)
            ),
            // WEST
            Shapes.or(
                    box(-0.5, 5.5, 7, 4.5, 10.5, 16),
                    box(-1, 0, 5, 5, 16, 11)
            )
    );
    public static final Map<Direction, VoxelShape> POLE_H = createShape(
            box(0, 5.75, 10.5, 16, 10.5, 15.5),
                box(0, 5.75, 0.5, 16, 10.5, 5.5),
			    box(10.5, 5.75, 0, 15.5, 10.5, 16),
			    box(0.5, 5.75, 0, 5.5, 10.5, 16)
    );
    public static final Map<Direction, VoxelShape> POLE_EXPR_L = createShape(
            Shapes.or(box(5, 0, 11, 11, 16, 17), box(11, 1, 11.25, 16, 3, 16.5), box(11, 13, 11.25, 16, 15, 16.5)),
            Shapes.or(box(5, 0, -1, 11, 16, 5), box(0, 1, -0.5, 5, 3, 4.75), box(0, 13, -0.5, 5, 15, 4.75)),
            Shapes.or(box(11, 0, 5, 17, 16, 11), box(11.25, 1, 0, 16.5, 3, 5), box(11.25, 13, 0, 16.5, 15, 5)),
            Shapes.or(box(-1, 0, 5, 5, 16, 11), box(-0.5, 1, 11, 4.75, 3, 16), box(-0.5, 13, 11, 4.75, 15, 16))
    );
    public static final Map<Direction, VoxelShape> POLE_EXPR_R = createShape(
            Shapes.or(box(5, 0, 11, 11, 16, 17), box(0, 1, 11.25, 5, 3, 16.5), box(0, 13, 11.25, 5, 15, 16.5)),
            Shapes.or(box(5, 0, -1, 11, 16, 5), box(11, 1, -0.5, 16, 3, 4.75), box(11, 13, -0.5, 16, 15, 4.75)),
            Shapes.or(box(11, 0, 5, 17, 16, 11), box(11.25, 1, 11, 16.5, 3, 16), box(11.25, 13, 11, 16.5, 15, 16)),
            Shapes.or(box(-1, 0, 5, 5, 16, 11), box(-0.5, 1, 0, 4.75, 3, 5), box(-0.5, 13, 0, 4.75, 15, 5))
    );
    public static final Map<Direction, VoxelShape> POLE_EXPR_M = createShape(
            box(0, 1, 11.25, 16, 15, 16.5),
			box(0, 1, -0.5, 16, 15, 4.75),
			box(11.25, 1, 0, 16.5, 15, 16),
			box(-0.5, 1, 0, 4.75, 15, 16)
    );
    public static final Map<Direction, VoxelShape> POLEFINE_D = createShape(
            box(0, 1, 12.25, 16, 15, 16.5),
            box(0, 1, -0.5, 16, 15, 3.75),
            box(12.25, 1, 0, 16.5, 15, 16),
            box(-0.5, 1, 0, 3.75, 15, 16)
    );
    public static final Map<Direction, VoxelShape> POLEFINE_JOINT_D = createShape(
            Shapes.or(
                    box(0, 10, 13.5, 5, 13, 16.5), box(11, 10, 13.5, 16, 13, 16.5), box(11, 3, 13.5, 16, 6, 16.5), box(0, 3, 13.5, 5, 6, 16.5), box(5, 0, 11, 11, 16, 17)
            ),
            Shapes.or(
                    box(11, 10, -0.5, 16, 13, 2.5), box(0, 10, -0.5, 5, 13, 2.5), box(0, 3, -0.5, 5, 6, 2.5), box(11, 3, -0.5, 16, 6, 2.5), box(5, 0, -1, 11, 16, 5)
            ),
            Shapes.or(
                    box(13.5, 10, 11, 16.5, 13, 16), box(13.5, 10, 0, 16.5, 13, 5),box(13.5, 3, 0, 16.5, 6, 5), box(13.5, 3, 11, 16.5, 6, 16), box(11, 0, 5, 17, 16, 11)
            ),
            Shapes.or(
                    box(-0.5, 10, 0, 2.5, 13, 5), box(-0.5, 10, 11, 2.5, 13, 16), box(-0.5, 3, 11, 2.5, 6, 16), box(-0.5, 3, 0, 2.5, 6, 5), box(-1, 0, 5, 5, 16, 11)
            )
    );
    public static final Map<Direction, VoxelShape> FREESIGN = createShape(
            box(0, 0, 0, 16, 16, 1),
			      box(0, 0, 15, 16, 16, 16),
			      box(0, 0, 0, 1, 16, 16),
			      box(15, 0, 0, 16, 16, 16)
    );
    public static final Map<Direction, VoxelShape> TRAFFICLINE = createShape(
            box(0, 0, 0, 16, 0.125, 16),
            box(0, 0, 0, 16, 0.125, 16),
            box(0, 0, 0, 16, 0.125, 16),
            box(0, 0, 0, 16, 0.125, 16)
    );
    public static final Map<Direction, VoxelShape> IFRS = createShape(
            Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(-1, 24, 8.75, 17, 32, 9.025)),
			    Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(-1, 24, 6.975, 17, 32, 7.25)),
			    Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(8.75, 24, -1, 9.025, 32, 17)),
			    Shapes.or(box(7.25, 0, 7.25, 8.75, 29, 8.75), box(6.975, 24, -1, 7.25, 32, 17))
    );
    public static final Map<Direction, VoxelShape> POLEFINE = createShape(
            box(7.25, 0, 14.4, 8.75, 16, 15.9),
			box(7.25, 0, 0.1, 8.75, 16, 1.6),
			box(14.4, 0, 7.25, 15.9, 16, 8.75),
			box(0.1, 0, 7.25, 1.6, 16, 8.75)
    );
    public static final Map<Direction, VoxelShape> STREETLIGHT = createShape(
            Shapes.or(box(2.19609, 3.35773, 6.5, 26.19609, 5.15773, 9.5), box(-6.80391, 3.20773, 5.5, 2.19609, 6.13773, 10.5)),
			Shapes.or(box(-10.19609, 3.35773, 6.5, 13.80391, 5.15773, 9.5), box(13.80391, 3.20773, 5.5, 22.80391, 6.13773, 10.5)),
			Shapes.or(box(6.5, 3.35773, -10.19609, 9.5, 5.15773, 13.80391), box(5.5, 3.20773, 13.80391, 10.5, 6.13773, 22.80391)),
			Shapes.or(box(6.5, 3.35773, 2.19609, 9.5, 5.15773, 26.19609), box(5.5, 3.20773, -6.80391, 10.5, 6.13773, 2.19609))
    );
    public static final Map<Direction, VoxelShape> STREETLIGHTB = createShape(
            Shapes.or(box(-6.58851, 6.00564, 6.5, 14.41149, 7.80564, 9.5), box(11.71444, 1.33873, 6.5, 25.71444, 3.13873, 9.5), box(-15.58851, 5.85564, 5.5, -6.58851, 8.78564, 10.5)),
			Shapes.or(box(1.58851, 6.00564, 6.5, 22.58851, 7.80564, 9.5), box(-9.71444, 1.33873, 6.5, 4.28556, 3.13873, 9.5), box(22.58851, 5.85564, 5.5, 31.58851, 8.78564, 10.5)),
			Shapes.or(box(6.5, 6.00564, 1.58851, 9.5, 7.80564, 22.58851), box(6.5, 1.33873, -9.71444, 9.5, 3.13873, 4.28556), box(5.5, 5.85564, 22.58851, 10.5, 8.78564, 31.58851)),
			Shapes.or(box(6.5, 6.00564, -6.58851, 9.5, 7.80564, 14.41149), box(6.5, 1.33873, 11.71444, 9.5, 3.13873, 25.71444), box(5.5, 5.85564, -15.58851, 10.5, 8.78564, -6.58851))
    );
    public static final Map<Direction, VoxelShape> STREETLIGHTC = createShape(
            Shapes.or(box(-3.58851, 6.00564, 4.5, 14.41149, 7.80564, 6.5), box(12.61444, -0.76127, 4.5, 26.61444, 1.03873, 6.5), box(-15.58851, 6.00564, 4.5, -3.58851, 7.80564, 11.5), box(-3.58851, 6.00564, 9.5, 14.41149, 7.80564, 11.5), box(12.61444, -0.76127, 9.5, 26.61444, 1.03873, 11.5)),
			Shapes.or(box(1.58851, 6.00564, 9.5, 19.58851, 7.80564, 11.5), box(-10.61444, -0.76127, 9.5, 3.38556, 1.03873, 11.5), box(19.58851, 6.00564, 4.5, 31.58851, 7.80564, 11.5), box(1.58851, 6.00564, 4.5, 19.58851, 7.80564, 6.5),box(-10.61444, -0.76127, 4.5, 3.38556, 1.03873, 6.5)),
			Shapes.or(box(4.5, 6.00564, 1.58851, 6.5, 7.80564, 19.58851), box(4.5, -0.76127, -10.61444, 6.5, 1.03873, 3.38556), box(4.5, 6.00564, 19.58851, 11.5, 7.80564, 31.58851), box(9.5, 6.00564, 1.58851, 11.5, 7.80564, 19.58851),box(9.5, -0.76127, -10.61444, 11.5, 1.03873, 3.38556)),
			Shapes.or(box(9.5, 6.00564, -3.58851, 11.5, 7.80564, 14.41149), box(9.5, -0.76127, 12.61444, 11.5, 1.03873, 26.61444), box(4.5, 6.00564, -15.58851, 11.5, 7.80564, -3.58851),box(4.5, 6.00564, -3.58851, 6.5, 7.80564, 14.41149), box(4.5, -0.76127, 12.61444, 6.5, 1.03873, 26.61444))
    );
    public static final Map<Direction, VoxelShape> STREETLIGHTD = createShape(
            Shapes.or(box(-10.88211, 6.49598, 4.499, 3.11989, 8.17798, 11.501), box(2.19609, 3.35773, 9.5, 26.19609, 5.15773, 11.5), box(2.19609, 3.35773, 4.5, 26.19609, 5.15773, 6.5)),
			Shapes.or(box(12.88011, 6.49598, 4.499, 26.88211, 8.17798, 11.501), box(-10.19609, 3.35773, 4.5, 13.80391, 5.15773, 6.5), box(-10.19609, 3.35773, 9.5, 13.80391, 5.15773, 11.5)),
			Shapes.or(box(4.499, 6.49598, 12.88011, 11.501, 8.17798, 26.88211), box(9.5, 3.35773, -10.19609, 11.5, 5.15773, 13.80391), box(4.5, 3.35773, -10.19609, 6.5, 5.15773, 13.80391)),
			Shapes.or(box(4.499, 6.49598, -10.88211, 11.501, 8.17798, 3.11989), box(4.5, 3.35773, 2.19609, 6.5, 5.15773, 26.19609), box(9.5, 3.35773, 2.19609, 11.5, 5.15773, 26.19609))
    );
    public static final Map<Direction, VoxelShape> ROADLIGHT = createShape(
            Shapes.or(box(6.5, 0, 6.5, 9.5, 4, 9.5), box(-9.80391, 2.35773, 6.5, 10.19609, 5.13773, 9.5)),
			Shapes.or(box(6.5, 0, 6.5, 9.5, 4, 9.5), box(5.80391, 2.35773, 6.5, 25.80391, 5.13773, 9.5)),
			Shapes.or(box(6.5, 0, 6.5, 9.5, 4, 9.5), box(6.5, 2.35773, 5.80391, 9.5, 5.13773, 25.80391)),
			Shapes.or(box(6.5, 0, 6.5, 9.5, 4, 9.5), box(6.5, 2.35773, -9.80391, 9.5, 5.13773, 10.19609))
    );
    public static final Map<Direction, VoxelShape> LAMPPOST = createShape(
            box(6, 0, 6, 10, 16, 10),
			box(6, 0, 6, 10, 16, 10),
			box(6, 0, 6, 10, 16, 10),
			box(6, 0, 6, 10, 16, 10)
    );
    public static final Map<Direction, VoxelShape> Hsign = createShape(
            box(-16, 0, 0, 32, 16, 1),
            box(-16, 0, 15, 32, 16, 16),
            box(0, 0, -16, 1, 16, 32),
            box(15, 0, -16, 16, 16, 32)
    );
    public static final Map<Direction, VoxelShape> LineO = createShape(
            box(0, 0, 0, 16, 0.1, 16),
			box(0, 0, 0, 16, 0.1, 16),
			box(0, 0, 0, 16, 0.1, 16),
			box(0, 0, 0, 16, 0.1, 16)
    );
    public static final Map<Direction, VoxelShape> MediumSign = createShape(
            box(0, 0, 0, 32, 32, 1),
            box(-16, 0, 15, 16, 32, 16),
            box(0, 0, -16, 1, 32, 16),
            box(15, 0, 0, 16, 32, 32)
    );
    public static final Map<Direction, VoxelShape> SIGNMINI = createShape(
            box(0, 3, 0, 16, 13, 1),
            box(0, 3, 15, 16, 13, 16),
            box(0, 3, 0, 1, 13, 16),
            box(15, 3, 0, 16, 13, 16)
    );
    public static final Map<Direction, VoxelShape> ExprFence = createShape(
            Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.75, 13, 6.65, 9.25, 15.5, 9.35), box(-16, 10, 6.25, 32, 13, 9.75), box(-16, 15, 6.25, 32, 18, 9.75), box(-16, 13, 7.25, 32, 14.5, 8.75), box(-16, 18, 6.75, 32, 18.5, 9.25),
                    box(-16, 9.5, 6.75, 32, 10, 9.25), box(-16, 14.5, 6.75, 32, 15, 9.25)),
			Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.75, 13, 6.65, 9.25, 15.5, 9.35), box(-16, 10, 6.25, 32, 13, 9.75), box(-16, 15, 6.25, 32, 18, 9.75), box(-16, 13, 7.25, 32, 14.5, 8.75),
    box(-16, 18, 6.75, 32, 18.5, 9.25), box(-16, 9.5, 6.75, 32, 10, 9.25), box(-16, 14.5, 6.75, 32, 15, 9.25)),
			Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.65, 13, 6.75, 9.35, 15.5, 9.25), box(6.25, 10, -16, 9.75, 13, 32), box(6.25, 15, -16, 9.75, 18, 32), box(7.25, 13, -16, 8.75, 14.5, 32), box(6.75, 18, -16, 9.25, 18.5, 32),
    box(6.75, 9.5, -16, 9.25, 10, 32), box(6.75, 14.5, -16, 9.25, 15, 32)),
			Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.65, 13, 6.75, 9.35, 15.5, 9.25), box(6.25, 10, -16, 9.75, 13, 32), box(6.25, 15, -16, 9.75, 18, 32), box(7.25, 13, -16, 8.75, 14.5, 32), box(6.75, 18, -16, 9.25, 18.5, 32),
    box(6.75, 9.5, -16, 9.25, 10, 32), box(6.75, 14.5, -16, 9.25, 15, 32))
    );
    public static final Map<Direction, VoxelShape> ExprFenceJ = createShape(
            Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.75, 13, 6.65, 9.25, 15.5, 9.35), box(6, 10, 6.25, 32, 13, 9.75), box(6, 15, 6.25, 32, 18, 9.75), box(6, 13, 7.25, 32, 14.5, 8.75), box(6, 18, 6.75, 32, 18.5, 9.25),
                    box(6, 9.5, 6.75, 32, 10, 9.25), box(6, 14.5, 6.75, 32, 15, 9.25), box(4, 9.5, 6.25, 6, 18.5, 9.75), box(0.5, 9, 5.5, 4, 19, 10.5)),
			Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.75, 13, 6.65, 9.25, 15.5, 9.35), box(-16, 10, 6.25, 10, 13, 9.75), box(-16, 15, 6.25, 10, 18, 9.75), box(-16, 13, 7.25, 10, 14.5, 8.75),
    box(-16, 18, 6.75, 10, 18.5, 9.25), box(-16, 9.5, 6.75, 10, 10, 9.25), box(-16, 14.5, 6.75, 10, 15, 9.25), box(10, 9.5, 6.25, 12, 18.5, 9.75), box(12, 9, 5.5, 15.5, 19, 10.5)),
			Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.65, 13, 6.75, 9.35, 15.5, 9.25), box(6.25, 10, -16, 9.75, 13, 10), box(6.25, 15, -16, 9.75, 18, 10), box(7.25, 13, -16, 8.75, 14.5, 10), box(6.75, 18, -16, 9.25, 18.5, 10),
    box(6.75, 9.5, -16, 9.25, 10, 10), box(6.75, 14.5, -16, 9.25, 15, 10), box(6.25, 9.5, 10, 9.75, 18.5, 12), box(5.5, 9, 12, 10.5, 19, 15.5)),
			Shapes.or(box(6.75, 0, 6.75, 9.25, 9.5, 9.25), box(6.65, 13, 6.75, 9.35, 15.5, 9.25), box(6.25, 10, 6, 9.75, 13, 32), box(6.25, 15, 6, 9.75, 18, 32), box(7.25, 13, 6, 8.75, 14.5, 32), box(6.75, 18, 6, 9.25, 18.5, 32),
    box(6.75, 9.5, 6, 9.25, 10, 32), box(6.75, 14.5, 6, 9.25, 15, 32), box(6.25, 9.5, 4, 9.75, 18.5, 6), box(5.5, 9, 0.5, 10.5, 19, 4))
    );
    public static final Map<Direction, VoxelShape> PTrafficLight = createShape(
            Block.box(2, -16, 6, 14, 32, 10),
            Block.box(2, -16, 6, 14, 32, 10),
            Block.box(6, -16, 2, 10, 32, 14),
            Block.box(6, -16, 2, 10, 32, 14)
    );
    public static final Map<Direction, VoxelShape> TrafficLight = createShape(
            Block.box(2, -2, 0, 14, 26, 6),
            Block.box(2, -2, 0, 14, 26, 6),
            Block.box(0, -2, 2, 6, 26, 14),
            Block.box(0, -2, 2, 6, 26, 14)
    );
    public static final Map<Direction, VoxelShape> Median_Strip_1 = createShape(
            box(0, -16, 7, 16, 32, 9),
            box(0, -16, 7, 16, 32, 9),
            box(7, -16, 0, 9, 32, 16),
            box(7, -16, 0, 9, 32, 16)
    );
}
