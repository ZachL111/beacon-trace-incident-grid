# beacon-trace-incident-grid

`beacon-trace-incident-grid` explores observability with a small Scala codebase and local fixtures. The technical goal is to package a Scala local lab for incident analysis with round-trip fixtures, lossless normalization checks, and documented operating limits.

## Project Rationale

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how span volume and signal loss should influence a review result.

## Beacon Trace Incident Grid Review Notes

`stale` and `stress` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## Feature Set

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/beacon-trace-incident-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `span volume` and `latency skew`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture

The implementation keeps the scoring rule plain: reward signal and confidence, preserve slack, penalize drag, then classify the result into a review lane.

The Scala code keeps the review rule close to the tests.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Test Command

The check exercises the source code and the review fixture. `stale` is the high score at 245; `stress` is the low score at 105.

## Next Improvements

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
