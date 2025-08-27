package net.modenschmirtz.uramaki.mixin;

import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;
import net.modenschmirtz.uramaki.item.ModItems;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemModels.class)
public abstract class ItemModelsMixin {
    @Shadow @Final private BakedModelManager modelManager;

    @Inject(method = "getModel(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/client/render/model/BakedModel;", at = @At("HEAD"), cancellable = true)
    private void Injected(ItemStack stack, CallbackInfoReturnable<BakedModel> cir){
        if (stack.getItem() == Items.CROSSBOW && stack.get(DataComponentTypes.CHARGED_PROJECTILES) instanceof ChargedProjectilesComponent component) {
            if (component.contains(ModItems.TUNA)) cir.setReturnValue(modelManager.getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Uramaki.MOD_ID, "crossbow_tuna"))));
            if (component.contains(Items.COD)) cir.setReturnValue(modelManager.getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Uramaki.MOD_ID, "crossbow_cod"))));
            if (component.contains(Items.SALMON)) cir.setReturnValue(modelManager.getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Uramaki.MOD_ID, "crossbow_salmon"))));
            if (component.contains(ModItems.GOLDEN_FISH)) cir.setReturnValue(modelManager.getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Uramaki.MOD_ID, "crossbow_golden_fish"))));
        }
    }
}
