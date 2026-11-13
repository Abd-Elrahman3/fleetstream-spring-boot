package com.learning.fleetstream.repository;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import com.learning.fleetstream.domain.*;

/** M2 BR-201/BR-202. Implement using real PostgreSQL; do not substitute an in-memory map. */
@org.springframework.stereotype.Repository
public class PostgresFleetStreamRepository implements FleetStreamRepository {
    @Override public Mono<Device> findDevice(UUID id) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 findDevice");
    }
    @Override public Mono<Void> saveIngestionAndOutbox(UUID receiptId, List<TelemetryPoint> points) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 saveIngestionAndOutbox");
    }
    @Override public Mono<Boolean> insertDeduplicated(TelemetryPoint point) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 insertDeduplicated");
    }
    @Override public Flux<TelemetryPoint> findAfter(UUID deviceId, long afterSequence, int limit) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 findAfter");
    }
    @Override public Mono<Void> advanceProjection(TelemetryPoint point) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 advanceProjection");
    }
}
