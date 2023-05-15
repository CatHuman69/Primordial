package net.craftycatdevs.primordial.common.datagen;

import net.craftycatdevs.primordial.Primordial;
import net.craftycatdevs.primordial.init.PrimordialBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class PrimordialBlockStateProvider extends BlockStateProvider {
    public PrimordialBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Primordial.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(PrimordialBlocks.AMBER_BLOCK);
        blockWithItem(PrimordialBlocks.AMBER_ORE);
        blockWithItem(PrimordialBlocks.DEEPSLATE_AMBER_ORE);
        blockWithItem(PrimordialBlocks.BLACK_SAND);
        blockWithItem(PrimordialBlocks.BLACK_SANDSTONE);
        blockWithItem(PrimordialBlocks.CHISELED_BLACK_SANDSTONE);
        blockWithItem(PrimordialBlocks.CUT_BLACK_SANDSTONE);
        blockWithItem(PrimordialBlocks.SMOOTH_BLACK_SANDSTONE);
        blockWithItem(PrimordialBlocks.SILTSTONE);
        blockWithItem(PrimordialBlocks.GYPSUM);
        blockWithItem(PrimordialBlocks.CHALK);
        blockWithItem(PrimordialBlocks.MUDSTONE);
        blockWithItem(PrimordialBlocks.LOAM);
        blockWithItem(PrimordialBlocks.LIMESTONE);
        blockWithItem(PrimordialBlocks.SHALE);
        blockWithItem(PrimordialBlocks.PEAT);
        blockWithItem(PrimordialBlocks.DRIED_SALT);
        blockWithItem(PrimordialBlocks.SILT);
        blockWithItem(PrimordialBlocks.DIRT_MOSS);
        blockWithItem(PrimordialBlocks.WHITE_SAND);
        blockWithItem(PrimordialBlocks.WHITE_SANDSTONE);
        blockWithItem(PrimordialBlocks.CHISELED_WHITE_SANDSTONE);
        blockWithItem(PrimordialBlocks.CUT_WHITE_SANDSTONE);
        blockWithItem(PrimordialBlocks.SMOOTH_WHITE_SANDSTONE);
        blockWithItem(PrimordialBlocks.POLISHED_CHALK);
        blockWithItem(PrimordialBlocks.POLISHED_LIMESTONE);
        blockWithItem(PrimordialBlocks.POLISHED_MUDSTONE);
        blockWithItem(PrimordialBlocks.POLISHED_SHALE);
        blockWithItem(PrimordialBlocks.POLISHED_SILTSTONE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

    }
}
