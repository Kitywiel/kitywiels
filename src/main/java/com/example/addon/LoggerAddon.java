package com.example.addon;

import com.example.addon.modules.Logger;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class LoggerAddon extends MeteorAddon {
    public static final org.slf4j.Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing Logger Addon");

        // Register modules
        Modules.get().add(new Logger());
    }

    @Override
    public void onRegisterCategories() {
        // Register custom module category if needed
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
