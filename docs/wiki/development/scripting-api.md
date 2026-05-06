---
title: "Scripting API"
category: development
tags: [scripting, api, java, python, ghidraScript, flatAPI]
status: stub
sources: []
updated: 2026-05-06
---

# Scripting API

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/Base/` scripting sources, Ghidra Javadoc.

The Ghidra Scripting API is the public interface exposed to Java and Python scripts for programmatic access to the Program model and Ghidra services.

## Overview

*(To be filled in)*

Key classes:
- `GhidraScript` — base class for all scripts; provides `currentProgram`, `currentAddress`, helper methods
- `FlatProgramAPI` — a simplified, flat API wrapping the [[Program Model]] managers
- `HeadlessScript` — extends `GhidraScript` for headless execution

## API Surface

*(To be filled in)*

Planned content:
- Navigating the listing (functions, instructions, data)
- Reading and writing memory
- Creating/modifying symbols, labels, functions
- Working with data types
- Adding comments and bookmarks
- Running analyzers programmatically
- Interacting with the decompiler from a script

## Related Components

- [[Scripting]]
- [[PyGhidra]]
- [[Headless Mode]]
- [[Program Model]]
- [[Analysis Pipeline]]

## Sources

*(None ingested yet)*
