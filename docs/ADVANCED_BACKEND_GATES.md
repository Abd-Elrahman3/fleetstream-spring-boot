# Advanced Backend Gates

CRUD alone does not complete this project. Every README rule is required, including the following demonstrations.

| Gate | Required demonstration |
| --- | --- |
| D5 | A client reading 1 event/s while ingress is 100/s cannot grow heap indefinitely; other clients remain responsive. |
| D5 | Cancel 1,000 streams and show subscriber counts, timers and pooled connections return near baseline. |
| D6 | Removing cancellation cleanup or acknowledging before DB commit must break a required test; no arbitrary sleeps as synchronization. |
| D6 | Compare shadow/current counts and state for 100 devices after disorder and duplicates; notifications stay unchanged. |
| D7 | Report actual results with dataset/config, including failures and bottleneck; a throughput claim without latency/lag evidence does not pass. |
| D7 | Final evidence shows duplicate tolerance, bounded buffers, failover recovery and why reactive code alone does not make a system faster. |

## Explain before advancing

1. Which invariant belongs in the domain, database, transport and worker respectively?
2. Where is the transaction boundary, and what happens if the process dies immediately after commit?
3. Which operations can safely retry, and how are duplicates or uncertain results resolved?
4. What is bounded: threads, connections, queues, buffers, retries and query sizes?
5. How is authorization enforced below the controller and across caches/messages?
6. Which metric tells you this system is failing before users report it?
7. How do you restore data and prove correctness after recovery?

Project-specific concepts to defend: Spring WebFlux, Reactor, R2DBC, Kafka, SSE, WebSocket, backpressure, ordering, event time, replay, bounded resources, reactive security and observability.

Record commands and results in evidence files. An owner can alter CI; the gates are an honest learning contract, not tamper-proof certification. Mark incomplete behavior openly.
