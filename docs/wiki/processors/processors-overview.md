---
title: "Processors Overview"
category: processors
tags: [processors, ISA, sleigh, architecture-support]
status: stub
sources: []
updated: 2026-05-06
---

# Processors Overview

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Processors/` directory.

Ghidra supports over 35 processor families via [[Sleigh]] specification files. This page catalogs all supported families and links to per-family detail pages.

## Supported Processor Families

| Family | Module | Notes |
|--------|--------|-------|
| x86 / x86-64 | `Processors/x86` | Most heavily tested; 16/32/64-bit modes |
| ARM | `Processors/ARM` | ARMv4–v7, Thumb, Thumb2 |
| AArch64 | `Processors/AARCH64` | ARMv8+ 64-bit |
| MIPS | `Processors/MIPS` | MIPS32/64, various ABI variants |
| PowerPC | `Processors/PowerPC` | PPC32/64, Book E |
| RISC-V | `Processors/RISCV` | RV32I/RV64I + standard extensions |
| JVM | `Processors/JVM` | Java bytecode |
| Dalvik | `Processors/Dalvik` | Android DEX bytecode |
| 68000 | `Processors/68000` | Motorola 68k family |
| 6502 | `Processors/6502` | MOS 6502 and variants |
| 8051 | `Processors/8051` | Intel MCS-51 |
| 8085 | `Processors/8085` | Intel 8085 |
| Z80 | `Processors/Z80` | Zilog Z80 |
| Sparc | `Processors/Sparc` | SPARC v8/v9 |
| PA-RISC | `Processors/PA-RISC` | HP PA-RISC |
| Xtensa | `Processors/Xtensa` | Tensilica Xtensa (ESP32 etc.) |
| AVR / Atmel | `Processors/Atmel` | Atmel AVR 8-bit |
| BPF / eBPF | `Processors/BPF`, `Processors/eBPF` | Classic and extended BPF |
| Hexagon | `Processors/Hexagon` | Qualcomm Hexagon DSP |
| PIC | `Processors/PIC` | Microchip PIC family |
| TI MSP430 | `Processors/TI_MSP430` | Texas Instruments MSP430 |
| HCS08 / HCS12 | `Processors/HCS08`, `Processors/HCS12` | Freescale/NXP 8/16-bit |
| Tricore | `Processors/tricore` | Infineon TriCore |
| NDS32 | `Processors/NDS32` | Andes NDS32 |
| LoongArch | `Processors/Loongarch` | Loongson LoongArch |
| SuperH | `Processors/SuperH`, `Processors/SuperH4` | Renesas SH |
| V850 | `Processors/V850` | Renesas V850 |
| M16C | `Processors/M16C` | Renesas M16C |
| M8C | `Processors/M8C` | Cypress PSoC M8C |
| MC6800 | `Processors/MC6800` | Motorola 6800 |
| MCS96 | `Processors/MCS96` | Intel MCS-96 |
| CP1600 | `Processors/CP1600` | GI CP1600 |
| CR16 | `Processors/CR16` | National Semiconductor CR16 |
| DATA | `Processors/DATA` | Generic data/raw bytes pseudo-processor |
| Toy | `Processors/Toy` | Toy architecture for testing/education |

## Sleigh Spec Structure

Each processor module in `Ghidra/Processors/<family>/data/languages/` contains:
- `*.slaspec` — top-level Sleigh specification
- `*.sinc` — shared include fragments
- `*.pspec` — processor metadata (register definitions, calling conventions)
- `*.cspec` — compiler/ABI spec (used by the [[Decompiler]])
- `*.ldefs` — language definitions (registered with Ghidra)

## Related Components

- [[Sleigh]]
- [[P-Code]]
- [[Sleigh Dev Tools]]
- [[Sleigh Authorship]]
- [[File Format Support]]

## Sources

*(None ingested yet)*
