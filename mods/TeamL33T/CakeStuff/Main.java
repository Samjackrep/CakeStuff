package CakeStuff.mods.TeamL33T.CakeStuff;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Main.modid, name = "CakeStuff", version = "0.3.5")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Main
{
       public static final String modid = "CakeStuff";
       // EnumToolMaterials
       public static EnumToolMaterial cakeSwordMaterial = EnumHelper.addToolMaterial("cakeSwordMaterial", 2, 200, 5F, 1F, 5);
       public static EnumToolMaterial cakePickaxeMaterial = EnumHelper.addToolMaterial("cakePickaxeMaterial", 3, 300, 6.25F, 0.5F, 5);
       public static EnumToolMaterial cakeShovelMaterial = EnumHelper.addToolMaterial("cakeShovelMaterial", 3, 350, 6.5F, 0.5F, 5);
       public static EnumToolMaterial cakeAxeMaterial = EnumHelper.addToolMaterial("cakeAxeMaterial", 3, 325, 6.25F, 0.5F, 5);
       public static EnumToolMaterial cakeHoeMaterial = EnumHelper.addToolMaterial("cakeHoeMaterial", 2, 200, 5F, 0.5F, 5);
       // Main Blocks/Cakes
       public static Block cakeOre = new CakeOre(4020);
       public static Block cakeDark = new DarkCake(4050);
       public static Block creamStrawberry = new CreamStrawberry(4032);
       // Items
       public static Item cakeSword = new CakeSword(4021, cakeSwordMaterial);
       public static Item cakePickaxe = new CakePickaxe(4022, cakePickaxeMaterial);
       public static Item cakeShovel = new CakeShovel(4024, cakeShovelMaterial);
       public static Item cakeAxe = new CakeAxe(4023, cakeAxeMaterial);
       public static Item cakeHoe = new CakeHoe(4025, cakeHoeMaterial);
       // Miscellaneous
       public static CakeOreGen cakeOreGen = new CakeOreGen();
       
       @EventHandler
       public void preInit(FMLPreInitializationEvent event)
       {
    	   // Will add sounds soon, do not remove slashes plzz
    	   // MinecraftForge.EVENT_BUS.register(new EventSound());
       }
       
       @EventHandler
       public void load(FMLInitializationEvent event)
       {
    	   // CreativeTab
    	   LanguageRegistry.instance().addStringLocalization("itemGroup.tabTutorial", "en_US", "CakeStuff");
    	   
    	   // ID Getter Class
    	   CakeStuffID id = new CakeStuffID();
    	   
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
    	   
    	   //Language Registry
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