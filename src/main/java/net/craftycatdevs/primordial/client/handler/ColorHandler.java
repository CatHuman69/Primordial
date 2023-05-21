package net.craftycatdevs.primordial.client.handler;

import net.craftycatdevs.primordial.init.PrimordialBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid="primordial", value={Dist.CLIENT}, bus=Mod.EventBusSubscriber.Bus.MOD)
public class ColorHandler {
    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.getBlockColors().register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor((BlockAndTintGetter)world,
                (BlockPos)pos) : FoliageColor.getDefaultColor(), new Block[]{(Block)PrimordialBlocks.SEQUOIADENDRON_LEAVES.get()});
        event.getBlockColors().register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getAverageFoliageColor((BlockAndTintGetter)world,
                (BlockPos)pos) : GrassColor.get((double)0.5, (double)1.0), new Block[]{(Block)PrimordialBlocks.OVERGROWN_BLACK_SAND.get()});
    }
}