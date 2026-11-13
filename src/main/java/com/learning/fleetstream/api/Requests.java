package com.learning.fleetstream.api;
import java.util.*;
import java.time.*;
import java.math.BigDecimal;
/** Transport shapes. TODO: D4 BR-401 add field validation, defensive copies and mapping tests.
 * Treat secrets and internal persistence fields as excluded unless explicitly part of the contract.
 */
public final class Requests {
    private Requests() {}
    public record TelemetryInput(UUID eventId, UUID deviceId, long sequence, Instant recordedAt, double latitude, double longitude) {}
    public record TelemetryBatch(List<TelemetryInput> points) {}
    public record CreateGeofence(double centerLatitude, double centerLongitude, double radiusMeters) {}
}
