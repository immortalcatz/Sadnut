package sadnut.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import sadnut.Main;
import sadnut.init.ModPotions;

public class CommonProxy {
	public void registerItemRenderer(Item item, int meta, String id) {
		
	}

	public EntityPlayer getPlayer()
	{
		return null;
	}
	
	@SubscribeEvent
	public void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(ModPotions.potionBleed);
	}
}
