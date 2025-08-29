package net.modenschmirtz.uramaki.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.SchoolingFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.modenschmirtz.uramaki.item.ModItems;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

public class TunaEntity extends SchoolingFishEntity implements GeoEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public TunaEntity(EntityType<? extends TunaEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public int getMaxGroupSize() {
        return 5;
    }

    @Override
    public ItemStack getBucketItem() {
        return ModItems.TUNA_BUCKET.getDefaultStack();
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    @Override
    protected SoundEvent getFlopSound() {
        return SoundEvents.ENTITY_SALMON_FLOP;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 5, this::animController));
    }

    private <E extends TunaEntity> PlayState animController(final AnimationState<E> event) {
        if (this.touchingWater) {
            event.getController().setAnimation(RawAnimation.begin().then("swim", Animation.LoopType.LOOP));
            if (event.isMoving()) {
                event.getController().setAnimationSpeed(1f);
            }else{
                event.getController().setAnimationSpeed(0.25f);
            }
        }else {
            event.getController().setAnimation(RawAnimation.begin().then("flop", Animation.LoopType.LOOP));
        }
        return PlayState.CONTINUE;
    }
}
