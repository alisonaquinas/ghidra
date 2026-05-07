# NDS32

Ghidra processor support for the **NDS32** RISC architecture from Andes Technology, commonly
found in embedded microcontrollers and IoT devices.

## Coverage

- NDS32 v3 instruction set
- Big-endian and little-endian variants (`nds32be.slaspec`, `nds32le.slaspec`)
- 16-bit compressed instruction extension (IFC — Instruction Fusion and Compression)

## Files

```text
data/languages/
  nds32.ldefs          — language definition (LE and BE variants)
  nds32.pspec          — processor spec (register file, special-purpose registers)
  nds32.cspec          — compiler spec (ABI calling conventions)
  nds32.sinc           — shared instruction encodings (included by both slaspec files)
  nds32le.slaspec      — little-endian top-level spec
  nds32be.slaspec      — big-endian top-level spec
  nds32.dwarf          — DWARF register mapping
  nds32.opinion        — binary format heuristics for auto-detection
```
