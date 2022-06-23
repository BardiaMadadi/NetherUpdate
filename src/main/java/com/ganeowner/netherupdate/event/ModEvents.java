package com.ganeowner.netherupdate.event;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.block.ModBlocks;
import com.ganeowner.netherupdate.item.ModItems;
import com.ganeowner.netherupdate.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.List;
import java.util.Random;

@Mod.EventBusSubscriber(modid = Netherupdate.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void clientSetup(VillagerTradesEvent event) {

        if(event.getType() == ModVillagers.BASALT_PROFESSION.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();



            ItemStack raw_basalt_ingot = new ItemStack(ModItems.RAW_BASALT_INGOT.get(), 1);
            ItemStack basalt_ingot = new ItemStack(ModItems.BASALT_INGOT.get(), 1);
            ItemStack basalt = new ItemStack(Items.BASALT,16);
            ItemStack block_of_basalt = new ItemStack(ModBlocks.BASALT_ORE_BLOCK.get(),1);
            ItemStack basalt_sword = new ItemStack(ModItems.BASALT_SWORD.get(), 1);

            trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    raw_basalt_ingot,5,12,0.06F));

            trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    basalt_ingot,5,12,0.06F));

            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    basalt,5,12,0.06F));

            trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 33),
                    block_of_basalt,5,12,0.06F));

            trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 60),
                    basalt_sword,5,12,0.06F));



        }

        // magma villager :
        if(event.getType() == ModVillagers.MAGMA_PROFESSION.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> magma_trades = event.getTrades();



            ItemStack raw_basalt_ingot = new ItemStack(ModItems.RAW_MAGMA_INGOT.get(), 1);
            ItemStack basalt_ingot = new ItemStack(ModItems.MAGMA_INGOT.get(), 1);
            ItemStack basalt = new ItemStack(Items.MAGMA_BLOCK,16);
            ItemStack block_of_basalt = new ItemStack(ModBlocks.MAGMA_ORE_BLOCK.get(),1);
            ItemStack basalt_sword = new ItemStack(ModItems.MAGMA_SWORD.get(), 1);

            magma_trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    raw_basalt_ingot,5,12,0.06F));

            magma_trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    basalt_ingot,5,12,0.06F));

            magma_trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    basalt,5,12,0.06F));

            magma_trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 33),
                    block_of_basalt,5,12,0.06F));

            magma_trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 60),
                    basalt_sword,5,12,0.06F));



        }



        // soul villager :
        if(event.getType() == ModVillagers.SOUL_PROFESSION.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> soul_trades = event.getTrades();



            ItemStack raw_basalt_ingot = new ItemStack(ModItems.RAW_SOUL_INGOT.get(), 1);
            ItemStack basalt_ingot = new ItemStack(ModItems.SOUL_INGOT.get(), 1);
            ItemStack basalt = new ItemStack(Items.SOUL_SAND,16);
            ItemStack block_of_basalt = new ItemStack(ModBlocks.SOUL_ORE_BLOCK.get(),1);
            ItemStack basalt_sword = new ItemStack(ModItems.SOUL_SWORD.get(), 1);

            soul_trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 4),
                    raw_basalt_ingot,5,12,0.06F));

            soul_trades.get(1).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 15),
                    basalt_ingot,5,12,0.06F));

            soul_trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    basalt,5,12,0.06F));

            soul_trades.get(2).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 33),
                    block_of_basalt,5,12,0.06F));

            soul_trades.get(3).add((trader, rand) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 60),
                    basalt_sword,5,12,0.06F));


        }



    }
}
