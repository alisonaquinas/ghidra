# Ghidra LLM Wiki — Schema & Workflow

This file is the governing schema for the Ghidra LLM wiki located in `docs/wiki/`. It tells the LLM how the wiki
is organized, what conventions to follow, and what workflows to use when ingesting new sources, answering queries,
or performing maintenance. Read this file at the start of every wiki-related session.

---

## What This Wiki Is

This wiki is a persistent, incrementally-maintained knowledge base about the Ghidra Software Reverse Engineering
(SRE) framework — its architecture, features, processors, internals, and development patterns. It is written and
maintained entirely by an LLM agent; humans read it and direct the LLM, but do not write wiki pages themselves.

**Raw sources** live in `docs/raw/`. They are immutable — the LLM reads from them but never modifies them.

**Wiki pages** live in `docs/wiki/`. These are LLM-generated, Obsidian Flavored Markdown files. All internal links
use wikilinks (`[[Page Title]]`).

**This file** (`AGENTS.md`) is the schema. It is co-evolved by the LLM and the user as the wiki matures.

---

## Directory Layout

```text
docs/wiki/
├── AGENTS.md              ← this file — schema and workflow
├── index.md               ← master content catalog (LLM updates on every ingest)
├── log.md                 ← append-only activity log (ingest, query, lint entries)
├── overview/              ← high-level orientation pages
├── entities/              ← named things: components, subsystems, tools, key files
├── features/              ← user-facing Ghidra capabilities and analysis tools
├── processors/            ← ISA/processor-family support pages
├── architecture/          ← internal framework design and module organization
├── development/           ← contributor and extension-developer guidance
└── sources/               ← per-source summary pages (one per ingested raw source)
```

### Category Descriptions

| Directory | What goes here |
|-----------|----------------|
| `overview/` | Big-picture pages: what Ghidra is, its origin, its primary use cases, a tour of major subsystems. Entry point for anyone new to the wiki. |
| `entities/` | Pages for specific named things: the Decompiler, Sleigh, P-Code, BSim, the Debugger, GhidraServer, PyGhidra, FunctionID, etc. Each entity gets one page. |
| `features/` | User-facing capabilities: disassembly, decompilation, scripting, analysis pipeline, diffing, graphing, headless mode, file format support. |
| `processors/` | One page per processor family or ISA group. Covers Ghidra's support level, Sleigh spec files, known quirks. |
| `architecture/` | Internal design: the plugin system, the Program model, SoftwareModeling framework, the Docking UI, the DB layer, headless/server modes. |
| `development/` | For contributors and extension authors: build system, Eclipse setup, extension development, scripting API, Sleigh language authorship. |
| `sources/` | One summary page per raw source ingested (a document, a class file, a doc page). Filename matches source. These feed the rest of the wiki. |

---

## Page Conventions

### Frontmatter

Every wiki page (except `index.md`, `log.md`, and `AGENTS.md`) must have YAML frontmatter:

```yaml
---
title: "Page Title"
category: entities | features | processors | architecture | development | overview | sources
tags: [tag1, tag2]
status: stub | draft | current
sources: []          # list of source filenames that informed this page
updated: YYYY-MM-DD
---
```

- `status: stub` — scaffolded placeholder, not yet filled in
- `status: draft` — partially written, content may be incomplete
- `status: current` — fully written and up to date

### Wikilinks

Use `[[Page Title]]` for all internal links. Never use relative Markdown paths for internal links. Use
`[[Page Title|display text]]` when the display text should differ from the page title.

### Callouts

Use Obsidian callouts for important notices:

```markdown
> [!NOTE]
> For general observations.

> [!WARNING]
> For known issues, gotchas, or security-sensitive information.

> [!TIP]
> For non-obvious usage tips or shortcuts.
```

### Page Structure

Standard section order for entity and feature pages:

