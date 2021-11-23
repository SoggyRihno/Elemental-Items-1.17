package elementalItems;

import elementalItems.utils.registry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.world.WorldTickCallback;
import net.minecraft.block.BlockState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("elementalitems");

	@Override
	public void onInitialize() {
		registry.initalize();
	}
}
