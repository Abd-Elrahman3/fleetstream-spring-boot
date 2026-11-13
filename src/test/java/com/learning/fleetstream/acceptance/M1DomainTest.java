package com.learning.fleetstream.acceptance;
import com.learning.fleetstream.domain.*;
import com.learning.fleetstream.exception.*;
import java.util.*;
import java.time.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Provided behavioral examples. These fail until M1 is implemented. Add boundary cases. */
@Tag("M1")
class M1DomainTest {
    @Test void nonfiniteCoordinatesAreRejected() {
        assertThrows(IllegalArgumentException.class, () -> new TelemetryPoint(UUID.randomUUID(), UUID.randomUUID(), 1, Instant.EPOCH, Double.NaN, 0));
    }
    @Test void centerIsInsideGeofence() {
        var device = UUID.randomUUID();
        var fence = new Geofence(UUID.randomUUID(), device, 30.0, 31.0, 100);
        var point = new TelemetryPoint(UUID.randomUUID(), device, 1, Instant.EPOCH, 30.0,31.0);
        assertTrue(fence.contains(point));
    }
}
