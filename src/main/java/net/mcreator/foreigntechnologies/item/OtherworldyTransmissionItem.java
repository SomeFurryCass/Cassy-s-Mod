
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;
import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModSounds;

public class OtherworldyTransmissionItem extends RecordItem {
	public OtherworldyTransmissionItem() {
		super(0, ForeignTechnologiesModSounds.REGISTRY.get(new ResourceLocation("foreign_technologies:otherworldysounds")),
				new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS).stacksTo(1).rarity(Rarity.RARE));
	}
}
