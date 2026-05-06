---
title: "JVM and Dalvik"
category: processors
tags: [jvm, java-bytecode, dalvik, android, dex]
status: stub
sources: []
updated: 2026-05-06
---

# JVM and Dalvik

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Processors/JVM/`, `Ghidra/Processors/Dalvik/`.

Ghidra supports Java Virtual Machine (JVM) bytecode and Android Dalvik/DEX bytecode as processor targets, enabling analysis of Java class files and Android DEX/ODEX/OAT files.

## Overview

*(To be filled in)*

- JVM module handles `.class` files (Java bytecode)
- Dalvik module handles `.dex` / `.odex` files (Android)
- These are typically loaded by format-specific loaders in [[File Format Support]]
- Decompilation quality varies since the IR was designed for native code

## Related Components

- [[Processors Overview]]
- [[Sleigh]]
- [[File Format Support]]
- [[Decompiler]]

## Sources

*(None ingested yet)*
