package com.learning.fleetstream.advanced;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import com.learning.fleetstream.domain.*;

/** D6 BR-602. See the matching README rule; add injected collaborators as needed. */
public class ProjectionRebuilder {
    public Mono<Long> rebuild(Instant highWatermark) {
        throw new UnsupportedOperationException("TODO: D6 BR-602 rebuild");
    }
}
