package com.xbzstudio;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.permissions.PermissionSet;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class KillItems {
    public static void execute(ServerLevel level, double x, double y, double z) {
        level.getServer().getCommands().performPrefixedCommand(
                new CommandSourceStack(
                        CommandSource.NULL,
                        new Vec3(x, y, z),
                        Vec2.ZERO,
                        level,
                        PermissionSet.ALL_PERMISSIONS,
                        "",
                        Component.literal(""),
                        level.getServer(),
                        null
                ),
                "kill @e[type=item]"
        );
    }
}