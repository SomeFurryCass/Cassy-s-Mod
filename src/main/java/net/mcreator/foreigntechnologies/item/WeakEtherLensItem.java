
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;

public class WeakEtherLensItem extends Item {
	public WeakEtherLensItem() {
		super(new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
