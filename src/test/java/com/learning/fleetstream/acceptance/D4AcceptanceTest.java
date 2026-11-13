package com.learning.fleetstream.acceptance;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Required test exercises. Read docs/ACCEPTANCE_TESTS.md for setup and expected results. */
@Tag("D4")
class D4AcceptanceTest {
    /** BR-401: Disconnect after 12, reconnect with Last-Event-ID:12 → next event is >12, even after application restart. */
    @Test void br401_acceptance() {
        fail("TODO: D4 BR-401 replace this with a behavior test; do not disable or delete it");
    }
    /** BR-402: Reusing a ticket, wrong origin, expired ticket and subscribing to another owner’s device are rejected. */
    @Test void br402_acceptance() {
        fail("TODO: D4 BR-402 replace this with a behavior test; do not disable or delete it");
    }
}
