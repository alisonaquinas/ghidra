---
title: "Program Model"
category: architecture
tags: [program, database, memory, symbols, data-types, references]
status: stub
sources: []
updated: 2026-05-06
---

# Program Model

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Framework/SoftwareModeling/`.

The Ghidra Program is the central data model — the in-memory (and on-disk) representation of a loaded binary and all
analysis results. Everything in a Ghidra session ultimately reads from or writes to the Program.

## Overview

- Persisted to disk as a Ghidra project database (`.rep` / `.gpr` files)
- Stores: memory map, code units (instructions + data), symbols, functions, data types, references, comments,
  bookmarks, equates
- Accessed via the `Program` Java interface and its sub-managers

## Key Sub-Managers

| Manager | Responsibility |
|---------|---------------|
| `Memory` | Memory blocks, byte access, memory map |
| `FunctionManager` | Function boundaries, parameters, return types |
| `SymbolTable` | Labels, namespaces, imports/exports |
| `DataTypeManager` | Type system — structs, enums, typedefs, function signatures |
| `ReferenceManager` | Code and data cross-references |
| `ListingModel` | Unified view of code and data in address order |
| `BookmarkManager` | User and analysis bookmarks |

## Related Components

- [[Software Modeling]]
- [[DB Layer]]
- [[Analysis Pipeline]]
- [[Scripting API]]
- [[Decompiler]]

## Sources

None ingested yet.
