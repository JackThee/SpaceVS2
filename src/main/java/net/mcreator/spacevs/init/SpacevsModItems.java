
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spacevs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.spacevs.SpacevsMod;

public class SpacevsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpacevsMod.MODID);
	public static final RegistryObject<Item> WHITE_SPACESHIP_BLOCK = block(SpacevsModBlocks.WHITE_SPACESHIP_BLOCK);
	public static final RegistryObject<Item> BLACK_SPACESHIP_BLOCK = block(SpacevsModBlocks.BLACK_SPACESHIP_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
