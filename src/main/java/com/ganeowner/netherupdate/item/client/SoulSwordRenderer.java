package com.ganeowner.netherupdate.item.client;

import com.ganeowner.netherupdate.item.custom.SoulSword;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class SoulSwordRenderer extends GeoItemRenderer<SoulSword> {
    public SoulSwordRenderer() {
        super(new SoulSwordModel());
    }
}
