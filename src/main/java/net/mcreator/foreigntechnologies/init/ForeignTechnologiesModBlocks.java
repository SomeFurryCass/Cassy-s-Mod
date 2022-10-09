
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.foreigntechnologies.block.TheDeepEtherPortalBlock;
import net.mcreator.foreigntechnologies.block.StrippedStalkBlock;
import net.mcreator.foreigntechnologies.block.StalkPlanksBlock;
import net.mcreator.foreigntechnologies.block.StalkDoorBlock;
import net.mcreator.foreigntechnologies.block.SlateDropOreBlock;
import net.mcreator.foreigntechnologies.block.ReinforcedEtherstoneBlock;
import net.mcreator.foreigntechnologies.block.KorisslateoreBlock;
import net.mcreator.foreigntechnologies.block.KorisPlatingBlock;
import net.mcreator.foreigntechnologies.block.KorisPillarBlock;
import net.mcreator.foreigntechnologies.block.KorisOreBlock;
import net.mcreator.foreigntechnologies.block.KorisGlassBlock;
import net.mcreator.foreigntechnologies.block.KorisFenceBlock;
import net.mcreator.foreigntechnologies.block.KorisBlockBlock;
import net.mcreator.foreigntechnologies.block.EtherstoneBlock;
import net.mcreator.foreigntechnologies.block.EtheriumClusterBlock;
import net.mcreator.foreigntechnologies.block.EtheriumBlockBlock;
import net.mcreator.foreigntechnologies.block.EtherdimensionPortalBlock;
import net.mcreator.foreigntechnologies.block.EtherSurfaceBlock;
import net.mcreator.foreigntechnologies.block.EtherStalkBlock;
import net.mcreator.foreigntechnologies.block.EtherSlateBrickBlock;
import net.mcreator.foreigntechnologies.block.EtherSlateBlock;
import net.mcreator.foreigntechnologies.block.EtherPurifierBlock;
import net.mcreator.foreigntechnologies.block.EtherPurifierAtiveBlock;
import net.mcreator.foreigntechnologies.block.EtherPanelBlock;
import net.mcreator.foreigntechnologies.block.EtherLampBlock;
import net.mcreator.foreigntechnologies.block.EtherGlassBlock;
import net.mcreator.foreigntechnologies.block.EtherGeneratorBlock;
import net.mcreator.foreigntechnologies.block.EtherDropOreBlock;
import net.mcreator.foreigntechnologies.block.DistortionBlock;
import net.mcreator.foreigntechnologies.block.AzemSlateBlock;
import net.mcreator.foreigntechnologies.block.AzemOreBlock;
import net.mcreator.foreigntechnologies.block.AzemBlockBlock;
import net.mcreator.foreigntechnologies.ForeignTechnologiesMod;

