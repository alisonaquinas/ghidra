---
title: "Sleigh Authorship"
category: development
tags: [sleigh, processor-spec, development, authoring]
status: stub
sources: []
updated: 2026-05-06
---

# Sleigh Authorship

> [!NOTE]
> This page is a stub. Primary sources: `GhidraDocs/languages/`, `Ghidra/Extensions/SleighDevTools/`, `Ghidra/Processors/Toy/`.

Writing a Sleigh processor specification is the path to adding support for a new processor family in Ghidra.

## Overview

*(To be filled in)*

- Start from an existing spec (e.g., `Processors/Toy/` for reference) or use SleighDevTools templates
- A complete spec requires: `.slaspec`, `.pspec`, `.cspec`, `.ldefs`
- The Sleigh compiler (part of [[Software Modeling]]) validates and compiles specs
- Test the spec using the Toy disassembler workflow

## Key Steps

*(To be filled in)*

1. Define address spaces and registers in `.pspec`
2. Define token fields and instruction encodings in `.slaspec`
3. Write semantic actions (P-Code emission) for each constructor
4. Define calling conventions in `.cspec`
5. Register the language in `.ldefs`
6. Compile and test

## Related Components

- [[Sleigh]]
- [[Sleigh Dev Tools]]
- [[P-Code]]
- [[Processors Overview]]

## Sources

*(None ingested yet)*
