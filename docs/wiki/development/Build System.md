---
title: "Build System"
aliases: ["Build System"]
category: development
tags: [build, gradle, dependencies, native, eclipse]
status: stub
sources: []
updated: 2026-05-06
---

# Build System

> [!NOTE]
> This page is a stub. Primary sources: `DevGuide.md`, `README.md`, `build.gradle`, `gradle.properties`.

Ghidra uses Gradle as its build system, with a mix of Java, C++, and Python components. The build is orchestrated from
the repository root.

## Overview

- Requires: JDK 21 (64-bit), Gradle 8.5+, Python 3.9–3.14
- Native components (Decompiler, etc.) require GCC/Clang/MSVC depending on platform
- Non-Maven-Central dependencies fetched via `gradle -I gradle/support/fetchDependencies.gradle`

## Key Gradle Tasks

| Task | Purpose |
|------|---------|
| `gradle -I gradle/support/fetchDependencies.gradle` | Download non-Maven dependencies |
| `gradle prepdev` | Fetch Maven deps, set up for development |
| `gradle buildGhidra` | Build full release zip to `build/dist/` |
| `gradle buildNatives` | Build C++ native components for current platform |
| `gradle cleanEclipse eclipse` | Generate Eclipse project files |
| `gradle clean` | Clean build artifacts |

## Platform Notes

- Windows: requires MSVC (Visual Studio 2017+ or Build Tools), Windows SDK, C++ ATL
- Linux/macOS: requires GCC or Clang + make

## Related Components

- [[Eclipse Setup]]
- [[Extension Development]]
- [[Framework Overview]]

## Sources

None ingested yet.
