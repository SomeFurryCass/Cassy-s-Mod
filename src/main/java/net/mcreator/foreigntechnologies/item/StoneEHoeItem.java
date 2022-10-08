
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StoneEHoeItem extends HoeItem {
	public StoneEHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return -0.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 5;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				0, -3f,

				new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS));
	}

}
