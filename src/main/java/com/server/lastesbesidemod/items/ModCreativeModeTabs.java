package com.server.lastesbesidemod.items;

import com.server.lastesbesidemod.LastesBesideMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LastesBesideMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MATERIALS_TAB;
    public static CreativeModeTab BLOCKS_TAB;
    public static CreativeModeTab EQUIPMENT_TAB;
    public static CreativeModeTab MONSTERS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        MATERIALS_TAB = event.registerCreativeModeTab(new ResourceLocation(LastesBesideMod.MODID, "lastestbeside_tab_mat"),
                builder -> builder.icon(() -> new ItemStack(ModItems.LYNX_SKIN.get()))
                        .title(Component.translatable("creativemodetab.lastestbeside_tab_mat")));
        EQUIPMENT_TAB = event.registerCreativeModeTab(new ResourceLocation(LastesBesideMod.MODID, "lastestbeside_tab_equip"),
                builder -> builder.icon(() -> new ItemStack(ModItems.LYNX_SKIN.get()))
                        .title(Component.translatable("creativemodetab.lastestbeside_tab_equip")));
        MONSTERS_TAB = event.registerCreativeModeTab(new ResourceLocation(LastesBesideMod.MODID, "lastestbeside_tab_mobs"),
                builder -> builder.icon(() -> new ItemStack(ModItems.LYNX_SKIN.get()))
                        .title(Component.translatable("creativemodetab.lastestbeside_tab_mobs")));
        BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(LastesBesideMod.MODID, "lastestbeside_tab_blocs"),
                builder -> builder.icon(() -> new ItemStack(ModItems.LYNX_SKIN.get()))
                        .title(Component.translatable("creativemodetab.lastestbeside_tab_blocks")));
    }
}
