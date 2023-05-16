package net.craftycatdevs.primordial.init;

import net.craftycatdevs.primordial.Primordial;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class PrimordialBlocks {

    public final static DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Primordial.MODID);

    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).sound(SoundType.METAL).strength(6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(5f).requiresCorrectToolForDrops(),
                    UniformInt.of(2, 5)));
    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DEEPSLATE).sound(SoundType.DEEPSLATE).strength(4.5F, 3.0F).requiresCorrectToolForDrops(),
                    UniformInt.of(2, 5)));
    public static final RegistryObject<Block> SILTSTONE = registerBlock("siltstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SHALE = registerBlock("shale",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHALK = registerBlock("chalk",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUDSTONE = registerBlock("mudstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GYPSUM = registerBlock("gypsum",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIRT_MOSS = registerBlock("dirt_moss",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GREEN).strength(0.6F).sound(SoundType.ROOTED_DIRT)));
    public static final RegistryObject<Block> LOAM = registerBlock("loam",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BROWN).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> SILT = registerBlock("silt",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> PEAT = registerBlock("peat",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_BLACK).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> BLACK_SANDSTONE = registerBlock("black_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> CHISELED_BLACK_SANDSTONE = registerBlock("chiseled_black_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> CUT_BLACK_SANDSTONE = registerBlock("cut_black_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> SMOOTH_BLACK_SANDSTONE = registerBlock("smooth_black_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> WHITE_SAND = registerBlock("white_sand",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of(Material.SAND).strength(0.5F).sound(SoundType.SAND)));
    public static final RegistryObject<Block> WHITE_SANDSTONE = registerBlock("white_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> CHISELED_WHITE_SANDSTONE = registerBlock("chiseled_white_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> CUT_WHITE_SANDSTONE = registerBlock("cut_white_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> SMOOTH_WHITE_SANDSTONE = registerBlock("smooth_white_sandstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(0.8F)));
    public static final RegistryObject<Block> DRIED_SALT = registerBlock("dried_salt",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_GRAY).strength(0.5F).sound(SoundType.GRAVEL)));
    public static final RegistryObject<Block> POLISHED_SILTSTONE  = registerBlock("polished_siltstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_LIMESTONE  = registerBlock("polished_limestone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_SHALE  = registerBlock("polished_shale",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_CHALK  = registerBlock("polished_chalk",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_MUDSTONE  = registerBlock("polished_mudstone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));





    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockIten(name, toReturn);
        return toReturn;

    }


    private static <T extends Block> RegistryObject<Item> registerBlockIten(String name, RegistryObject<T>block) {
        return PrimordialItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
