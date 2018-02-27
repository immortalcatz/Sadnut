package sadnut.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProviderSurface;
import net.minecraftforge.common.DimensionManager;
import sadnut.Main;

public class SadnutDimensionHandler{
	public static DimensionType SadnutDimension;
	public static final DimensionType SADNUT_DIMENSION = DimensionType.register("SADNUT", "_sadnut", WorldTypeSadnut.dimID, WorldProviderSadnut.class, false);
	
	public static void init() {
		registerDimensions();
	}
	
	private static void registerDimensions() {
		DimensionManager.registerDimension(WorldTypeSadnut.dimID, SADNUT_DIMENSION);
	}
}
