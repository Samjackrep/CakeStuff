package mods.TeamL33T.CakeStuff;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Main.modid, name = "CakeStuff", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Main
{
       public static final String modid = "CakeStuff";
       // Main Blocks/Cakes
       public static Block cakeOre;
       public static Block cakeDark;
       public static Block creamStrawberry;
       // Items
       public static Item cakeSword;
       public static Item cakePickaxe;
       public static Item cakeShovel;
       public static Item cakeAxe;
       public static Item cakeHoe;
       // Miscellaneous
       public static CakeOreGen cakeOreGen;
       // Fluids
       public static Block flowStrawberry;
       public static Block stillStrawberry;
       // EnumToolMaterials
       public static EnumToolMaterial cakeSwordMaterial = EnumHelper.addToolMaterial("cakeSwordMaterial", 2, 200, 5F, 1F, 5);
       public static EnumToolMaterial cakePickaxeMaterial = EnumHelper.addToolMaterial("cakePickaxeMaterial", 3, 300, 6.25F, 0.5F, 5);
       public static EnumToolMaterial cakeShovelMaterial = EnumHelper.addToolMaterial("cakeShovelMaterial", 3, 350, 6.5F, 0.5F, 5);
       public static EnumToolMaterial cakeAxeMaterial = EnumHelper.addToolMaterial("cakeAxeMaterial", 3, 325, 6.25F, 0.5F, 5);
       public static EnumToolMaterial cakeHoeMaterial = EnumHelper.addToolMaterial("cakeHoeMaterial", 2, 200, 5F, 0.5F, 5);
       
       @EventHandler
       public void preInit(FMLPreInitializationEvent event)
       {
    	   
       }
       
       @EventHandler
       public void load(FMLInitializationEvent event)
       {
    	   // ID Getter Class
    	   CakeStuffID id = new CakeStuffID();
    	   
    	   // Declare Cakestuff
    	   creamStrawberry = new CreamStrawberry(id.StrawberryCream);
    	   cakeDark = new DarkCake(id.DarkCake);
    	   cakeOre = new CakeOre(id.CakeOre).func_111022_d("cakestuff:cake_ore");
    	   cakeSword = new CakeSword(id.CakeSword, cakeSwordMaterial);
    	   cakePickaxe = new CakePickaxe(id.CakePick, cakePickaxeMaterial);
    	   cakeShovel = new CakeShovel(id.CakeShovel, cakeShovelMaterial);
    	   cakeAxe = new CakeAxe(id.CakeAxe, cakeAxeMaterial);
    	   cakeHoe = new CakeHoe(id.CakeHoe, cakeHoeMaterial);
    	   cakeOreGen = new CakeOreGen();
    	   
    	   // Register Cake Stuff
    	   GameRegistry.registerBlock(creamStrawberry, "creamStrawberry");
    	   GameRegistry.registerBlock(cakeOre, "oreCake");
    	   GameRegistry.registerBlock(cakeDark, "cakeDark");
    	   GameRegistry.registerItem(cakeSword, "swordCake");
    	   GameRegistry.registerItem(cakePickaxe, "pickaxeCake");
    	   GameRegistry.registerItem(cakeShovel, "shovelCake");
    	   GameRegistry.registerItem(cakeAxe, "axeCake");
    	   GameRegistry.registerItem(cakeHoe, "hoeCake");
    	   GameRegistry.registerWorldGenerator(cakeOreGen);
    	   //GameRegistry.registerBlock(flowStrawberry, "flowStrawberry");
    	   LanguageRegistry.addName(cakeOre, "Cake Ore");
    	   LanguageRegistry.addName(cakeSword, "Cake Sword");
    	   LanguageRegistry.addName(cakePickaxe, "Cake Pickaxe");
    	   LanguageRegistry.addName(cakeShovel, "Cake Shovel");
    	   LanguageRegistry.addName(cakeAxe, "Cake Axe");
    	   LanguageRegistry.addName(cakeHoe, "Cake Hoe");
    	   LanguageRegistry.addName(cakeDark, "Dark Cake");
    	   LanguageRegistry.addName(creamStrawberry, "Strawberry Cream");
    	   
    	   // Register Recipes
    	   ItemStack cake = new ItemStack(Item.cake);
    	   ItemStack cakeOre = new ItemStack(CakeStuffID.CakeOre, 1, 0);
    	   GameRegistry.addSmelting(CakeStuffID.CakeOre, cake, 0.1f);
    	   GameRegistry.addRecipe(new ItemStack(cakeSword), new Object[] {
    		   " c ",
    		   " c ",
    		   " i ",
    		   'c', cake, 'i', new ItemStack(Item.ingotIron)
    	   });
    	   GameRegistry.addRecipe(new ItemStack(cakeDark), new Object[] {
    		   "pcp",
    		   "cec",
    		   "pcp",
    		   'p', new ItemStack(Item.enderPearl), 'c', cake, 'e', new ItemStack(Block.dragonEgg)
    	   });
    	   GameRegistry.addRecipe(new ItemStack(cakePickaxe), new Object[] {
    		   "ccc", " s ", " s ", 'c', cake, 's', new ItemStack(Item.ingotIron)
    	   });
    	   GameRegistry.addRecipe(new ItemStack(cakeAxe), new Object[] {
    		   "cc ", "cs ", " s ", 'c', cake, 's', new ItemStack(Item.ingotIron)
    	   });
    	   GameRegistry.addRecipe(new ItemStack(cakeShovel), new Object[] {
    		   " c ", " s ", " s ", 'c', cake, 's', new ItemStack(Item.ingotIron)
    	   });
    	   GameRegistry.addRecipe(new ItemStack(cakeHoe), new Object[] {
    		   "cc ", " s ", " s ", 'c', cake, 's', new ItemStack(Item.ingotIron)
    	   });
       }
       
}