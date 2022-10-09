
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.foreigntechnologies.world.features.EtherstalktreenormalFeature;
import net.mcreator.foreigntechnologies.world.features.EtherstalktreelargeFeature;
import net.mcreator.foreigntechnologies.world.features.EtherstalktreeFeature;
import net.mcreator.foreigntechnologies.world.features.EtherstalkhugeFeature;
import net.mcreator.foreigntechnologies.ForeignTechnologiesMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ForeignTechnologiesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForeignTechnologiesMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ETHERSTALKTREE = register("etherstalktree", EtherstalktreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EtherstalktreeFeature.GENERATE_BIOMES,
					EtherstalktreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ETHERSTALKTREENORMAL = register("etherstalktreenormal", EtherstalktreenormalFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EtherstalktreenormalFeature.GENERATE_BIOMES,
					EtherstalktreenormalFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ETHERSTALKTREELARGE = register("etherstalktreelarge", EtherstalktreelargeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EtherstalktreelargeFeature.GENERATE_BIOMES,
					EtherstalktreelargeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ETHERSTALKHUGE = register("etherstalkhuge", EtherstalkhugeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EtherstalkhugeFeature.GENERATE_BIOMES,
					EtherstalkhugeFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}