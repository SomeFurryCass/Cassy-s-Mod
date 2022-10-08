
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foreigntechnologies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.foreigntechnologies.block.entity.EtherPurifierBlockEntity;
import net.mcreator.foreigntechnologies.ForeignTechnologiesMod;

public class ForeignTechnologiesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			ForeignTechnologiesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ETHER_PURIFIER = register("ether_purifier", ForeignTechnologiesModBlocks.ETHER_PURIFIER,
			EtherPurifierBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
