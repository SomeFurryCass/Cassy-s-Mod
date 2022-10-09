
package net.mcreator.foreigntechnologies.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

public class TheCorruptionBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(
			Climate.Parameter.span(-0.404761904763f, -0.261904761905f), Climate.Parameter.span(-1.071428571429f, -0.928571428571f),
			Climate.Parameter.span(0.428571428571f, 0.571428571429f), Climate.Parameter.span(0.928571428571f, 1.071428571429f),
			Climate.Parameter.point(0), Climate.Parameter.span(0.760058440914f, 0.902915583772f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-1).waterColor(-1).waterFogColor(-1).skyColor(-1)
				.foliageColorOverride(-1).grassColorOverride(-1)
				.ambientLoopSound(new SoundEvent(new ResourceLocation("foreign_technologies:corruption"))).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
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
