package com.ganeowner.netherupdate.item.client;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.item.custom.MagmaSword;
import com.ganeowner.netherupdate.item.custom.SoulSword;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MagmaSwordModel extends AnimatedGeoModel<MagmaSword> {
    @Override
    public ResourceLocation getModelLocation(MagmaSword object) {
        return new ResourceLocation(Netherupdate.MOD_ID, "geo/magma_sword.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(MagmaSword object) {
        return new ResourceLocation(Netherupdate.MOD_ID, "textures/item/magma_sword.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(MagmaSword animatable) {
        return new ResourceLocation(Netherupdate.MOD_ID, "animations/magma_sword.animation.json");
    }
}
