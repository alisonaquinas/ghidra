# Graph

Core graph framework providing directed graph abstractions, algorithms, and visual graph
infrastructure used throughout Ghidra.

## What This Module Provides

- **Graph interfaces and base types**: `GDirectedGraph`, `GEdge`, `GWeightedEdge`, `GraphPath`
- **Graph algorithms**: Dijkstra shortest path, topological sort, DFS/BFS traversal,
  strongly-connected component detection, cycle detection
- **Visual graph infrastructure**: `VisualGraphComponentProvider` and layout integration for
  rendering graphs in Ghidra's docking UI
- **Utilities**: `MutableGDirectedGraphWrapper`, `GraphPathSet`, `GraphToTreeAlgorithm`

## Relationships

This module is a dependency for `Features/DataGraph`, `Features/FunctionGraph`, and other
modules that display or analyze graph-structured data. The `ghidra.service.graph` service
interface (in a separate framework module) sits above this layer and allows plugins to register
graph displays without a direct dependency on layout implementations.

## Package Structure

```text
ghidra.graph          — core interfaces and base implementations
ghidra.graph.algo     — graph algorithms
ghidra.graph.viewer   — visual graph rendering and layout management
ghidra.graph.jung     — JUNG-backed graph implementations
```
