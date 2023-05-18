package net.craftycatdevs.primordial.common.datagen;

import net.craftycatdevs.primordial.Primordial;
import net.craftycatdevs.primordial.init.PrimordialItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Primordial.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(PrimordialItems.AMBER);
        simpleItem(PrimordialItems.AMBER_APHID);
        simpleItem(PrimordialItems.AMBER_MOSQUITO);
        simpleItem(PrimordialItems.GYPSUM_POWDER);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Primordial.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Primordial.MODID,"item/" + item.getId().getPath()));


    }
}
