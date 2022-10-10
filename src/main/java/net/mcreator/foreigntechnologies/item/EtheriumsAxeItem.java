
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;
import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModItems;

public class EtheriumsAxeItem extends AxeItem {
	public EtheriumsAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 53f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 140;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForeignTechnologiesModItems.ETHERIUM.get()));
			}
		}, 1, -2f, new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS).fireResistant());
	}
}
