---
title: "Disassembly"
category: features
tags: [disassembly, listing, code-browser, auto-analysis]
status: stub
sources: []
updated: 2026-05-06
---

# Disassembly

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/Base/`, `GhidraDocs/GhidraClass/Beginner/`.

Ghidra's disassembler converts raw binary bytes into instruction mnemonics using [[Sleigh]] processor specifications,
producing the Listing view.

## Overview

- Driven by [[Sleigh]] specs compiled to `.sla` files
- Produces the Code Listing: instructions, operands, references, data
- Integrated with [[Analysis Pipeline]] — disassembly is the first analysis pass
- Supports recursive descent and linear sweep strategies

## The Listing View

## Related Components

- [[Sleigh]]
- [[P-Code]]
- [[Analysis Pipeline]]
- [[Program Model]]

## Sources

None ingested yet.
