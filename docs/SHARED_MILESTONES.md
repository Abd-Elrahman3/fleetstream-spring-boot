# Shared Milestones (M1–M3)

Rules are mandatory and cumulative. README section 5 is authoritative. Testing is part of each milestone; the AQA guide is complementary, not an alternative that skips implementation.

## M1 — Domain and invariants

**Branch:** `feature/m1-domain`

**Goal:** Validate telemetry; Specify geofence transitions.

**You will practise:** Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-101 | Validate telemetry — Latitude -90 and 90 accepted; NaN and infinity rejected; timestamp exactly now+2m accepted. |
| [ ] | BR-102 | Specify geofence transitions — Center point inside; repeat identical point emits nothing; first outside observation establishes state; outside→inside emits one ENTER. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/fleetstream/acceptance/M1DomainTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/M1.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## M2 — Database and persistence

**Branch:** `feature/m2-database`

**Goal:** Persist reactively; Partition and retain history.

**You will practise:** Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-201 | Persist reactively — Same device/sequence and same payload → dedup; same sequence with different coordinates → 409 for direct ingress or quarantine for broker consumption. |
| [ ] | BR-202 | Partition and retain history — Drop an expired partition without deleting current device state or recent dedup keys; query a device range using an index. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/fleetstream/acceptance/M2AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/M2.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## M3 — Transactional use cases

**Branch:** `feature/m3-transactions`

**Goal:** Accept durably before acknowledging; Handle ordering and gaps.

**You will practise:** Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-301 | Accept durably before acknowledging — Kill Kafka: accepted batches remain in outbox and recover. Kill DB: ingress returns 503, never 202. |
| [ ] | BR-302 | Handle ordering and gaps — Receive sequences 10,12,11,12: projection ends at 12, gap 11 is resolved, history has each point once and effects do not duplicate. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/fleetstream/acceptance/M3AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/M3.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.
