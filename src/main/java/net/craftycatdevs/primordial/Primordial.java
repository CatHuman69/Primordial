package net.craftycatdevs.primordial;

import com.mojang.logging.LogUtils;
import net.craftycatdevs.primordial.init.PrimordialBlocks;
import net.craftycatdevs.primordial.init.PrimordialTabs;
import net.craftycatdevs.primordial.init.PrimordialItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Primordial.MODID)
public class Primordial {
    public static final String MODID = "primordial";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // Very Important Comment
    public Primordial() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        PrimordialItems.register(modEventBus);
        PrimordialBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == PrimordialTabs.PRIMORDIAL_MISCELLANEOUS) {
            event.accept(PrimordialItems.AMBER);
            event.accept(PrimordialItems.AMBER_MOSQUITO);
            event.accept(PrimordialItems.AMBER_APHID);
            event.accept(PrimordialItems.GYPSUM_POWDER);
        }

        if(event.getTab() == PrimordialTabs.PRIMORDIAL_BLOCKS) {
            event.accept(PrimordialBlocks.AMBER_BLOCK);
            event.accept(PrimordialBlocks.AMBER_ORE);
            event.accept(PrimordialBlocks.DEEPSLATE_AMBER_ORE);
            event.accept(PrimordialBlocks.SHALE);
            event.accept(PrimordialBlocks.MUDSTONE);
            event.accept(PrimordialBlocks.SILTSTONE);
            event.accept(PrimordialBlocks.CHALK);
            event.accept(PrimordialBlocks.LIMESTONE);
            event.accept(PrimordialBlocks.GYPSUM);
            event.accept(PrimordialBlocks.DIRT_MOSS);
            event.accept(PrimordialBlocks.LOAM);
            event.accept(PrimordialBlocks.SILT);
            event.accept(PrimordialBlocks.PEAT);
            event.accept(PrimordialBlocks.DRIED_SALT);
            event.accept(PrimordialBlocks.OVERGROWN_BLACK_SAND);
            event.accept(PrimordialBlocks.BLACK_SAND);
            event.accept(PrimordialBlocks.BLACK_SANDSTONE);
            event.accept(PrimordialBlocks.CHISELED_BLACK_SANDSTONE);
            event.accept(PrimordialBlocks.CUT_BLACK_SANDSTONE);
            event.accept(PrimordialBlocks.SMOOTH_BLACK_SANDSTONE);
            event.accept(PrimordialBlocks.WHITE_SAND);
            event.accept(PrimordialBlocks.WHITE_SANDSTONE);
            event.accept(PrimordialBlocks.CHISELED_WHITE_SANDSTONE);
            event.accept(PrimordialBlocks.CUT_WHITE_SANDSTONE);
            event.accept(PrimordialBlocks.SMOOTH_WHITE_SANDSTONE);
            event.accept(PrimordialBlocks.POLISHED_SHALE);
            event.accept(PrimordialBlocks.POLISHED_MUDSTONE);
            event.accept(PrimordialBlocks.POLISHED_SILTSTONE);
            event.accept(PrimordialBlocks.POLISHED_CHALK);
            event.accept(PrimordialBlocks.REINFORCED_GLASS);
            event.accept(PrimordialBlocks.SEQUOIADENDRON_LEAVES);
            event.accept(PrimordialBlocks.SEQUOIADENDRON_LOG);
            event.accept(PrimordialBlocks.SEQUOIADENDRON_WOOD);
            event.accept(PrimordialBlocks.STRIPPED_SEQUOIADENDRON_LOG);
            event.accept(PrimordialBlocks.STRIPPED_SEQUOIADENDRON_WOOD);
            event.accept(PrimordialBlocks.SEQUOIADENDRON_PLANKS);
            event.accept(PrimordialBlocks.SEQUOIADENDRON_SAPLING);


        }

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}