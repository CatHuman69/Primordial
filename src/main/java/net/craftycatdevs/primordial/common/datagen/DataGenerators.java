package net.craftycatdevs.primordial.common.datagen;

import net.craftycatdevs.primordial.Primordial;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Primordial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new PrimordialRecipeProvider(packOutput));
        generator.addProvider(true, new PrimordialBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new PrimordialItemModelProvider(packOutput, existingFileHelper));
    }
}