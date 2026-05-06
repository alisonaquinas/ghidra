---
title: "Graphing"
aliases: ["Graphing"]
category: features
tags: [graph, call-graph, function-graph, data-flow, visualization]
status: stub
sources: []
updated: 2026-05-06
---

# Graphing

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/FunctionGraph/`, `Ghidra/Features/GraphFunctionCalls/`, `Ghidra/Framework/Graph/`.

Ghidra provides several graph-based views for visualizing code structure, including function call graphs and control
flow graphs.

## Overview

Graph types:

- **Function Graph** — control flow graph (CFG) for a single function (blocks and edges)
- **Function Call Graph** — call relationships between functions in the program
- **Data Graph** — data reference relationships

## Graph Framework

- `Ghidra/Framework/Graph/` provides the underlying graph infrastructure
- Supports interactive layout, zoom, grouping, and annotation
- `Ghidra/Features/GraphServices/` provides the graph service API

## Related Components

- [[Analysis Pipeline]]
- [[Decompilation]]
- [[Program Model]]

## Sources

None ingested yet.
