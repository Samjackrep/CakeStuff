package mods.TeamL33T.CakeStuff;

import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class StrawberryFlowing extends BlockFlowing {

	protected StrawberryFlowing(int id) {
		super(id, Material.water);
		this.blockHardness = 100.0F;
		this.setLightOpacity(3);
		this.func_111022_d("cakestuff:strawberry_flow");
		this.func_94424_b("cakestuff:strawberry_flow");
		this.setUnlocalizedName("flowingStrawberry");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
