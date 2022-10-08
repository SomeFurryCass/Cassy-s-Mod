
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;

public class EtherDropItem extends Item {
	public EtherDropItem() {
		super(new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
