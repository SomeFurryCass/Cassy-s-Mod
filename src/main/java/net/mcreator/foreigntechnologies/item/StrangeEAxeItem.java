
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StrangeEAxeItem extends AxeItem {
	public StrangeEAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 75;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				1, -2.2f,

				new Item.Properties().tab(null).fireResistant());
	}

}
