package net.craftycatdevs.primordial.init;

import net.craftycatdevs.primordial.Primordial;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PrimordialItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Primordial.MODID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMBER_MOSQUITO = ITEMS.register("amber_mosquito",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMBER_APHID = ITEMS.register("amber_aphid",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
