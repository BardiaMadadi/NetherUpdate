package com.ganeowner.netherupdate.item.client;

import com.ganeowner.netherupdate.Netherupdate;
import com.ganeowner.netherupdate.item.custom.BasaltSword;
import com.ganeowner.netherupdate.item.custom.MagmaSword;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BasaltSwordModel extends AnimatedGeoModel<BasaltSword> {
    @Override
    public ResourceLocation getModelLocation(BasaltSword object) {
        return new ResourceLocation(Netherupdate.MOD_ID, "geo/basalt_sword.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BasaltSword object) {
        return new ResourceLocation(Netherupdate.MOD_ID, "textures/item/basalt_sword.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BasaltSword animatable) {
        return new ResourceLocation(Netherupdate.MOD_ID, "animations/basalt_sword.animation.json");
    }
}
