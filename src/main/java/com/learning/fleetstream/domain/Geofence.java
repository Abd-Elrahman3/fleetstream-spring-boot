package com.learning.fleetstream.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


/** M1 domain skeleton. Radius 10..100000 meters; boundary counts as inside. See README sections 4–5. */
public class Geofence {
    private UUID id;
    private UUID deviceId;
    private double centerLatitude;
    private double centerLongitude;
    private double radiusMeters;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public Geofence(UUID id, UUID deviceId, double centerLatitude, double centerLongitude, double radiusMeters) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getId() { return id; }
    public UUID getDeviceId() { return deviceId; }
    public double getCenterLatitude() { return centerLatitude; }
    public double getCenterLongitude() { return centerLongitude; }
    public double getRadiusMeters() { return radiusMeters; }

    /** M1 BR-102. Haversine; radius boundary is inside. Earth radius 6371000m. */
    public boolean contains(TelemetryPoint point) {
        throw new UnsupportedOperationException("TODO: M1 BR-102");
    }
}
