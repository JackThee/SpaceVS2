
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spacevs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.spacevs.block.WhiteSpaceshipBlockBlock;
import net.mcreator.spacevs.block.SpaceGlassBlock;
import net.mcreator.spacevs.block.RedSpaceshipBlockBlock;
import net.mcreator.spacevs.block.MoltenScrapBlock;
import net.mcreator.spacevs.block.GreySpaceshipBlockBlock;
import net.mcreator.spacevs.block.CyanSpaceshipBlockBlock;
import net.mcreator.spacevs.block.BlackSpaceshipBlockBlock;
import net.mcreator.spacevs.SpacevsMod;

public class SpacevsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SpacevsMod.MODID);
	public static final RegistryObject<Block> WHITE_SPACESHIP_BLOCK = REGISTRY.register("white_spaceship_block", () -> new WhiteSpaceshipBlockBlock());
	public static final RegistryObject<Block> BLACK_SPACESHIP_BLOCK = REGISTRY.register("black_spaceship_block", () -> new BlackSpaceshipBlockBlock());
	public static final RegistryObject<Block> GREY_SPACESHIP_BLOCK = REGISTRY.register("grey_spaceship_block", () -> new GreySpaceshipBlockBlock());
	public static final RegistryObject<Block> CYAN_SPACESHIP_BLOCK = REGISTRY.register("cyan_spaceship_block", () -> new CyanSpaceshipBlockBlock());
	public static final RegistryObject<Block> RED_SPACESHIP_BLOCK = REGISTRY.register("red_spaceship_block", () -> new RedSpaceshipBlockBlock());
	public static final RegistryObject<Block> MOLTEN_SCRAP = REGISTRY.register("molten_scrap", () -> new MoltenScrapBlock());
	public static final RegistryObject<Block> SPACE_GLASS = REGISTRY.register("space_glass", () -> new SpaceGlassBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
