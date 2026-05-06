---
title: "Headless Mode"
aliases: ["Headless Mode"]
category: features
tags: [headless, automation, batch, analyzeHeadless]
status: stub
sources: []
updated: 2026-05-06
---

# Headless Mode

> [!NOTE]
> This page is a stub. Primary sources: `GhidraDocs/GettingStarted.md`, `Ghidra/Features/Base/` headless launcher.

Headless mode runs Ghidra non-interactively via the `analyzeHeadless` script, enabling automated batch analysis, CI/CD
integration, and large-scale processing pipelines.

## Overview

- Launched via `support/analyzeHeadless` (or `.bat` on Windows)
- Accepts a project path, binary files, and pre/post-analysis scripts
- No GUI — all output goes to stdout/log files
- Full access to the [[Scripting API]] via `HeadlessScript`

## Common Use Cases

- Bulk import and analyze a directory of binaries
- Run a custom script against each binary and extract results
- Export decompiled code, call graphs, or symbol tables to files
- Integration with reverse engineering pipelines

## Related Components

- [[Scripting]]
- [[Scripting API]]
- [[PyGhidra]]
- [[Analysis Pipeline]]

## Sources

None ingested yet.
