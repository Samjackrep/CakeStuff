package CakeStuff.mods.TeamL33T.CakeStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;

public class CreamStrawberry extends Block {
	
	public static Icon creamStrawberryTop;
	public static Icon creamStrawberrySide;

	public CreamStrawberry(int par1) {
		super(par1, Material.rock);
		this.setUnlocalizedName("creamStrawberry");
		this.setStepSound(Block.soundSnowFootstep);
		this.setCreativeTab(Main.tabCakeStuff);
	}
	
	@Override
	public void registerIcons(IconRegister iconReg) {
		creamStrawberryTop = iconReg.registerIcon("cakestuff:creamstrawberry_top");
		creamStrawberrySide = iconReg.registerIcon("cakestuff:creamstrawberry_side");
	}
	
	@Override
	public Icon getIcon(int par1, int par2)
    {
		if(par1 == 0) {
			return this.creamStrawberryTop;
		} else if(par1 == 1) {
			return this.creamStrawberryTop;
		} else {
			return this.creamStrawberrySide;
		}
    }

}
