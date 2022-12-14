
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.foreigntechnologies.ForeignTechnologiesMod;

public class ForeignTechnologiesModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			ForeignTechnologiesMod.MODID);
	public static final RegistryObject<ParticleType<?>> ETHER = REGISTRY.register("ether", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> ETHERDUST = REGISTRY.register("etherdust", () -> new SimpleParticleType(false));
}
