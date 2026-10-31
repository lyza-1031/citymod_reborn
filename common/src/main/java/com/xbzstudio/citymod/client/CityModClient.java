package com.xbzstudio.citymod.client;

import com.xbzstudio.citymod.entity.ModEntities;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;

public final class CityModClient {
    private CityModClient() {
    }

    public static void init() {
        EntityRendererRegistry.register(() -> ModEntities.SEAT, SeatRenderer::new);
    }
}
