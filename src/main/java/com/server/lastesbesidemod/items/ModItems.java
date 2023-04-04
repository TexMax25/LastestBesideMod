package com.server.lastesbesidemod.items;

import com.server.lastesbesidemod.LastestBesideMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LastestBesideMod.MODID);

    public static final RegistryObject<Item> LYNX_SKIN = ITEMS.register("lynx_skin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_FRAGMENT = ITEMS.register("rock_fragment",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YETI_SKIN = ITEMS.register("yeti_skin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GIANT_FEATHER = ITEMS.register("giant_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICE_CRYSTAL = ITEMS.register("ice_crystal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
