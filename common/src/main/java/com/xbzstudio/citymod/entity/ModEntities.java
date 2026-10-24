package com.xbzstudio.citymod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public final class ModEntities {
    public static final EntityType<SeatEntity> SEAT = EntityType.Builder
            .of(SeatEntity::new, MobCategory.MISC)
            .sized(0.0F, 0.0F)
            .clientTrackingRange(10)
            .updateInterval(20)
            .build("seat");

    private ModEntities() {
    }
}
