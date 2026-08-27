# enginehost-plugin-kirikiri

An [enginehost](https://github.com/bi0shacker001/enginehost) plugin for
KiriKiri/krkr2, wrapping a fork of
[Kirikiroid2Yuri](https://github.com/bi0shacker001/kirikiroid2-enginehost)
(vendored at `vendor/kirikiroid2`), the most actively-maintained
open-source KiriKiri2 Android engine.

## Why this exists

enginehost is a centralized interpreter for VN engines, designed to be
called programmatically with an existing game folder. This plugin adds
KiriKiri2 support while leaving the game files in place.

## Status

The vendored engine app is the plugin directly. It declares the real
`dev.enginehost.plugin.engine`/`engineVersion`/`pluginVersion` meta-data
and the `dev.enginehost.plugin.RUN` intent-filter, and is correctly
discovered and dispatched to by enginehost's `PluginRegistry`.
`KR2Activity` accepts enginehost's `path` extra and passes it into native
startup, bypassing the engine's file browser. The manual CI workflow
restores upstream's prebuilt native dependencies and builds the patched
engine APK.
