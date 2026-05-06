---
title: "ARM and AArch64"
aliases: ["ARM and AArch64"]
category: processors
tags: [arm, aarch64, thumb, thumb2, armv8, mobile]
status: stub
sources: []
updated: 2026-05-06
---

# ARM and AArch64

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Processors/ARM/`, `Ghidra/Processors/AARCH64/`.

Ghidra supports both 32-bit ARM (including Thumb and Thumb-2) and 64-bit AArch64 (ARMv8+).

## Overview

- ARM module: `Ghidra/Processors/ARM/` — covers ARMv4 through ARMv7, Thumb, Thumb-2
- AArch64 module: `Ghidra/Processors/AARCH64/` — ARMv8/v8.x 64-bit
- Heavily used for Android, iOS, and embedded targets

## Sleigh Files

## Known Issues / Quirks

- Interworking between ARM and Thumb modes
- IT block handling in Thumb-2

## Related Components

- [[Processors Overview]]
- [[Sleigh]]
- [[File Format Support]]

## Sources

None ingested yet.
