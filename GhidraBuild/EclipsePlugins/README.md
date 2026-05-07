# EclipsePlugins

Eclipse plugin projects shipped with Ghidra to support development and language authoring within
the Eclipse IDE. These plugins are built separately from the main Gradle build and distributed
with Ghidra releases under `Extensions/Eclipse/`.

## Plugins

### GhidraDev

Supports developing and debugging Ghidra scripts and modules from Eclipse. See
[GhidraDev/GhidraDevPlugin/README.md](GhidraDev/GhidraDevPlugin/README.md) for full
installation and usage documentation.

Key capabilities:

- Create new Ghidra script and module projects linked to a Ghidra installation
- Launch and debug Ghidra (and PyGhidra) directly from Eclipse run configurations
- Export Ghidra module projects as installable extension archives

### GhidraSleighEditor

Provides syntax highlighting, content assist, and error checking for Sleigh language files
(`.slaspec`, `.sinc`) within Eclipse. Uses Xtext-based language tooling — the grammar and
generated artifacts live in the `ghidra.xtext.sleigh*` projects inside this directory.

## Building

These plugins are built from Eclipse, not Gradle. See the `Building` section of
[GhidraDev/GhidraDevPlugin/README.md](GhidraDev/GhidraDevPlugin/README.md) for the Eclipse
PDE build procedure. Gradle is used only to prepare dependencies
(`gradle prepGhidraDev eclipse -PeclipsePDE`).
