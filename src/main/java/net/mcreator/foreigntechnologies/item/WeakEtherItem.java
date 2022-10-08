
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;

public class WeakEtherItem extends Item {
	public WeakEtherItem() {
		super(new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
