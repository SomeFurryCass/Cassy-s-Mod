
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.foreigntechnologies.item.WoodESwordItem;
import net.mcreator.foreigntechnologies.item.WoodEShovelItem;
import net.mcreator.foreigntechnologies.item.WoodEPickaxeItem;
import net.mcreator.foreigntechnologies.item.WoodEHoeItem;
import net.mcreator.foreigntechnologies.item.WoodEAxeItem;
import net.mcreator.foreigntechnologies.item.WeakEtherLensItem;
import net.mcreator.foreigntechnologies.item.WeakEtherItem;
import net.mcreator.foreigntechnologies.item.SuperEtherEmitterItem;
import net.mcreator.foreigntechnologies.item.StrangeESwordItem;
import net.mcreator.foreigntechnologies.item.StrangeEShovelItem;
import net.mcreator.foreigntechnologies.item.StrangeEPickItem;
import net.mcreator.foreigntechnologies.item.StrangeEHoeItem;
import net.mcreator.foreigntechnologies.item.StrangeEAxeItem;
import net.mcreator.foreigntechnologies.item.StrangeCoreItem;
import net.mcreator.foreigntechnologies.item.StrangeBallItem;
import net.mcreator.foreigntechnologies.item.StoneESwordItem;
import net.mcreator.foreigntechnologies.item.StoneEShovelItem;
import net.mcreator.foreigntechnologies.item.StoneEPickItem;
import net.mcreator.foreigntechnologies.item.StoneEHoeItem;
import net.mcreator.foreigntechnologies.item.StoneEAxeItem;
import net.mcreator.foreigntechnologies.item.StoneCoreItem;
import net.mcreator.foreigntechnologies.item.RawEtherItem;
import net.mcreator.foreigntechnologies.item.PureEtherItem;
import net.mcreator.foreigntechnologies.item.PureEtherBottleItem;
import net.mcreator.foreigntechnologies.item.OtherworldyTransmissionItem;
import net.mcreator.foreigntechnologies.item.NetheriteESwordItem;
import net.mcreator.foreigntechnologies.item.NetheriteEShovelItem;
import net.mcreator.foreigntechnologies.item.NetheriteEPickItem;
import net.mcreator.foreigntechnologies.item.NetheriteEHoeItem;
import net.mcreator.foreigntechnologies.item.NetheriteEAxeItem;
import net.mcreator.foreigntechnologies.item.NetheriteCoreItem;
import net.mcreator.foreigntechnologies.item.IroncoreItem;
import net.mcreator.foreigntechnologies.item.IronESwordItem;
import net.mcreator.foreigntechnologies.item.IronEShovelItem;
import net.mcreator.foreigntechnologies.item.IronEPickItem;
import net.mcreator.foreigntechnologies.item.IronEHoeItem;
import net.mcreator.foreigntechnologies.item.IronEAxeItem;
import net.mcreator.foreigntechnologies.item.GoldcoreItem;
import net.mcreator.foreigntechnologies.item.GoldESwordItem;
import net.mcreator.foreigntechnologies.item.GoldEShovelItem;
import net.mcreator.foreigntechnologies.item.GoldEPickItem;
import net.mcreator.foreigntechnologies.item.GoldEHoeItem;
import net.mcreator.foreigntechnologies.item.GoldEAxeItem;
import net.mcreator.foreigntechnologies.item.FrenStickItem;
import net.mcreator.foreigntechnologies.item.FrenItem;
import net.mcreator.foreigntechnologies.item.EtherdimensionItem;
import net.mcreator.foreigntechnologies.item.EtherEmitterItem;
import net.mcreator.foreigntechnologies.item.EtherDropItem;
import net.mcreator.foreigntechnologies.item.EtherBottleItem;
import net.mcreator.foreigntechnologies.item.DiamondESwordItem;
import net.mcreator.foreigntechnologies.item.DiamondEShovelItem;
import net.mcreator.foreigntechnologies.item.DiamondEPickItem;
import net.mcreator.foreigntechnologies.item.DiamondEHoeItem;
import net.mcreator.foreigntechnologies.item.DiamondEAxeItem;
import net.mcreator.foreigntechnologies.item.DiamondCoreItem;
import net.mcreator.foreigntechnologies.item.CoppercoreItem;
import net.mcreator.foreigntechnologies.item.CopperESwordItem;
import net.mcreator.foreigntechnologies.item.CopperEShovelItem;
import net.mcreator.foreigntechnologies.item.CopperEPickItem;
import net.mcreator.foreigntechnologies.item.CopperEHoeItem;
import net.mcreator.foreigntechnologies.item.CopperEAxeItem;
import net.mcreator.foreigntechnologies.item.BrittleStoneCoreItem;
import net.mcreator.foreigntechnologies.ForeignTechnologiesMod;

