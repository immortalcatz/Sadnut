package sadnut.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sadnut.Main;
import sadnut.init.ModItems;
import sadnut.util.IHasModel;

/**
 * Created by NotoriousGTW on 2/6/2018.
 */
public class ItemShovel extends net.minecraft.item.ItemSpade implements IHasModel {

    private String name;

    public ItemShovel(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;

        ModItems.ITEMS.add(this);
    }

    @Override
    public Item setCreativeTab(CreativeTabs tab) {
        return super.setCreativeTab(Main.toolsTab);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, name);
    }
}
