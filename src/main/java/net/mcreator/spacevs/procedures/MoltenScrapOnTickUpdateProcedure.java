package net.mcreator.spacevs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class MoltenScrapOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (9 < Mth.nextInt(RandomSource.create(), 1, 10)) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 5, 1, 1, 1, 5);
		}
	}
}
