
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spacevs.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.spacevs.SpacevsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpacevsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpacevsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SpacevsModBlocks.BLACK_SPACESHIP_BLOCK.get().asItem());
			tabData.accept(SpacevsModBlocks.WHITE_SPACESHIP_BLOCK.get().asItem());
			tabData.accept(SpacevsModBlocks.GREY_SPACESHIP_BLOCK.get().asItem());
			tabData.accept(SpacevsModBlocks.CYAN_SPACESHIP_BLOCK.get().asItem());
			tabData.accept(SpacevsModBlocks.RED_SPACESHIP_BLOCK.get().asItem());
			tabData.accept(SpacevsModBlocks.MOLTEN_SCRAP.get().asItem());
			tabData.accept(SpacevsModBlocks.SPACE_GLASS.get().asItem());
			tabData.accept(SpacevsModBlocks.RACK.get().asItem());
			tabData.accept(SpacevsModBlocks.TIN_CRYSTALS.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SpacevsModItems.RAW_COMPOSITE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SpacevsModItems.MINING_LASER.get());
		}
	}
}
