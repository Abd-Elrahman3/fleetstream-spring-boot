# Developer Track (D4–D7)

Rules are mandatory and cumulative. README section 5 is authoritative. Testing is part of each milestone; the AQA guide is complementary, not an alternative that skips implementation.

## D4 — API contracts and authorization

**Branch:** `feature/d4-api`

**Goal:** Stream resumable SSE; Authenticate WebSockets.

**You will practise:** Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-401 | Stream resumable SSE — Disconnect after 12, reconnect with Last-Event-ID:12 → next event is >12, even after application restart. |
| [ ] | BR-402 | Authenticate WebSockets — Reusing a ticket, wrong origin, expired ticket and subscribing to another owner’s device are rejected. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/fleetstream/acceptance/D4AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D4.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## D5 — Advanced behavior and resource limits

**Branch:** `feature/d5-advanced`

**Goal:** Apply explicit backpressure; Avoid blocking and leaks.

**You will practise:** Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-501 | Apply explicit backpressure — A client reading 1 event/s while ingress is 100/s cannot grow heap indefinitely; other clients remain responsive. |
| [ ] | BR-502 | Avoid blocking and leaks — Cancel 1,000 streams and show subscriber counts, timers and pooled connections return near baseline. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/fleetstream/acceptance/D5AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D5.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## D6 — Failure testing and recovery

**Branch:** `feature/d6-failures`

**Goal:** Test time and demand; Rebuild projections.

**You will practise:** Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-601 | Test time and demand — Removing cancellation cleanup or acknowledging before DB commit must break a required test; no arbitrary sleeps as synchronization. |
| [ ] | BR-602 | Rebuild projections — Compare shadow/current counts and state for 100 devices after disorder and duplicates; notifications stay unchanged. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/fleetstream/acceptance/D6AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D6.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## D7 — Operations and design defense

**Branch:** `feature/d7-operations`

**Goal:** Measure throughput and resource limits; Operate across failures.

**You will practise:** Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-701 | Measure throughput and resource limits — Report actual results with dataset/config, including failures and bottleneck; a throughput claim without latency/lag evidence does not pass. |
| [ ] | BR-702 | Operate across failures — Final evidence shows duplicate tolerance, bounded buffers, failover recovery and why reactive code alone does not make a system faster. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/fleetstream/acceptance/D7AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D7.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.
