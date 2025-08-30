package net.modenschmirtz.uramaki.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.item.ModItems;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TUNA, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_TUNA, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_FISH, Models.GENERATED);

        itemModelGenerator.register(ModItems.COD_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNA_FILLET, Models.GENERATED);

        itemModelGenerator.register(ModItems.COOKED_COD_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SALMON_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_TUNA_FILLET, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNA_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNA_SPAWN_EGG, new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
    }
}
