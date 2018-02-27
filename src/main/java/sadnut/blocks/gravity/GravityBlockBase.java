package sadnut.blocks.gravity;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPos.MutableBlockPos;
import net.minecraft.world.World;
import sadnut.Main;
import sadnut.init.ModBlocks;
import sadnut.init.ModItems;
import sadnut.util.IHasModel;


public class GravityBlockBase extends BlockFalling implements IHasModel{
	public GravityBlockBase(String name, Material material) {

		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.worldgenTab);
		setSoundType(SoundType.GROUND);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		
	}
	
	//nonfunctioning attempt at TFC gravity
	public void onUpdate(World world, MutableBlockPos pos) {
	    if ((world.getBlockState(pos.north().down()).getMaterial() == Material.AIR) || ((world.getBlockState(pos.north().down()).getMaterial()) == Material.WATER))
	    {
	        if ((world.getBlockState(pos.north().down()).getMaterial() == Material.AIR) || ((world.getBlockState(pos.north().down()).getMaterial()) == Material.WATER))
	        {
	        	world.setBlockState(pos.north().down(), this.getDefaultState());
	        }
	        if ((world.getBlockState(pos.east().down()).getMaterial() == Material.AIR) || ((world.getBlockState(pos.east().down()).getMaterial()) == Material.WATER))
	        {
	        	world.setBlockState(pos.east().down(), this.getDefaultState());
	        }
	        if ((world.getBlockState(pos.west().down()).getMaterial() == Material.AIR) || ((world.getBlockState(pos.west().down()).getMaterial()) == Material.WATER))
	        {
	        	world.setBlockState(pos.west().down(), this.getDefaultState());
	        }
	        if ((world.getBlockState(pos.south().down()).getMaterial() == Material.AIR) || ((world.getBlockState(pos.south().down()).getMaterial()) == Material.WATER))
	        {
	        	world.setBlockState(pos.south().down(), this.getDefaultState());
	        }
	        else {
	        	
	        }
	    }
	    	
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
