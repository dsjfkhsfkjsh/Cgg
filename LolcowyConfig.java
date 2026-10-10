package com.lolcowy.client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/** Small dependency-free config scaffold; stores user preferences in config/lolcowy.properties. */
public final class LolcowyConfig {
    private static final Path FILE = Path.of("config", "lolcowy.properties");
    private LolcowyConfig() {}

    public static void load() {
        try {
            Files.createDirectories(FILE.getParent());
            if (Files.notExists(FILE)) {
                String defaults = "# lolcowy client preferences\n"
                        + "menu_key=period\n"
                        + "fps_profile=balanced\n"
                        + "storage_finder=false\n"
                        + "spawner_finder=false\n"
                        + "entity_finder=false\n"
                        + "freecam=false\n"
                        + "item_view=false\n"
                        + "highlight_style=filled_translucent\n"
                        + "highlight_opacity=0.45\n"
                        + "highlight_color=16776960\n";
                Files.writeString(FILE, defaults, StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            System.err.println("[lolcowy] Could not create config: " + e.getMessage());
        }
    }
}
