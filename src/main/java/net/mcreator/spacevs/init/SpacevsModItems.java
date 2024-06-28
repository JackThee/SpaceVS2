
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

import net.mcreator.spacevs.item.RawCompositeItem;
import net.mcreator.spacevs.item.CompositePlatingItem;
import net.mcreator.spacevs.item.BlackDyePasteItem;
import net.mcreator.spacevs.SpacevsMod;

public class SpacevsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpacevsMod.MODID);
	public static final RegistryObject<Item> WHITE_SPACESHIP_BLOCK = block(SpacevsModBlocks.WHITE_SPACESHIP_BLOCK);
	public static final RegistryObject<Item> BLACK_SPACESHIP_BLOCK = block(SpacevsModBlocks.BLACK_SPACESHIP_BLOCK);
	public static final RegistryObject<Item> GREY_SPACESHIP_BLOCK = block(SpacevsModBlocks.GREY_SPACESHIP_BLOCK);
	public static final RegistryObject<Item> CYAN_SPACESHIP_BLOCK = block(SpacevsModBlocks.CYAN_SPACESHIP_BLOCK);
	public static final RegistryObject<Item> RED_SPACESHIP_BLOCK = block(SpacevsModBlocks.RED_SPACESHIP_BLOCK);
	public static final RegistryObject<Item> MOLTEN_SCRAP = block(SpacevsModBlocks.MOLTEN_SCRAP);
	public static final RegistryObject<Item> RAW_COMPOSITE = REGISTRY.register("raw_composite", () -> new RawCompositeItem());
	public static final RegistryObject<Item> COMPOSITE_PLATING = REGISTRY.register("composite_plating", () -> new CompositePlatingItem());
	public static final RegistryObject<Item> BLACK_DYE_PASTE = REGISTRY.register("black_dye_paste", () -> new BlackDyePasteItem());
	public static final RegistryObject<Item> SPACE_GLASS = block(SpacevsModBlocks.SPACE_GLASS);
	public static final RegistryObject<Item> RACK = block(SpacevsModBlocks.RACK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
