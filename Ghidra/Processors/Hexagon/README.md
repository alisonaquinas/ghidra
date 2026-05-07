# Hexagon

Ghidra processor support for the **Qualcomm Hexagon** DSP/HVX architecture, also known as QDSP6.

## Coverage

- Core Hexagon V5/V55/V60/V62/V65/V66 instruction set
- Hexagon Vector eXtensions (HVX) — SIMD vector instructions (`hexagon_hvx.sinc`)
- Floating-point operations (`hexagon_float.sinc`)
- Load-Store Multiple Words (`lsmw.sinc`)
- Little-endian only (Hexagon is exclusively LE in practice)

## Files

```text
data/languages/
  hexagon.ldefs          — language definition (variant list, endianness)
  hexagon.pspec          — processor spec (register map, context registers)
  hexagon.cspec          — compiler spec (calling conventions, stack model)
  hexagon.slaspec        — top-level Sleigh spec (includes sinc files)
  hexagon.sinc           — core instruction encodings
  hexagon_hvx.sinc       — HVX vector extension encodings
  hexagon_float.sinc     — floating-point instruction encodings
  lsmw.sinc              — load/store multiple words encodings
  hexagon.dwarf          — DWARF register mapping
  hexagon.opinion        — binary format heuristics for auto-detection
```

## Notes

Hexagon uses VLIW-style instruction packets delimited by parse bits in the encoding. The Sleigh
spec models packet boundaries; analysis scripts in `developer_scripts/` assist with packet
debugging.
