package com.learning.fleetstream.service;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import com.learning.fleetstream.domain.*;
import com.learning.fleetstream.repository.FleetStreamRepository;

@org.springframework.stereotype.Service
public class FleetStreamService {
    private final FleetStreamRepository repository;
    private final Clock clock;
    public FleetStreamService(FleetStreamRepository repository, Clock clock) {
        this.repository = Objects.requireNonNull(repository);
        this.clock = Objects.requireNonNull(clock);
    }
    /** M3 BR-301; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public Mono<UUID> ingest(String subject, List<TelemetryPoint> points) {
        throw new UnsupportedOperationException("TODO: M3 BR-301 ingest");
    }
    /** M3 BR-302; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public Mono<Void> consume(TelemetryPoint point) {
        throw new UnsupportedOperationException("TODO: M3 BR-302 consume");
    }
    /** D4 BR-401; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public Flux<TelemetryPoint> events(UUID deviceId, long afterSequence, String subject) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 events");
    }
    /** D5 BR-501; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public Flux<TelemetryPoint> boundedStream(UUID deviceId, String subject) {
        throw new UnsupportedOperationException("TODO: D5 BR-501 boundedStream");
    }
}
