# Implementation Labs and Contract Details

These details are part of the requirements and refine the README rules.

## Device fixture and ingress deduplication

Seed two devices with stable UUIDs, owned by Alice and Bob respectively, using a development-only migration/fixture command; device provisioning is outside this project's public API. Audience fleetstream-api; telemetry:write permits submitting only owned devices. Read/stream/geofence/ticket operations require ownership. Add a production provisioning design to your ADR, but no public unauthenticated registration route.

Separate ingress deduplication from consumer effects. Add ingress_keys(device_id,sequence,event_id UNIQUE,payload_hash,received_at, PRIMARY KEY(device_id,sequence)); commit these keys, receipt and outbox together. Same identity+payload is a replay; any changed identity/payload mapping →409 and rolls back the entire batch. acceptedCount counts only newly accepted points, so an all-duplicate batch returns 202 with acceptedCount=0 and no extra outbox events. Retain ingress keys for at least the seven-day ingestion horizon. Consumer processed_events(consumer,event_id) is a separate table committed with history/projection/alert effects. Do not let the ingress key cause a consumer to skip its first processing.

## Event-time and identity contract

eventId uniquely identifies a device/sequence/payload combination. Reject timestamps older than seven days at ingress (400 OUTSIDE_RETENTION); late but retained data is accepted. Point constructors validate coordinates and sequence; timestamp-relative checks belong in a service with injected Clock. Batch validation occurs before writes. Initial device lastSequence is -1. Numeric sequence never rolls back; a reboot must persist its sequence or use a separately provisioned new device identity. A point may fill a historical gap without changing the latest projection.

## Replay and WebSocket protocol

SSE sends `id: <sequence>`, `event: telemetry` and JSON TelemetryView as data. Last-Event-ID is a nonnegative integer. No cursor starts live delivery after a snapshot of current sequence; an explicit cursor replays strictly later retained events before live events with no gap during the handoff. A requested cursor older than the retained replay window returns 410. Heartbeat is a comment line. Slow client disconnect is explicit; clients reconnect using their last processed ID.

WebSocket handshake path /ws/devices/{deviceId}?ticket=<single-use-ticket> consumes a hashed 30s ticket bound to origin/subject/device. Frame types: SUBSCRIBE {afterSequence?}, TELEMETRY {sequence,payload}, PING {nonce}, PONG {nonce}, ERROR {code,message}. Max text frame 16KiB; reject binary frames. Ticket handshake binds one device; changing device requires a new authorized connection. Apply the 256-event buffer and one-hour lifetime. Close 1008 for policy/auth expiration, 1009 for oversized frames, 1013 for overload; never expose bearer tokens. Origin allowlist defaults to http://localhost:3000 in local config only.

## Reactive lab

Test a subscriber with initial demand zero using StepVerifier, then request one at a time. Prove cancellation releases timers, subscriptions and connection permits. Add Reactor context propagation for correlation IDs, a bounded concurrency setting and a graceful-shutdown drain deadline. Use R2DBC TransactionalOperator for composed DB work; do not call subscribe() inside a service to hide work from the request lifecycle.
