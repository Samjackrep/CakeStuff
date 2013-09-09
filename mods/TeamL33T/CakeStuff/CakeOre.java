package mods.TeamL33T.CakeStuff;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CakeOre extends BlockOre {

	public CakeOre(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1.5F);
		this.setLightValue(0.1F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName("cakeOre");
	}

	public int idDropped(int par1, Random random, int par2) {
        return Item.cake.itemID;
    }
	
}
