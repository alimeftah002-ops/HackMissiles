package com.hackmissiles;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3d;

public class BlockLauncher extends Block {
    public BlockLauncher(AbstractBlock.Properties props) {
        super(props);
    }

    // Placeholder - right-click to spawn missile entity towards stored player target
    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }
}
