package sadnut.sadnutmaterials.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sadnut.sadnutmaterials.Main;
import sadnut.sadnutmaterials.init.ModBlocks;
import sadnut.sadnutmaterials.init.ModItems;
import sadnut.sadnutmaterials.util.IHasModel;

public class LeavesBase extends Block implements net.minecraftforge.common.IShearable, IHasModel
{
    public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
    public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");
    protected boolean leavesFancy;
    int[] surroundings;

    public LeavesBase(String name)
    {
        super(Material.LEAVES);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setTickRandomly(true);
        this.setCreativeTab(Main.creativeTab);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setSoundType(SoundType.PLANT);
        
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    
    //enables walking through block
	@Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
    {
        return NULL_AABB;
    }
	
	
	//modifies acceleration
	@Override
	public Vec3d modifyAcceleration(World worldIn, BlockPos pos, Entity entityIn, Vec3d motion)
	{
		return motion.crossProduct(new Vec3d(0.75, 1, 0.75));
	}
	
	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return false;
	}

	//was in original net.minecraft BlockLeaves. allows light through (normalcube does the same)
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

    @Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		// TODO Auto-generated method stub
		return false;
	}
}