package com.xbzstudio.forge;

import com.xbzstudio.citymod.CityMod;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CityMod.MODID)
public class citymodForge {
    @SuppressWarnings("unchecked")
    private static final Logger LOGGER = LoggerFactory.getLogger("CityMod");
    public citymodForge() {
        if (net.minecraftforge.fml.ModList.get().isLoaded("schoolnext")) {
            LOGGER.error("【我的城市：现代生活】有不兼容的模组！");
            throw new RuntimeException("""
                    【我的城市：现代生活】检测到旧版《中国式学校》模组！
                    CityMod 已经包含了《中国式学校》的内容，该模组已被废弃！
                    请从 mods 文件夹中删除 schoolnext-xxx.jar 后再启动游戏！否则会导致游戏崩溃！""");
        }
        else{LOGGER.info("【我的城市：现代生活】模组已加载");}
        ModRegistry.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}