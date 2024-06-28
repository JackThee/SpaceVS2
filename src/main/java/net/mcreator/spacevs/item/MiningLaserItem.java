
package net.mcreator.spacevs.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.spacevs.procedures.MiningLaserRightclickedOnBlockProcedure;

public class MiningLaserItem extends Item {
	public MiningLaserItem() {
		super(new Item.Properties().durability(150).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MiningLaserRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