public class ForeignTechnologiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForeignTechnologiesMod.MODID);
	public static final RegistryObject<Block> ETHER_GENERATOR = REGISTRY.register("ether_generator", () -> new EtherGeneratorBlock());
	public static final RegistryObject<Block> ETHER_PURIFIER = REGISTRY.register("ether_purifier", () -> new EtherPurifierBlock());
	public static final RegistryObject<Block> ETHER_PURIFIER_ATIVE = REGISTRY.register("ether_purifier_ative", () -> new EtherPurifierAtiveBlock());
	public static final RegistryObject<Block> ETHERSTONE = REGISTRY.register("etherstone", () -> new EtherstoneBlock());
	public static final RegistryObject<Block> ETHER_SLATE = REGISTRY.register("ether_slate", () -> new EtherSlateBlock());
	public static final RegistryObject<Block> ETHER_STALK = REGISTRY.register("ether_stalk", () -> new EtherStalkBlock());
	public static final RegistryObject<Block> ETHER_GLASS = REGISTRY.register("ether_glass", () -> new EtherGlassBlock());
	public static final RegistryObject<Block> ETHER_SURFACE = REGISTRY.register("ether_surface", () -> new EtherSurfaceBlock());
	public static final RegistryObject<Block> ETHER_PANEL = REGISTRY.register("ether_panel", () -> new EtherPanelBlock());
	public static final RegistryObject<Block> ETHERDIMENSION_PORTAL = REGISTRY.register("etherdimension_portal",
			() -> new EtherdimensionPortalBlock());
	public static final RegistryObject<Block> DISTORTION = REGISTRY.register("distortion", () -> new DistortionBlock());
	public static final RegistryObject<Block> ETHER_SLATE_BRICK = REGISTRY.register("ether_slate_brick", () -> new EtherSlateBrickBlock());
	public static final RegistryObject<Block> THE_DEEP_ETHER_PORTAL = REGISTRY.register("the_deep_ether_portal", () -> new TheDeepEtherPortalBlock());
	public static final RegistryObject<Block> KORIS_ORE = REGISTRY.register("koris_ore", () -> new KorisOreBlock());
	public static final RegistryObject<Block> KORISSLATEORE = REGISTRY.register("korisslateore", () -> new KorisslateoreBlock());
	public static final RegistryObject<Block> KORIS_FENCE = REGISTRY.register("koris_fence", () -> new KorisFenceBlock());
	public static final RegistryObject<Block> KORIS_GLASS = REGISTRY.register("koris_glass", () -> new KorisGlassBlock());
	public static final RegistryObject<Block> KORIS_PILLAR = REGISTRY.register("koris_pillar", () -> new KorisPillarBlock());
	public static final RegistryObject<Block> REINFORCED_ETHERSTONE = REGISTRY.register("reinforced_etherstone",
			() -> new ReinforcedEtherstoneBlock());
	public static final RegistryObject<Block> STRIPPED_STALK = REGISTRY.register("stripped_stalk", () -> new StrippedStalkBlock());
	public static final RegistryObject<Block> STALK_PLANKS = REGISTRY.register("stalk_planks", () -> new StalkPlanksBlock());
	public static final RegistryObject<Block> STALK_DOOR = REGISTRY.register("stalk_door", () -> new StalkDoorBlock());
	public static final RegistryObject<Block> ETHER_LAMP = REGISTRY.register("ether_lamp", () -> new EtherLampBlock());
	public static final RegistryObject<Block> ETHER_DROP_ORE = REGISTRY.register("ether_drop_ore", () -> new EtherDropOreBlock());
	public static final RegistryObject<Block> SLATE_DROP_ORE = REGISTRY.register("slate_drop_ore", () -> new SlateDropOreBlock());
	public static final RegistryObject<Block> ETHERIUM_CLUSTER = REGISTRY.register("etherium_cluster", () -> new EtheriumClusterBlock());
	public static final RegistryObject<Block> AZEM_ORE = REGISTRY.register("azem_ore", () -> new AzemOreBlock());
	public static final RegistryObject<Block> AZEM_SLATE = REGISTRY.register("azem_slate", () -> new AzemSlateBlock());
	public static final RegistryObject<Block> AZEM_BLOCK = REGISTRY.register("azem_block", () -> new AzemBlockBlock());
	public static final RegistryObject<Block> KORIS_BLOCK = REGISTRY.register("koris_block", () -> new KorisBlockBlock());
	public static final RegistryObject<Block> KORIS_PLATING = REGISTRY.register("koris_plating", () -> new KorisPlatingBlock());
	public static final RegistryObject<Block> ETHERIUM_BLOCK = REGISTRY.register("etherium_block", () -> new EtheriumBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			EtherGeneratorBlock.registerRenderLayer();
			EtherGlassBlock.registerRenderLayer();
			KorisFenceBlock.registerRenderLayer();
			KorisGlassBlock.registerRenderLayer();
			StalkDoorBlock.registerRenderLayer();
			EtherLampBlock.registerRenderLayer();
		}
	}
}
