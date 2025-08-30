package net.modenschmirtz.uramaki;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.modenschmirtz.uramaki.entity.ModEntities;
import net.modenschmirtz.uramaki.entity.render.FishProjectileRenderer;
import net.modenschmirtz.uramaki.entity.render.TunaRenderer;

public class UramakiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TUNA, TunaRenderer::new);
        EntityRendererRegistry.register(ModEntities.FISH_PROJECTILE, FishProjectileRenderer::new);
    }
}
