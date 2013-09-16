package mods.TeamL33T.CakeStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCakeStuff extends CreativeTabs {

	public CreativeTabCakeStuff() {
		super("cakeStuff");
	}
	
	@Override
	public int getTabIconItemIndex() {
		return Item.cake.itemID;
	}
	
}
