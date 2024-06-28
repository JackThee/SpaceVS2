package net.mcreator.spacevs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MiningLaserRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:mining/laserable")))) {
			if (99 < itemstack.getDamageValue()) {
				if (!(entity instanceof Player _plrCldCheck5 && _plrCldCheck5.getCooldowns().isOnCooldown(itemstack.getItem()))) {
					world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 1);
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
				}
			}
		}
	}
}
