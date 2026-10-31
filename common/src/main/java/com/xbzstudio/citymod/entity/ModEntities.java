package com.xbzstudio.citymod.entity;

import com.xbzstudio.citymod.CityMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public final class ModEntities {
    public static final ResourceKey<EntityType<?>> SEAT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(CityMod.MODID, "seat"));

    public static final EntityType<SeatEntity> SEAT = EntityType.Builder
            .of(SeatEntity::new, MobCategory.MISC)
            .sized(0.0F, 0.0F)
            // 1.20.1：玩家骑乘偏移 = -0.35；
            // 1.21.1+：玩家自身 VEHICLE 挂点为 +0.6，最终位置 = seatY + PASSENGER - 0.6。
            // 取 PASSENGER = +0.25 时结果同为 seatY - 0.35，保证与 1.20.1 坐得一样高。
            .passengerAttachments(0.25F)
            .clientTrackingRange(10)
            .updateInterval(20)
            .build(SEAT_KEY);

    private ModEntities() {
    }
}
