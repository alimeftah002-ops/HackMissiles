package com.hackmissiles;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HackMissiles.MODID);

    public static final RegistryObject<Block> LAUNCHER =
        BLOCKS.register("launcher", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f)));

    public static final RegistryObject<Block> SENTRY =
        BLOCKS.register("sentry", () -> new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(2.0f)));

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
