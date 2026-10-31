package com.xbzstudio.citymod;

import com.xbzstudio.citymod.block.TooltipBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;

import java.util.function.Consumer;

public class ModBlockItem extends BlockItem {
    private final String blockName; // 娉ㄥ唽鍚嶏紙涓嶅惈鍛藉悕绌洪棿锛?

    public ModBlockItem(Block block, Properties properties, String blockName) {
        super(block, properties);
        this.blockName = blockName;
    }

    @Override
    public Component getName(ItemStack stack) {
        return Component.translatable("block." + CityMod.MODID + "." + blockName);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay display,
                                Consumer<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, display, tooltip, flag);
        if (getBlock() instanceof TooltipBlock tooltipBlock) {
            String key = tooltipBlock.getTooltipKey();
            if (key != null && !key.isEmpty()) {
                tooltip.accept(Component.translatable(key).withStyle(ChatFormatting.GRAY));
            }
        }
    }
}
