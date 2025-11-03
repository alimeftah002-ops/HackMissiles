package com.hackmissiles;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

public class ItemTargetDesignator extends Item {
    public ItemTargetDesignator(Properties props) {
        super(props);
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getPos();
        PlayerEntity player = context.getPlayer();
        if (!world.isRemote) {
            // store target in player's persistent data (example approach)
            player.getPersistentData().putInt("targetX", pos.getX());
            player.getPersistentData().putInt("targetY", pos.getY());
            player.getPersistentData().putInt("targetZ", pos.getZ());
            player.sendMessage(new StringTextComponent("Target locked: " + pos.toString()), player.getUniqueID());
        }
        return ActionResultType.SUCCESS;
    }
}
