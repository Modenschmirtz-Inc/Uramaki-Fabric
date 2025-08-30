package net.modenschmirtz.uramaki.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modenschmirtz.uramaki.entity.ModEntities;
import net.modenschmirtz.uramaki.item.ModItems;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class FishProjectile extends PersistentProjectileEntity implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private static final TrackedData<String> VARIANT = DataTracker.registerData(FishProjectile.class, TrackedDataHandlerRegistry.STRING);

    public FishProjectile(EntityType<? extends FishProjectile> entityType, World world) {
        super(entityType, world);
    }

    public FishProjectile(World world, LivingEntity owner, ItemStack stack, ItemStack shotFrom, String variant) {
        super(ModEntities.FISH_PROJECTILE, owner, world, stack, shotFrom);
        setVariant(variant);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(VARIANT, "tuna");
    }

    public void setVariant(String value) {
        this.dataTracker.set(VARIANT, value);
    }

    public String getVariant() {
        return this.dataTracker.get(VARIANT);
    }

    @Override
    protected ItemStack getDefaultItemStack() {
        return ModItems.TUNA.getDefaultStack();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
