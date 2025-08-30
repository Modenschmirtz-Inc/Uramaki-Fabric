package net.modenschmirtz.uramaki;

import net.fabricmc.api.ModInitializer;
import net.modenschmirtz.uramaki.block.ModBlocks;
import net.modenschmirtz.uramaki.entity.ModEntities;
import net.modenschmirtz.uramaki.item.ModItemGroups;
import net.modenschmirtz.uramaki.item.ModItems;
import net.modenschmirtz.uramaki.misc.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Uramaki implements ModInitializer {
	public static final String MOD_ID = "uramaki";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
		ModItemGroups.register();
		ModEntities.register();
		ModSounds.register();
	}
}