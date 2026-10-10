
package com.lolcowy.client;

import net.fabricmc.api.ClientModInitializer;

public final class LolcowyClient implements ClientModInitializer {
    public static final String MOD_ID = "lolcowy";

    @Override
    public void onInitializeClient() {
        System.out.println("[lolcowy] Client initialized.");
        LolcowyConfig.load();
    }
}
