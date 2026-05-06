---
title: "Plugin System"
category: architecture
tags: [plugins, tools, extension-points, architecture]
status: stub
sources: []
updated: 2026-05-06
---

# Plugin System

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Framework/Project/`, `Ghidra/Framework/Docking/`, `DevGuide.md`.

Ghidra's plugin system is the primary extension mechanism. Plugins register services, provide actions, and contribute UI
components to tools (workspaces of docked windows).

## Overview

- A **Tool** is a named workspace: a collection of plugins + their UI layout
- A **Plugin** contributes: services, actions (menu items/toolbar), component providers (docked panels)
- Plugins declare dependencies on services from other plugins
- The plugin manager handles loading, dependency resolution, and lifecycle

## Key Concepts

- `PluginTool` — the runtime container for a set of plugins
- `Plugin` — the base class for all plugins
- `ServiceProvider` / `ServiceRegistry` — service discovery
- `ComponentProvider` — contributes a dockable panel to a tool
- `DockingAction` — a menu item or toolbar button

## Extension Points

- Analyzers (extension of [[Analysis Pipeline]])
- Loaders (extension of [[File Format Support]])
- Exporters
- Decompiler passes (limited)

## Related Components

- [[Framework Overview]]
- [[Docking UI]]
- [[Extension Development]]

## Sources

None ingested yet.
