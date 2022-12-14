
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForeignTechnologiesModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("foreign_technologies", "etheraudio1"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "etheraudio1")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "otherworldysounds"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "otherworldysounds")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "etherportalsound"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "etherportalsound")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "corruption"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "corruption")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "watcherdeath"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "watcherdeath")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "watcherhurt"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "watcherhurt")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "watchersounds"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "watchersounds")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "etheraudiolow"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "etheraudiolow")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "korisplatebreak"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "korisplatebreak")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "korisplatestep"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "korisplatestep")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "korisplatehit"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "korisplatehit")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "metalbreakloud"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "metalbreakloud")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "metalsteploud"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "metalsteploud")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "metalhitloud"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "metalhitloud")));
		REGISTRY.put(new ResourceLocation("foreign_technologies", "highlands"),
				new SoundEvent(new ResourceLocation("foreign_technologies", "highlands")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
