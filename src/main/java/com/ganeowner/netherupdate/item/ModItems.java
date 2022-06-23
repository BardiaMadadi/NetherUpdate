package com.ganeowner.netherupdate.item;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.creativemodetab.NetherUpdateCreativeModeTab;
import com.ganeowner.netherupdate.item.custom.BasaltSword;
import com.ganeowner.netherupdate.item.custom.MagmaSword;
import com.ganeowner.netherupdate.item.custom.SoulSword;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS,
            Netherupdate.MOD_ID
    );


    // SWORDS :
    public static final RegistryObject<Item> SOUL_SWORD = ITEMS.register("soul_sword",
            () -> new SoulSword(Tiers.DIAMOND, 3, -3.6F, (new Item.Properties())
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));

    public static final RegistryObject<Item> MAGMA_SWORD = ITEMS.register("magma_sword",
            () -> new MagmaSword(Tiers.DIAMOND, 2, -3.6F, (new Item.Properties())
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));

    public static final RegistryObject<Item> BASALT_SWORD = ITEMS.register("basalt_sword",
            () -> new BasaltSword(Tiers.DIAMOND, 2, -3.6F, (new Item.Properties())
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));

    // INGOTS :
    public static final RegistryObject<Item> SOUL_INGOT = ITEMS.register("soul_ingot",
            () -> new Item(new Item.Properties()
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));
    public static final RegistryObject<Item> MAGMA_INGOT = ITEMS.register("magma_ingot",
            () -> new Item(new Item.Properties()
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));
    public static final RegistryObject<Item> BASALT_INGOT = ITEMS.register("basalt_ingot",
            () -> new Item(new Item.Properties()
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));
    // RAW INGOTS :
    public static final RegistryObject<Item> RAW_SOUL_INGOT = ITEMS.register("raw_soul_ingot",
            () -> new Item(new Item.Properties()
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));
    public static final RegistryObject<Item> RAW_MAGMA_INGOT = ITEMS.register("raw_magma_ingot",
            () -> new Item(new Item.Properties()
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));

    public static final RegistryObject<Item> RAW_BASALT_INGOT = ITEMS.register("raw_basalt_ingot",
            () -> new Item(new Item.Properties()
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));

    // OTHERS :


    public static final RegistryObject<Item> STONE_STICK = ITEMS.register("stone_stick",
            () -> new Item(new Item.Properties()
                    .tab(NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab)));



    // Helpers :
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
