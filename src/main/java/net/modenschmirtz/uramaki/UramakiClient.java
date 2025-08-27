package net.modenschmirtz.uramaki;

import net.fabricmc.api.ClientModInitializer;
import net.modenschmirtz.uramaki.client.ModItemModelPredicates;

public class UramakiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemModelPredicates.register();
    }
}
