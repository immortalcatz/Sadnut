package sadnut.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sadnut.Main;
import sadnut.init.ModBlocks;
import sadnut.init.ModItems;
import sadnut.util.IHasModel;

public class LeavesBase extends Block implements net.minecraftforge.common.IShearable, IHasModel
{
    protected boolean leavesFancy;
	private boolean isTransparent = true;

    public LeavesBase(String name)
    {
        super(Material.LEAVES);
        
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setTickRandomly(true);
        this.setCreativeTab(Main.worldgenTab);
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
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

    @Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }
    @Override public boolean isLeaves(IBlockState state, IBlockAccess world, BlockPos pos){ return true; }
    
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		return null;
	}

	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
		AxisAlignedBB axisalignedbb = blockState.getBoundingBox(blockAccess, pos);

		switch (side) {
			case DOWN:
				if (axisalignedbb.minY > 0.0D) {
					return true;
				}
				break;
			case UP:
				if (axisalignedbb.maxY < 1.0D) {
					return true;
				}
				break;
			case NORTH:
				if (axisalignedbb.minZ > 0.0D) {
					return true;
				}
				break;
			case SOUTH:
				if (axisalignedbb.maxZ < 1.0D) {
					return true;
				}
				break;
			case WEST:
				if (axisalignedbb.minX > 0.0D) {
					return true;
				}
				break;
			case EAST:
				if (axisalignedbb.maxX < 1.0D) {
					return true;
				}
		}

		return !blockAccess.getBlockState(pos.offset(side)).doesSideBlockRendering(blockAccess, pos.offset(side), side.getOpposite());
}
	
	//fancy rendering
	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos)
	{
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	/**
	 * Pass true to draw this block using fancy graphics, or false for fast graphics.
	 */
	@SideOnly(Side.CLIENT)
	public void setGraphicsLevel(boolean p_150122_1_)
	{
		this.isTransparent = p_150122_1_;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return this.isTransparent ? BlockRenderLayer.CUTOUT_MIPPED : BlockRenderLayer.SOLID;
	}





}