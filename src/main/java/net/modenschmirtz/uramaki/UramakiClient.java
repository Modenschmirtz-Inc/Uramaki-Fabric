package net.modenschmirtz.uramaki;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.modenschmirtz.uramaki.client.ModItemModelPredicates;
import net.modenschmirtz.uramaki.entity.ModEntities;
import net.modenschmirtz.uramaki.entity.render.TunaRenderer;

public class UramakiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemModelPredicates.register();
        EntityRendererRegistry.register(ModEntities.TUNA, TunaRenderer::new);
    }
}
