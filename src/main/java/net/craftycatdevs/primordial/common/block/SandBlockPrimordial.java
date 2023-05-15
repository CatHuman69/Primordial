package net.craftycatdevs.primordial.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class SandBlockPrimordial extends FallingBlock {
    private final int dustColor;

    public SandBlockPrimordial(int p_55967_, BlockBehaviour.Properties properties) {
        super(properties);
        this.dustColor = p_55967_;
    }

    public int getDustColor(BlockState state, BlockGetter world, BlockPos pos) {
        return this.dustColor;
    }
}