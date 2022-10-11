
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModSounds;

public class MusicDiscItem extends RecordItem {
	public MusicDiscItem() {
		super(0, ForeignTechnologiesModSounds.REGISTRY.get(new ResourceLocation("foreign_technologies:highlands")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
