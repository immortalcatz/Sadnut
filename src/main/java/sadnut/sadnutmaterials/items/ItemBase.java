package sadnut.sadnutmaterials.items;

import sadnut.sadnutmaterials.Main;
import sadnut.sadnutmaterials.init.ModItems;
import sadnut.sadnutmaterials.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.creativeTab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
