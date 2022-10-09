
package net.mcreator.foreigntechnologies.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModTabs;
import net.mcreator.foreigntechnologies.init.ForeignTechnologiesModItems;

public abstract class KorisarmorArmorItem extends ArmorItem {
	public KorisarmorArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{8, 22, 18, 8}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 32;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForeignTechnologiesModItems.KORIS.get()));
			}

			@Override
			public String getName() {
				return "korisarmor_armor";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.6f;
			}
		}, slot, properties);
	}

	public static class Helmet extends KorisarmorArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "foreign_technologies:textures/models/armor/korisarmor_layer_1.png";
		}
	}

	public static class Chestplate extends KorisarmorArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "foreign_technologies:textures/models/armor/korisarmor_layer_1.png";
		}
	}

	public static class Leggings extends KorisarmorArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "foreign_technologies:textures/models/armor/korisarmor_layer_2.png";
		}
	}

	public static class Boots extends KorisarmorArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "foreign_technologies:textures/models/armor/korisarmor_layer_1.png";
		}
	}
}
