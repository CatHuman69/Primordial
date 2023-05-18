package net.craftycatdevs.primordial.common.worldgen.feature.tree;

import net.craftycatdevs.primordial.common.worldgen.feature.configurations.PrimordialConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class SequoiadendronTreeFeature extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_222910_, boolean p_222911_) {
        return PrimordialConfiguredFeatures.SEQUOIADENDRON_KEY;
    }
}
