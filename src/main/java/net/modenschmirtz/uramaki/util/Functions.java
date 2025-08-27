package net.modenschmirtz.uramaki.util;

import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;

public class Functions {
    public static Identifier id(String id) {
        return Identifier.of(Uramaki.MOD_ID, id);
    }
}
