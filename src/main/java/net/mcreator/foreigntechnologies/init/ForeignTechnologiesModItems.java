
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.foreigntechnologies.item.WoodESwordItem;
import net.mcreator.foreigntechnologies.item.WoodEShovelItem;
import net.mcreator.foreigntechnologies.item.WoodEPickaxeItem;
import net.mcreator.foreigntechnologies.item.WoodEHoeItem;
import net.mcreator.foreigntechnologies.item.WoodEAxeItem;
import net.mcreator.foreigntechnologies.item.WeakEtherLensItem;
import net.mcreator.foreigntechnologies.item.WeakEtherItem;
import net.mcreator.foreigntechnologies.item.TheEdgeItem;
import net.mcreator.foreigntechnologies.item.TheDeepEtherItem;
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
import net.mcreator.foreigntechnologies.item.StellariteItem;
import net.mcreator.foreigntechnologies.item.StalkReedItem;
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
import net.mcreator.foreigntechnologies.item.MusicDiscItem;
import net.mcreator.foreigntechnologies.item.KoristoolsSwordItem;
import net.mcreator.foreigntechnologies.item.KoristoolsShovelItem;
import net.mcreator.foreigntechnologies.item.KoristoolsPickaxeItem;
import net.mcreator.foreigntechnologies.item.KoristoolsHoeItem;
import net.mcreator.foreigntechnologies.item.KoristoolsAxeItem;
import net.mcreator.foreigntechnologies.item.KorisarmorArmorItem;
import net.mcreator.foreigntechnologies.item.KorisItem;
import net.mcreator.foreigntechnologies.item.KorisChunkItem;
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
import net.mcreator.foreigntechnologies.item.EtheriumsSwordItem;
import net.mcreator.foreigntechnologies.item.EtheriumsShovelItem;
import net.mcreator.foreigntechnologies.item.EtheriumsPickaxeItem;
import net.mcreator.foreigntechnologies.item.EtheriumsHoeItem;
import net.mcreator.foreigntechnologies.item.EtheriumsAxeItem;
import net.mcreator.foreigntechnologies.item.EtheriumaArmorItem;
import net.mcreator.foreigntechnologies.item.EtheriumItem;
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
import net.mcreator.foreigntechnologies.item.AzemaSwordItem;
import net.mcreator.foreigntechnologies.item.AzemaShovelItem;
import net.mcreator.foreigntechnologies.item.AzemaPickaxeItem;
import net.mcreator.foreigntechnologies.item.AzemaHoeItem;
import net.mcreator.foreigntechnologies.item.AzemaAxeItem;
import net.mcreator.foreigntechnologies.item.AzemaArmorItem;
import net.mcreator.foreigntechnologies.item.AzemItem;
import net.mcreator.foreigntechnologies.item.AzemChunkItem;
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
	public static final RegistryObject<Item> DISTORTION = block(ForeignTechnologiesModBlocks.DISTORTION, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHER_SLATE_BRICK = block(ForeignTechnologiesModBlocks.ETHER_SLATE_BRICK,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> THE_DEEP_ETHER = REGISTRY.register("the_deep_ether", () -> new TheDeepEtherItem());
	public static final RegistryObject<Item> KORIS_ORE = block(ForeignTechnologiesModBlocks.KORIS_ORE, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> KORIS_CHUNK = REGISTRY.register("koris_chunk", () -> new KorisChunkItem());
	public static final RegistryObject<Item> KORISSLATEORE = block(ForeignTechnologiesModBlocks.KORISSLATEORE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> KORIS = REGISTRY.register("koris", () -> new KorisItem());
	public static final RegistryObject<Item> KORISTOOLS_PICKAXE = REGISTRY.register("koristools_pickaxe", () -> new KoristoolsPickaxeItem());
	public static final RegistryObject<Item> KORISTOOLS_AXE = REGISTRY.register("koristools_axe", () -> new KoristoolsAxeItem());
	public static final RegistryObject<Item> KORISTOOLS_SWORD = REGISTRY.register("koristools_sword", () -> new KoristoolsSwordItem());
	public static final RegistryObject<Item> KORISTOOLS_SHOVEL = REGISTRY.register("koristools_shovel", () -> new KoristoolsShovelItem());
	public static final RegistryObject<Item> KORISTOOLS_HOE = REGISTRY.register("koristools_hoe", () -> new KoristoolsHoeItem());
	public static final RegistryObject<Item> KORISARMOR_ARMOR_HELMET = REGISTRY.register("korisarmor_armor_helmet",
			() -> new KorisarmorArmorItem.Helmet());
	public static final RegistryObject<Item> KORISARMOR_ARMOR_CHESTPLATE = REGISTRY.register("korisarmor_armor_chestplate",
			() -> new KorisarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> KORISARMOR_ARMOR_LEGGINGS = REGISTRY.register("korisarmor_armor_leggings",
			() -> new KorisarmorArmorItem.Leggings());
	public static final RegistryObject<Item> KORISARMOR_ARMOR_BOOTS = REGISTRY.register("korisarmor_armor_boots",
			() -> new KorisarmorArmorItem.Boots());
	public static final RegistryObject<Item> WATCHER = REGISTRY.register("watcher_spawn_egg",
			() -> new ForgeSpawnEggItem(ForeignTechnologiesModEntities.WATCHER, -16777216, -1,
					new Item.Properties().tab(ForeignTechnologiesModTabs.TAB_ETHER_TOOLS)));
	public static final RegistryObject<Item> KORIS_FENCE = block(ForeignTechnologiesModBlocks.KORIS_FENCE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> KORIS_GLASS = block(ForeignTechnologiesModBlocks.KORIS_GLASS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> KORIS_PILLAR = block(ForeignTechnologiesModBlocks.KORIS_PILLAR,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> REINFORCED_ETHERSTONE = block(ForeignTechnologiesModBlocks.REINFORCED_ETHERSTONE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STRIPPED_STALK = block(ForeignTechnologiesModBlocks.STRIPPED_STALK,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STALK_PLANKS = block(ForeignTechnologiesModBlocks.STALK_PLANKS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STALK_REED = REGISTRY.register("stalk_reed", () -> new StalkReedItem());
	public static final RegistryObject<Item> STALK_DOOR = doubleBlock(ForeignTechnologiesModBlocks.STALK_DOOR,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHER_LAMP = block(ForeignTechnologiesModBlocks.ETHER_LAMP, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHER_DROP_ORE = block(ForeignTechnologiesModBlocks.ETHER_DROP_ORE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> SLATE_DROP_ORE = block(ForeignTechnologiesModBlocks.SLATE_DROP_ORE,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHERIUM = REGISTRY.register("etherium", () -> new EtheriumItem());
	public static final RegistryObject<Item> ETHERIUM_CLUSTER = block(ForeignTechnologiesModBlocks.ETHERIUM_CLUSTER,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHERIUMA_ARMOR_HELMET = REGISTRY.register("etheriuma_armor_helmet",
			() -> new EtheriumaArmorItem.Helmet());
	public static final RegistryObject<Item> ETHERIUMA_ARMOR_CHESTPLATE = REGISTRY.register("etheriuma_armor_chestplate",
			() -> new EtheriumaArmorItem.Chestplate());
	public static final RegistryObject<Item> ETHERIUMA_ARMOR_LEGGINGS = REGISTRY.register("etheriuma_armor_leggings",
			() -> new EtheriumaArmorItem.Leggings());
	public static final RegistryObject<Item> ETHERIUMA_ARMOR_BOOTS = REGISTRY.register("etheriuma_armor_boots", () -> new EtheriumaArmorItem.Boots());
	public static final RegistryObject<Item> AZEM = REGISTRY.register("azem", () -> new AzemItem());
	public static final RegistryObject<Item> AZEM_CHUNK = REGISTRY.register("azem_chunk", () -> new AzemChunkItem());
	public static final RegistryObject<Item> AZEM_ORE = block(ForeignTechnologiesModBlocks.AZEM_ORE, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> AZEM_SLATE = block(ForeignTechnologiesModBlocks.AZEM_SLATE, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> AZEM_BLOCK = block(ForeignTechnologiesModBlocks.AZEM_BLOCK, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> KORIS_BLOCK = block(ForeignTechnologiesModBlocks.KORIS_BLOCK,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> KORIS_PLATING = block(ForeignTechnologiesModBlocks.KORIS_PLATING,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHERIUM_BLOCK = block(ForeignTechnologiesModBlocks.ETHERIUM_BLOCK,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> AZEMA_PICKAXE = REGISTRY.register("azema_pickaxe", () -> new AzemaPickaxeItem());
	public static final RegistryObject<Item> AZEMA_AXE = REGISTRY.register("azema_axe", () -> new AzemaAxeItem());
	public static final RegistryObject<Item> AZEMA_SWORD = REGISTRY.register("azema_sword", () -> new AzemaSwordItem());
	public static final RegistryObject<Item> AZEMA_SHOVEL = REGISTRY.register("azema_shovel", () -> new AzemaShovelItem());
	public static final RegistryObject<Item> AZEMA_HOE = REGISTRY.register("azema_hoe", () -> new AzemaHoeItem());
	public static final RegistryObject<Item> ETHERIUMS_PICKAXE = REGISTRY.register("etheriums_pickaxe", () -> new EtheriumsPickaxeItem());
	public static final RegistryObject<Item> ETHERIUMS_AXE = REGISTRY.register("etheriums_axe", () -> new EtheriumsAxeItem());
	public static final RegistryObject<Item> ETHERIUMS_SWORD = REGISTRY.register("etheriums_sword", () -> new EtheriumsSwordItem());
	public static final RegistryObject<Item> ETHERIUMS_SHOVEL = REGISTRY.register("etheriums_shovel", () -> new EtheriumsShovelItem());
	public static final RegistryObject<Item> ETHERIUMS_HOE = REGISTRY.register("etheriums_hoe", () -> new EtheriumsHoeItem());
	public static final RegistryObject<Item> AZEMA_ARMOR_HELMET = REGISTRY.register("azema_armor_helmet", () -> new AzemaArmorItem.Helmet());
	public static final RegistryObject<Item> AZEMA_ARMOR_CHESTPLATE = REGISTRY.register("azema_armor_chestplate",
			() -> new AzemaArmorItem.Chestplate());
	public static final RegistryObject<Item> AZEMA_ARMOR_LEGGINGS = REGISTRY.register("azema_armor_leggings", () -> new AzemaArmorItem.Leggings());
	public static final RegistryObject<Item> AZEMA_ARMOR_BOOTS = REGISTRY.register("azema_armor_boots", () -> new AzemaArmorItem.Boots());
	public static final RegistryObject<Item> AZEM_FENCE = block(ForeignTechnologiesModBlocks.AZEM_FENCE, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHERSTONE_STAIRS = block(ForeignTechnologiesModBlocks.ETHERSTONE_STAIRS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> ETHERSTONE_SLAB = block(ForeignTechnologiesModBlocks.ETHERSTONE_SLAB,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STALK_STAIRS = block(ForeignTechnologiesModBlocks.STALK_STAIRS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STALK_SLAB = block(ForeignTechnologiesModBlocks.STALK_SLAB, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> SLATE_BRICK_SLAB = block(ForeignTechnologiesModBlocks.SLATE_BRICK_SLAB,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> SLATE_BRICK_STAIRS = block(ForeignTechnologiesModBlocks.SLATE_BRICK_STAIRS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> PANEL_STAIRS = block(ForeignTechnologiesModBlocks.PANEL_STAIRS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> PANEL_SLAB = block(ForeignTechnologiesModBlocks.PANEL_SLAB, ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> R_ETHERSTONE_STAIRS = block(ForeignTechnologiesModBlocks.R_ETHERSTONE_STAIRS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> R_ETHER_SLAB = block(ForeignTechnologiesModBlocks.R_ETHER_SLAB,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> THE_EDGE = REGISTRY.register("the_edge", () -> new TheEdgeItem());
	public static final RegistryObject<Item> MUSIC_DISC = REGISTRY.register("music_disc", () -> new MusicDiscItem());
	public static final RegistryObject<Item> STELLARWOOD = block(ForeignTechnologiesModBlocks.STELLARWOOD,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STELLARWOOD_PLANKS = block(ForeignTechnologiesModBlocks.STELLARWOOD_PLANKS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STELLARITE = REGISTRY.register("stellarite", () -> new StellariteItem());
	public static final RegistryObject<Item> STELLAR_LEAVES = block(ForeignTechnologiesModBlocks.STELLAR_LEAVES,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STELLAR_GRASS = block(ForeignTechnologiesModBlocks.STELLAR_GRASS,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);
	public static final RegistryObject<Item> STELLAR_STARLIGHT = block(ForeignTechnologiesModBlocks.STELLAR_STARLIGHT,
			ForeignTechnologiesModTabs.TAB_ETHER_TOOLS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
