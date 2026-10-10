# lolcowy — Minecraft Java 26.2 / Fabric

**Status: source scaffold, not a finished playable client yet.** This ZIP establishes the mod project and config defaults. The requested renderer features are documented below, but have not been implemented or runtime-tested because the build environment used to prepare this archive does not have JDK 25, Gradle, or downloadable Minecraft/Fabric 26.2 dependencies available. No fake or nonfunctional `.jar` is included.

## Planned features

- **Performance profiles:** conservative presets for particles, clouds, entity distance and other client settings where supported by 26.2's APIs. This cannot guarantee an FPS increase on every computer.
- **Storage Finder:** configurable block selection; translucent filled highlight only (no tracer lines).
- **Spawner Finder:** highlight spawner blocks with the same filled-only style.
- **Entity Finder:** selectable entity categories and filled/outline highlight settings.
- **Client-only Freecam:** detach the local camera without moving the server-side player. Multiplayer servers may still restrict or detect related behavior; this is not an anti-cheat bypass.
- **Item View:** adjust held-item translation, scale and rotation.
- **ClickGUI:** configurable menu key (default period), opacity, highlight color and toggles.

## Verified version notes

The official Fabric developer site currently lists Minecraft `26.2`, Loader `0.19.5`, and Loom `1.18-SNAPSHOT` in its version selector. The official setup guide says JDK 25 is needed for the current 26.x toolchain. Fabric API did not have a version listed on that selector when checked, so this scaffold intentionally does not add a Fabric API dependency. See:

- https://fabricmc.net/develop/
- https://docs.fabricmc.net/develop/getting-started/setting-up
- https://docs.fabricmc.net/develop/getting-started/building-a-mod

## Build on Windows

1. Install **JDK 25 (64-bit)**. Open Command Prompt and run `java -version`; it should report version 25.
2. Install **Gradle 9.5.1 or a compatible version** (Fabric's 26.2 announcement recommends Gradle 9.5.1 and Loom 1.17 at publication; the version selector later showed Loom 1.18-SNAPSHOT, so use the current official version selector if Gradle reports a compatibility error).
3. Open PowerShell in this folder.
4. Run `gradle build`.
5. If Gradle reports that the `net.fabricmc.fabric-loom` plugin cannot be found, verify network access and the Loom version in `gradle.properties` against https://fabricmc.net/develop/.
6. When a build succeeds, the distributable mod JAR is placed in `build\libs\`.

## Important

This is **not yet the complete requested mod**: the feature list is a design target, not an implemented claim. Renderer mixins and the ClickGUI/freecam/finders need to be written against the exact 26.2 mappings and then built and tested in a real Fabric development environment. Do not put this scaffold into your live `mods` folder expecting the finder/optimization features to work.
