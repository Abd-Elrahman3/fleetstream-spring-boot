package com.learning.fleetstream.repository;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import com.learning.fleetstream.domain.*;

public interface FleetStreamRepository {
    Mono<Device> findDevice(UUID id);
    Mono<Void> saveIngestionAndOutbox(UUID receiptId, List<TelemetryPoint> points);
    Mono<Boolean> insertDeduplicated(TelemetryPoint point);
    Flux<TelemetryPoint> findAfter(UUID deviceId, long afterSequence, int limit);
    Mono<Void> advanceProjection(TelemetryPoint point);
}
