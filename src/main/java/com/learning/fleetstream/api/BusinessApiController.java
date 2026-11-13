package com.learning.fleetstream.api;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import static com.learning.fleetstream.api.Responses.*;
import com.learning.fleetstream.service.FleetStreamService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import org.springframework.http.codec.ServerSentEvent;

/** D4 transport skeleton. Implement validation, authorization and DTO/service mapping.
 * Throwing TODOs is deliberate: no endpoint claims business success yet.
 */
@RestController
public class BusinessApiController {
    private final FleetStreamService service;
    public BusinessApiController(FleetStreamService service) { this.service = service; }
    @PostMapping("/api/v1/telemetry/batches")
    public Mono<ResponseEntity<IngestionReceipt>> ingest(@Valid @RequestBody Requests.TelemetryBatch request, @AuthenticationPrincipal Jwt principal) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 ingest");
    }
    @GetMapping("/api/v1/devices/{deviceId}/latest")
    public Mono<ResponseEntity<TelemetryView>> latest(@PathVariable UUID deviceId, @AuthenticationPrincipal Jwt principal) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 latest");
    }
    @PostMapping("/api/v1/devices/{deviceId}/geofences")
    public Mono<ResponseEntity<GeofenceView>> createGeofence(@PathVariable UUID deviceId, @Valid @RequestBody Requests.CreateGeofence request, @AuthenticationPrincipal Jwt principal) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 createGeofence");
    }
    @PostMapping("/api/v1/devices/{deviceId}/stream-tickets")
    public Mono<ResponseEntity<StreamTicket>> ticket(@PathVariable UUID deviceId, @RequestHeader("Origin") String origin, @AuthenticationPrincipal Jwt principal) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 ticket");
    }
    @GetMapping(value="/api/v1/devices/{deviceId}/events", produces="text/event-stream")
    public Flux<ServerSentEvent<TelemetryView>> events(@PathVariable UUID deviceId,
            @RequestHeader(value="Last-Event-ID", required=false) String lastId,
            @AuthenticationPrincipal Jwt principal) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 D5 BR-501 resumable bounded SSE");
    }
}
