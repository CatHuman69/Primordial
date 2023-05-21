package net.craftycatdevs.primordial.init;

import net.craftycatdevs.primordial.Primordial;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Primordial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PrimordialTabs {
    public static CreativeModeTab PRIMORDIAL_MISCELLANEOUS;
    public static CreativeModeTab PRIMORDIAL_BLOCKS;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        PRIMORDIAL_MISCELLANEOUS = event.registerCreativeModeTab(new ResourceLocation(Primordial.MODID, "primordial_miscellaneous"),
                builder -> builder.icon(() -> new ItemStack(PrimordialItems.AMBER.get()))
                        .title(Component.translatable("creativemodetab.primordial_miscellaneous")));

        PRIMORDIAL_BLOCKS = event.registerCreativeModeTab(new ResourceLocation(Primordial.MODID, "primordial_blocks"),
                builder -> builder.icon(() -> new ItemStack(PrimordialBlocks.AMBER_BLOCK.get()))
                        .title(Component.translatable("creativemodetab.primordial_blocks")));

    }
}

