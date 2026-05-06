---
title: "Decompiler"
category: entities
tags: [decompiler, pcode, c-output, native]
status: stub
sources: []
updated: 2026-05-06
---

# Decompiler

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/Decompiler/` source tree, `GhidraDocs/GhidraClass/` materials.

The Ghidra decompiler converts [[P-Code]] (Ghidra's IR) into readable C pseudocode. It is implemented as a native C++ process that communicates with the Java GUI over a socket.

## Overview

*(To be filled in)*

- Implemented in `Ghidra/Features/Decompiler/`
- Native C++ core (`src/decompile/cpp/`)
- Java wrapper manages the subprocess and parses XML output
- Key dependency for [[Decompilation]] feature and several analysis passes

## Architecture

*(To be filled in)*

Planned content:
- The decompilation pipeline: P-Code → simplified P-Code → high P-Code → C AST → output
- How the native process is launched and communicated with
- XML protocol between Java and C++ sides

## Key Capabilities

*(To be filled in)*

- Type recovery and propagation
- Variable coalescing and aliasing analysis
- Control flow structuring (loops, conditionals)
- Call convention analysis

## Related Components

- [[P-Code]]
- [[Sleigh]]
- [[Decompilation]]
- [[Software Modeling]]
- [[Scripting API]]

## Sources

*(None ingested yet)*

## Open Questions

- How does the decompiler handle obfuscated/anti-decompilation code patterns?
- What are the extension points for adding custom decompiler passes?
