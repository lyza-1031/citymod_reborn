package com.xbzstudio.citymod.entity;

import com.xbzstudio.citymod.block.genericblocks.GenericChairBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
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
        if (!this.level().isClientSide()) {
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
    public boolean hurtServer(ServerLevel level, DamageSource source, float amount) {
        return false;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
    }

    @Override
    protected void readAdditionalSaveData(ValueInput input) {
        this.chairPos = input.getLong(CHAIR_POS_TAG).map(BlockPos::of).orElse(null);
    }

    @Override
    protected void addAdditionalSaveData(ValueOutput output) {
        if (this.chairPos != null) {
            output.putLong(CHAIR_POS_TAG, this.chairPos.asLong());
        }
    }
}
