
package net.mcreator.foreigntechnologies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.foreigntechnologies.entity.WatcherEntity;

public class WatcherRenderer extends MobRenderer<WatcherEntity, GhastModel<WatcherEntity>> {
	public WatcherRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WatcherEntity entity) {
		return new ResourceLocation("foreign_technologies:textures/entities/watcherfiller.png");
	}
}
