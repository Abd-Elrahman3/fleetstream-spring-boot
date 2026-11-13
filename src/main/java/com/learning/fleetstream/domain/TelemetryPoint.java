package com.learning.fleetstream.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


/** M1 domain skeleton. Sequence >=0; latitude [-90,90], longitude [-180,180]; finite coordinates only. See README sections 4–5. */
public class TelemetryPoint {
    private UUID eventId;
    private UUID deviceId;
    private long sequence;
    private Instant recordedAt;
    private double latitude;
    private double longitude;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public TelemetryPoint(UUID eventId, UUID deviceId, long sequence, Instant recordedAt, double latitude, double longitude) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getEventId() { return eventId; }
    public UUID getDeviceId() { return deviceId; }
    public long getSequence() { return sequence; }
    public Instant getRecordedAt() { return recordedAt; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
}
