---
title: "x86 Processor"
aliases: ["x86 Processor"]
category: processors
tags: [x86, x86-64, intel, amd, 16-bit, 32-bit, 64-bit]
status: stub
sources: []
updated: 2026-05-06
---

# x86 Processor

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Processors/x86/`.

Ghidra's x86 processor module supports the Intel/AMD x86 family across 16-bit, 32-bit (IA-32), and 64-bit (x86-64/AMD64)
modes.

## Overview

- The most heavily used and tested processor module in Ghidra
- Supports real mode (16-bit), protected mode (32-bit), and long mode (64-bit)
- Handles both Intel and AT&T syntax in the Listing (configurable)
- Covers SIMD extensions: MMX, SSE, SSE2–4, AVX, AVX-512

## Sleigh Files

Located in `Ghidra/Processors/x86/data/languages/`:

- `x86.slaspec` — 32-bit mode
- `x86-64.slaspec` — 64-bit mode
- Shared `.sinc` files for instruction groups

## Known Issues / Quirks

## Related Components

- [[Processors Overview]]
- [[Sleigh]]
- [[P-Code]]
- [[Decompiler]]

## Sources

None ingested yet.