1. One-paragraph summary (below the title, before any sections)
2. `## Overview` — what it is and why it exists
3. `## Key Capabilities` or `## Architecture` — how it works
4. `## Related Components` — wikilinks to connected pages
5. `## Sources` — which raw sources informed this page
6. `## Open Questions` — gaps, contradictions, things to investigate (remove when resolved)

For processor pages, use: Overview → Supported Variants → Sleigh Files → Known Issues → Related.

---

## Operations

### Ingest a New Source

When the user drops a new file into `docs/raw/` and asks you to ingest it:

1. Read the source file fully.
2. Discuss key takeaways with the user if the source is complex.
3. Create a summary page in `docs/wiki/sources/` named after the source file.
4. Update `index.md` to include the new source summary page.
5. Identify all entities, features, processors, or architecture concepts mentioned. Update or create pages in the
   appropriate category directories.
6. Update cross-references: if page A now should link to the newly created/updated page B, add the link.
7. Append an entry to `log.md` in the format: `## [YYYY-MM-DD] ingest | <source filename>`.

A single ingest may touch 5–20 wiki pages. That is expected and correct.

### Answer a Query

When the user asks a question about Ghidra:

1. Read `index.md` to find relevant pages.
2. Read the relevant pages.
3. Synthesize an answer with citations to wiki pages and, where applicable, source files.
4. If the answer is substantive enough to be reusable (a comparison, an analysis, a connection), offer to file it
   as a new wiki page.
5. Append an entry to `log.md`: `## [YYYY-MM-DD] query | <short description>`.

### Lint the Wiki

When the user asks you to health-check the wiki:

1. Scan all pages for: broken wikilinks, orphan pages (no inbound links), stale `status: stub` pages that have
   available source data, contradictions between pages.
2. Scan `index.md` for pages listed that do not exist, or pages that exist but are missing from the index.
3. Suggest new pages for concepts that appear in multiple pages but lack their own entry.
4. Suggest new sources to ingest that would fill identified gaps.
5. Append an entry to `log.md`: `## [YYYY-MM-DD] lint | <summary>`.

---

## Ghidra-Specific Taxonomy

These are the primary concepts and their canonical page names in this wiki. Use these names consistently in wikilinks.

### Core Concepts

- `[[Ghidra Overview]]` — the project at a glance
- `[[P-Code]]` — Ghidra's intermediate representation (IR)
- `[[Sleigh]]` — the processor specification language
- `[[Program Model]]` — the in-memory representation of a binary

### Key Entities

- `[[Decompiler]]` — the native C decompiler
- `[[Debugger]]` — the dynamic analysis / debugging subsystem
- `[[BSim]]` — behavioral similarity search
- `[[GhidraServer]]` — collaborative multi-user server
- `[[PyGhidra]]` — Python 3 / JPype integration
- `[[FunctionID]]` — library function identification
- `[[Sleigh Dev Tools]]` — tooling for Sleigh spec authorship

### Framework Modules

- `[[Plugin System]]` — extension/plugin architecture
- `[[Software Modeling]]` — the SoftwareModeling framework module
- `[[Docking UI]]` — the dockable window/tool system
- `[[DB Layer]]` — the internal database abstraction

### Development

- `[[Build System]]` — Gradle-based build
- `[[Extension Development]]` — writing Ghidra extensions
- `[[Scripting API]]` — Java and Python scripting interfaces
- `[[Eclipse Setup]]` — IDE configuration for contributors

---

## Source Index

Raw sources currently in `docs/raw/`:

| File | Description |
|------|-------------|
| `llm-wiki.md` | The LLM wiki pattern specification — not a Ghidra source |

Additional sources should be added here as they are ingested.

---

## Evolution Notes

- This schema was initialized during the wiki scaffolding pass (2026-05-06).
- Page content is placeholder (`status: stub`) until ingestion passes fill it in.
- The processor directory is scaffolded by family; individual Sleigh spec files have not yet been ingested.
- Priority ingestion targets: `GhidraDocs/GettingStarted.md`, `DevGuide.md`, `README.md`, class materials in `GhidraDocs/GhidraClass/`.
