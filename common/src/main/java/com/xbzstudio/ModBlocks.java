package com.xbzstudio;

import com.xbzstudio.block.BlockShapes;
import com.xbzstudio.block.GenericSignBlock;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create("citymod", Registries.BLOCK);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create("citymod", Registries.ITEM);

    // ==================== 路牌 ====================
    public static final RegistrySupplier<Block> EXPR_1 = registerSign("expr_1", BlockShapes.EXPR_1);
    public static final RegistrySupplier<Block> EXPR_2 = registerSign("expr_2", BlockShapes.EXPR_2);
    public static final RegistrySupplier<Block> EXPR_3 = registerSign("expr_3", BlockShapes.EXPR_3);
    public static final RegistrySupplier<Block> EXPR_4 = registerSign("expr_4", BlockShapes.EXPR_4);
    public static final RegistrySupplier<Block> EXPR_5 = registerSign("expr_5", BlockShapes.EXPR_5);
    public static final RegistrySupplier<Block> EXPR_5a = registerSign("expr_5a", BlockShapes.EXPR_5a);
    public static final RegistrySupplier<Block> EXPR_5b = registerSign("expr_5b", BlockShapes.EXPR_5b);
    public static final RegistrySupplier<Block> EXPR_5c = registerSign("expr_5c", BlockShapes.EXPR_5c);
    public static final RegistrySupplier<Block> EXPR_5_d = registerSign("expr_5_d", BlockShapes.EXPR_5_d);
    public static final RegistrySupplier<Block> EXPR_5_e = registerSign("expr_5_e", BlockShapes.EXPR_5_e);
    public static final RegistrySupplier<Block> EXPR_5_f = registerSign("expr_5_f", BlockShapes.EXPR_5_f);
    public static final RegistrySupplier<Block> SERVICE_AREA_SIGN = registerSign("service_area_sign", BlockShapes.SERVICE_AREA_SIGN);
    public static final RegistrySupplier<Block> OVERPASS_SIGN = registerSign("overpass_sign", BlockShapes.OVERPASS_SIGN);
    public static final RegistrySupplier<Block> OVERPASS_SIGN_2 = registerSign("overpass_sign_2", BlockShapes.OVERPASS_SIGN_2);
    public static final RegistrySupplier<Block> OVERPASS_SIGN_3 = registerSign("overpass_sign_3", BlockShapes.OVERPASS_SIGN_3);
    public static final RegistrySupplier<Block> OVER_PASS_SIGN_4 = registerSign("over_pass_sign_4", BlockShapes.OVER_PASS_SIGN_4);
    public static final RegistrySupplier<Block> ROAD_6 = registerSign("road_6", BlockShapes.ROAD_6);
    public static final RegistrySupplier<Block> ROAD_11 = registerSign("road_11", BlockShapes.ROAD_11);
    public static final RegistrySupplier<Block> EXPR_SIGN_LARGE = registerSign("expr_sign_large", BlockShapes.EXPR_SIGN_LARGE);
    public static final RegistrySupplier<Block> EXPRESSWAY_EXIT_SIGN =registerSign("expressway_exit_sign",BlockShapes.EXPRESSWAY_EXIT_SIGN);
    public static final RegistrySupplier<Block> EXPR_T_IPS =registerSign("expr_t_ips",BlockShapes.EXPR_T_IPS);
    public static final RegistrySupplier<Block> TRAFFIC_SIGN = registerSign("traffic_sign", BlockShapes.TRAFFIC_SIGN);
    public static final RegistrySupplier<Block> TRAFFIC_SIGN_L = registerSign("traffic_sign_l", BlockShapes.TRAFFIC_SIGN_L);
    public static final RegistrySupplier<Block> TRAFFIC_SIGN_R = registerSign("traffic_sign_r", BlockShapes.TRAFFIC_SIGN_R);
    public static final RegistrySupplier<Block> TRAFFIC_SIGN_T = registerSign("traffic_sign_t", BlockShapes.TRAFFIC_SIGN_T);

    // 路牌注册快捷方法
    private static RegistrySupplier<Block> registerSign(String id, java.util.Map<net.minecraft.core.Direction, net.minecraft.world.phys.shapes.VoxelShape> shape) {
        return BLOCKS.register(id, () -> new GenericSignBlock(shape));
    }

    // 初始化 BlockItems
    public static void init() {
        for (RegistrySupplier<Block> block : BLOCKS) {
            ITEMS.register(block.getId().getPath(),
                    () -> new BlockItem(block.get(), new Item.Properties()));
        }
    }
}