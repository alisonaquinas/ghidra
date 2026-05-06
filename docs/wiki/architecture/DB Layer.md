---
title: "DB Layer"
aliases: ["DB Layer"]
category: architecture
tags: [database, storage, persistence, db, transactions]
status: stub
sources: []
updated: 2026-05-06
---

# DB Layer

> [!NOTE]
> This page is a stub. Primary source: `Ghidra/Framework/DB/`.

The DB layer is Ghidra's internal database abstraction — a custom embedded database that provides transactional,
versioned storage for Program data.

## Overview

- Not SQL — a custom record-oriented database
- Provides: tables, records, fields, indexing, transactions, undo/redo
- All Program data (functions, data, symbols, etc.) is stored through this layer
- Supports versioned repositories via GhidraServer

## Key Concepts

- `DBHandle` — a connection to an open database
- `Table` — a typed collection of records
- `DBRecord` — a row with typed fields
- Transaction model: all writes happen inside a transaction; commit/rollback supported

## Related Components

- [[Program Model]]
- [[Software Modeling]]
- [[GhidraServer]]
- [[Framework Overview]]

## Sources

None ingested yet.
