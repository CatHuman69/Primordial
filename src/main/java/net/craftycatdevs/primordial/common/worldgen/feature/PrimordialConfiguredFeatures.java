package net.craftycatdevs.primordial.common.worldgen.feature;

import net.craftycatdevs.primordial.Primordial;
import net.craftycatdevs.primordial.init.PrimordialBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class PrimordialConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SEQUOIADENDRON_KEY = registerKey("sequoiadendron");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AMBER_ORE_KEY = registerKey("amber_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, SEQUOIADENDRON_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(PrimordialBlocks.SEQUOIADENDRON_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.simple(PrimordialBlocks.SEQUOIADENDRON_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(OreConfiguration.target(stoneReplaceables,
                        PrimordialBlocks.AMBER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, PrimordialBlocks.DEEPSLATE_AMBER_ORE.get().defaultBlockState()));

        register(context, AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 9));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Primordial.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}