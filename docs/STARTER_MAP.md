# Starter File Map

These are intentionally unfinished building blocks, not a complete solution. Add missing DTOs, entity mappings, repository queries, configuration and tests as specified. No business endpoint is provided complete.

| File | Purpose |
| --- | --- |
| src/main/java/com/learning/fleetstream/FleetStreamApplication.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/fleetstream/advanced/GeofenceProcessor.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/advanced/ProjectionRebuilder.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/advanced/StreamTicketService.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/advanced/TelemetryOutboxPublisher.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/api/ApiExceptionHandler.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/api/FleetStreamController.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/config/SecurityConfig.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/fleetstream/config/TimeConfig.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/fleetstream/domain/Alert.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/domain/Device.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/domain/Geofence.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/domain/TelemetryPoint.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/exception/ConflictException.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/fleetstream/exception/NotFoundException.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/fleetstream/persistence/TelemetryPointEntity.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/repository/FleetStreamRepository.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/repository/PostgresFleetStreamRepository.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/fleetstream/service/FleetStreamService.java | Unfinished learner code; see rule IDs in Javadoc |
| src/test/java/com/learning/fleetstream/acceptance/D4AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/fleetstream/acceptance/D5AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/fleetstream/acceptance/D6AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/fleetstream/acceptance/D7AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/fleetstream/acceptance/M1DomainTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/fleetstream/acceptance/M2AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/fleetstream/acceptance/M3AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/fleetstream/structure/StarterStructureTest.java | Behavioral examples / test exercise |

Constructors use declared fields in README order. Implement validation and assignment before services. Repository ports describe the first core use cases; extend them as necessary. Advanced component methods are starting boundaries, not prescribed complete architecture. Keep provided behavioral constructor/method signatures while adding overloads or collaborators.

## Typed transport exercises

- `src/main/java/com/learning/fleetstream/api/BusinessApiController.java`: typed D4 transport skeleton; validate and map according to API_REQUIREMENTS.md.
- `src/main/java/com/learning/fleetstream/api/DeviceWebSocketHandler.java`: typed D4 transport skeleton; validate and map according to API_REQUIREMENTS.md.
- `src/main/java/com/learning/fleetstream/api/Requests.java`: typed D4 transport skeleton; validate and map according to API_REQUIREMENTS.md.
- `src/main/java/com/learning/fleetstream/api/Responses.java`: typed D4 transport skeleton; validate and map according to API_REQUIREMENTS.md.
