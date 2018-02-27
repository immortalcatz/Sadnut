package sadnut.items.tools;

import sadnut.Main;
import sadnut.init.ModItems;
import sadnut.items.ItemBase;
import sadnut.util.IHasModel;

public class ItemToolhead extends ItemBase implements IHasModel{

	public ItemToolhead(String name) {
		super(name);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.toolsTab);
		
		ModItems.ITEMS.add(this);
	}

}
