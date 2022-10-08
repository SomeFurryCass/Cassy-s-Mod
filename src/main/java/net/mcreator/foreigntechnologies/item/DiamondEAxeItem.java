
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class DiamondEAxeItem extends AxeItem {
	public DiamondEAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				1, -3.2f,

				new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS));
	}

}
