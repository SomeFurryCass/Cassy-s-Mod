
package net.mcreator.foreigntechnologies.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class NetheriteEHoeItem extends HoeItem {
	public NetheriteEHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		},

				0, -3f,

				new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS));
	}

}
