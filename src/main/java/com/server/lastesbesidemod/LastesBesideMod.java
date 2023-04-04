package com.server.lastesbesidemod;

import com.mojang.logging.LogUtils;
import com.server.lastesbesidemod.items.ModCreativeModeTabs;
import com.server.lastesbesidemod.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LastesBesideMod.MODID)
public class LastesBesideMod {
    public static final String MODID = "lastesbesidemod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public LastesBesideMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.MATERIALS_TAB) {
            // Skins - Feathers
                // Skins
            event.accept(ModItems.LYNX_SKIN);
            event.accept(ModItems.YETI_SKIN);
                //Feathers
            event.accept(ModItems.GIANT_FEATHER);

            //  Crystals - Ores - Logs
                // Logs

                // Ores
            event.accept(ModItems.ROCK_FRAGMENT);
            event.accept(ModItems.DAWN_QUARTZ);
            event.accept(ModItems.SLEEP_AMETHYST);
                // Crystals
            event.accept(ModItems.ICE_CRYSTAL);


        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
