package alas.sadnutmaterials.init;

import java.util.ArrayList;
import java.util.List;

import alas.sadnutmaterials.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//metal ores
	public static final Block BISMUTHINITE_ORE_BLOCK = new BlockBase("bismuthinite_ore_block", Material.ROCK);
	public static final Block CASSITERITE_ORE_BLOCK = new BlockBase("cassiterite_ore_block", Material.ROCK);
	public static final Block GARNIERITE_ORE_BLOCK = new BlockBase("garnierite_ore_block", Material.ROCK);
	public static final Block HEMATITE_ORE_BLOCK = new BlockBase("hematite_ore_block", Material.ROCK);
	public static final Block LIMONITE_ORE_BLOCK = new BlockBase("limonite_ore_block", Material.ROCK);
	public static final Block MAGNETITE_ORE_BLOCK = new BlockBase("magnetite_ore_block", Material.ROCK);
	public static final Block MALACHITE_ORE_BLOCK = new BlockBase("malachite_ore_block", Material.ROCK);
	public static final Block NATIVE_COPPER_ORE_BLOCK = new BlockBase("native_copper_ore_block", Material.ROCK);
	public static final Block NATIVE_GOLD_ORE_BLOCK = new BlockBase("native_gold_ore_block", Material.ROCK);
	public static final Block NATIVE_SILVER_ORE_BLOCK = new BlockBase("native_silver_ore_block", Material.ROCK);
	public static final Block SPHALERITE_ORE_BLOCK = new BlockBase("sphalerite_ore_block", Material.ROCK);
	public static final Block TETRAHEDRITE_ORE_BLOCK = new BlockBase("tetrahedrite_ore_block", Material.ROCK);
	
	//nonmetal ores
	public static final Block BITUMINOUS_COAL_ORE_BLOCK = new BlockBase("bituminous_coal_ore_block", Material.ROCK);
	public static final Block BORAX_ORE_BLOCK = new BlockBase("borax_ore_block", Material.ROCK);
	public static final Block CINNABAR_ORE_BLOCK = new BlockBase("cinnabar_ore_block", Material.ROCK);
	public static final Block CRYOLITE_ORE_BLOCK = new BlockBase("cryolite_ore_block", Material.ROCK);
	public static final Block GRAPHITE_ORE_BLOCK = new BlockBase("graphite_ore_block", Material.ROCK);
	public static final Block KAOLINITE_ORE_BLOCK = new BlockBase("kaolinite_ore_block", Material.ROCK);
	public static final Block KIMBERLITE_ORE_BLOCK = new BlockBase("kimberlite_ore_block", Material.ROCK);
	public static final Block LAPIS_LAZULI_ORE_BLOCK = new BlockBase("lapis_lazuli_ore_block", Material.ROCK);
	public static final Block LIGNITE_ORE_BLOCK = new BlockBase("lignite_ore_block", Material.ROCK);
	public static final Block SALTPETER_ORE_BLOCK = new BlockBase("saltpeter_ore_block", Material.ROCK);
	public static final Block SULFUR_ORE_BLOCK = new BlockBase("sulfur_ore_block", Material.ROCK);
	public static final Block SYLVITE_ORE_BLOCK = new BlockBase("sylvite_ore_block", Material.ROCK);
	
	//useless ores
	public static final Block GALENA_ORE_BLOCK = new BlockBase("galena_ore_block", Material.ROCK);
	public static final Block NATIVE_PLATINUM_ORE_BLOCK = new BlockBase("native_platinum_ore_block", Material.ROCK);
	public static final Block GYPSUM_ORE_BLOCK = new BlockBase("gypsum_ore_block", Material.ROCK);
	public static final Block JET_ORE_BLOCK = new BlockBase("jet_ore_block", Material.ROCK);
	public static final Block PITCHBLENDE_ORE_BLOCK = new BlockBase("pitchblende_ore_block", Material.ROCK);
}
