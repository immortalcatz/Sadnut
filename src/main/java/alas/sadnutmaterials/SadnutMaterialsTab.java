package alas.sadnutmaterials;

import alas.sadnutmaterials.init.ModItems;
import alas.sadnutmaterials.util.Reference;
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
