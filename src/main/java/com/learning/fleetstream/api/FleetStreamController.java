package com.learning.fleetstream.api;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import com.learning.fleetstream.service.FleetStreamService;

/** D4 BR-401/BR-402. Add the contract's DTOs, validation, mappings and status/headers.
 * The provided /learning/status route only reports that this is unfinished.
 * Do not mistake it for any of the required business endpoints.
 */
@org.springframework.web.bind.annotation.RestController
public class FleetStreamController {
    private final FleetStreamService service;
    public FleetStreamController(FleetStreamService service) { this.service = service; }
    @org.springframework.web.bind.annotation.GetMapping("/learning/status")
    public org.springframework.http.ResponseEntity<Map<String,String>> status() {
        return org.springframework.http.ResponseEntity.status(501)
            .body(Map.of("status", "UNIMPLEMENTED", "next", "Read docs/GETTING_STARTED.md"));
    }
    // TODO: D4 BR-401 BR-402 implement all required endpoints using typed DTOs.
}
