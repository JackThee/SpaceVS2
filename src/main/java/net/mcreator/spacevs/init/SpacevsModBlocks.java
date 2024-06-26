
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spacevs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.spacevs.block.WhiteSpaceshipBlockBlock;
import net.mcreator.spacevs.SpacevsMod;

public class SpacevsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SpacevsMod.MODID);
	public static final RegistryObject<Block> WHITE_SPACESHIP_BLOCK = REGISTRY.register("white_spaceship_block", () -> new WhiteSpaceshipBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
