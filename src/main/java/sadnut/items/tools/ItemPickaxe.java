package sadnut.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sadnut.Main;
import sadnut.init.ModItems;
import sadnut.util.IHasModel;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe implements IHasModel{

    private String name;

    public ItemPickaxe(ToolMaterial material, String name) {
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
