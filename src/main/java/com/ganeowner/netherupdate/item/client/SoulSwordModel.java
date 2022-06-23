package com.ganeowner.netherupdate.item.client;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.item.custom.SoulSword;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SoulSwordModel extends AnimatedGeoModel<SoulSword> {
    @Override
    public ResourceLocation getModelLocation(SoulSword object) {
        return new ResourceLocation(Netherupdate.MOD_ID, "geo/soul_sword.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SoulSword object) {
        return new ResourceLocation(Netherupdate.MOD_ID, "textures/item/soul_sword.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SoulSword animatable) {
        return new ResourceLocation(Netherupdate.MOD_ID, "animations/soul_sword.animation.json");
    }
}
