
package net.mcreator.foreigntechnologies.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class EtheroverworldBiome {

	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(
			Climate.Parameter.span(-0.404761904763f, -0.261904761905f), Climate.Parameter.span(-1.071428571429f, -0.928571428571f),
			Climate.Parameter.span(0.438571428571f, 0.581428571429f), Climate.Parameter.span(0.728571428571f, 0.871428571429f),
			Climate.Parameter.point(0), Climate.Parameter.span(-0.910207420517f, -0.767350277659f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16777216).waterColor(-13421773).waterFogColor(-13421773)
				.skyColor(-16777216).foliageColorOverride(-13421773).grassColorOverride(-13421773)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("foreign_technologies:etheraudio1")))
				.ambientParticle(new AmbientParticleSettings((SimpleParticleType) (ForeignTechnologiesModParticleTypes.ETHER.get()), 0.05f)).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register(
				"foreign_technologies:tree_etheroverworld",
				FeatureUtils.register("foreign_technologies:tree_etheroverworld", Feature.TREE,
						new TreeConfiguration.TreeConfigurationBuilder(
								BlockStateProvider.simple(ForeignTechnologiesModBlocks.ETHER_STALK.get().defaultBlockState()),
								new GiantTrunkPlacer(20, 2, 14),
								BlockStateProvider.simple(ForeignTechnologiesModBlocks.ETHER_GLASS.get().defaultBlockState()),
								new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
								new TwoLayersFeatureSize(1, 1, 2))
								.decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL.defaultBlockState()))))
								.decorators(ImmutableList.of(EtheroverworldLeaveDecorator.INSTANCE, EtheroverworldTrunkDecorator.INSTANCE

										, EtheroverworldFruitDecorator.INSTANCE))
								.build()),
				List.of(CountPlacement.of(2), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0),
						PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));

		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.NONE).temperature(0f).downfall(0f)
				.specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}

	public static void init() {
	}

}
