package net.modenschmirtz.uramaki.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.modenschmirtz.uramaki.Uramaki;

public class ModItemGroups {

    public static final ItemGroup URAMAKI_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Uramaki.MOD_ID, "uramaki_items"),
            FabricItemGroup.builder().icon(ModItems.TUNA::getDefaultStack).displayName(Text.translatable("itemgroup.uramaki.uramaki_items"))
                    .entries((context, entries) -> {
                        entries.add(ModItems.TUNA);
                        entries.add(ModItems.COOKED_TUNA);
                        entries.add(ModItems.GOLDEN_FISH);

                        entries.add(ModItems.COD_FILLET);
                        entries.add(ModItems.SALMON_FILLET);
                        entries.add(ModItems.TUNA_FILLET);

                        entries.add(ModItems.COOKED_COD_FILLET);
                        entries.add(ModItems.COOKED_SALMON_FILLET);
                        entries.add(ModItems.COOKED_TUNA_FILLET);
                    }).build());

    public static void register(){
        Uramaki.LOGGER.info("Registering Item Groups For :"+Uramaki.MOD_ID);
    }
}
