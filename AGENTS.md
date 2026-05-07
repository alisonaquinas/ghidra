# Ghidra — Agent Guide

Ghidra is the NSA-developed software reverse engineering (SRE) framework. This guide orients
AI agents working in this repository.

## Repository Layout

```text
ghidra/
├── Ghidra/               ← all Ghidra modules (Framework, Features, Debug, Processors, Extensions)
│   ├── Framework/        ← core libraries (graph, DB, SoftwareModeling, plugin system, UI)
│   ├── Features/         ← user-facing capabilities (decompiler, BSim, scripting, analysis)
│   ├── Debug/            ← dynamic analysis and debugger subsystem
│   ├── Processors/       ← ISA/processor support (Sleigh specs per architecture)
│   ├── Extensions/       ← optional/experimental modules
│   └── Configurations/   ← release packaging definitions
├── GhidraBuild/          ← build infrastructure only (not shipped as part of Ghidra)
│   ├── BuildFiles/       ← Sleigh build templates, Gradle Doclets
│   ├── EclipsePlugins/   ← GhidraDev and GhidraSleighEditor Eclipse plugins
│   ├── LaunchSupport/    ← JVM discovery and launch property parsing utilities
│   └── MarkdownSupport/  ← Markdown-to-HTML converter used during release builds
├── GPL/                  ← GPL-licensed modules (standalone, independently buildable)
├── GhidraDocs/           ← user-facing docs (Getting Started, Ghidra Class slides)
├── docs/                 ← developer wiki (Obsidian vault; LLM-maintained)
│   ├── wiki/             ← Obsidian-Flavored Markdown pages; see docs/wiki/AGENTS.md
│   └── raw/              ← immutable raw source material for wiki ingestion
├── gradle/               ← Gradle build configuration (dependency management, module utils)
├── licenses/             ← license texts for bundled third-party components
├── README.md             ← install, build, and release instructions
├── DevGuide.md           ← contributor setup, Gradle tasks, licensing conventions
└── CONTRIBUTING.md       ← contribution process and code review expectations
```

## Key Conventions

- **License**: Apache 2.0 for everything under `Ghidra/` and `GhidraBuild/`. GPL code must live
  exclusively in `GPL/` as a standalone, independently buildable module.
- **License header**: Every Java source file begins with the standard GHIDRA IP block
  (`/* ### \n * IP: GHIDRA ...`). Do not omit or alter this header.
- **No external deps in GhidraBuild**: `LaunchSupport` and `MarkdownSupport` must remain
  dependency-free because they run before the main classpath is assembled.
- **Module structure**: Each module under `Ghidra/` contains `Module.manifest`,
  `build.gradle`, `certification.manifest`, and a `src/` tree. Do not add files that break
  this layout.
- **Sleigh specs**: Processor support lives in `Ghidra/Processors/<Arch>/data/languages/`.
  Each architecture needs `.ldefs`, `.slaspec` (or `.sinc` includes), `.pspec`, and `.cspec`.

## Build

```bash
# First-time setup: download non-Maven dependencies
gradle -I gradle/support/fetchDependencies.gradle

# Prepare development environment (downloads Maven deps, generates Eclipse projects)
gradle prepdev

# Build a full Ghidra distribution for the current platform
gradle buildGhidra

# Run all tests
gradle test

# Clean build artifacts
gradle clean
```

See `DevGuide.md` for the full task reference and Eclipse setup instructions.

## Testing

Tests live alongside source under `src/test/java/`. Run a specific module's tests with:

```bash
gradle :<ModuleName>:test
```

Integration tests are marked `@IntegrationCategory` and run separately:

```bash
gradle integrationTest
```

## Documentation

- **User docs**: `GhidraDocs/` — Getting Started guide and Ghidra Class slides
- **Dev guide**: `DevGuide.md` — environment setup, Gradle tasks, licensing
- **Wiki**: `docs/wiki/` — LLM-maintained Obsidian vault; governed by `docs/wiki/AGENTS.md`

## CI

`.github/workflows/` contains:

- `markdown-lint.yml` — runs on markdown changes; `lint-docs` uses `markdownlint-obsidian`
  for `docs/wiki/`; `lint-repo` uses `markdownlint-cli2` on changed non-docs `.md` files only.

When editing markdown outside `docs/`, ensure it passes `.markdownlint-cli2.jsonc` (120-char
line limit, consistent list/emphasis style).

## Eclipse Development

Eclipse is the primary IDE. After `gradle prepdev`, import the generated `.project` files via
`File → Import → General → Existing Projects into Workspace`. GhidraDev (the Eclipse plugin
in `GhidraBuild/EclipsePlugins/GhidraDev/`) enables Ghidra script and module development from
within Eclipse.
