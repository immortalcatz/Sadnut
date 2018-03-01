package sadnut.util.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import sadnut.init.ModBlocks;
import sadnut.init.ModItems;
import sadnut.util.Reference;

public class SadnutToolsTab extends CreativeTabs{

	public SadnutToolsTab() {
		super("Sadnut Tools");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.STEEL_AXE_HEAD);
	}
}
