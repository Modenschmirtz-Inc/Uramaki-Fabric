package net.modenschmirtz.uramaki.entity.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.modenschmirtz.uramaki.entity.custom.TunaEntity;
import net.modenschmirtz.uramaki.util.Functions;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

@Environment(EnvType.CLIENT)
public class TunaModel extends DefaultedEntityGeoModel<TunaEntity> {
    public TunaModel() {
        super(Functions.id("tuna"), false);
    }
}
