# Lisa

Experimental Ghidra extension integrating the **LiSA** (Library for Static Analysis) abstract
interpretation engine developed at Università Ca' Foscari, Venice.

## Purpose

LiSA provides a static analysis framework based on abstract interpretation, enabling construction
of sound, over-approximate program analyses. This extension exposes LiSA analyses within Ghidra
so that results can be viewed alongside disassembly and decompilation.

## Contents

- `LisaLaunchScript.java` — GhidraScript entry point; bootstraps a LiSA analysis run on the
  current program
- `Lisa_ResolveX86orX64LinuxSyscallsScript.java` — example analysis that resolves Linux system
  call numbers in x86/x86-64 binaries using LiSA's abstract domains
- `src/` — Java source for the extension's plugin and analysis integration

## Status

This is an experimental extension (`createdOn=9/9/2025`). APIs may change. See the scripts in
`ghidra_scripts/` for usage examples before building custom analyses on top of this module.

## Building

Build and install as a standard Ghidra extension:

```bash
gradle -PghidraInstallDir=<path/to/ghidra> buildExtension
```
