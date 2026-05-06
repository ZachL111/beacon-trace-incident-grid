# Review Journal

The repository goal stays the same: package a Scala local lab for incident analysis with round-trip fixtures, lossless normalization checks, and documented operating limits. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 213, lane `ship`
- `stress`: `latency skew`, score 105, lane `watch`
- `edge`: `signal loss`, score 185, lane `ship`
- `recovery`: `incident shape`, score 214, lane `ship`
- `stale`: `span volume`, score 245, lane `ship`

## Note

The useful failure mode here is a wrong decision on a named case, not a vague style disagreement.
