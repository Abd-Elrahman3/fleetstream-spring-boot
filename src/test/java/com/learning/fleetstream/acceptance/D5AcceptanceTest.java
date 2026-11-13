package com.learning.fleetstream.acceptance;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Required test exercises. Read docs/ACCEPTANCE_TESTS.md for setup and expected results. */
@Tag("D5")
class D5AcceptanceTest {
    /** BR-501: A client reading 1 event/s while ingress is 100/s cannot grow heap indefinitely; other clients remain responsive. */
    @Test void br501_acceptance() {
        fail("TODO: D5 BR-501 replace this with a behavior test; do not disable or delete it");
    }
    /** BR-502: Cancel 1,000 streams and show subscriber counts, timers and pooled connections return near baseline. */
    @Test void br502_acceptance() {
        fail("TODO: D5 BR-502 replace this with a behavior test; do not disable or delete it");
    }
}
