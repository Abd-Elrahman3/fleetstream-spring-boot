package com.learning.fleetstream.acceptance;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Required test exercises. Read docs/ACCEPTANCE_TESTS.md for setup and expected results. */
@Tag("M2")
class M2AcceptanceTest {
    /** BR-201: Same device/sequence and same payload → dedup; same sequence with different coordinates → 409 for direct ingress or quarantine for broker consumption. */
    @Test void br201_acceptance() {
        fail("TODO: M2 BR-201 replace this with a behavior test; do not disable or delete it");
    }
    /** BR-202: Drop an expired partition without deleting current device state or recent dedup keys; query a device range using an index. */
    @Test void br202_acceptance() {
        fail("TODO: M2 BR-202 replace this with a behavior test; do not disable or delete it");
    }
}
