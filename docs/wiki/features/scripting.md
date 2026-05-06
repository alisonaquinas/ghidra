---
title: "Scripting"
category: features
tags: [scripting, java, python, automation, headless]
status: stub
sources: []
updated: 2026-05-06
---

# Scripting

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/Base/` scripting sources, `GhidraDocs/GhidraClass/` scripting exercises.

Ghidra supports user-written scripts in Java and Python for automating analysis tasks, extending the UI, and batch processing.

## Overview

*(To be filled in)*

- Script Manager UI: browse, run, and edit scripts from within the GUI
- Scripts live in `~/ghidra_scripts/` by default (configurable)
- Java scripts extend `GhidraScript` (or `HeadlessScript` for headless use)
- Python scripts via [[PyGhidra]] (CPython 3) or the older Jython 2.7 extension

## Scripting API

*(To be filled in)*

- The `FlatProgramAPI` provides a simplified script-friendly interface
- Full program database access: functions, instructions, data, references, symbols
- Can interact with the GUI (dialogs, progress monitors) in GUI mode
- See [[Scripting API]] for the full API surface

## Headless Scripting

*(To be filled in)*

- `analyzeHeadless` script runs scripts without launching the GUI
- See [[Headless Mode]]

## Related Components

- [[Scripting API]]
- [[PyGhidra]]
- [[Headless Mode]]
- [[Analysis Pipeline]]
- [[Program Model]]

## Sources

*(None ingested yet)*
