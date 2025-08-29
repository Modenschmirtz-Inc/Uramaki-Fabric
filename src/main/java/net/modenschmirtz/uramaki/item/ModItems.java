package net.modenschmirtz.uramaki.item;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.EntityBucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.modenschmirtz.uramaki.Uramaki;
import net.modenschmirtz.uramaki.entity.ModEntities;
import net.modenschmirtz.uramaki.item.components.ModFoodComponents;
import net.modenschmirtz.uramaki.item.custom.TunaItem;

public class ModItems {

    public static final Item TUNA = registerItem("tuna", new TunaItem(new Item.Settings().food(ModFoodComponents.TUNA)));
    public static final Item COOKED_TUNA = registerItem("cooked_tuna", new Item(new Item.Settings().food(ModFoodComponents.COOKED_TUNA)));
    public static final Item GOLDEN_FISH = registerItem("golden_fish", new Item(new Item.Settings().food(ModFoodComponents.GOLDEN_FISH).rarity(Rarity.RARE)));

    public static final Item COD_FILLET = registerItem("cod_fillet", new Item(new Item.Settings().food(ModFoodComponents.COD_FILLET)));
    public static final Item SALMON_FILLET = registerItem("salmon_fillet", new Item(new Item.Settings().food(ModFoodComponents.SALMON_FILLET)));
    public static final Item TUNA_FILLET = registerItem("tuna_fillet", new Item(new Item.Settings().food(ModFoodComponents.TUNA_FILLET)));

    public static final Item COOKED_COD_FILLET = registerItem("cooked_cod_fillet", new Item(new Item.Settings().food(ModFoodComponents.COOKED_COD_FILLET)));
    public static final Item COOKED_SALMON_FILLET = registerItem("cooked_salmon_fillet", new Item(new Item.Settings().food(ModFoodComponents.COOKED_SALMON_FILLET)));
    public static final Item COOKED_TUNA_FILLET = registerItem("cooked_tuna_fillet", new Item(new Item.Settings().food(ModFoodComponents.COOKED_TUNA_FILLET)));

    public static final Item TUNA_BUCKET = registerItem("tuna_bucket",
            new EntityBucketItem(
                    ModEntities.TUNA,
                    Fluids.WATER,
                    SoundEvents.ITEM_BUCKET_EMPTY_FISH,
                    new Item.Settings().maxCount(1).component(DataComponentTypes.BUCKET_ENTITY_DATA, NbtComponent.DEFAULT)
            ));
    public static final Item TUNA_SPAWN_EGG = registerItem("tuna_spawn_egg", new SpawnEggItem(ModEntities.TUNA, 0xeff0f2, 0x62728c, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Uramaki.MOD_ID, name), item);
    }

    public static void register(){
        Uramaki.LOGGER.info("Registering Mod Items For: "+Uramaki.MOD_ID);
    }
}
