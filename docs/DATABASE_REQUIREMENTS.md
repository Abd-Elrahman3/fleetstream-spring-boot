# Database Requirements

## 1. Ownership and schema

PostgreSQL tables devices(id,owner_subject,last_sequence,last_seen_at), ingestion_receipts(id,subject,created_at), outbox_events(id,receipt_id,payload JSONB,published_at NULL), telemetry_dedup(device_id,sequence,event_id UNIQUE,payload_hash,recorded_at, PRIMARY KEY(device_id,sequence)), telemetry_points(device_id,sequence,recorded_at,latitude,longitude,payload_hash) partitioned by recorded_at, geofences(id,device_id FK,center_latitude,center_longitude,radius_meters), geofence_states(device_id,geofence_id,last_sequence,inside), alerts(id,device_id,geofence_id,source_event_id,type,created_at, UNIQUE(geofence_id,source_event_id,type)), stream_tickets(ticket_hash PK,subject,device_id,origin,expires_at,consumed_at NULL). Design partition-compatible primary keys instead of assuming PostgreSQL global unique indexes across partitions. Kafka topic fleet.telemetry.v1 has 6 partitions, keyed by device ID; schema version in the envelope. PostgreSQL replay data is authoritative; Redis is optional and not required. Auth validates issuer and audience fleetstream-api. Use R2DBC TransactionalOperator across state/effect writes.

## 2. Required artifacts

- ERD with cardinality, PK, FK, nullability and ownership.
- Versioned forward migrations for every constraint/index; no automatic schema update in final configuration.
- Seed fixtures for normal, duplicate, missing-reference and boundary cases.
- Explicit transaction isolation, lock order, timeout and retry policy.
- EXPLAIN (ANALYZE, BUFFERS) for the busiest query before and after an index; include row counts and hardware.
- Upgrade test from a prior schema fixture, not only create-from-empty.
- Backup/restore commands for a disposable destination and SQL integrity checks.

## 3. Testing rules

Run actual PostgreSQL semantics. Use separate connections/processes for concurrent transactions and deterministic barriers; bound all waits. A service-level existence check is not a uniqueness guarantee. If the app relies on a constraint, test direct SQL violating it. Explain any SELECT FOR UPDATE, SKIP LOCKED, RLS, serializable retry or projection checkpoint used here.

## 4. Migration discipline

An applied migration is immutable. Use expand/backfill/contract for incompatible changes, and state how old/new application versions coexist. Separate migration privileges from runtime privileges. Document retention and restore behavior for derived data, deduplication records and secrets. Do not ship real user data in fixtures.

See [Implementation Labs and Contract Details](IMPLEMENTATION_LABS.md) for concrete fixtures, payload semantics and boundary experiments. These are required, not optional extras.
