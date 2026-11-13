package com.learning.fleetstream.api;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


/** D4 BR-402: implement ProblemDetail mappings and validation fieldErrors.
 * GraphQL also needs DataFetcherExceptionResolver; WebFlux needs reactive security error mapping.
 */
@org.springframework.web.bind.annotation.RestControllerAdvice
public class ApiExceptionHandler {
    // TODO: D4 BR-402 stable error codes; never leak SQL, stack traces or secrets.
}
