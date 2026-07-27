package com.xbzstudio;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.storage.LevelResource;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PlayerJoinHandler {
    private static final Set<String> seen = new HashSet<>();
    public static void onPlayerJoin(ServerPlayer player) {
        String saveName = player.serverLevel().getServer().getWorldPath(LevelResource.ROOT).getParent().getFileName().toString();
        String key = player.getUUID() + "_" + saveName;
        if (seen.add(key)) {
            player.sendSystemMessage(Component.literal(
                    "§6欢迎使用 我的城市：交通与生活！" + "\n" +
                            "§7本模组完全免费，禁止倒卖，如果付费获得本模组则证明你被骗了！"+"\n" +
                            "模组基于CC-BY-NC 4.0协议分发"
            ));
        }
    }
}