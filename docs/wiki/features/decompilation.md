---
title: "Decompilation"
category: features
tags: [decompiler, c-output, pcode, high-pcode]
status: stub
sources: []
updated: 2026-05-06
---

# Decompilation

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/Decompiler/`, decompiler class materials.

Ghidra's decompilation feature converts disassembled code into C pseudocode via the [[Decompiler]] engine.

## Overview

- The Decompiler window shows C pseudocode for a selected function
- Synchronized with the Listing view — clicking in one highlights the other
- Supports renaming, retyping variables, and adding comments that persist
- Output improves with better type information (imported PDB, user annotations)

## The Decompilation Pipeline

- Raw binary → [[Sleigh]] lifting → raw [[P-Code]] → simplified P-Code → high P-Code (SSA) → C AST → output

## Related Components

- [[Decompiler]]
- [[P-Code]]
- [[Sleigh]]
- [[Analysis Pipeline]]
- [[Program Model]]

## Sources

None ingested yet.
