package com.ganeowner.netherupdate.world.feature;

import com.ganeowner.netherupdate.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> NETHER_SOUL_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.SOUL_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SOUL_ORE = FeatureUtils.register("soul_ore",
            Feature.ORE, new OreConfiguration(NETHER_SOUL_ORES, 3));



    public static final List<OreConfiguration.TargetBlockState> NETHER_MAGMA_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.MAGMA_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MAGMA_ORE = FeatureUtils.register("magma_ore",
            Feature.ORE, new OreConfiguration(NETHER_MAGMA_ORES, 3));


    public static final List<OreConfiguration.TargetBlockState> NETHER_BASALT_ORES = List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.BASALT_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BASALT_ORE = FeatureUtils.register("basalt_ore",
            Feature.ORE, new OreConfiguration(NETHER_BASALT_ORES, 3));



}
