---
title: "FunctionID"
category: entities
tags: [function-id, library-identification, hashing]
status: stub
sources: []
updated: 2026-05-06
---

# FunctionID

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Features/FunctionID/`.

FunctionID identifies known library functions in stripped binaries by matching function hashes against a pre-built
database of known functions.

## Overview

- Hash-based matching (not behavioral like [[BSim]])
- Databases shipped with Ghidra cover common C runtime and OS libraries
- Analysts can build their own FID databases from known binaries
- Applied as an analyzer in the [[Analysis Pipeline]]

## Related Components

- [[BSim]]
- [[Analysis Pipeline]]
- [[Scripting API]]

## Sources

None ingested yet.
