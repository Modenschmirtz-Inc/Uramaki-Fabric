package net.modenschmirtz.uramaki.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.modenschmirtz.uramaki.item.ModItems;

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

        itemModelGenerator.register(ModItems.COD_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALMON_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNA_FILLET, Models.GENERATED);

        itemModelGenerator.register(ModItems.COOKED_COD_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SALMON_FILLET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_TUNA_FILLET, Models.GENERATED);
    }
}
