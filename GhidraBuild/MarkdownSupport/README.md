# MarkdownSupport

Converts Markdown files to HTML during the Ghidra release build process. Used to generate
browsable HTML documentation (e.g., `analyzeHeadlessREADME.html`) from Markdown source files
in the repository.

## Entry Point

`ghidra.markdown.MarkdownToHtml` — command-line program that takes two arguments:

1. Path to the input `.md` file
2. Path for the output `.html` file

## Dependencies

Uses the [commonmark-java](https://github.com/commonmark/commonmark-java) library with the
following extensions:

- `commonmark-ext-gfm-tables` — GitHub Flavored Markdown table support
- `commonmark-ext-heading-anchor` — anchor IDs on headings for in-page navigation
- `commonmark-ext-footnotes` — footnote syntax

These dependencies are resolved via Gradle and available at build time (unlike `LaunchSupport`,
this module is not constrained to zero dependencies).

## Usage

Invoked by the Gradle build; not intended for standalone use outside the Ghidra build pipeline.
