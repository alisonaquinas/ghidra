---
title: "Analysis Pipeline"
category: features
tags: [analysis, analyzers, auto-analysis, pipeline]
status: stub
sources: []
updated: 2026-05-06
---

# Analysis Pipeline

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/Base/` analyzer sources, `GhidraDocs/GhidraClass/` materials.

The Ghidra analysis pipeline is the automated sequence of analyzers that run when a binary is imported or when the user triggers "Auto Analyze." Each analyzer examines specific aspects of the program and annotates the [[Program Model]].

## Overview

*(To be filled in)*

- Analyzers are ordered by priority and run sequentially or in dependency order
- Each analyzer can be enabled/disabled in the Analysis Options dialog
- Analyzers communicate results by modifying the program database (functions, data types, references, symbols)
- Custom analyzers can be added via extensions or scripts

## Key Analyzers

*(To be filled in)*

Planned content:
- Disassembler (entry point discovery, recursive descent)
- Function analyzer
- Data type propagation
- Stack variable analysis
- Reference analysis
- [[FunctionID]] matching
- Demangler analyzers (GNU, Microsoft)
- [[P-Code]] analysis passes

## Related Components

- [[Disassembly]]
- [[Decompiler]]
- [[P-Code]]
- [[FunctionID]]
- [[Program Model]]
- [[Scripting API]]

## Sources

*(None ingested yet)*
