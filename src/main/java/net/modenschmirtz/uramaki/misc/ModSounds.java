package net.modenschmirtz.uramaki.misc;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;

public class ModSounds {

    public static final SoundEvent FISH_SPLAT = register("fish_splat");

    private static SoundEvent register(String name) {
        Identifier id = Identifier.of(Uramaki.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void register(){
        Uramaki.LOGGER.info("Registering Mod Sounds For :"+Uramaki.MOD_ID);
    }
}