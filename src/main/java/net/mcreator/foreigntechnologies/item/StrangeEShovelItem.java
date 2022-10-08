
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StrangeEShovelItem extends ShovelItem {
	public StrangeEShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 13f;
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

				1, -3f,

				new Item.Properties().tab(null).fireResistant());
	}

}
