package com.ganeowner.netherupdate.block;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.creativemodetab.NetherUpdateCreativeModeTab;
import com.ganeowner.netherupdate.item.ModItems;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Netherupdate.MOD_ID);

    // ORE BLOCKS :

    public static final RegistryObject<Block> SOUL_ORE = registerBlock("soul_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .noCollission()
            )
            , NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab);


    public static final RegistryObject<Block> MAGMA_ORE = registerBlock("magma_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .noCollission()
            )
            , NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab);

    public static final RegistryObject<Block> BASALT_ORE = registerBlock("basalt_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .noCollission()
            )
            , NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab);


    // INGOT BLOCK :

    public static final RegistryObject<Block> MAGMA_ORE_BLOCK = registerBlock("magma_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            )
            , NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab);

    public static final RegistryObject<Block> SOUL_ORE_BLOCK = registerBlock("soul_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            )
            , NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab);
    public static final RegistryObject<Block> BASALT_ORE_BLOCK = registerBlock("basalt_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
            )
            , NetherUpdateCreativeModeTab.NetherUpdateCreativeModeTab);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
