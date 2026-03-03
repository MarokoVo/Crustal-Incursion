package com.cim.client.gecko.item.energy;

import com.cim.item.energy.MachineBatteryBlockItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class MachineBatteryItemRenderer extends GeoItemRenderer<MachineBatteryBlockItem> {
    public MachineBatteryItemRenderer() {
        super(new MachineBatteryItemModel());
    }
}
