package net.modenschmirtz.uramaki.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.modenschmirtz.uramaki.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.FISHES).add(ModItems.TUNA).add(ModItems.COOKED_TUNA).add(ModItems.GOLDEN_FISH);
        getOrCreateTagBuilder(ConventionalItemTags.RAW_FISH_FOODS).add(ModItems.TUNA);
        getOrCreateTagBuilder(ConventionalItemTags.RAW_FISHES_FOODS).add(ModItems.TUNA);
        getOrCreateTagBuilder(ConventionalItemTags.COOKED_FISH_FOODS).add(ModItems.COOKED_TUNA);
        getOrCreateTagBuilder(ConventionalItemTags.COOKED_FISHES_FOODS).add(ModItems.COOKED_TUNA);
        getOrCreateTagBuilder(ItemTags.OCELOT_FOOD).add(ModItems.TUNA);
        getOrCreateTagBuilder(ItemTags.CAT_FOOD).add(ModItems.TUNA);
    }
}
