package com.xbzstudio.citymod.entity;

import com.xbzstudio.citymod.block.genericblocks.GenericChairBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

/**
 * 不可见、无碰撞的座位实体。只负责承载玩家，不参与渲染和交互。
 */
public class SeatEntity extends Entity {
    private static final String CHAIR_POS_TAG = "ChairPos";

    @Nullable
    private BlockPos chairPos;

    public SeatEntity(EntityType<?> type, Level level) {
        super(type, level);
        this.noPhysics = true;
        this.setNoGravity(true);
    }

    public void setChairPos(BlockPos pos) {
        this.chairPos = pos.immutable();
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide) {
            if (this.chairPos == null
                    || !(this.level().getBlockState(this.chairPos).getBlock() instanceof GenericChairBlock)) {
                this.ejectPassengers();
                this.discard();
            }
        }
    }

    @Override
    public boolean isPickable() {
        return false;
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        if (tag.contains(CHAIR_POS_TAG)) {
            this.chairPos = BlockPos.of(tag.getLong(CHAIR_POS_TAG));
        }
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        if (this.chairPos != null) {
            tag.putLong(CHAIR_POS_TAG, this.chairPos.asLong());
        }
    }
}
