package com.ganeowner.netherupdate.item.client;

import com.ganeowner.netherupdate.item.custom.BasaltSword;
import com.ganeowner.netherupdate.item.custom.MagmaSword;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BasaltSwordRenderer extends GeoItemRenderer<BasaltSword> {
    public BasaltSwordRenderer() {
        super(new BasaltSwordModel());
    }
}
