
package net.mcreator.spacevs.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class MoltenScrapBlock extends Block {
	public MoltenScrapBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).lightLevel(s -> 3));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
