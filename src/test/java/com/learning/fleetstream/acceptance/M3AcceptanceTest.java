package com.learning.fleetstream.acceptance;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Required test exercises. Read docs/ACCEPTANCE_TESTS.md for setup and expected results. */
@Tag("M3")
class M3AcceptanceTest {
    /** BR-301: Kill Kafka: accepted batches remain in outbox and recover. Kill DB: ingress returns 503, never 202. */
    @Test void br301_acceptance() {
        fail("TODO: M3 BR-301 replace this with a behavior test; do not disable or delete it");
    }
    /** BR-302: Receive sequences 10,12,11,12: projection ends at 12, gap 11 is resolved, history has each point once and effects do not duplicate. */
    @Test void br302_acceptance() {
        fail("TODO: M3 BR-302 replace this with a behavior test; do not disable or delete it");
    }
}
