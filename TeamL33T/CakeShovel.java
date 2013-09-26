package CakeStuff.TeamL33T;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class CakeShovel extends ItemSpade {

	public CakeShovel(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		setMaxStackSize(1);
		setUnlocalizedName("cakeShovel");
		func_111206_d("cakestuff:cake_shovel");
		setCreativeTab(Main.tabCakeStuff);
	}
	
}
