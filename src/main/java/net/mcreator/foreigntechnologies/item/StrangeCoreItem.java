
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StrangeCoreItem extends Item {
	public StrangeCoreItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.RARE));
	}
}
