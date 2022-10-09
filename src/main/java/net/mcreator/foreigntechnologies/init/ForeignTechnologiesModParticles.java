
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.foreigntechnologies.client.particle.EtherdustParticle;
import net.mcreator.foreigntechnologies.client.particle.EtherParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForeignTechnologiesModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ForeignTechnologiesModParticleTypes.ETHER.get(),
				EtherParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ForeignTechnologiesModParticleTypes.ETHERDUST.get(),
				EtherdustParticle::provider);
	}
}
