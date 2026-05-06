# Beacon Trace Incident Grid Walkthrough

This note is the quickest way to read the extra review model in `beacon-trace-incident-grid`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 213 | ship |
| stress | latency skew | 105 | watch |
| edge | signal loss | 185 | ship |
| recovery | incident shape | 214 | ship |
| stale | span volume | 245 | ship |

Start with `stale` and `stress`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `stress` becomes less cautious without a clear reason, I would inspect the drag input first.
