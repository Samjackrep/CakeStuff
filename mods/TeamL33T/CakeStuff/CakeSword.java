package CakeStuff.mods.TeamL33T.CakeStuff;

import paulscode.sound.SoundSystem;
import cpw.mods.fml.common.Mod.EventHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;

public class CakeSword extends ItemSword {
	
	public CakeSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("cakeSword");
		this.func_111206_d("cakestuff:cake_sword");
		this.setCreativeTab(new CreativeTabCakeStuff());
	}

	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		player.getFoodStats().setFoodLevel(20);
		return new ItemStack(Item.ingotIron);
	}
	
}