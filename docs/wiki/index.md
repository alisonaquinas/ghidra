---
title: "Wiki Index"
updated: 2026-05-06
---

# Ghidra Wiki — Content Index

This is the master catalog of all pages in the wiki. The LLM updates this file on every ingest. When answering a query, read this file first to locate relevant pages.

---

## Overview

| Page | Summary |
|------|---------|
| [[Ghidra Overview]] | What Ghidra is, its origin at NSA, primary use cases, and high-level architecture |

## Entities

| Page | Summary |
|------|---------|
| [[Decompiler]] | The native C decompiler — architecture, P-Code lifting, output, and limitations |
| [[Sleigh]] | The processor specification language used to define ISA semantics |
| [[P-Code]] | Ghidra's intermediate representation; the bridge between Sleigh specs and analysis |
| [[BSim]] | Behavioral similarity search for finding functionally equivalent code across binaries |
| [[Debugger]] | The dynamic analysis subsystem with support for GDB, LLDB, WinDbg, and others |
| [[GhidraServer]] | The collaborative multi-user server for shared project repositories |
| [[PyGhidra]] | Python 3 integration via JPype; enables Python scripting against the Ghidra API |
| [[FunctionID]] | Library function identification by hash-matching against known function signatures |
| [[Sleigh Dev Tools]] | IDE tooling for authoring and validating Sleigh processor specifications |

## Features

| Page | Summary |
|------|---------|
| [[Disassembly]] | How Ghidra disassembles binary code; auto-analysis, markup, and code flow |
| [[Decompilation]] | The decompilation pipeline from P-Code to C pseudocode |
| [[Analysis Pipeline]] | The automated analysis system: analyzers, ordering, and configuration |
| [[Scripting]] | Java and Python scripting interfaces, the Script Manager, and headless scripting |
| [[File Format Support]] | Supported executable and binary formats (PE, ELF, Mach-O, etc.) |
| [[Program Diff]] | Binary diffing and comparison tools |
| [[Graphing]] | Function call graphs, data flow graphs, and graph visualization |
| [[Headless Mode]] | Running Ghidra non-interactively via the analyzeHeadless script |
| [[Debugging Feature]] | Dynamic debugging workflow, trace recording, and emulation |

## Processors

| Page | Summary |
|------|---------|
| [[Processors Overview]] | Summary of all supported processor families and Ghidra support levels |
| [[x86 Processor]] | x86 / x86-64 support — the most heavily used processor module |
| [[ARM and AArch64]] | 32-bit ARM and 64-bit AArch64 support |
| [[MIPS]] | MIPS 32/64 support, including variants |
| [[RISC-V]] | RISC-V RV32 and RV64 support |
| [[PowerPC]] | PowerPC and Power ISA support |
| [[JVM and Dalvik]] | Java bytecode (JVM) and Android bytecode (Dalvik/DEX) support |
| [[Other Processors]] | Remaining ISAs: 6502, 68000, 8051, Z80, Sparc, Xtensa, and more |

## Architecture

| Page | Summary |
|------|---------|
| [[Framework Overview]] | The module/framework decomposition of the Ghidra codebase |
| [[Plugin System]] | How Ghidra's plugin and tool architecture works |
| [[Program Model]] | The in-memory representation of a loaded binary program |
| [[Software Modeling]] | The SoftwareModeling framework: types, data types, symbol tables |
| [[Docking UI]] | The dockable window and tool management system |
| [[DB Layer]] | The internal database abstraction used for persistent program storage |

## Development

| Page | Summary |
|------|---------|
| [[Build System]] | Gradle-based build: tasks, dependencies, native components |
| [[Eclipse Setup]] | Setting up Eclipse for Ghidra development |
| [[Extension Development]] | Writing, packaging, and distributing Ghidra extensions |
| [[Scripting API]] | The public Java and Python scripting API surface |
| [[Sleigh Authorship]] | Writing and validating Sleigh processor specification files |
| [[Licensing and Contributing]] | Licensing (Apache 2.0 primary), contribution workflow, and copyright |

## Sources

| Page | Summary |
|------|---------|
| *(no sources ingested yet)* | |

---

*Last updated: 2026-05-06 — initial scaffold pass. No sources ingested yet.*
