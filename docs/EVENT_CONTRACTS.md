# Event Contracts

Target envelope is in [AsyncAPI](../api/asyncapi.json). Every event includes eventId,aggregateId,type,schemaVersion,occurredAt,correlationId,payload. Schema version is 1. Unknown optional fields are tolerated; incompatible semantics need a new version and migration. Maximum encoded message size is 256KiB.

Kafka topic `fleet.telemetry.v1` has six partitions; key=deviceId. Event aggregateId equals deviceId and payload is TelemetryPoint. Event type is `TelemetryRecorded`. Consumer group `fleetstream-v1` commits offsets only after DB work. Define schema validation, poison-message quarantine and rebalance behavior. An ingestion batch expands into one event per point; stable eventId is preserved.

At-least-once delivery permits duplicates. Consumer identity plus eventId deduplicates effects in the same transaction. Never assume ordering across unrelated partitions/queues. Record trace context in headers without bearer tokens. Read README rules for crash windows, retention and replay.
