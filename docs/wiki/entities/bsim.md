---
title: "BSim"
category: entities
tags: [bsim, similarity, search, database]
status: stub
sources: []
updated: 2026-05-06
---

# BSim

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/BSim/`, `GhidraDocs/GhidraClass/BSim/`.

BSim (Behavioral Similarity) is a Ghidra feature for finding functionally equivalent functions across different binaries, even when they have been compiled with different compilers, optimization levels, or have been lightly obfuscated.

## Overview

*(To be filled in)*

- Generates feature vectors from [[P-Code]] for each function
- Stores vectors in a database (H2 local, or Elasticsearch via `BSimElasticPlugin`)
- Queries return functions ranked by similarity score
- Useful for: library identification, malware family correlation, patch diffing

## Architecture

*(To be filled in)*

Planned content:
- Feature extraction from P-Code
- The H2 vs. Elasticsearch backends
- Server/client query protocol
- `Ghidra/Extensions/BSimElasticPlugin/` for the elastic backend

## Use Cases

*(To be filled in)*

- Finding known library functions in a stripped binary
- Tracking a function across compiler/version differences
- Malware variant detection

## Related Components

- [[P-Code]]
- [[Decompiler]]
- [[GhidraServer]]
- [[Analysis Pipeline]]

## Sources

*(None ingested yet)*

## Open Questions

- What are the similarity thresholds and scoring semantics?
- How does BSim handle inlined functions?
