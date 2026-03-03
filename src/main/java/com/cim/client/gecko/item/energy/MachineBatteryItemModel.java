package com.cim.client.gecko.item.energy;

import net.minecraft.resources.ResourceLocation;
import com.cim.item.energy.MachineBatteryBlockItem;
import com.cim.main.CrustalIncursionMod;
import software.bernie.geckolib.model.GeoModel;

public class MachineBatteryItemModel extends GeoModel<MachineBatteryBlockItem> {

    @Override
    public ResourceLocation getModelResource(MachineBatteryBlockItem animatable) {
        return new ResourceLocation(CrustalIncursionMod.MOD_ID, "geo/machine_battery.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MachineBatteryBlockItem animatable) {
        return new ResourceLocation(CrustalIncursionMod.MOD_ID, "textures/block/machine_battery.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MachineBatteryBlockItem animatable) {
        return new ResourceLocation(CrustalIncursionMod.MOD_ID, "animations/empty.animation.json");
    }
}
