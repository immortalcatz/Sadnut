package sadnut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import sadnut.init.ModBlocks;
import sadnut.init.ModItems;
import sadnut.util.Reference;

public class SadnutMaterialsTab extends CreativeTabs{

	public SadnutMaterialsTab() {
		super("Sadnut Materials");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.CINNABAR_ITEM);
	}
}
