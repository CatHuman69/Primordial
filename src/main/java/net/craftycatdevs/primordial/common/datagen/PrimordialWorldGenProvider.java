package net.craftycatdevs.primordial.common.datagen;

import net.craftycatdevs.primordial.Primordial;
import net.craftycatdevs.primordial.common.worldgen.PrimordialConfiguredFeatures;
import net.craftycatdevs.primordial.common.worldgen.PrimordialPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class PrimordialWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, PrimordialConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, PrimordialPlacedFeatures::bootstrap);

    public PrimordialWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Primordial.MODID));
    }
}
