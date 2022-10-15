
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.foreigntechnologies.world.biome.TheCorruptionBiome;
import net.mcreator.foreigntechnologies.world.biome.EtheroverworldBiome;
import net.mcreator.foreigntechnologies.world.biome.EtherdeeplandsBiome;
import net.mcreator.foreigntechnologies.world.biome.EtherHighlandsBiome;
import net.mcreator.foreigntechnologies.ForeignTechnologiesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForeignTechnologiesModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ForeignTechnologiesMod.MODID);
	public static final RegistryObject<Biome> ETHEROVERWORLD = REGISTRY.register("etheroverworld", () -> EtheroverworldBiome.createBiome());
	public static final RegistryObject<Biome> ETHERDEEPLANDS = REGISTRY.register("etherdeeplands", () -> EtherdeeplandsBiome.createBiome());
	public static final RegistryObject<Biome> THE_CORRUPTION = REGISTRY.register("the_corruption", () -> TheCorruptionBiome.createBiome());
	public static final RegistryObject<Biome> ETHER_HIGHLANDS = REGISTRY.register("ether_highlands", () -> EtherHighlandsBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EtheroverworldBiome.init();
			EtherdeeplandsBiome.init();
			TheCorruptionBiome.init();
			EtherHighlandsBiome.init();
		});
	}
}
