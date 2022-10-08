
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ForeignTechnologiesModTabs {
	public static CreativeModeTab TAB_ETHER_TOOLS;

	public static void load() {
		TAB_ETHER_TOOLS = new CreativeModeTab("tabether_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ForeignTechnologiesModItems.FREN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
