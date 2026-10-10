package com.lolcowy.client;

import net.fabricmc.api.ClientModInitializer;

/**
 * lolcowy client entry point.
 *
 * This initial source scaffold deliberately avoids unstable game-renderer internals.
 * The next implementation stage should add 26.2-specific mixins and render hooks
 * after resolving the exact 26.2 client mappings/API artifacts in Gradle.
 */
public final class LolcowyClient implements ClientModInitializer {
    public static final String MOD_ID = "lolcowy";

    @Override
    public void onInitializeClient() {
        System.out.println("[lolcowy] Client initialized. Configuration scaffold loaded.");
        LolcowyConfig.load();
    }
}
