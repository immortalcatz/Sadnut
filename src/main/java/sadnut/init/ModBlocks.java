package sadnut.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import sadnut.blocks.BlockBase;
import sadnut.blocks.LeavesBase;
import sadnut.blocks.LogBase;
import sadnut.blocks.StoneBase;
import sadnut.blocks.gravity.DirtBase;
import sadnut.blocks.gravity.GravelBase;
import sadnut.blocks.gravity.GravityBlockBase;
import sadnut.blocks.gravity.SandBase;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//raw sedimentary rocks
	public static final Block RAW_CHALK_BLOCK = new StoneBase("raw_chalk_block", Material.ROCK);
	public static final Block RAW_CHERT_BLOCK = new StoneBase("raw_chert_block", Material.ROCK);
	public static final Block RAW_CLAYSTONE_BLOCK = new StoneBase("raw_claystone_block", Material.ROCK);
	public static final Block RAW_CONGLOMERATE_BLOCK = new StoneBase("raw_conglomerate_block", Material.ROCK);
	public static final Block RAW_DOLOMITE_BLOCK = new StoneBase("raw_dolomite_block", Material.ROCK);
	public static final Block RAW_LIMESTONE_BLOCK = new StoneBase("raw_limestone_block", Material.ROCK);
	public static final Block RAW_ROCK_SALT_BLOCK = new StoneBase("raw_rock_salt_block", Material.ROCK);
	public static final Block RAW_SHALE_BLOCK = new StoneBase("raw_shale_block", Material.ROCK);

	//raw metamorphic rocks
	public static final Block RAW_GNEISS_BLOCK = new StoneBase("raw_gneiss_block", Material.ROCK);
	public static final Block RAW_MARBLE_BLOCK = new StoneBase("raw_marble_block", Material.ROCK);
	public static final Block RAW_PHYLLITE_BLOCK = new StoneBase("raw_phyllite_block", Material.ROCK);
	public static final Block RAW_QUARTZITE_BLOCK = new StoneBase("raw_quartzite_block", Material.ROCK);
	public static final Block RAW_SCHIST_BLOCK = new StoneBase("raw_schist_block", Material.ROCK);
	public static final Block RAW_SLATE_BLOCK = new StoneBase("raw_slate_block", Material.ROCK);

	//raw igneous intrusive rocks
	public static final Block RAW_DIORITE_BLOCK = new StoneBase("raw_diorite_block", Material.ROCK);
	public static final Block RAW_GABBRO_BLOCK = new StoneBase("raw_gabbro_block", Material.ROCK);
	public static final Block RAW_GRANITE_BLOCK = new StoneBase("raw_granite_block", Material.ROCK);

	//raw igneous extrusive rocks
	public static final Block RAW_ANDESITE_BLOCK = new StoneBase("raw_andesite_block", Material.ROCK);
	public static final Block RAW_BASALT_BLOCK = new StoneBase("raw_basalt_block", Material.ROCK);
	public static final Block RAW_DACITE_BLOCK = new StoneBase("raw_dacite_block", Material.ROCK);
	public static final Block RAW_RHYOLITE_BLOCK = new StoneBase("raw_rhyolite_block", Material.ROCK);
	
	//cobble sedimentary rocks
	public static final Block COBBLE_CHALK_BLOCK = new BlockBase("cobble_chalk_block", Material.ROCK);
	public static final Block COBBLE_CHERT_BLOCK = new BlockBase("cobble_chert_block", Material.ROCK);
	public static final Block COBBLE_CLAYSTONE_BLOCK = new BlockBase("cobble_claystone_block", Material.ROCK);
	public static final Block COBBLE_CONGLOMERATE_BLOCK = new BlockBase("cobble_conglomerate_block", Material.ROCK);
	public static final Block COBBLE_DOLOMITE_BLOCK = new BlockBase("cobble_dolomite_block", Material.ROCK);
	public static final Block COBBLE_LIMESTONE_BLOCK = new BlockBase("cobble_limestone_block", Material.ROCK);
	public static final Block COBBLE_ROCK_SALT_BLOCK = new BlockBase("cobble_rock_salt_block", Material.ROCK);
	public static final Block COBBLE_SHALE_BLOCK = new BlockBase("cobble_shale_block", Material.ROCK);
	
	//cobble metamorphic rocks
	public static final Block COBBLE_GNEISS_BLOCK = new BlockBase("cobble_gneiss_block", Material.ROCK);
	public static final Block COBBLE_MARBLE_BLOCK = new BlockBase("cobble_marble_block", Material.ROCK);
	public static final Block COBBLE_PHYLLITE_BLOCK = new BlockBase("cobble_phyllite_block", Material.ROCK);
	public static final Block COBBLE_QUARTZITE_BLOCK = new BlockBase("cobble_quartzite_block", Material.ROCK);
	public static final Block COBBLE_SCHIST_BLOCK = new BlockBase("cobble_schist_block", Material.ROCK);
	public static final Block COBBLE_SLATE_BLOCK = new BlockBase("cobble_slate_block", Material.ROCK);
	
	//cobble igneous intrusive rocks
	public static final Block COBBLE_DIORITE_BLOCK = new BlockBase("cobble_diorite_block", Material.ROCK);
	public static final Block COBBLE_GABBRO_BLOCK = new BlockBase("cobble_gabbro_block", Material.ROCK);
	public static final Block COBBLE_GRANITE_BLOCK = new BlockBase("cobble_granite_block", Material.ROCK);
	
	//cobble igneous extrusive rocks
	public static final Block COBBLE_ANDESITE_BLOCK = new BlockBase("cobble_andesite_block", Material.ROCK);
	public static final Block COBBLE_BASALT_BLOCK = new BlockBase("cobble_basalt_block", Material.ROCK);
	public static final Block COBBLE_DACITE_BLOCK = new BlockBase("cobble_dacite_block", Material.ROCK);
	public static final Block COBBLE_RHYOLITE_BLOCK = new BlockBase("cobble_rhyolite_block", Material.ROCK);
	
	//polished sedimentary rocks
	public static final Block POLISHED_CHALK_BLOCK = new BlockBase("polished_chalk_block", Material.ROCK);
	public static final Block POLISHED_CHERT_BLOCK = new BlockBase("polished_chert_block", Material.ROCK);
	public static final Block POLISHED_CLAYSTONE_BLOCK = new BlockBase("polished_claystone_block", Material.ROCK);
	public static final Block POLISHED_CONGLOMERATE_BLOCK = new BlockBase("polished_conglomerate_block", Material.ROCK);
	public static final Block POLISHED_DOLOMITE_BLOCK = new BlockBase("polished_dolomite_block", Material.ROCK);
	public static final Block POLISHED_LIMESTONE_BLOCK = new BlockBase("polished_limestone_block", Material.ROCK);
	public static final Block POLISHED_ROCK_SALT_BLOCK = new BlockBase("polished_rock_salt_block", Material.ROCK);
	public static final Block POLISHED_SHALE_BLOCK = new BlockBase("polished_shale_block", Material.ROCK);

	//polished metamorphic rocks
	public static final Block POLISHED_GNEISS_BLOCK = new BlockBase("polished_gneiss_block", Material.ROCK);
	public static final Block POLISHED_MARBLE_BLOCK = new BlockBase("polished_marble_block", Material.ROCK);
	public static final Block POLISHED_PHYLLITE_BLOCK = new BlockBase("polished_phyllite_block", Material.ROCK);
	public static final Block POLISHED_QUARTZITE_BLOCK = new BlockBase("polished_quartzite_block", Material.ROCK);
	public static final Block POLISHED_SCHIST_BLOCK = new BlockBase("polished_schist_block", Material.ROCK);
	public static final Block POLISHED_SLATE_BLOCK = new BlockBase("polished_slate_block", Material.ROCK);
	
	//polished igneous intrusive rocks
	public static final Block POLISHED_DIORITE_BLOCK = new BlockBase("polished_diorite_block", Material.ROCK);
	public static final Block POLISHED_GABBRO_BLOCK = new BlockBase("polished_gabbro_block", Material.ROCK);
	public static final Block POLISHED_GRANITE_BLOCK = new BlockBase("polished_granite_block", Material.ROCK);
	
	//polished igneous extrusive rocks
	public static final Block POLISHED_ANDESITE_BLOCK = new BlockBase("polished_andesite_block", Material.ROCK);
	public static final Block POLISHED_BASALT_BLOCK = new BlockBase("polished_basalt_block", Material.ROCK);
	public static final Block POLISHED_DACITE_BLOCK = new BlockBase("polished_dacite_block", Material.ROCK);
	public static final Block POLISHED_RHYOLITE_BLOCK = new BlockBase("polished_rhyolite_block", Material.ROCK);
	  
	//brick sedimentary rocks
	public static final Block CHALK_BRICK = new BlockBase("chalk_brick", Material.ROCK);
	public static final Block CHERT_BRICK = new BlockBase("chert_brick", Material.ROCK);
	public static final Block CLAYSTONE_BRICK = new BlockBase("claystone_brick", Material.ROCK);
	public static final Block CONGLOMERATE_BRICK = new BlockBase("conglomerate_brick", Material.ROCK);
	public static final Block DOLOMITE_BRICK = new BlockBase("dolomite_brick", Material.ROCK);
	public static final Block LIMESTONE_BRICK = new BlockBase("limestone_brick", Material.ROCK);
	public static final Block ROCK_SALT_BRICK = new BlockBase("rock_salt_brick", Material.ROCK);
	public static final Block SHALE_BRICK = new BlockBase("shale_brick", Material.ROCK);
	
	//brick metamorphic rocks
	public static final Block GNEISS_BRICK = new BlockBase("gneiss_brick", Material.ROCK);
	public static final Block MARBLE_BRICK = new BlockBase("marble_brick", Material.ROCK);
	public static final Block PHYLLITE_BRICK = new BlockBase("phyllite_brick", Material.ROCK);
	public static final Block QUARTZITE_BRICK = new BlockBase("quartzite_brick", Material.ROCK);
	public static final Block SCHIST_BRICK = new BlockBase("schist_brick", Material.ROCK);
	public static final Block SLATE_BRICK = new BlockBase("slate_brick", Material.ROCK);
	
	//brick igneous intrusive rocks
	public static final Block DIORITE_BRICK = new BlockBase("diorite_brick", Material.ROCK);
	public static final Block GABBRO_BRICK = new BlockBase("gabbro_brick", Material.ROCK);
	public static final Block GRANITE_BRICK = new BlockBase("granite_brick", Material.ROCK);
	
	//brick igneous extrusive rocks
	public static final Block ANDESITE_BRICK = new BlockBase("andesite_brick", Material.ROCK);
	public static final Block BASALT_BRICK = new BlockBase("basalt_brick", Material.ROCK);
	public static final Block DACITE_BRICK = new BlockBase("dacite_brick", Material.ROCK);
	public static final Block RHYOLITE_BRICK = new BlockBase("rhyolite_brick", Material.ROCK);
	
	//dirt sedimentary rocks
	public static final Block CHALK_DIRT = new DirtBase("chalk_dirt", Material.GROUND);
	public static final Block CHERT_DIRT = new DirtBase("chert_dirt", Material.GROUND);
	public static final Block CLAYSTONE_DIRT = new DirtBase("claystone_dirt", Material.GROUND);
	public static final Block CONGLOMERATE_DIRT = new DirtBase("conglomerate_dirt", Material.GROUND);
	public static final Block DOLOMITE_DIRT = new DirtBase("dolomite_dirt", Material.GROUND);
	public static final Block LIMESTONE_DIRT = new DirtBase("limestone_dirt", Material.GROUND);
	public static final Block DIRT_SALT_DIRT = new DirtBase("rock_salt_dirt", Material.GROUND);
	public static final Block SHALE_DIRT = new DirtBase("shale_dirt", Material.GROUND);

	//dirt metamorphic rocks
	public static final Block GNEISS_DIRT = new DirtBase("gneiss_dirt", Material.GROUND);
	public static final Block MARBLE_DIRT = new DirtBase("marble_dirt", Material.GROUND);
	public static final Block PHYLLITE_DIRT = new DirtBase("phyllite_dirt", Material.GROUND);
	public static final Block QUARTZITE_DIRT = new DirtBase("quartzite_dirt", Material.GROUND);
	public static final Block SCHIST_DIRT = new DirtBase("schist_dirt", Material.GROUND);
	public static final Block SLATE_DIRT = new DirtBase("slate_dirt", Material.GROUND);

	//dirt igneous intrusive rocks
	public static final Block DIORITE_DIRT = new DirtBase("diorite_dirt", Material.GROUND);
	public static final Block GABBRO_DIRT = new DirtBase("gabbro_dirt", Material.GROUND);
	public static final Block GRANITE_DIRT = new DirtBase("granite_dirt", Material.GROUND);

	//dirt igneous extrusive rocks
	public static final Block ANDESITE_DIRT = new DirtBase("andesite_dirt", Material.GROUND);
	public static final Block BASALT_DIRT = new DirtBase("basalt_dirt", Material.GROUND);
	public static final Block DACITE_DIRT = new DirtBase("dacite_dirt", Material.GROUND);
	public static final Block RHYOLITE_DIRT = new DirtBase("rhyolite_dirt", Material.GROUND);


	//gravel sedimentary rocks
	public static final Block CHALK_GRAVEL = new GravelBase("chalk_gravel", Material.GROUND);
	public static final Block CHERT_GRAVEL = new GravelBase("chert_gravel", Material.GROUND);
	public static final Block CLAYSTONE_GRAVEL = new GravelBase("claystone_gravel", Material.GROUND);
	public static final Block CONGLOMERATE_GRAVEL = new GravelBase("conglomerate_gravel", Material.GROUND);
	public static final Block DOLOMITE_GRAVEL = new GravelBase("dolomite_gravel", Material.GROUND);
	public static final Block LIMESTONE_GRAVEL = new GravelBase("limestone_gravel", Material.GROUND);
	public static final Block GRAVEL_SALT_GRAVEL = new GravelBase("rock_salt_gravel", Material.GROUND);
	public static final Block SHALE_GRAVEL = new GravelBase("shale_gravel", Material.GROUND);

	//gravel metamorphic rocks
	public static final Block GNEISS_GRAVEL = new GravelBase("gneiss_gravel", Material.GROUND);
	public static final Block MARBLE_GRAVEL = new GravelBase("marble_gravel", Material.GROUND);
	public static final Block PHYLLITE_GRAVEL = new GravelBase("phyllite_gravel", Material.GROUND);
	public static final Block QUARTZITE_GRAVEL = new GravelBase("quartzite_gravel", Material.GROUND);
	public static final Block SCHIST_GRAVEL = new GravelBase("schist_gravel", Material.GROUND);
	public static final Block SLATE_GRAVEL = new GravelBase("slate_gravel", Material.GROUND);

	//gravel igneous intrusive rocks
	public static final Block DIORITE_GRAVEL = new GravelBase("diorite_gravel", Material.GROUND);
	public static final Block GABBRO_GRAVEL = new GravelBase("gabbro_gravel", Material.GROUND);
	public static final Block GRANITE_GRAVEL = new GravelBase("granite_gravel", Material.GROUND);

	//gravel igneous extrusive rocks
	public static final Block ANDESITE_GRAVEL = new GravelBase("andesite_gravel", Material.GROUND);
	public static final Block BASALT_GRAVEL = new GravelBase("basalt_gravel", Material.GROUND);
	public static final Block DACITE_GRAVEL = new GravelBase("dacite_gravel", Material.GROUND);
	public static final Block RHYOLITE_GRAVEL = new GravelBase("rhyolite_gravel", Material.GROUND);
	
	//sand sedimentary rocks
	public static final Block CHALK_SAND = new SandBase("chalk_sand", Material.GROUND);
	public static final Block CHERT_SAND = new SandBase("chert_sand", Material.GROUND);
	public static final Block CLAYSTONE_SAND = new SandBase("claystone_sand", Material.GROUND);
	public static final Block CONGLOMERATE_SAND = new SandBase("conglomerate_sand", Material.GROUND);
	public static final Block DOLOMITE_SAND = new SandBase("dolomite_sand", Material.GROUND);
	public static final Block LIMESTONE_SAND = new SandBase("limestone_sand", Material.GROUND);
	public static final Block SAND_SALT_SAND = new SandBase("rock_salt_sand", Material.GROUND);
	public static final Block SHALE_SAND = new SandBase("shale_sand", Material.GROUND);

	//sand metamorphic rocks
	public static final Block GNEISS_SAND = new SandBase("gneiss_sand", Material.GROUND);
	public static final Block MARBLE_SAND = new SandBase("marble_sand", Material.GROUND);
	public static final Block PHYLLITE_SAND = new SandBase("phyllite_sand", Material.GROUND);
	public static final Block QUARTZITE_SAND = new SandBase("quartzite_sand", Material.GROUND);
	public static final Block SCHIST_SAND = new SandBase("schist_sand", Material.GROUND);
	public static final Block SLATE_SAND = new SandBase("slate_sand", Material.GROUND);

	//sand igneous intrusive rocks
	public static final Block DIORITE_SAND = new SandBase("diorite_sand", Material.GROUND);
	public static final Block GABBRO_SAND = new SandBase("gabbro_sand", Material.GROUND);
	public static final Block GRANITE_SAND = new SandBase("granite_sand", Material.GROUND);

	//sand igneous extrusive rocks
	public static final Block ANDESITE_SAND = new SandBase("andesite_sand", Material.GROUND);
	public static final Block BASALT_SAND = new SandBase("basalt_sand", Material.GROUND);
	public static final Block DACITE_SAND = new SandBase("dacite_sand", Material.GROUND);
	public static final Block RHYOLITE_SAND = new SandBase("rhyolite_sand", Material.GROUND);
	
	
	
	
	
	
	
	
	
	
	//logs
	public static final Block ACACIA_LOG_BLOCK = new LogBase("acacia_log_block", Material.WOOD);
	public static final Block ASH_LOG_BLOCK = new LogBase("ash_log_block", Material.WOOD);
	public static final Block ASPEN_LOG_BLOCK = new LogBase("aspen_log_block", Material.WOOD);
	public static final Block BIRCH_LOG_BLOCK = new LogBase("birch_log_block", Material.WOOD);
	public static final Block CHESTNUT_LOG_BLOCK = new LogBase("chestnut_log_block", Material.WOOD);
	public static final Block DOUGLAS_FIR_LOG_BLOCK = new LogBase("douglas_fir_log_block", Material.WOOD);
	public static final Block HICKORY_LOG_BLOCK = new LogBase("hickory_log_block", Material.WOOD);
	public static final Block KAPOK_LOG_BLOCK = new LogBase("kapok_log_block", Material.WOOD);
	public static final Block MAPLE_LOG_BLOCK = new LogBase("maple_log_block", Material.WOOD);
	public static final Block OAK_LOG_BLOCK = new LogBase("oak_log_block", Material.WOOD);
	public static final Block PINE_LOG_BLOCK = new LogBase("pine_log_block", Material.WOOD);
	public static final Block SEQUOIA_LOG_BLOCK = new LogBase("sequoia_log_block", Material.WOOD);
	public static final Block SPRUCE_LOG_BLOCK = new LogBase("spruce_log_block", Material.WOOD);
	public static final Block SYCAMORE_LOG_BLOCK = new LogBase("sycamore_log_block", Material.WOOD);
	public static final Block WHITE_CEDAR_LOG_BLOCK = new LogBase("white_cedar_log_block", Material.WOOD);
	public static final Block WHITE_ELM_LOG_BLOCK = new LogBase("white_elm_log_block", Material.WOOD);
	public static final Block WILLOW_LOG_BLOCK = new LogBase("willow_log_block", Material.WOOD);
	
	//leaves
	public static final Block ACACIA_LEAVES = new LeavesBase("acacia_leaves");
	public static final Block ASH_LEAVES = new LeavesBase("ash_leaves");
	public static final Block ASPEN_LEAVES = new LeavesBase("aspen_leaves");
	public static final Block BIRCH_LEAVES = new LeavesBase("birch_leaves");
	public static final Block CHESTNUT_LEAVES = new LeavesBase("chestnut_leaves");
	public static final Block DOUGLAS_FIR_LEAVES = new LeavesBase("douglas_fir_leaves");
	public static final Block HICKORY_LEAVES = new LeavesBase("hickory_leaves");
	public static final Block KAPOK_LEAVES = new LeavesBase("kapok_leaves");
	public static final Block MAPLE_LEAVES = new LeavesBase("maple_leaves");
	public static final Block OAK_LEAVES = new LeavesBase("oak_leaves");
	public static final Block PINE_LEAVES = new LeavesBase("pine_leaves");
	public static final Block SEQUOIA_LEAVES = new LeavesBase("sequoia_leaves");
	public static final Block SPRUCE_LEAVES = new LeavesBase("spruce_leaves");
	public static final Block SYCAMORE_LEAVES = new LeavesBase("sycamore_leaves");
	public static final Block WHITE_CEDAR_LEAVES = new LeavesBase("white_cedar_leaves");
	public static final Block WHITE_ELM_LEAVES = new LeavesBase("white_elm_leaves");
	public static final Block WILLOW_LEAVES = new LeavesBase("willow_leaves");
}
