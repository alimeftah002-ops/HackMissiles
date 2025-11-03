package com.hackmissiles;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HackMissiles.MODID);

    public static final RegistryObject<Item> TARGET_DESIGNATOR =
        ITEMS.register("target_designator", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MISSILE_LITE =
        ITEMS.register("missile_lite", () -> new Item(new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> MISSILE_MID =
        ITEMS.register("missile_mid", () -> new Item(new Item.Properties().group(ItemGroup.COMBAT)));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
