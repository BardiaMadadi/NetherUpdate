package com.ganeowner.netherupdate.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> SOUL_ORE_PLACED_UNIFORM = PlacementUtils.register("soul_ore_placed_uniform",
            ModConfiguredFeatures.SOUL_ORE, ModOrePlacement.commonOrePlacement(
                    3,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(120))));


    public static final Holder<PlacedFeature> MAGMA_ORE_PLACED_UNIFORM = PlacementUtils.register("magma_ore_placed_uniform",
            ModConfiguredFeatures.MAGMA_ORE, ModOrePlacement.commonOrePlacement(
                    3,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(120))));


    public static final Holder<PlacedFeature> BASALT_ORE_PLACED_UNIFORM = PlacementUtils.register("basalt_ore_placed_uniform",
            ModConfiguredFeatures.BASALT_ORE, ModOrePlacement.commonOrePlacement(
                    3,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(120))));


}
