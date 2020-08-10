package com.cammeh;

import com.cammeh.registries.ItemRegistry;
import net.fabricmc.api.ModInitializer;

public class CamCo implements ModInitializer {

    @Override
    public void onInitialize() {
        ItemRegistry.register();
    }
}
