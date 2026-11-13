# Acceptance Tests

Every row is mandatory. M1 includes provided examples in starters; later test skeletons must become real behavior tests. Test names below are descriptions, not a hidden API.

| Milestone | Rule | Scenario and expected result |
| --- | --- | --- |
| M1 | BR-101 | Latitude -90 and 90 accepted; NaN and infinity rejected; timestamp exactly now+2m accepted. |
| M1 | BR-102 | Center point inside; repeat identical point emits nothing; first outside observation establishes state; outside→inside emits one ENTER. |
| M2 | BR-201 | Same device/sequence and same payload → dedup; same sequence with different coordinates → 409 for direct ingress or quarantine for broker consumption. |
| M2 | BR-202 | Drop an expired partition without deleting current device state or recent dedup keys; query a device range using an index. |
| M3 | BR-301 | Kill Kafka: accepted batches remain in outbox and recover. Kill DB: ingress returns 503, never 202. |
| M3 | BR-302 | Receive sequences 10,12,11,12: projection ends at 12, gap 11 is resolved, history has each point once and effects do not duplicate. |
| D4 | BR-401 | Disconnect after 12, reconnect with Last-Event-ID:12 → next event is >12, even after application restart. |
| D4 | BR-402 | Reusing a ticket, wrong origin, expired ticket and subscribing to another owner’s device are rejected. |
| D5 | BR-501 | A client reading 1 event/s while ingress is 100/s cannot grow heap indefinitely; other clients remain responsive. |
| D5 | BR-502 | Cancel 1,000 streams and show subscriber counts, timers and pooled connections return near baseline. |
| D6 | BR-601 | Removing cancellation cleanup or acknowledging before DB commit must break a required test; no arbitrary sleeps as synchronization. |
| D6 | BR-602 | Compare shadow/current counts and state for 100 devices after disorder and duplicates; notifications stay unchanged. |
| D7 | BR-701 | Report actual results with dataset/config, including failures and bottleneck; a throughput claim without latency/lag evidence does not pass. |
| D7 | BR-702 | Final evidence shows duplicate tolerance, bounded buffers, failover recovery and why reactive code alone does not make a system faster. |

## Failure drills

1. Throttle a subscriber until its 256-event buffer fills.
2. Rebalance Kafka after DB commit but before offset commit.
3. Resume a stream on another instance using persisted cursor.

## Evidence standard

Record setup, exact command, controlled failure point, durable before/after state, expected result and actual result. A test that only asserts an exception or mocks all persistence cannot prove a database invariant. Use bounded timeouts and deterministic coordination; avoid sleeps as a race strategy. Record a seed for randomized tests. Do not turn an unavailable Docker dependency into a silently skipped passing test.

For D6, deliberately introduce one representative bug and verify a test detects it. For D7, record machine configuration, dataset, concurrency, p50/p95/p99, throughput, errors and resource usage. Restore tests use a different database from the source.
