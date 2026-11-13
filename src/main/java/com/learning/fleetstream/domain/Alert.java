package com.learning.fleetstream.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


/** M1 domain skeleton. One ENTER/EXIT transition effect per source event and geofence. See README sections 4–5. */
public class Alert {
    private UUID id;
    private UUID deviceId;
    private UUID sourceEventId;
    private String type;
    private Instant createdAt;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public Alert(UUID id, UUID deviceId, UUID sourceEventId, String type, Instant createdAt) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getId() { return id; }
    public UUID getDeviceId() { return deviceId; }
    public UUID getSourceEventId() { return sourceEventId; }
    public String getType() { return type; }
    public Instant getCreatedAt() { return createdAt; }
}
