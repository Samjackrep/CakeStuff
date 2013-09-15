package CakeStuff.CakeStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CakePickaxe extends ItemPickaxe {

	public CakePickaxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("cakePickaxe");
		this.func_111206_d("cakestuff:cake_pickaxe");
	}
	
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(1, 6000));
		player.addPotionEffect(new PotionEffect(3, 6000));
		player.addPotionEffect(new PotionEffect(16, 6000));
		return new ItemStack(Item.pickaxeWood);
	}
	
}
