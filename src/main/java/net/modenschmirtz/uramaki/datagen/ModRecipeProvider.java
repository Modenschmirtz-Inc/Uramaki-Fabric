package net.modenschmirtz.uramaki.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.*;
import net.minecraft.registry.RegistryWrapper;
import net.modenschmirtz.uramaki.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateModCookingRecipes(exporter, "smoking", RecipeSerializer.SMOKING, SmokingRecipe::new, 100);
        generateModCookingRecipes(exporter, "smelting", RecipeSerializer.SMELTING, SmeltingRecipe::new, 200);
        generateModCookingRecipes(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new, 600);
    }

    private static <T extends AbstractCookingRecipe> void generateModCookingRecipes(RecipeExporter exporter, String cooker, RecipeSerializer<T> serializer, AbstractCookingRecipe.RecipeFactory<T> recipeFactory, int cookingTime){
        offerFoodCookingRecipe(exporter, cooker, serializer, recipeFactory, cookingTime, ModItems.TUNA, ModItems.COOKED_TUNA, 0.35F);
        offerFoodCookingRecipe(exporter, cooker, serializer, recipeFactory, cookingTime, ModItems.COD_FILLET, ModItems.COOKED_COD_FILLET, 0.175F);
        offerFoodCookingRecipe(exporter, cooker, serializer, recipeFactory, cookingTime, ModItems.SALMON_FILLET, ModItems.COOKED_SALMON_FILLET, 0.175F);
        offerFoodCookingRecipe(exporter, cooker, serializer, recipeFactory, cookingTime, ModItems.TUNA_FILLET, ModItems.COOKED_TUNA_FILLET, 0.175F);
    }
}