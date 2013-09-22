package CakeStuff.mods.TeamL33T.CakeStuff;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class CakeAxe extends ItemAxe {

	public CakeAxe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("cakeAxe");
		this.setTextureName("cakestuff:cake_axe");
		this.setCreativeTab(Main.tabCakeStuff);
	}	
}
