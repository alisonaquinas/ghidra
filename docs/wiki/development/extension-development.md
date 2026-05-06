---
title: "Extension Development"
category: development
tags: [extensions, plugins, development, sdk, skeleton]
status: stub
sources: []
updated: 2026-05-06
---

# Extension Development

> [!NOTE]
> This page is a stub. Primary sources: `GhidraBuild/Skeleton/`, `DevGuide.md`, `Ghidra/Extensions/`.

Extensions are the primary way to distribute custom Ghidra functionality. An extension is a zip file containing compiled
plugins, scripts, and metadata that Ghidra installs and loads at runtime.

## Overview

- `GhidraBuild/Skeleton/` provides a starting template for new extensions
- Extensions can contribute: plugins, analyzers, loaders, exporters, scripts
- Distributed as `.zip` files; installed via Ghidra's Extension Manager
- GPL code must live in the `GPL/` top-level directory as a standalone module

## Extension Types

- Plugin extensions (Java)
- Script collections
- Processor modules (Sleigh-based)
- Loader / exporter plugins

## Related Components

- [[Plugin System]]
- [[Build System]]
- [[Eclipse Setup]]
- [[Scripting API]]

## Sources

None ingested yet.
