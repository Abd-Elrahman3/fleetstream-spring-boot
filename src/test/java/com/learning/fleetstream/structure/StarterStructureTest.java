package com.learning.fleetstream.structure;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** A packaging check only; does not grade business behavior. */
@Tag("structure")
class StarterStructureTest {
    @Test void applicationAndPortArePresent() throws Exception {
        assertTrue(Class.forName("com.learning.fleetstream.repository.FleetStreamRepository").isInterface());
        assertTrue(Class.forName("com.learning.fleetstream.FleetStreamApplication").isAnnotationPresent(
            org.springframework.boot.autoconfigure.SpringBootApplication.class));
    }
    @Test void clockBeanUsesUtc() {
        assertEquals(java.time.ZoneOffset.UTC, new com.learning.fleetstream.config.TimeConfig().clock().getZone());
    }
}
