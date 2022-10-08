
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;

public class CoppercoreItem extends Item {
	public CoppercoreItem() {
		super(new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
