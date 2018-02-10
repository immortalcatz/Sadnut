package sadnut.sadnutmaterials.blocks;

<<<<<<< HEAD
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sadnut.sadnutmaterials.Main;
import sadnut.sadnutmaterials.util.Reference;

public class BlockBase extends Block {

	public BlockBase(Material mat, String name) {
		super(mat);
		setRegistryName(name);
		setUnlocalizedName(name);
		register();
		setHardness(1F);
		setCreativeTab(Main.creativeTab);
	}
	
	public BlockBase(Material mat, String name, boolean register) {
		super(mat);
		setRegistryName(name);
		setUnlocalizedName(name);
		setHardness(1F);
		setCreativeTab(Main.creativeTab);
		if (register) {
			register();
		}
	}
	
	public void register(Item item) {
		GameRegistry.findRegistry(Block.class).register(this);
		GameRegistry.findRegistry(Item.class).register(item);
	}
	
	public void register() {
		register(new ItemBlock(this).setRegistryName(getRegistryName()));
	}
	
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString(),"inventory"));
	}
	
	public BlockBase setBlockSoundType(SoundType soundType) {
		setSoundType(soundType);
		return this;
	}
	
}
=======
import sadnut.sadnutmaterials.Main;
import sadnut.sadnutmaterials.init.ModBlocks;
import sadnut.sadnutmaterials.init.ModItems;
import sadnut.sadnutmaterials.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	public BlockBase(String name, Material material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.creativeTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
>>>>>>> master
