package net.modenschmirtz.uramaki.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.modenschmirtz.uramaki.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Predicate;

@Mixin(CrossbowItem.class)
public class CrossbowItemMixin {
    @Inject(method = "createArrowEntity", at = @At("HEAD"), cancellable = true)
    private void Injected(World world, LivingEntity shooter, ItemStack weaponStack, ItemStack projectileStack, boolean critical, CallbackInfoReturnable<ProjectileEntity> cir){
    }

    @Inject(method = "getHeldProjectiles", at = @At("RETURN"), cancellable = true)
    private void Injected2(CallbackInfoReturnable<Predicate<ItemStack>> cir){
        cir.setReturnValue(cir.getReturnValue()
                .or(stack -> stack.isOf(ModItems.TUNA))
                .or(stack -> stack.isOf(Items.COD))
                .or(stack -> stack.isOf(Items.SALMON))
                .or(stack -> stack.isOf(ModItems.GOLDEN_FISH)));
    }
}
