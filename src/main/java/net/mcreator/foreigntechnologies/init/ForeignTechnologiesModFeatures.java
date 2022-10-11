
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

import net.mcreator.foreigntechnologies.world.features.plants.StellarSaplingFeature;
import net.mcreator.foreigntechnologies.world.features.ores.KorisslateoreFeature;
import net.mcreator.foreigntechnologies.world.features.ores.KorisOreFeature;
import net.mcreator.foreigntechnologies.world.features.ores.EtheriumClusterFeature;
import net.mcreator.foreigntechnologies.world.features.ores.EtherDropOreFeature;
import net.mcreator.foreigntechnologies.world.features.ores.AzemSlateFeature;
import net.mcreator.foreigntechnologies.world.features.ores.AzemOreFeature;
import net.mcreator.foreigntechnologies.world.features.StellarTreeFeature;
import net.mcreator.foreigntechnologies.world.features.SmallstalkFeature;
import net.mcreator.foreigntechnologies.world.features.LargestalkFeature;
import net.mcreator.foreigntechnologies.world.features.HugestalkFeature;
import net.mcreator.foreigntechnologies.world.features.EtherstalktreenormalFeature;
import net.mcreator.foreigntechnologies.ForeignTechnologiesMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ForeignTechnologiesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForeignTechnologiesMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ETHERSTALKTREENORMAL = register("etherstalktreenormal", EtherstalktreenormalFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EtherstalktreenormalFeature.GENERATE_BIOMES,
					EtherstalktreenormalFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SMALLSTALK = register("smallstalk", SmallstalkFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, SmallstalkFeature.GENERATE_BIOMES, SmallstalkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LARGESTALK = register("largestalk", LargestalkFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, LargestalkFeature.GENERATE_BIOMES, LargestalkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HUGESTALK = register("hugestalk", HugestalkFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HugestalkFeature.GENERATE_BIOMES, HugestalkFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KORIS_ORE = register("koris_ore", KorisOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, KorisOreFeature.GENERATE_BIOMES, KorisOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KORISSLATEORE = register("korisslateore", KorisslateoreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, KorisslateoreFeature.GENERATE_BIOMES, KorisslateoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ETHER_DROP_ORE = register("ether_drop_ore", EtherDropOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, EtherDropOreFeature.GENERATE_BIOMES, EtherDropOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ETHERIUM_CLUSTER = register("etherium_cluster", EtheriumClusterFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EtheriumClusterFeature.GENERATE_BIOMES,
					EtheriumClusterFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AZEM_ORE = register("azem_ore", AzemOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AzemOreFeature.GENERATE_BIOMES, AzemOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AZEM_SLATE = register("azem_slate", AzemSlateFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AzemSlateFeature.GENERATE_BIOMES, AzemSlateFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STELLAR_SAPLING = register("stellar_sapling", StellarSaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, StellarSaplingFeature.GENERATE_BIOMES,
					StellarSaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STELLAR_TREE = register("stellar_tree", StellarTreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, StellarTreeFeature.GENERATE_BIOMES, StellarTreeFeature::placedFeature));

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
