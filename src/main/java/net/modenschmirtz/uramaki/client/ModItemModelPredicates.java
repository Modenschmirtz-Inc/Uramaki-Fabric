package net.modenschmirtz.uramaki.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;
import net.modenschmirtz.uramaki.item.ModItems;

@Environment(EnvType.CLIENT)
public class ModItemModelPredicates {
    public static void register(){
        ModelPredicateProviderRegistry.register(Items.CROSSBOW, Identifier.of(Uramaki.MOD_ID, "tuna"), (stack, world, entity, seed) -> {
            ChargedProjectilesComponent chargedProjectilesComponent = stack.get(DataComponentTypes.CHARGED_PROJECTILES);
            return chargedProjectilesComponent != null && chargedProjectilesComponent.contains(ModItems.TUNA) ? 1.0F : 0.0F;
        });
    }
}
