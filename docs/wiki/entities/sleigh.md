---
title: "Sleigh"
category: entities
tags: [sleigh, processor-spec, language-definition, IR]
status: stub
sources: []
updated: 2026-05-06
---

# Sleigh

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Processors/` spec files, `GhidraDocs/languages/`, `Ghidra/Framework/SoftwareModeling/`.

Sleigh is Ghidra's domain-specific language for specifying processor instruction set semantics. A Sleigh specification
file (`.slaspec` / `.sinc`) describes how to decode binary instructions and lift them to [[P-Code]].

## Overview

- Declarative language: defines tokens, fields, constructors, and semantic actions
- Used by Ghidra's disassembler and P-Code lifter
- One `.slaspec` file per processor family (plus shared `.sinc` includes)
- Compiled to `.sla` binary by the Sleigh compiler at build time

## Key Concepts

Planned content:

- Token and field definitions
- Constructor tables and pattern matching
- Semantic actions and P-Code emission
- `attach variables`, `attach names`
- The `default` space and named address spaces

## Sleigh Files Location

Spec files live in `Ghidra/Processors/<family>/data/languages/`. Each processor family has:

- `*.slaspec` — top-level spec (includes `.sinc` fragments)
- `*.sinc` — shared include fragments
- `*.pspec` — processor metadata (registers, calling conventions)
- `*.cspec` — compiler/ABI spec

## Related Components

- [[P-Code]]
- [[Decompiler]]
- [[Processors Overview]]
- [[Sleigh Dev Tools]]
- [[Sleigh Authorship]]

## Sources

None ingested yet.

## Open Questions

- How does the Sleigh compiler handle ambiguous instruction encodings?
- What tooling is available for debugging Sleigh specs?
