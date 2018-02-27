package sadnut.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import sadnut.items.ItemBase;
import sadnut.items.RockItemBase;
import sadnut.items.tools.ItemAxe;
import sadnut.items.tools.ItemHoe;
import sadnut.items.tools.ItemPickaxe;
import sadnut.items.tools.ItemShovel;
import sadnut.items.tools.ItemSword;
import sadnut.items.tools.ItemToolhead;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
    public static final Item.ToolMaterial bismuthBronzeToolMaterial= EnumHelper.addToolMaterial("BismuthBronze", 2, 1200, 10.0f, 90, 10);
    public static final Item.ToolMaterial blackBronzeToolMaterial= EnumHelper.addToolMaterial("BlackBronze", 2, 1460, 9.0f, 95, 10);
    public static final Item.ToolMaterial blackSteelToolMaterial= EnumHelper.addToolMaterial("BlackSteel", 2, 4200, 16.0f, 205, 12);
    public static final Item.ToolMaterial blueSteelToolMaterial= EnumHelper.addToolMaterial("BlueSteel", 3, 6500, 18.0f, 240, 22);
    public static final Item.ToolMaterial bronzeToolMaterial= EnumHelper.addToolMaterial("Bronze", 2, 1300, 11.0f, 100, 13);
    public static final Item.ToolMaterial copperToolMaterial= EnumHelper.addToolMaterial("Copper", 2, 600, 8.0f, 4, 8);
    public static final Item.ToolMaterial redSteelToolMaterial= EnumHelper.addToolMaterial("RedSteel", 3, 6500, 18.0f, 240, 22);
    public static final Item.ToolMaterial steelToolMaterial= EnumHelper.addToolMaterial("Steel", 2, 3300, 14.0f, 170, 10);
    public static final Item.ToolMaterial wroughtIronToolMaterial= EnumHelper.addToolMaterial("WroughtIron", 2, 600, 12.0f, 135, 10);

  //toolheads
    public static final Item BISMUTH_BRONZE_PICK_HEAD = new ItemToolhead("bismuth_bronze_pick_head");
    public static final Item BLACK_BRONZE_PICK_HEAD = new ItemToolhead("black_bronze_pick_head");
    public static final Item BLACK_STEEL_PICK_HEAD = new ItemToolhead("black_steel_pick_head");
    public static final Item BLUE_STEEL_PICK_HEAD = new ItemToolhead("blue_steel_pick_head");
    public static final Item BRONZE_PICK_HEAD = new ItemToolhead("bronze_pick_head");
    public static final Item COPPER_PICK_HEAD = new ItemToolhead("copper_pick_head");
    public static final Item RED_STEEL_PICK_HEAD = new ItemToolhead("red_steel_pick_head");
    public static final Item STEEL_PICK_HEAD = new ItemToolhead("steel_pick_head");
    public static final Item WROUGHT_IRON_PICK_HEAD = new ItemToolhead("wrought_iron_pick_head");

    public static final Item BISMUTH_BRONZE_AXE_HEAD = new ItemToolhead("bismuth_bronze_axe_head");
    public static final Item BLACK_BRONZE_AXE_HEAD = new ItemToolhead("black_bronze_axe_head");
    public static final Item BLACK_STEEL_AXE_HEAD = new ItemToolhead("black_steel_axe_head");
    public static final Item BLUE_STEEL_AXE_HEAD = new ItemToolhead("blue_steel_axe_head");
    public static final Item BRONZE_AXE_HEAD = new ItemToolhead("bronze_axe_head");
    public static final Item COPPER_AXE_HEAD = new ItemToolhead("copper_axe_head");
    public static final Item RED_STEEL_AXE_HEAD = new ItemToolhead("red_steel_axe_head");
    public static final Item STEEL_AXE_HEAD = new ItemToolhead("steel_axe_head");
    public static final Item WROUGHT_IRON_AXE_HEAD = new ItemToolhead("wrought_iron_axe_head");

    public static final Item BISMUTH_BRONZE_HOE_HEAD = new ItemToolhead("bismuth_bronze_hoe_head");
    public static final Item BLACK_BRONZE_HOE_HEAD = new ItemToolhead("black_bronze_hoe_head");
    public static final Item BLACK_STEEL_HOE_HEAD = new ItemToolhead("black_steel_hoe_head");
    public static final Item BLUE_STEEL_HOE_HEAD = new ItemToolhead("blue_steel_hoe_head");
    public static final Item BRONZE_HOE_HEAD = new ItemToolhead("bronze_hoe_head");
    public static final Item COPPER_HOE_HEAD = new ItemToolhead("copper_hoe_head");
    public static final Item RED_STEEL_HOE_HEAD = new ItemToolhead("red_steel_hoe_head");
    public static final Item STEEL_HOE_HEAD = new ItemToolhead("steel_hoe_head");
    public static final Item WROUGHT_IRON_HOE_HEAD = new ItemToolhead("wrought_iron_hoe_head");

    public static final Item BISMUTH_BRONZE_SHOVEL_HEAD = new ItemToolhead("bismuth_bronze_shovel_head");
    public static final Item BLACK_BRONZE_SHOVEL_HEAD = new ItemToolhead("black_bronze_shovel_head");
    public static final Item BLACK_STEEL_SHOVEL_HEAD = new ItemToolhead("black_steel_shovel_head");
    public static final Item BLUE_STEEL_SHOVEL_HEAD = new ItemToolhead("blue_steel_shovel_head");
    public static final Item BRONZE_SHOVEL_HEAD = new ItemToolhead("bronze_shovel_head");
    public static final Item COPPER_SHOVEL_HEAD = new ItemToolhead("copper_shovel_head");
    public static final Item RED_STEEL_SHOVEL_HEAD = new ItemToolhead("red_steel_shovel_head");
    public static final Item STEEL_SHOVEL_HEAD = new ItemToolhead("steel_shovel_head");
    public static final Item WROUGHT_IRON_SHOVEL_HEAD = new ItemToolhead("wrought_iron_shovel_head");

    public static final Item BISMUTH_BRONZE_SWORD_BLADE = new ItemToolhead("bismuth_bronze_sword_blade");
    public static final Item BLACK_BRONZE_SWORD_BLADE = new ItemToolhead("black_bronze_sword_blade");
    public static final Item BLACK_STEEL_SWORD_BLADE = new ItemToolhead("black_steel_sword_blade");
    public static final Item BLUE_STEEL_SWORD_BLADE = new ItemToolhead("blue_steel_sword_blade");
    public static final Item BRONZE_SWORD_BLADE = new ItemToolhead("bronze_sword_blade");
    public static final Item COPPER_SWORD_BLADE = new ItemToolhead("copper_sword_blade");
    public static final Item RED_STEEL_SWORD_BLADE = new ItemToolhead("red_steel_sword_blade");
    public static final Item STEEL_SWORD_BLADE = new ItemToolhead("steel_sword_blade");
    public static final Item WROUGHT_IRON_SWORD_BLADE = new ItemToolhead("wrought_iron_sword_blade");

    //picks
	public static final Item BISMUTH_BRONZE_PICK = new ItemPickaxe(bismuthBronzeToolMaterial, "bismuth_bronze_pick");
	public static final Item BLACK_BRONZE_PICK = new ItemPickaxe(blackBronzeToolMaterial, "black_bronze_pick");
	public static final Item BLACK_STEEL_PICK = new ItemPickaxe(blackSteelToolMaterial, "black_steel_pick");
	public static final Item BLUE_STEEL_PICK = new ItemPickaxe(blueSteelToolMaterial, "blue_steel_pick");
	public static final Item BRONZE_PICK = new ItemPickaxe(bronzeToolMaterial, "bronze_pick");
	public static final Item COPPER_PICK = new ItemPickaxe(copperToolMaterial, "copper_pick");
	public static final Item RED_STEEL_PICK = new ItemPickaxe(redSteelToolMaterial, "red_steel_pick");
	public static final Item STEEL_PICK = new ItemPickaxe(steelToolMaterial, "steel_pick");
	public static final Item WROUGHT_IRON_PICK = new ItemPickaxe(wroughtIronToolMaterial, "wrought_iron_pick");

	//axes
    public static final Item BISMUTH_BRONZE_AXE = new ItemAxe(bismuthBronzeToolMaterial, "bismuth_bronze_axe");
    public static final Item BLACK_BRONZE_AXE = new ItemAxe(blackBronzeToolMaterial, "black_bronze_axe");
    public static final Item BLACK_STEEL_AXE = new ItemAxe(blackSteelToolMaterial, "black_steel_axe");
    public static final Item BLUE_STEEL_AXE = new ItemAxe(blueSteelToolMaterial, "blue_steel_axe");
    public static final Item BRONZE_AXE = new ItemAxe(bronzeToolMaterial, "bronze_axe");
    public static final Item COPPER_AXE = new ItemAxe(copperToolMaterial, "copper_axe");
    public static final Item RED_STEEL_AXE = new ItemAxe(redSteelToolMaterial, "red_steel_axe");
    public static final Item STEEL_AXE = new ItemAxe(steelToolMaterial, "steel_axe");
    public static final Item WROUGHT_IRON_AXE = new ItemAxe(wroughtIronToolMaterial, "wrought_iron_axe");

    //shovels
    public static final Item BISMUTH_BRONZE_SHOVEL = new ItemShovel(bismuthBronzeToolMaterial, "bismuth_bronze_shovel");
    public static final Item BLACK_BRONZE_SHOVEL = new ItemShovel(blackBronzeToolMaterial, "black_bronze_shovel");
    public static final Item BLACK_STEEL_SHOVEL = new ItemShovel(blackSteelToolMaterial, "black_steel_shovel");
    public static final Item BLUE_STEEL_SHOVEL = new ItemShovel(blueSteelToolMaterial, "blue_steel_shovel");
    public static final Item BRONZE_SHOVEL = new ItemShovel(bronzeToolMaterial, "bronze_shovel");
    public static final Item COPPER_SHOVEL = new ItemShovel(copperToolMaterial, "copper_shovel");
    public static final Item RED_STEEL_SHOVEL = new ItemShovel(redSteelToolMaterial, "red_steel_shovel");
    public static final Item STEEL_SHOVEL = new ItemShovel(steelToolMaterial, "steel_shovel");
    public static final Item WROUGHT_IRON_SHOVEL = new ItemShovel(wroughtIronToolMaterial, "wrought_iron_shovel");

    //hoes
    public static final Item BISMUTH_BRONZE_HOE = new ItemHoe(bismuthBronzeToolMaterial, "bismuth_bronze_hoe");
    public static final Item BLACK_BRONZE_HOE = new ItemHoe(blackBronzeToolMaterial, "black_bronze_hoe");
    public static final Item BLACK_STEEL_HOE = new ItemHoe(blackSteelToolMaterial, "black_steel_hoe");
    public static final Item BLUE_STEEL_HOE = new ItemHoe(blueSteelToolMaterial, "blue_steel_hoe");
    public static final Item BRONZE_HOE = new ItemHoe(bronzeToolMaterial, "bronze_hoe");
    public static final Item COPPER_HOE = new ItemHoe(copperToolMaterial, "copper_hoe");
    public static final Item RED_STEEL_HOE = new ItemHoe(redSteelToolMaterial, "red_steel_hoe");
    public static final Item STEEL_HOE = new ItemHoe(steelToolMaterial, "steel_hoe");
    public static final Item WROUGHT_IRON_HOE = new ItemHoe(wroughtIronToolMaterial, "wrought_iron_hoe");

    //swords
    public static final Item BISMUTH_BRONZE_SWORD = new ItemSword(bismuthBronzeToolMaterial, "bismuth_bronze_sword");
    public static final Item BLACK_BRONZE_SWORD = new ItemSword(blackBronzeToolMaterial, "black_bronze_sword");
    public static final Item BLACK_STEEL_SWORD = new ItemSword(blackSteelToolMaterial, "black_steel_sword");
    public static final Item BLUE_STEEL_SWORD = new ItemSword(blueSteelToolMaterial, "blue_steel_sword");
    public static final Item BRONZE_SWORD = new ItemSword(bronzeToolMaterial, "bronze_sword");
    public static final Item COPPER_SWORD = new ItemSword(copperToolMaterial, "copper_sword");
    public static final Item RED_STEEL_SWORD = new ItemSword(redSteelToolMaterial, "red_steel_sword");
    public static final Item STEEL_SWORD = new ItemSword(steelToolMaterial, "steel_sword");
    public static final Item WROUGHT_IRON_SWORD = new ItemSword(wroughtIronToolMaterial, "wrought_iron_sword");
	
    //ingots
	public static final Item BISMUTH_BRONZE_INGOT = new ItemBase("bismuth_bronze_ingot");
	public static final Item BISMUTH_INGOT = new ItemBase("bismuth_ingot");
	public static final Item BLACK_BRONZE_INGOT = new ItemBase("black_bronze_ingot");
	public static final Item BLACK_STEEL_INGOT = new ItemBase("black_steel_ingot");
	public static final Item BLUE_STEEL_INGOT = new ItemBase("blue_steel_ingot");
	public static final Item BRASS_INGOT = new ItemBase("brass_ingot");
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item GOLD_INGOT = new ItemBase("gold_ingot");
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
	public static final Item NICKEL_INGOT = new ItemBase("nickel_ingot");
	public static final Item PIG_IRON_INGOT = new ItemBase("pig_iron_ingot");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");
	public static final Item RED_STEEL_INGOT = new ItemBase("red_steel_ingot");
	public static final Item ROSE_GOLD_INGOT = new ItemBase("rose_gold_ingot");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	public static final Item STERLING_SILVER_INGOT = new ItemBase("sterling_silver_ingot");
	public static final Item TIN_INGOT = new ItemBase("tin_ingot");
	public static final Item UNKNOWN_INGOT = new ItemBase("unknown_ingot");
	public static final Item WROUGHT_IRON_INGOT = new ItemBase("wrought_iron_ingot");
	public static final Item ZINC_INGOT = new ItemBase("zinc_ingot");
	
	//sheets
	public static final Item BISMUTH_BRONZE_SHEET = new ItemBase("bismuth_bronze_sheet");
	public static final Item BISMUTH_SHEET = new ItemBase("bismuth_sheet");
	public static final Item BLACK_BRONZE_SHEET = new ItemBase("black_bronze_sheet");
	public static final Item BLACK_STEEL_SHEET = new ItemBase("black_steel_sheet");
	public static final Item BLUE_STEEL_SHEET = new ItemBase("blue_steel_sheet");
	public static final Item BRASS_SHEET = new ItemBase("brass_sheet");
	public static final Item BRONZE_SHEET = new ItemBase("bronze_sheet");
	public static final Item COPPER_SHEET = new ItemBase("copper_sheet");
	public static final Item GOLD_SHEET = new ItemBase("gold_sheet");
	public static final Item LEAD_SHEET = new ItemBase("lead_sheet");
	public static final Item NICKEL_SHEET = new ItemBase("nickel_sheet");
	public static final Item PIG_IRON_SHEET = new ItemBase("pig_iron_sheet");
	public static final Item PLATINUM_SHEET = new ItemBase("platinum_sheet");
	public static final Item RED_STEEL_SHEET = new ItemBase("red_steel_sheet");
	public static final Item ROSE_GOLD_SHEET = new ItemBase("rose_gold_sheet");
	public static final Item SILVER_SHEET = new ItemBase("silver_sheet");
	public static final Item STEEL_SHEET = new ItemBase("steel_sheet");
	public static final Item STERLING_SILVER_SHEET = new ItemBase("sterling_silver_sheet");
	public static final Item TIN_SHEET = new ItemBase("tin_sheet");
	public static final Item WROUGHT_IRON_SHEET = new ItemBase("wrought_iron_sheet");
	public static final Item ZINC_SHEET = new ItemBase("zinc_sheet");
	
	//double ingots
	public static final Item BISMUTH_BRONZE_DOUBLE_INGOT = new ItemBase("bismuth_bronze_double_ingot");
	public static final Item BISMUTH_DOUBLE_INGOT = new ItemBase("bismuth_double_ingot");
	public static final Item BLACK_BRONZE_DOUBLE_INGOT = new ItemBase("black_bronze_double_ingot");
	public static final Item BLACK_STEEL_DOUBLE_INGOT = new ItemBase("black_steel_double_ingot");
	public static final Item BLUE_STEEL_DOUBLE_INGOT = new ItemBase("blue_steel_double_ingot");
	public static final Item BRASS_DOUBLE_INGOT = new ItemBase("brass_double_ingot");
	public static final Item BRONZE_DOUBLE_INGOT = new ItemBase("bronze_double_ingot");
	public static final Item COPPER_DOUBLE_INGOT = new ItemBase("copper_double_ingot");
	public static final Item GOLD_DOUBLE_INGOT = new ItemBase("gold_double_ingot");
	public static final Item LEAD_DOUBLE_INGOT = new ItemBase("lead_double_ingot");
	public static final Item NICKEL_DOUBLE_INGOT = new ItemBase("nickel_double_ingot");
	public static final Item PIG_IRON_DOUBLE_INGOT = new ItemBase("pig_iron_double_ingot");
	public static final Item PLATINUM_DOUBLE_INGOT = new ItemBase("platinum_double_ingot");
	public static final Item RED_STEEL_DOUBLE_INGOT = new ItemBase("red_steel_double_ingot");
	public static final Item ROSE_GOLD_DOUBLE_INGOT = new ItemBase("rose_gold_double_ingot");
	public static final Item SILVER_DOUBLE_INGOT = new ItemBase("silver_double_ingot");
	public static final Item STEEL_DOUBLE_INGOT = new ItemBase("steel_double_ingot");
	public static final Item STERLING_SILVER_DOUBLE_INGOT = new ItemBase("sterling_silver_double_ingot");
	public static final Item TIN_DOUBLE_INGOT = new ItemBase("tin_double_ingot");
	public static final Item WROUGHT_IRON_DOUBLE_INGOT = new ItemBase("wrought_iron_double_ingot");
	public static final Item ZINC_DOUBLE_INGOT = new ItemBase("zinc_double_ingot");
	
	//double sheets
	public static final Item BISMUTH_BRONZE_DOUBLE_SHEET = new ItemBase("bismuth_bronze_double_sheet");
	public static final Item BISMUTH_DOUBLE_SHEET = new ItemBase("bismuth_double_sheet");
	public static final Item BLACK_BRONZE_DOUBLE_SHEET = new ItemBase("black_bronze_double_sheet");
	public static final Item BLACK_STEEL_DOUBLE_SHEET = new ItemBase("black_steel_double_sheet");
	public static final Item BLUE_STEEL_DOUBLE_SHEET = new ItemBase("blue_steel_double_sheet");
	public static final Item BRASS_DOUBLE_SHEET = new ItemBase("brass_double_sheet");
	public static final Item BRONZE_DOUBLE_SHEET = new ItemBase("bronze_double_sheet");
	public static final Item COPPER_DOUBLE_SHEET = new ItemBase("copper_double_sheet");
	public static final Item GOLD_DOUBLE_SHEET = new ItemBase("gold_double_sheet");
	public static final Item LEAD_DOUBLE_SHEET = new ItemBase("lead_double_sheet");
	public static final Item NICKEL_DOUBLE_SHEET = new ItemBase("nickel_double_sheet");
	public static final Item PIG_IRON_DOUBLE_SHEET = new ItemBase("pig_iron_double_sheet");
	public static final Item PLATINUM_DOUBLE_SHEET = new ItemBase("platinum_double_sheet");
	public static final Item RED_STEEL_DOUBLE_SHEET = new ItemBase("red_steel_double_sheet");
	public static final Item ROSE_GOLD_DOUBLE_SHEET = new ItemBase("rose_gold_double_sheet");
	public static final Item SILVER_DOUBLE_SHEET = new ItemBase("silver_double_sheet");
	public static final Item STEEL_DOUBLE_SHEET = new ItemBase("steel_double_sheet");
	public static final Item STERLING_SILVER_DOUBLE_SHEET = new ItemBase("sterling_silver_double_sheet");
	public static final Item TIN_DOUBLE_SHEET = new ItemBase("tin_double_sheet");
	public static final Item WROUGHT_IRON_DOUBLE_SHEET = new ItemBase("wrought_iron_double_sheet");
	public static final Item ZINC_DOUBLE_SHEET = new ItemBase("zinc_double_sheet");
	
	//scrap
	public static final Item BISMUTH_BRONZE_SCRAP = new ItemBase("bismuth_bronze_scrap");
	public static final Item BISMUTH_SCRAP = new ItemBase("bismuth_scrap");
	public static final Item BLACK_BRONZE_SCRAP = new ItemBase("black_bronze_scrap");
	public static final Item BLACK_STEEL_SCRAP = new ItemBase("black_steel_scrap");
	public static final Item BLUE_STEEL_SCRAP = new ItemBase("blue_steel_scrap");
	public static final Item BRASS_SCRAP = new ItemBase("brass_scrap");
	public static final Item BRONZE_SCRAP = new ItemBase("bronze_scrap");
	public static final Item COPPER_SCRAP = new ItemBase("copper_scrap");
	public static final Item GOLD_SCRAP = new ItemBase("gold_scrap");
	public static final Item LEAD_SCRAP = new ItemBase("lead_scrap");
	public static final Item NICKEL_SCRAP = new ItemBase("nickel_scrap");
	public static final Item PIG_IRON_SCRAP = new ItemBase("pig_iron_scrap");
	public static final Item PLATINUM_SCRAP = new ItemBase("platinum_scrap");
	public static final Item RED_STEEL_SCRAP = new ItemBase("red_steel_scrap");
	public static final Item ROSE_GOLD_SCRAP = new ItemBase("rose_gold_scrap");
	public static final Item SILVER_SCRAP = new ItemBase("silver_scrap");
	public static final Item STEEL_SCRAP = new ItemBase("steel_scrap");
	public static final Item STERLING_SILVER_SCRAP = new ItemBase("sterling_silver_scrap");
	public static final Item TIN_SCRAP = new ItemBase("tin_scrap");
	public static final Item WROUGHT_IRON_SCRAP = new ItemBase("wrought_iron_scrap");
	public static final Item ZINC_SCRAP = new ItemBase("zinc_scrap");
	
	//unshaped
	public static final Item BISMUTH_BRONZE_UNSHAPED = new ItemBase("bismuth_bronze_unshaped");
	public static final Item BISMUTH_UNSHAPED = new ItemBase("bismuth_unshaped");
	public static final Item BLACK_BRONZE_UNSHAPED = new ItemBase("black_bronze_unshaped");
	public static final Item BLACK_STEEL_UNSHAPED = new ItemBase("black_steel_unshaped");
	public static final Item BLUE_STEEL_UNSHAPED = new ItemBase("blue_steel_unshaped");
	public static final Item BRASS_UNSHAPED = new ItemBase("brass_unshaped");
	public static final Item BRONZE_UNSHAPED = new ItemBase("bronze_unshaped");
	public static final Item COPPER_UNSHAPED = new ItemBase("copper_unshaped");
	public static final Item GOLD_UNSHAPED = new ItemBase("gold_unshaped");
	public static final Item LEAD_UNSHAPED = new ItemBase("lead_unshaped");
	public static final Item NICKEL_UNSHAPED = new ItemBase("nickel_unshaped");
	public static final Item PIG_IRON_UNSHAPED = new ItemBase("pig_iron_unshaped");
	public static final Item PLATINUM_UNSHAPED = new ItemBase("platinum_unshaped");
	public static final Item RED_STEEL_UNSHAPED = new ItemBase("red_steel_unshaped");
	public static final Item ROSE_GOLD_UNSHAPED = new ItemBase("rose_gold_unshaped");
	public static final Item SILVER_UNSHAPED = new ItemBase("silver_unshaped");
	public static final Item STEEL_UNSHAPED = new ItemBase("steel_unshaped");
	public static final Item STERLING_SILVER_UNSHAPED = new ItemBase("sterling_silver_unshaped");
	public static final Item TIN_UNSHAPED = new ItemBase("tin_unshaped");
	public static final Item UNKNOWN_UNSHAPED = new ItemBase("unknown_unshaped");
	public static final Item WROUGHT_IRON_UNSHAPED = new ItemBase("wrought_iron_unshaped");
	public static final Item ZINC_UNSHAPED = new ItemBase("zinc_unshaped");
	
	//ore items
	//metal ore items
	public static final Item BISMUTHINITE_ITEM = new ItemBase("bismuthinite_item");
	public static final Item BISMUTHINITE_POOR_ITEM = new ItemBase("bismuthinite_poor_item");
	public static final Item BISMUTHINITE_RICH_ITEM = new ItemBase("bismuthinite_rich_item");
	public static final Item BISMUTHINITE_SMALL_ITEM = new ItemBase("bismuthinite_small_item");
	public static final Item CASSITERITE_ITEM = new ItemBase("cassiterite_item");
	public static final Item CASSITERITE_POOR_ITEM = new ItemBase("cassiterite_poor_item");
	public static final Item CASSITERITE_RICH_ITEM = new ItemBase("cassiterite_rich_item");
	public static final Item CASSITERITE_SMALL_ITEM = new ItemBase("cassiterite_small_item");
	public static final Item GARNIERITE_ITEM = new ItemBase("garnierite_item");
	public static final Item GARNIERITE_POOR_ITEM = new ItemBase("garnierite_poor_item");
	public static final Item GARNIERITE_RICH_ITEM = new ItemBase("garnierite_rich_item");
	public static final Item GARNIERITE_SMALL_ITEM = new ItemBase("garnierite_small_item");
	public static final Item HEMATITE_ITEM = new ItemBase("hematite_item");
	public static final Item HEMATITE_POOR_ITEM = new ItemBase("hematite_poor_item");
	public static final Item HEMATITE_RICH_ITEM = new ItemBase("hematite_rich_item");
	public static final Item HEMATITE_SMALL_ITEM = new ItemBase("hematite_small_item");
	public static final Item LIMONITE_ITEM = new ItemBase("limonite_item");
	public static final Item LIMONITE_POOR_ITEM = new ItemBase("limonite_poor_item");
	public static final Item LIMONITE_RICH_ITEM = new ItemBase("limonite_rich_item");
	public static final Item LIMONITE_SMALL_ITEM = new ItemBase("limonite_small_item");
	public static final Item MAGNETITE_ITEM = new ItemBase("magnetite_item");
	public static final Item MAGNETITE_POOR_ITEM = new ItemBase("magnetite_poor_item");
	public static final Item MAGNETITE_RICH_ITEM = new ItemBase("magnetite_rich_item");
	public static final Item MAGNETITE_SMALL_ITEM = new ItemBase("magnetite_small_item");
	public static final Item MALACHITE_ITEM = new ItemBase("malachite_item");
	public static final Item MALACHITE_POOR_ITEM = new ItemBase("malachite_poor_item");
	public static final Item MALACHITE_RICH_ITEM = new ItemBase("malachite_rich_item");
	public static final Item MALACHITE_SMALL_ITEM = new ItemBase("malachite_small_item");
	public static final Item NATIVE_COPPER_ITEM = new ItemBase("native_copper_item");
	public static final Item NATIVE_COPPER_POOR_ITEM = new ItemBase("native_copper_poor_item");
	public static final Item NATIVE_COPPER_RICH_ITEM = new ItemBase("native_copper_rich_item");
	public static final Item NATIVE_COPPER_SMALL_ITEM = new ItemBase("native_copper_small_item");
	public static final Item NATIVE_GOLD_ITEM = new ItemBase("native_gold_item");
	public static final Item NATIVE_GOLD_POOR_ITEM = new ItemBase("native_gold_poor_item");
	public static final Item NATIVE_GOLD_RICH_ITEM = new ItemBase("native_gold_rich_item");
	public static final Item NATIVE_GOLD_SMALL_ITEM = new ItemBase("native_gold_small_item");
	public static final Item NATIVE_SILVER_ITEM = new ItemBase("native_silver_item");
	public static final Item NATIVE_SILVER_POOR_ITEM = new ItemBase("native_silver_poor_item");
	public static final Item NATIVE_SILVER_RICH_ITEM = new ItemBase("native_silver_rich_item");
	public static final Item NATIVE_SILVER_SMALL_ITEM = new ItemBase("native_silver_small_item");
	public static final Item SPHALERITE_ITEM = new ItemBase("sphalerite_item");
	public static final Item SPHALERITE_POOR_ITEM = new ItemBase("sphalerite_poor_item");
	public static final Item SPHALERITE_RICH_ITEM = new ItemBase("sphalerite_rich_item");
	public static final Item SPHALERITE_SMALL_ITEM = new ItemBase("sphalerite_small_item");
	public static final Item TETRAHEDRITE_ITEM = new ItemBase("tetrahedrite_item");
	public static final Item TETRAHEDRITE_POOR_ITEM = new ItemBase("tetrahedrite_poor_item");
	public static final Item TETRAHEDRITE_RICH_ITEM = new ItemBase("tetrahedrite_rich_item");
	public static final Item TETRAHEDRITE_SMALL_ITEM = new ItemBase("tetrahedrite_small_item");
	
	//nonmetal ore items
	public static final Item BITUMINOUS_COAL_ITEM = new ItemBase("bituminous_coal_item");
	public static final Item BORAX_ITEM = new ItemBase("borax_item");
	public static final Item CINNABAR_ITEM = new ItemBase("cinnabar_item");
	public static final Item CRYOLITE_ITEM = new ItemBase("cryolite_item");
	public static final Item GRAPHITE_ITEM = new ItemBase("graphite_item");
	public static final Item KAOLINITE_ITEM = new ItemBase("kaolinite_item");
	public static final Item KIMBERLITE_ITEM = new ItemBase("kimberlite_item");
	public static final Item LAPIS_LAZULI_ITEM = new ItemBase("lapis_lazuli_item");
	public static final Item LIGNITE_ITEM = new ItemBase("lignite_item");
	public static final Item SALTPETER_ITEM = new ItemBase("saltpeter_item");
	public static final Item SULFUR_RICH_ITEM = new ItemBase("sulfur_rich_item");
	public static final Item SULFUR_POOR_ITEM = new ItemBase("sulfur_poor_item");
	public static final Item SULFUR_ITEM = new ItemBase("sulfur_item");
	public static final Item SYLVITE_POOR_ITEM = new ItemBase("sylvite_poor_item");
	public static final Item SYLVITE_RICH_ITEM = new ItemBase("sylvite_rich_item");
	public static final Item SYLVITE_ITEM = new ItemBase("sylvite_item");
	
	
	//useless ore items
	public static final Item GALENA_ITEM = new ItemBase("galena_item");
	public static final Item GALENA_SMALL_ITEM = new ItemBase("galena_small_item");
	public static final Item GALENA_POOR_ITEM = new ItemBase("galena_poor_item");
	public static final Item GALENA_RICH_ITEM = new ItemBase("galena_rich_item");
	public static final Item NATIVE_PLATINUM_ITEM = new ItemBase("native_platinum_item");
	public static final Item NATIVE_PLATINUM_SMALL_ITEM = new ItemBase("native_platinum_small_item");
	public static final Item NATIVE_PLATINUM_POOR_ITEM = new ItemBase("native_platinum_poor_item");
	public static final Item NATIVE_PLATINUM_RICH_ITEM = new ItemBase("native_platinum_rich_item");
	public static final Item GYPSUM_ITEM = new ItemBase("gypsum_item");
	public static final Item JET_ITEM = new ItemBase("jet_item");
	public static final Item PITCHBLENDE_ITEM = new ItemBase("pitchblende_item");
	public static final Item MICROCLINE_ITEM = new ItemBase("microcline_item");
	public static final Item OLIVINE_ITEM = new ItemBase("olivine_item");
	public static final Item PETRIFIED_WOOD_ITEM = new ItemBase("petrified_wood_item");
	public static final Item SATINSPAR_ITEM = new ItemBase("satinspar_item");
	public static final Item SELENITE_ITEM = new ItemBase("selenite_item");
	public static final Item SERPENTINE_ITEM = new ItemBase("serpentine_item");
	
	
	public static final List<Item> LOOSEROCKS = new ArrayList<Item>();
	
	
	
	// metamorphic loose rocks
	public static final Item GNEISS_LOOSE_ROCK = new RockItemBase("gneiss_loose_rock");
	public static final Item MARBLE_LOOSE_ROCK = new RockItemBase("marble_loose_rock");
	public static final Item PHYLLITE_LOOSE_ROCK = new RockItemBase("phyllite_loose_rock");
	public static final Item QUARTZITE_LOOSE_ROCK = new RockItemBase("quartzite_loose_rock");
	public static final Item SCHIST_LOOSE_ROCK = new RockItemBase("schist_loose_rock");
	public static final Item SLATE_LOOSE_ROCK = new RockItemBase("slate_loose_rock");

	// igneous intrusive loose rocks
	public static final Item DIORITE_LOOSE_ROCK = new RockItemBase("diorite_loose_rock");
	public static final Item GABBRO_LOOSE_ROCK = new RockItemBase("gabbro_loose_rock");
	public static final Item GRANITE_LOOSE_ROCK = new RockItemBase("granite_loose_rock");

	// igneous extrusive loose rocks
	public static final Item ANDESITE_LOOSE_ROCK = new RockItemBase("andesite_loose_rock");
	public static final Item BASALT_LOOSE_ROCK = new RockItemBase("basalt_loose_rock");
	public static final Item DACITE_LOOSE_ROCK = new RockItemBase("dacite_loose_rock");
	public static final Item RHYOLITE_LOOSE_ROCK = new RockItemBase("rhyolite_loose_rock");
	
	
	
	
}
