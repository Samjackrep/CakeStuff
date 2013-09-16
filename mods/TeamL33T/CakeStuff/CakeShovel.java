package mods.TeamL33T.CakeStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class CakeShovel extends ItemSpade {

	public CakeShovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("cakeShovel");
		this.func_111206_d("cakestuff:cake_shovel");
		this.setCreativeTab(new CreativeTabCakeStuff());
	}
	
}
