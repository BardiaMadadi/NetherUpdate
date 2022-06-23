package com.ganeowner.netherupdate.world.gen;

import com.ganeowner.netherupdate.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.RAW_GENERATION);

        if(event.getCategory() == Biome.BiomeCategory.NETHER) {
            base.add(ModPlacedFeatures.SOUL_ORE_PLACED_UNIFORM);
            base.add(ModPlacedFeatures.MAGMA_ORE_PLACED_UNIFORM);
            base.add(ModPlacedFeatures.BASALT_ORE_PLACED_UNIFORM);
        }
    }
}
