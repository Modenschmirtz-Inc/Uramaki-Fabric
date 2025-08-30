package net.modenschmirtz.uramaki.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import net.modenschmirtz.uramaki.entity.ModEntities;
import net.modenschmirtz.uramaki.item.ModItems;
import net.modenschmirtz.uramaki.misc.ModSounds;
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
        pickupType = PickupPermission.DISALLOWED;
        setDamage(1.5);
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
    protected void onBlockHit(BlockHitResult blockHitResult) {
        super.onBlockHit(blockHitResult);
        if (getWorld() instanceof ServerWorld world){
            world.spawnParticles(DustParticleEffect.DEFAULT, getX(), getY(), getZ(), 25, 0.25, 0.25, 0.25, 0.1d);
        }
        discard();
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        if (entityHitResult.getEntity() instanceof LivingEntity entity){
            if (!getWorld().isClient() && getPierceLevel() <= 0) {
                entity.setStuckArrowCount(Math.max(entity.getStuckArrowCount() -1, 0));
            }
        }
        if (getWorld() instanceof ServerWorld world){
            world.spawnParticles(DustParticleEffect.DEFAULT, getX(), getY(), getZ(), 25, 0.25, 0.25, 0.25, 0.1d);
        }
    }

    @Override
    protected SoundEvent getHitSound() {
        return ModSounds.FISH_SPLAT;
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