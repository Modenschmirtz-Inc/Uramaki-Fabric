package net.modenschmirtz.uramaki.entity.render;

import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;
import net.modenschmirtz.uramaki.entity.custom.FishProjectile;
import software.bernie.geckolib.model.GeoModel;

public class FishProjectileModel extends GeoModel<FishProjectile> {
    @Override
    public Identifier getModelResource(FishProjectile entity) {
        return switch (entity.getVariant()) {
            case "cod" -> Identifier.of(Uramaki.MOD_ID, "geo/entity/cod.geo.json");
            case "salmon" -> Identifier.of(Uramaki.MOD_ID, "geo/entity/salmon.geo.json");
            default -> Identifier.of(Uramaki.MOD_ID, "geo/entity/tuna.geo.json");
        };
    }

    @Override
    public Identifier getTextureResource(FishProjectile entity) {
        return switch (entity.getVariant()) {
            case "cod" -> Identifier.ofVanilla("textures/entity/fish/cod.png");
            case "salmon" -> Identifier.ofVanilla("textures/entity/fish/salmon.png");
            default -> Identifier.of(Uramaki.MOD_ID, "textures/entity/tuna.png");
        };
    }

    @Override
    public Identifier getAnimationResource(FishProjectile entity) {
        return null;
    }
}
