package net.modenschmirtz.uramaki.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;
import net.modenschmirtz.uramaki.entity.custom.TunaEntity;

public class ModEntities {
    public static final EntityType<TunaEntity> TUNA = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(Uramaki.MOD_ID, "tuna"),
            EntityType.Builder.<TunaEntity>create(TunaEntity::new, SpawnGroup.WATER_CREATURE)
                    .dimensions(0.7F, 0.4F).eyeHeight(0.26F).maxTrackingRange(4).build());

    public static void register() {
        Uramaki.LOGGER.info("Registering Mod Entities For :" + Uramaki.MOD_ID);
        FabricDefaultAttributeRegistry.register(TUNA, FishEntity.createFishAttributes().build());
    }
}
