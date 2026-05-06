---
title: "PyGhidra"
aliases: ["PyGhidra"]
category: entities
tags: [python, pyghidra, jpype, scripting]
status: stub
sources: []
updated: 2026-05-06
---

# PyGhidra

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/PyGhidra/`, `Ghidra/Features/Base/` scripting sources.

PyGhidra is Ghidra's Python 3 integration layer, implemented via JPype. It allows analysts to script Ghidra using Python
3, including interactive use and headless automation.

## Overview

- Replaces the older Jython 2.7 scripting (which used `Ghidra/Extensions/Jython/`)
- Uses JPype to bridge CPython and the JVM
- Launched via `support/pyghidraRun` (or `support\pyghidraRun.bat` on Windows)
- Supports both interactive (GUI) and headless scripting modes

## Key Differences from Jython

- CPython 3.x vs. Jython 2.7
- Full access to Python 3 ecosystem (pip packages)
- JPype type coercion behavior

## Related Components

- [[Scripting API]]
- [[Scripting]]
- [[Headless Mode]]
- [[Build System]]

## Sources

None ingested yet.

## Open Questions

- Which Python 3 versions are supported?
- Are there known performance differences vs. Jython for scripting-heavy workflows?
