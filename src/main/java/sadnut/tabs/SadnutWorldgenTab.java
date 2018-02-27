package sadnut.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import sadnut.init.ModBlocks;
import sadnut.init.ModItems;
import sadnut.util.Reference;

public class SadnutWorldgenTab extends CreativeTabs{

	public SadnutWorldgenTab() {
		super("Sadnut Worldgen");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.RAW_BASALT_BLOCK);
	}
}
