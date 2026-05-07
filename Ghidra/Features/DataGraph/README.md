# DataGraph

Interactive data exploration graph feature that lets analysts navigate program data relationships
visually. Displays an expandable graph of data references, enabling exploration of pointer webs,
struct layouts, and data cross-references directly from the Listing or Decompiler.

## Key Components

- `DataGraphPlugin` — registers the feature with the plugin system; provides the action to open
  a graph view from a selected data item
- `DataGraphProvider` — docking component that hosts the graph display
- `DegContext` / `DegSatelliteContext` — context state for the primary and satellite views
- `datagraph.graph.explore` — vertex and edge types specific to data exploration graphs
  (`EgVertex`, `EgEdge`, `AbstractExplorationGraph`)

## Dependencies

Builds on `Framework/Graph` for graph algorithm and visual rendering infrastructure, and on
`Features/GraphServices` for graph display service registration.
