# API Test Specification

The authoritative contract is [API Requirements](../API_REQUIREMENTS.md). Build a test matrix for all 6 operations.

For each: test successful response/status/headers, malformed payload, boundary values, missing resource, duplicate request, authorization denial and relevant unavailable dependency. Check database side effects after rejection. Use exact request bytes for signatures, real JWT validation tests for issuer/audience, and protocol-specific assertions for GraphQL/gRPC/streaming.

| Rule | Required sample |
| --- | --- |
| BR-401 | Disconnect after 12, reconnect with Last-Event-ID:12 → next event is >12, even after application restart. |
| BR-402 | Reusing a ticket, wrong origin, expired ticket and subscribing to another owner’s device are rejected. |
| BR-501 | A client reading 1 event/s while ingress is 100/s cannot grow heap indefinitely; other clients remain responsive. |
| BR-502 | Cancel 1,000 streams and show subscriber counts, timers and pooled connections return near baseline. |

Do not call real carrier/payment/customer services. Build deterministic local provider fixtures and record request counts and idempotency keys.
