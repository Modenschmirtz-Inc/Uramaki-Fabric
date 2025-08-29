package net.modenschmirtz.uramaki.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.modenschmirtz.uramaki.entity.ModEntities;
import net.modenschmirtz.uramaki.item.ModItemGroups;
import net.modenschmirtz.uramaki.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class EnglishProvider extends FabricLanguageProvider {
    public EnglishProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.TUNA, "Raw Tuna");
        translationBuilder.add(ModItems.COOKED_TUNA, "Cooked Tuna");
        translationBuilder.add(ModItems.GOLDEN_FISH, "Golden Fish");

        translationBuilder.add(ModItems.COD_FILLET, "Raw Cod Fillet");
        translationBuilder.add(ModItems.SALMON_FILLET, "Raw Salmon Fillet");
        translationBuilder.add(ModItems.TUNA_FILLET, "Raw Tuna Fillet");

        translationBuilder.add(ModItems.COOKED_COD_FILLET, "Cooked Cod Fillet");
        translationBuilder.add(ModItems.COOKED_SALMON_FILLET, "Cooked Salmon Fillet");
        translationBuilder.add(ModItems.COOKED_TUNA_FILLET, "Cooked Tuna Fillet");

        translationBuilder.add(ModEntities.TUNA, "Tuna");

        translationBuilder.add(ModItemGroups.URAMAKI_ITEM_GROUP.getDisplayName().getString(), "Uramaki");
    }
}
