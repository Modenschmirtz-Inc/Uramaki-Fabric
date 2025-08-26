package net.modenschmirtz.uramaki.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;

public class ModBlocks {

    private static Block registerBlock(String name, Block block, Boolean blockItem){
        if (blockItem) registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Uramaki.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, Item.Settings settings){
        registerBlockItem(name, block, settings);
        return Registry.register(Registries.BLOCK, Identifier.of(Uramaki.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Uramaki.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static void registerBlockItem(String name, Block block, Item.Settings settings){
        Registry.register(Registries.ITEM, Identifier.of(Uramaki.MOD_ID, name),
                new BlockItem(block, settings));
    }

    public static void register(){
        Uramaki.LOGGER.info("Registering Mod Blocks For :"+Uramaki.MOD_ID);
    }
}
