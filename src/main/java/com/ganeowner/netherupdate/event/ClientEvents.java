package com.ganeowner.netherupdate.event;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.block.ModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Netherupdate.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SOUL_ORE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGMA_ORE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BASALT_ORE.get(), RenderType.translucent());
    }
}
