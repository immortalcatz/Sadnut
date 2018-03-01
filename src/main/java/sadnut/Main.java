package sadnut;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import sadnut.proxy.CommonProxy;
import sadnut.util.Reference;
import sadnut.util.tabs.SadnutMaterialsTab;
import sadnut.util.tabs.SadnutToolsTab;
import sadnut.util.tabs.SadnutWorldgenTab;
import sadnut.world.WorldTypeSadnut;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	public static SimpleNetworkWrapper network;
	
	public static final SadnutWorldgenTab worldgenTab = new SadnutWorldgenTab();
	public static final SadnutMaterialsTab materialsTab = new SadnutMaterialsTab();
	public static final SadnutToolsTab toolsTab = new SadnutToolsTab();
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		instance = this;

		network = NetworkRegistry.INSTANCE.newSimpleChannel("SADNUT");
		new WorldTypeSadnut(WorldTypeSadnut.getNextID(), "sadnut");
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
