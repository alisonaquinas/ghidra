# BuildFiles

Shared build infrastructure files used across the Ghidra source tree. Not part of the Ghidra
distribution — used only during the build process.

## Contents

### Doclets (`Doclets/`)

Custom Javadoc doclets that generate Ghidra-specific API documentation output formats used in
the release build pipeline.

### Sleigh Build Templates

Ant build file templates for compiling Sleigh language specifications:

- `sleighDevBuild.template` — template for in-source development builds; supports both
  Eclipse ("Run As → Ant Build") and command-line (`ant`) invocations from a language's
  `data/` directory
- `sleighDistBuild.template` — template used during distribution builds to compile all
  Sleigh specs into `.sla` files

These templates are instantiated by the Gradle build into concrete `build.xml` files placed
alongside each processor's language data directory.
