package com.ganeowner.netherupdate;

import com.ganeowner.netherupdate.block.ModBlocks;
import com.ganeowner.netherupdate.item.ModItems;
import com.ganeowner.netherupdate.villager.ModVillagers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;



// The value here should match an entry in the META-INF/mods.toml file
@Mod(Netherupdate.MOD_ID)
public class Netherupdate {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();
    public static final String MOD_ID = "netherupdate";

    public Netherupdate() {
        // Register the setup method for modloading
        eventbus.addListener(this::setup);

        ModItems.register(eventbus);
        ModBlocks.register(eventbus);


        ModVillagers.register(eventbus);

        MinecraftForge.EVENT_BUS.register(this);

    }
    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }



}
