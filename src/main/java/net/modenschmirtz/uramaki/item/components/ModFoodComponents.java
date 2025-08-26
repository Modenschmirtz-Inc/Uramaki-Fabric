package net.modenschmirtz.uramaki.item.components;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TUNA = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent COOKED_TUNA = new FoodComponent.Builder().nutrition(6).saturationModifier(0.8F).build();

    public static final FoodComponent COD_FILLET = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final FoodComponent SALMON_FILLET = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build();
    public static final FoodComponent TUNA_FILLET = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).build();

    public static final FoodComponent COOKED_COD_FILLET = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodComponent COOKED_SALMON_FILLET = new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build();
    public static final FoodComponent COOKED_TUNA_FILLET = new FoodComponent.Builder().nutrition(3).saturationModifier(0.4F).build();
}
