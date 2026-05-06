---
title: "GhidraServer"
category: entities
tags: [server, collaboration, multi-user, repository]
status: stub
sources: []
updated: 2026-05-06
---

# GhidraServer

> [!NOTE]
> This page is a stub. Primary sources: `Ghidra/Features/GhidraServer/`, `GhidraDocs/GettingStarted.md`.

GhidraServer is the multi-user collaboration server for Ghidra. It hosts shared project repositories that multiple
analysts can connect to, enabling concurrent work on the same binary.

## Overview

- Provides a versioned, shared repository model
- Clients connect via RMI
- Authentication options: password, PKI, JAAS
- Supports repository-level access control

## Architecture

Planned content:

- Server process startup and configuration
- Repository storage layout
- Check-in / check-out workflow
- The `-i` interface option and network binding

## Running the Server

## Related Components

- [[Ghidra Overview]]
- [[Build System]]
- [[Plugin System]]

## Sources

None ingested yet.

## Open Questions

- Maximum tested number of concurrent users?
- How does merge conflict resolution work for concurrent edits?
