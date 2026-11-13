package com.learning.fleetstream.api;
import java.util.*;
import java.time.*;
import java.math.BigDecimal;
/** Transport shapes. TODO: D4 BR-401 add field validation, defensive copies and mapping tests.
 * Treat secrets and internal persistence fields as excluded unless explicitly part of the contract.
 */
public final class Responses {
    private Responses() {}
    public record TelemetryView(UUID eventId, UUID deviceId, long sequence, Instant recordedAt, double latitude, double longitude) {}
    public record IngestionReceipt(UUID receiptId, int acceptedCount) {}
    public record GeofenceView(UUID id, UUID deviceId, double centerLatitude, double centerLongitude, double radiusMeters) {}
    public record StreamTicket(String ticket, Instant expiresAt) {}
}
