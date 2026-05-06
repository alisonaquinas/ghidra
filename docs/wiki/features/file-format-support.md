---
title: "File Format Support"
category: features
tags: [file-formats, loaders, pe, elf, macho, binary]
status: stub
sources: []
updated: 2026-05-06
---

# File Format Support

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Features/FileFormats/`.

Ghidra supports loading a wide variety of executable and binary file formats via loader plugins.

## Overview

*(To be filled in)*

Planned content — supported formats:
- PE / PE+ (Windows executables and DLLs)
- ELF (Linux, Android, embedded)
- Mach-O (macOS, iOS)
- DEX / ODEX (Android Dalvik bytecode)
- Class files (JVM bytecode)
- Raw binary / ROM images
- COFF, a.out, Intel Hex, Motorola S-records
- Archive formats (.a, .lib)
- Firmware formats (various)

## Loader Architecture

*(To be filled in)*

- Loaders live in `Ghidra/Features/FileFormats/` and in processor-specific modules
- Each loader implements the `Loader` interface
- Loaders can be ranked by confidence for ambiguous formats
- Custom loaders can be added via extensions

## Related Components

- [[Analysis Pipeline]]
- [[Program Model]]
- [[Processors Overview]]
- [[Extension Development]]

## Sources

*(None ingested yet)*
