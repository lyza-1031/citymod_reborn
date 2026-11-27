package com.xbzstudio.forge;

import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.locating.IModFile;
import net.minecraftforge.resource.PathPackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.network.chat.Component;

import java.nio.file.Path;

@Mod.EventBusSubscriber(modid = "citymod", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForgeResourcePackHandler {

    @SubscribeEvent
    public static void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() == PackType.CLIENT_RESOURCES) {
            event.addRepositorySource((consumer) -> {
                try {
                    IModFile file = ModList.get().getModFileById("citymod").getFile();

                    Path path = file.findResource("resourcepacks/hd_resources");

                    Pack pack = Pack.readMetaAndCreate(
                            "citymod:hd_resources",
                            Component.translatable("resourcepack.citymod.hd_resources"),
                            false,
                            (packId) -> new PathPackResources(packId, true, path),
                            PackType.CLIENT_RESOURCES,
                            Pack.Position.TOP,
                            PackSource.BUILT_IN
                    );

                    if (pack != null) {
                        consumer.accept(pack);
                    } else {
                        System.out.println("[CityMod] Forge 资源包注册失败：pack 为 null，可能是 pack.mcmeta 有问题");
                    }
                } catch (Exception e) {
                    System.out.println("[CityMod] Forge 资源包注册发生异常: " + e.getMessage());
                }
            });
        }
    }
}