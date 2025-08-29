package net.modenschmirtz.uramaki.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.modenschmirtz.uramaki.entity.custom.TunaEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class TunaRenderer extends GeoEntityRenderer<TunaEntity> {
    public TunaRenderer(EntityRendererFactory.Context context) {
        super(context, new TunaModel());
    }
}