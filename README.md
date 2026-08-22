# enginehost-plugin-kirikiri

An [enginehost](https://github.com/bi0shacker001/enginehost) plugin for
KiriKiri/krkr2, wrapping a fork of
[Kirikiroid2Yuri](https://github.com/bi0shacker001/kirikiroid2-joiplay)
(vendored at `vendor/kirikiroid2`), the most actively-maintained
open-source KiriKiri2 Android engine.

## Why this exists

No real, shipped JoiPlay plugin exists for KiriKiri — JoiPlay's own engine
detector already recognizes the type, but its own attempted plugin
(`joiplay/Kirikiroid2` on GitHub) was abandoned in 2022 with zero plugin
wiring done. This fills that real gap, for enginehost's own
programmatic-launch use case rather than JoiPlay's catalog-based one.

## Status

Real, working plugin shell: declares the real
`dev.enginehost.plugin.engine`/`engineVersion`/`pluginVersion` meta-data
and the `dev.enginehost.plugin.RUN` intent-filter, and is correctly
discovered and dispatched to by enginehost's own `PluginRegistry`. It
does **not** yet start the actual engine — `vendor/kirikiroid2`'s real
Android entry point (`KR2Activity`) resolves its game folder through its
own internal file-browser flow, not an Intent extra, and the real unlock
(how to point its native init at an arbitrary runtime folder instead)
hasn't been found yet. That's the next real piece of work here.
