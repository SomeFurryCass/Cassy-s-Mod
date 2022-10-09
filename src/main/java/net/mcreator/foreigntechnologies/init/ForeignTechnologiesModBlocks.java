
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
import net.mcreator.foreigntechnologies.block.KorisslateoreBlock;
import net.mcreator.foreigntechnologies.block.KorisOreBlock;
import net.mcreator.foreigntechnologies.block.KorisGlassBlock;
import net.mcreator.foreigntechnologies.block.KorisFenceBlock;
import net.mcreator.foreigntechnologies.block.EtherstoneBlock;
import net.mcreator.foreigntechnologies.block.EtherdimensionPortalBlock;
import net.mcreator.foreigntechnologies.block.EtherSurfaceBlock;
import net.mcreator.foreigntechnologies.block.EtherStalkBlock;
import net.mcreator.foreigntechnologies.block.EtherSlateBrickBlock;
import net.mcreator.foreigntechnologies.block.EtherSlateBlock;
import net.mcreator.foreigntechnologies.block.EtherPurifierBlock;
import net.mcreator.foreigntechnologies.block.EtherPurifierAtiveBlock;
import net.mcreator.foreigntechnologies.block.EtherPanelBlock;
import net.mcreator.foreigntechnologies.block.EtherGlassBlock;
import net.mcreator.foreigntechnologies.block.EtherGeneratorBlock;
import net.mcreator.foreigntechnologies.block.DistortionBlock;
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

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			EtherGeneratorBlock.registerRenderLayer();
			EtherGlassBlock.registerRenderLayer();
			KorisFenceBlock.registerRenderLayer();
			KorisGlassBlock.registerRenderLayer();
		}
	}
}
