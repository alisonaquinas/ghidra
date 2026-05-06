---
title: "Debugger"
aliases: ["Debugger"]
category: entities
tags: [debugger, dynamic-analysis, gdb, lldb, windbg, emulation]
status: stub
sources: []
updated: 2026-05-06
---

# Debugger

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Debug/` source tree, `GhidraDocs/GhidraClass/Debugger/`.

The Ghidra Debugger is the dynamic analysis subsystem introduced in Ghidra 10.x. It integrates live debugging sessions
with Ghidra's static analysis, enabling trace recording, memory inspection, and emulation.

## Overview

- Located in `Ghidra/Debug/`
- Connects to external debuggers via agent plugins
- Supported backends: GDB, LLDB, WinDbg/dbgeng, x64dbg, JPDA (Java), drgn
- Traces are stored as first-class Ghidra objects, enabling post-mortem analysis

## Debugger Architecture

Planned content:

- The TraceModeling framework (`Ghidra/Debug/Framework-TraceModeling/`)
- The RMI trace protocol (`Ghidra/Debug/Debugger-rmi-trace/`)
- How agents connect to the debugger backend
- The `Debugger-api` module and extension points

## Supported Agents

| Agent | Module | Target |
|-------|--------|--------|
| GDB | `Debugger-agent-gdb` | Linux/macOS processes, remote targets |
| LLDB | `Debugger-agent-lldb` | macOS/Linux processes |
| WinDbg / DbgEng | `Debugger-agent-dbgeng` | Windows processes and kernel |
| x64dbg | `Debugger-agent-x64dbg` | Windows user-mode |
| drgn | `Debugger-agent-drgn` | Linux kernel live/crash debugging |
| JPDA | `Debugger-isf` / `Debugger-jpda` | Java processes |

## Related Components

- [[P-Code]]
- [[Debugging Feature]]

- [[Plugin System]]

## Sources

None ingested yet.

## Open Questions

- How does emulation relate to the live debugger? Same trace model?
- What changed in the RMI-based architecture vs. the older socket-based approach?
