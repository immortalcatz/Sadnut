package sadnut.sadnutmaterials;

import sadnut.sadnutmaterials.init.ModItems;
import sadnut.sadnutmaterials.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SadnutMaterialsTab extends CreativeTabs{

	public SadnutMaterialsTab() {
		super(Reference.MOD_ID);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.COPPER_INGOT);
	}
}