public class ForeignTechnologiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ForeignTechnologiesMod.MODID);
	public static final RegistryObject<Item> FREN = REGISTRY.register("fren", () -> new FrenItem());
	public static final RegistryObject<Item> STRANGE_BALL = REGISTRY.register("strange_ball", () -> new StrangeBallItem());
	public static final RegistryObject<Item> RAW_ETHER = REGISTRY.register("raw_ether", () -> new RawEtherItem());
	public static final RegistryObject<Item> ETHER_BOTTLE = REGISTRY.register("ether_bottle", () -> new EtherBottleItem());
	public static final RegistryObject<Item> STONE_CORE = REGISTRY.register("stone_core", () -> new StoneCoreItem());
	public static final RegistryObject<Item> BRITTLE_STONE_CORE = REGISTRY.register("brittle_stone_core", () -> new BrittleStoneCoreItem());
	public static final RegistryObject<Item> COPPERCORE = REGISTRY.register("coppercore", () -> new CoppercoreItem());
	public static final RegistryObject<Item> IRONCORE = REGISTRY.register("ironcore", () -> new IroncoreItem());
	public static final RegistryObject<Item> GOLDCORE = REGISTRY.register("goldcore", () -> new GoldcoreItem());
	public static final RegistryObject<Item> DIAMOND_CORE = REGISTRY.register("diamond_core", () -> new DiamondCoreItem());
	public static final RegistryObject<Item> NETHERITE_CORE = REGISTRY.register("netherite_core", () -> new NetheriteCoreItem());
	public static final RegistryObject<Item> STRANGE_CORE = REGISTRY.register("strange_core", () -> new StrangeCoreItem());
	public static final RegistryObject<Item> STONE_E_PICK = REGISTRY.register("stone_e_pick", () -> new StoneEPickItem());
	public static final RegistryObject<Item> IRON_E_PICK = REGISTRY.register("iron_e_pick", () -> new IronEPickItem());
	public static final RegistryObject<Item> COPPER_E_PICK = REGISTRY.register("copper_e_pick", () -> new CopperEPickItem());
	public static final RegistryObject<Item> GOLD_E_PICK = REGISTRY.register("gold_e_pick", () -> new GoldEPickItem());
	public static final RegistryObject<Item> DIAMOND_E_PICK = REGISTRY.register("diamond_e_pick", () -> new DiamondEPickItem());
	public static final RegistryObject<Item> NETHERITE_E_PICK = REGISTRY.register("netherite_e_pick", () -> new NetheriteEPickItem());
	public static final RegistryObject<Item> STRANGE_E_PICK = REGISTRY.register("strange_e_pick", () -> new StrangeEPickItem());
	public static final RegistryObject<Item> ETHER_EMITTER = REGISTRY.register("ether_emitter", () -> new EtherEmitterItem());
	public static final RegistryObject<Item> WEAK_ETHER = REGISTRY.register("weak_ether", () -> new WeakEtherItem());
	public static final RegistryObject<Item> WEAK_ETHER_LENS = REGISTRY.register("weak_ether_lens", () -> new WeakEtherLensItem());
	public static final RegistryObject<Item> SUPER_ETHER_EMITTER = REGISTRY.register("super_ether_emitter", () -> new SuperEtherEmitterItem());
	public static final RegistryObject<Item> STONE_E_SWORD = REGISTRY.register("stone_e_sword", () -> new StoneESwordItem());
	public static final RegistryObject<Item> COPPER_E_SWORD = REGISTRY.register("copper_e_sword", () -> new CopperESwordItem());
	public static final RegistryObject<Item> IRON_E_SWORD = REGISTRY.register("iron_e_sword", () -> new IronESwordItem());
	public static final RegistryObject<Item> GOLD_E_SWORD = REGISTRY.register("gold_e_sword", () -> new GoldESwordItem());
	public static final RegistryObject<Item> DIAMOND_E_SWORD = REGISTRY.register("diamond_e_sword", () -> new DiamondESwordItem());
	public static final RegistryObject<Item> NETHERITE_E_SWORD = REGISTRY.register("netherite_e_sword", () -> new NetheriteESwordItem());
	public static final RegistryObject<Item> STRANGE_E_SWORD = REGISTRY.register("strange_e_sword", () -> new StrangeESwordItem());
	public static final RegistryObject<Item> FREN_STICK = REGISTRY.register("fren_stick", () -> new FrenStickItem());
	public static final RegistryObject<Item> WOOD_E_SWORD = REGISTRY.register("wood_e_sword", () -> new WoodESwordItem());
	public static final RegistryObject<Item> WOOD_E_PICKAXE = REGISTRY.register("wood_e_pickaxe", () -> new WoodEPickaxeItem());
	public static final RegistryObject<Item> WOOD_E_SHOVEL = REGISTRY.register("wood_e_shovel", () -> new WoodEShovelItem());
	public static final RegistryObject<Item> WOOD_E_AXE = REGISTRY.register("wood_e_axe", () -> new WoodEAxeItem());
	public static final RegistryObject<Item> WOOD_E_HOE = REGISTRY.register("wood_e_hoe", () -> new WoodEHoeItem());
	public static final RegistryObject<Item> ETHER_GENERATOR = block(ForeignTechnologiesModBlocks.ETHER_GENERATOR,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PURE_ETHER = REGISTRY.register("pure_ether", () -> new PureEtherItem());
	public static final RegistryObject<Item> ETHER_PURIFIER = block(ForeignTechnologiesModBlocks.ETHER_PURIFIER,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> PURE_ETHER_BOTTLE = REGISTRY.register("pure_ether_bottle", () -> new PureEtherBottleItem());
	public static final RegistryObject<Item> ETHER_DROP = REGISTRY.register("ether_drop", () -> new EtherDropItem());
	public static final RegistryObject<Item> ETHER_PURIFIER_ATIVE = block(ForeignTechnologiesModBlocks.ETHER_PURIFIER_ATIVE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> COPPER_E_AXE = REGISTRY.register("copper_e_axe", () -> new CopperEAxeItem());
	public static final RegistryObject<Item> COPPER_E_SHOVEL = REGISTRY.register("copper_e_shovel", () -> new CopperEShovelItem());
	public static final RegistryObject<Item> ETHERSTONE = block(ForeignTechnologiesModBlocks.ETHERSTONE, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> COPPER_E_HOE = REGISTRY.register("copper_e_hoe", () -> new CopperEHoeItem());
	public static final RegistryObject<Item> ETHER_SLATE = block(ForeignTechnologiesModBlocks.ETHER_SLATE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STONE_E_AXE = REGISTRY.register("stone_e_axe", () -> new StoneEAxeItem());
	public static final RegistryObject<Item> ETHER_STALK = block(ForeignTechnologiesModBlocks.ETHER_STALK,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STONE_E_SHOVEL = REGISTRY.register("stone_e_shovel", () -> new StoneEShovelItem());
	public static final RegistryObject<Item> ETHER_GLASS = block(ForeignTechnologiesModBlocks.ETHER_GLASS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STONE_E_HOE = REGISTRY.register("stone_e_hoe", () -> new StoneEHoeItem());
	public static final RegistryObject<Item> ETHER_SURFACE = block(ForeignTechnologiesModBlocks.ETHER_SURFACE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> IRON_E_AXE = REGISTRY.register("iron_e_axe", () -> new IronEAxeItem());
	public static final RegistryObject<Item> ETHER_PANEL = block(ForeignTechnologiesModBlocks.ETHER_PANEL,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> IRON_E_SHOVEL = REGISTRY.register("iron_e_shovel", () -> new IronEShovelItem());
	public static final RegistryObject<Item> IRON_E_HOE = REGISTRY.register("iron_e_hoe", () -> new IronEHoeItem());
	public static final RegistryObject<Item> DIAMOND_E_AXE = REGISTRY.register("diamond_e_axe", () -> new DiamondEAxeItem());
	public static final RegistryObject<Item> DIAMOND_E_SHOVEL = REGISTRY.register("diamond_e_shovel", () -> new DiamondEShovelItem());
	public static final RegistryObject<Item> DIAMOND_E_HOE = REGISTRY.register("diamond_e_hoe", () -> new DiamondEHoeItem());
	public static final RegistryObject<Item> NETHERITE_E_AXE = REGISTRY.register("netherite_e_axe", () -> new NetheriteEAxeItem());
	public static final RegistryObject<Item> NETHERITE_E_SHOVEL = REGISTRY.register("netherite_e_shovel", () -> new NetheriteEShovelItem());
	public static final RegistryObject<Item> NETHERITE_E_HOE = REGISTRY.register("netherite_e_hoe", () -> new NetheriteEHoeItem());
	public static final RegistryObject<Item> GOLD_E_AXE = REGISTRY.register("gold_e_axe", () -> new GoldEAxeItem());
	public static final RegistryObject<Item> GOLD_E_SHOVEL = REGISTRY.register("gold_e_shovel", () -> new GoldEShovelItem());
	public static final RegistryObject<Item> GOLD_E_HOE = REGISTRY.register("gold_e_hoe", () -> new GoldEHoeItem());
	public static final RegistryObject<Item> STRANGE_E_AXE = REGISTRY.register("strange_e_axe", () -> new StrangeEAxeItem());
	public static final RegistryObject<Item> STRANGE_E_SHOVEL = REGISTRY.register("strange_e_shovel", () -> new StrangeEShovelItem());
	public static final RegistryObject<Item> STRANGE_E_HOE = REGISTRY.register("strange_e_hoe", () -> new StrangeEHoeItem());
	public static final RegistryObject<Item> OTHERWORLDY_TRANSMISSION = REGISTRY.register("otherworldy_transmission",
			() -> new OtherworldyTransmissionItem());
	public static final RegistryObject<Item> ETHERDIMENSION = REGISTRY.register("etherdimension", () -> new EtherdimensionItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
