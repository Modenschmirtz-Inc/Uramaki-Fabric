package net.modenschmirtz.uramaki.entity.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.modenschmirtz.uramaki.entity.custom.FishProjectile;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class FishProjectileRenderer extends GeoEntityRenderer<FishProjectile> {
    public FishProjectileRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new FishProjectileModel());
    }

    @Override
    protected void applyRotations(FishProjectile entity, MatrixStack poseStack, float ageInTicks, float rotationYaw, float partialTick, float nativeScale) {
        super.applyRotations(entity, poseStack, ageInTicks, rotationYaw, partialTick, nativeScale);

        poseStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getYaw(partialTick)));
        poseStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.getPitch(partialTick)));

        float s = entity.shake - partialTick;
        if (s > 0.0F) {
            float t = -MathHelper.sin(s * 3.0F) * s;
            poseStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(t));
        }
    }
}
