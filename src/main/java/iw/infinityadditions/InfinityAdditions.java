package iw.infinityadditions;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static iw.infinityadditions.block.ModBlocks.registerModBlocks;
import static iw.infinityadditions.item.ModItems.registerModItems;

public class InfinityAdditions implements ModInitializer {
	public static final String MOD_ID = "infinity-additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Mod!");
        registerModItems();
        registerModBlocks();
	}
}