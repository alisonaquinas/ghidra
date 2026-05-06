---
title: "Software Modeling"
category: architecture
tags: [software-modeling, data-types, type-system, sleigh-compiler]
status: stub
sources: []
updated: 2026-05-06
---

# Software Modeling

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Framework/SoftwareModeling/`.

The SoftwareModeling framework is the largest and most foundational Framework module. It contains the Program model, the data type system, the [[Sleigh]] compiler, and the [[P-Code]] infrastructure.

## Overview

*(To be filled in)*

Key responsibilities:
- Defines the `Program` interface and its full implementation
- Hosts the data type system (C-like types: structs, unions, enums, pointers, arrays, typedefs)
- Contains the Sleigh compiler (`ghidra.pcodeCPort.*`) that translates `.slaspec` → `.sla`
- Defines the P-Code IR classes (`Varnode`, `PcodeOp`, `PcodeOpAST`)
- Provides the `Language` abstraction used by all processor modules

## Related Components

- [[Program Model]]
- [[P-Code]]
- [[Sleigh]]
- [[DB Layer]]
- [[Framework Overview]]

## Sources

*(None ingested yet)*
