package com.learning.fleetstream.api;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;
/** Register /ws/devices/{deviceId} using a reactive handler mapping.
 * Validate one-use ticket/origin before upgrading; authorize subscriptions and bound buffers.
 */
public class DeviceWebSocketHandler implements WebSocketHandler {
    @Override public Mono<Void> handle(WebSocketSession session) {
        return Mono.error(new UnsupportedOperationException("TODO: D4 BR-402 D5 BR-501 bounded authenticated WebSocket"));
    }
}
