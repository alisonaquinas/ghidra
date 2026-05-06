---
title: "Framework Overview"
category: architecture
tags: [framework, modules, architecture, java, osgi]
status: stub
sources: []
updated: 2026-05-06
---

# Framework Overview

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Framework/` source tree, `DevGuide.md`.

Ghidra's codebase is organized into three layers — Framework, Features, and Extensions — with a plugin-based
architecture binding them together.

## Three-Layer Structure

- **Framework** (`Ghidra/Framework/`) — core infrastructure: DB, GUI docking, file system, graph, project model,
  software modeling, utilities
- **Features** (`Ghidra/Features/`) — user-facing capabilities built on the Framework
- **Extensions** (`Ghidra/Extensions/`) — optional add-ons, some bundled with the release
- **Processors** (`Ghidra/Processors/`) — ISA definitions via [[Sleigh]]
- **Debug** (`Ghidra/Debug/`) — the dynamic analysis subsystem

## Framework Modules

| Module | Purpose |
|--------|---------|
| `DB` | Internal database abstraction for persistent program storage |
| `Docking` | The dockable window / tool system |
| `Emulation` | P-Code emulation engine |
| `FileSystem` | Virtual file system for reading file containers |
| `Generic` | Shared utilities, data structures, concurrency |
| `Graph` | Graph model and visualization framework |
| `Gui` | Core GUI components and theming |
| `Help` | Help system (JavaHelp integration) |
| `Project` | Project management, workspace, tool configuration |
| `Pty` | Pseudo-terminal support (used by debugger agents) |
| `SoftwareModeling` | The [[Software Modeling]] framework — program model, data types, Sleigh compiler |
| `Utility` | Logging, classpath, extension loading |

## Related Components

- [[Plugin System]]
- [[Software Modeling]]
- [[Docking UI]]
- [[DB Layer]]
- [[Build System]]

## Sources

None ingested yet.
