package com.learning.fleetstream.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


/** M1 domain skeleton. Authorization subject must own or be assigned to the device. See README sections 4–5. */
public class Device {
    private UUID id;
    private String ownerSubject;
    private long lastSequence;
    private Instant lastSeenAt;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public Device(UUID id, String ownerSubject, long lastSequence, Instant lastSeenAt) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getId() { return id; }
    public String getOwnerSubject() { return ownerSubject; }
    public long getLastSequence() { return lastSequence; }
    public Instant getLastSeenAt() { return lastSeenAt; }
}
