package net.ktn.firstmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ktn-mod");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}