package net.modenschmirtz.uramaki.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Uramaki.MOD_ID, name), item);
    }

    public static void register(){
        Uramaki.LOGGER.info("Registering Mod Items For: "+Uramaki.MOD_ID);
    }
}
