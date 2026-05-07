# LaunchSupport

Java utilities used by Ghidra's launch scripts to locate a suitable JVM and parse launch
configuration before the main Ghidra classpath is assembled. This module must have **no external
dependencies** — it runs before any dependency resolution can happen.

## Key Classes

- `LaunchSupport` (entry point) — orchestrates JVM discovery and launch property loading;
  invoked directly by `ghidraRun` / `analyzeHeadless` shell scripts
- `ghidra.launch.LaunchProperties` — parses Ghidra's launch properties file format, which
  allows duplicate keys (unlike standard `java.util.Properties`)
- `ghidra.launch.JavaFinder` / `MacJavaFinder` — platform-aware JVM search logic; checks
  `JAVA_HOME`, well-known installation paths, and macOS-specific locations

## Constraints

- No external library dependencies allowed — the module must be self-contained
- Targets the minimum Java version required to bootstrap the JVM search (currently Java 11)
