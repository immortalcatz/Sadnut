package sadnut.items;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import sadnut.Main;
import sadnut.init.ModBlocks;
import sadnut.init.ModItems;
import sadnut.util.IHasModel;
import sadnut.util.PlayerInfo;
import sadnut.util.PlayerManager;

public class RockItemBase extends Item implements IHasModel{
	public RockItemBase(String name) {
		
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.worldgenTab);
		
		ModItems.LOOSEROCKS.add(this);
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack itemStackIn = playerIn.getHeldItem(handIn);
		if(itemStackIn.getCount() < 2)
		{
			return new ActionResult(EnumActionResult.FAIL, itemStackIn);
		}

		PlayerInfo pi = PlayerManager.getInstance().getPlayerInfoFromPlayer(playerIn);

		pi.specialCraftingType = itemStackIn;
		pi.specialCraftingTypeAlternate = null;
		if(!worldIn.isRemote)
			playerIn.openGui(Main.instance, 0, worldIn, playerIn.getPosition().getX(), playerIn.getPosition().getY(), playerIn.getPosition().getZ());

		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

	
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
