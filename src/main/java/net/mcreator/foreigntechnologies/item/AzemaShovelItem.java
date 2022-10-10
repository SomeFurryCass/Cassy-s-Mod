
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;
import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModItems;

public class AzemaShovelItem extends ShovelItem {
	public AzemaShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2380;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 70;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForeignTechnologiesModItems.AZEM.get()));
			}
		}, 1, -2.4f, new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS).fireResistant());
	}
}
