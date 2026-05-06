# Wiki Activity Log

Append-only chronological record of wiki operations. Each entry follows the format:
`## [YYYY-MM-DD] <operation> | <description>`

Operations: `ingest`, `query`, `lint`, `scaffold`, `schema-update`

Quick parse: `grep "^## \[" log.md | tail -10`

---

## [2026-05-06] scaffold | Initial wiki structure created

Created directory layout, AGENTS.md schema, index.md catalog, and stub pages for all planned categories. No raw sources ingested yet. All pages are `status: stub`.

Priority ingestion targets identified:
- `GhidraDocs/GettingStarted.md`
- `DevGuide.md`
- `README.md`
- `GhidraDocs/GhidraClass/` course materials
