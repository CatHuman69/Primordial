package net.craftycatdevs.primordial.common.datagen;

import net.craftycatdevs.primordial.Primordial;
import net.craftycatdevs.primordial.init.PrimordialBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Primordial.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(PrimordialBlocks.POLISHED_CHALK);
        blockWithItem(PrimordialBlocks.POLISHED_LIMESTONE);
        blockWithItem(PrimordialBlocks.POLISHED_MUDSTONE);
        blockWithItem(PrimordialBlocks.POLISHED_SHALE);
        blockWithItem(PrimordialBlocks.POLISHED_SILTSTONE);
        
        logBlock(((RotatedPillarBlock) PrimordialBlocks.SEQUOIADENDRON_LOG.get()));
        axisBlock((RotatedPillarBlock) PrimordialBlocks.SEQUOIADENDRON_WOOD.get(), blockTexture(PrimordialBlocks.SEQUOIADENDRON_LOG.get()), blockTexture(PrimordialBlocks.SEQUOIADENDRON_LOG.get()));
        axisBlock((RotatedPillarBlock) PrimordialBlocks.STRIPPED_SEQUOIADENDRON_LOG.get(), new ResourceLocation(Primordial.MODID, "block/stripped_sequoiadendron_log"),
                new ResourceLocation(Primordial.MODID, "block/stripped_sequoiadendron_log_top"));
        axisBlock((RotatedPillarBlock) PrimordialBlocks.STRIPPED_SEQUOIADENDRON_WOOD.get(), new ResourceLocation(Primordial.MODID, "block/stripped_sequoiadendron_log"),
                new ResourceLocation(Primordial.MODID, "block/stripped_sequoiadendron_log"));

        blockWithItem(PrimordialBlocks.SEQUOIADENDRON_PLANKS);
        blockWithItem(PrimordialBlocks.SEQUOIADENDRON_LEAVES);
        saplingBlock(PrimordialBlocks.SEQUOIADENDRON_SAPLING);

        simpleBlockItem(PrimordialBlocks.SEQUOIADENDRON_LOG.get(), models().withExistingParent("primordial:sequoiadendron_log", "minecraft:block/cube_column"));
        simpleBlockItem(PrimordialBlocks.SEQUOIADENDRON_WOOD.get(), models().withExistingParent("primordial:sequoiadendron_wood", "minecraft:block/cube_column"));
        simpleBlockItem(PrimordialBlocks.STRIPPED_SEQUOIADENDRON_LOG.get(), models().withExistingParent("primordial:stripped_sequoiadendron_log", "minecraft:block/cube_column"));
        simpleBlockItem(PrimordialBlocks.STRIPPED_SEQUOIADENDRON_WOOD.get(), models().withExistingParent("primordial:stripped_sequoiadendron_wood", "minecraft:block/cube_column"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

    }
    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}

