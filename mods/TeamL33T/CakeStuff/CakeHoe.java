package CakeStuff.mods.TeamL33T.CakeStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class CakeHoe extends ItemHoe {

	public CakeHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("cakeHoe");
		this.func_111206_d("cakestuff:cake_hoe");
	}
	
}
