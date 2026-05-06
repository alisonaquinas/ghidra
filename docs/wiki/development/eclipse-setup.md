---
title: "Eclipse Setup"
category: development
tags: [eclipse, ide, development, java, setup]
status: stub
sources: []
updated: 2026-05-06
---

# Eclipse Setup

> [!NOTE]
> This page is a stub. Primary sources: `DevGuide.md`, `eclipse/` directory, `GhidraBuild/EclipsePlugins/`.

Ghidra's primary IDE is Eclipse. The build system generates nested Eclipse project files from Gradle metadata.

## Overview

- Run `gradle cleanEclipse eclipse` to generate `.project` / `.classpath` files
- Import as "existing projects" from the root
- The `eclipse/` directory contains Eclipse-specific launcher and formatter configs
- `GhidraBuild/EclipsePlugins/` provides Eclipse plugins for Ghidra development (including [[Sleigh Dev Tools]])

## Related Components

- [[Build System]]
- [[Sleigh Dev Tools]]
- [[Extension Development]]

## Sources

None ingested yet.
