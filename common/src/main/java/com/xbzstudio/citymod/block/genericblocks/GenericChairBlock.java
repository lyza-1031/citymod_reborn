package com.xbzstudio.citymod.block.genericblocks;

import com.xbzstudio.citymod.entity.ModEntities;
import com.xbzstudio.citymod.entity.SeatEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;
import java.util.Map;


public class GenericChairBlock extends GenericSignBlock {
    private final double seatY;

    public GenericChairBlock(Map<Direction, VoxelShape> shapes, double seatY) {
        this(shapes, null, seatY);
    }

    public GenericChairBlock(Map<Direction, VoxelShape> shapes, String tooltipKey, double seatY) {
        super(shapes, tooltipKey);
        this.seatY = seatY;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player,
                                 InteractionHand hand, BlockHitResult hit) {
        if (hand != InteractionHand.MAIN_HAND) {
            return InteractionResult.PASS;
        }
        if (!level.isClientSide) {
            double x = pos.getX() + 0.5;
            double y = pos.getY() + seatY;
            double z = pos.getZ() + 0.5;
            List<SeatEntity> seats = level.getEntitiesOfClass(SeatEntity.class, seatBox(x, y, z),
                    seat -> !seat.isRemoved());
            SeatEntity seat = seats.isEmpty() ? createSeat(level, pos, x, y, z) : seats.get(0);
            if (seat.getPassengers().isEmpty()) {
                player.startRiding(seat);
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if (!state.is(newState.getBlock()) && !level.isClientSide) {
            double x = pos.getX() + 0.5;
            double y = pos.getY() + seatY;
            double z = pos.getZ() + 0.5;
            for (SeatEntity seat : level.getEntitiesOfClass(SeatEntity.class, seatBox(x, y, z),
                    seat -> !seat.isRemoved())) {
                seat.ejectPassengers();
                seat.discard();
            }
        }
        super.onRemove(state, level, pos, newState, movedByPiston);
    }

    private static AABB seatBox(double x, double y, double z) {
        return new AABB(x - 0.25, y - 0.25, z - 0.25, x + 0.25, y + 0.25, z + 0.25);
    }

    private static SeatEntity createSeat(Level level, BlockPos pos, double x, double y, double z) {
        SeatEntity seat = new SeatEntity(ModEntities.SEAT, level);
        seat.setPos(x, y, z);
        seat.setChairPos(pos);
        level.addFreshEntity(seat);
        return seat;
    }
}
