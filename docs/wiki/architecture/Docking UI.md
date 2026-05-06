---
title: "Docking UI"
aliases: ["Docking UI"]
category: architecture
tags: [docking, ui, windows, tools, layout, swing]
status: stub
sources: []
updated: 2026-05-06
---

# Docking UI

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Framework/Docking/`.

The Docking UI framework provides Ghidra's dockable window and tool management system — the infrastructure that allows
panels to be dragged, split, tabbed, and saved as tool layouts.

## Overview

- Built on Java Swing
- `DockingWindowManager` manages the layout of all docked component providers
- Tool layouts are serialized to XML and saved per-project
- Supports windowed and docked modes, floating windows, and detached panels

## Key Concepts

- `ComponentProvider` — a panel that can be docked into a tool
- `DockingAction` — an action that can appear in menus, toolbars, or context menus
- `Tool` — a named, saved configuration of plugins and their layout

## Related Components

- [[Plugin System]]
- [[Framework Overview]]

## Sources

None ingested yet.
