package net.modenschmirtz.uramaki.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;
import net.modenschmirtz.uramaki.entity.custom.FishProjectile;
import net.modenschmirtz.uramaki.entity.custom.TunaEntity;

public class ModEntities {
    public static final EntityType<TunaEntity> TUNA = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Uramaki.MOD_ID, "tuna"),
            EntityType.Builder.create(TunaEntity::new, SpawnGroup.WATER_CREATURE)
                    .dimensions(0.7F, 0.4F).eyeHeight(0.26F).maxTrackingRange(4).build());

    public static final EntityType<FishProjectile> FISH_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Uramaki.MOD_ID, "fish_projectile"),
            EntityType.Builder.<FishProjectile>create(FishProjectile::new, SpawnGroup.MISC)
                    .dimensions(0.5F, 0.5F).eyeHeight(0.13F).maxTrackingRange(4).trackingTickInterval(20).build());

    public static void register() {
        Uramaki.LOGGER.info("Registering Mod Entities For :" + Uramaki.MOD_ID);
        FabricDefaultAttributeRegistry.register(TUNA, FishEntity.createFishAttributes().build());
    }
}
