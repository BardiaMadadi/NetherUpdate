package com.ganeowner.netherupdate.villager;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.block.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, Netherupdate.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS
            = DeferredRegister.create(ForgeRegistries.PROFESSIONS,Netherupdate.MOD_ID);

    // BASALT VILLAGER :

    public static final RegistryObject<PoiType> BASALT_STATION_POI = POI_TYPES.register("basalt_station_poi",
            ()-> new PoiType("basalt_station_poi", PoiType.getBlockStates(ModBlocks.BASALT_ORE_BLOCK.get()),1,1));


    public static final RegistryObject<VillagerProfession> BASALT_PROFESSION = VILLAGER_PROFESSIONS.register("basalt_profession",
            ()-> new VillagerProfession("basalt_profession", BASALT_STATION_POI.get(), ImmutableSet.of(),ImmutableSet.of(), SoundEvents.VILLAGER_WORK_MASON));

    // MAGMA VILLAGER :

    public static final RegistryObject<PoiType> MAGMA_STATION_POI = POI_TYPES.register("magma_station_poi",
            ()-> new PoiType("magma_station_poi", PoiType.getBlockStates(ModBlocks.MAGMA_ORE_BLOCK.get()),1,1));


    public static final RegistryObject<VillagerProfession> MAGMA_PROFESSION = VILLAGER_PROFESSIONS.register("magma_profession",
            ()-> new VillagerProfession("magma_profession", MAGMA_STATION_POI.get(), ImmutableSet.of(),ImmutableSet.of(), SoundEvents.VILLAGER_WORK_MASON));

    // SOUL VILLAGER :

    public static final RegistryObject<PoiType> SOUL_STATION_POI = POI_TYPES.register("soul_station_poi",
            ()-> new PoiType("soul_station_poi", PoiType.getBlockStates(ModBlocks.SOUL_ORE_BLOCK.get()),1,1));


    public static final RegistryObject<VillagerProfession> SOUL_PROFESSION = VILLAGER_PROFESSIONS.register("soul_profession",
            ()-> new VillagerProfession("soul_profession", SOUL_STATION_POI.get(), ImmutableSet.of(),ImmutableSet.of(), SoundEvents.VILLAGER_WORK_MASON));





    public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }


}
