package com.ganeowner.netherupdate.item.client;

import com.ganeowner.netherupdate.item.custom.MagmaSword;
import com.ganeowner.netherupdate.item.custom.SoulSword;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class MagmaSwordRenderer extends GeoItemRenderer<MagmaSword> {
    public MagmaSwordRenderer() {
        super(new MagmaSwordModel());
    }
}
