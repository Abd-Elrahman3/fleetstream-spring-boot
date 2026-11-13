package com.learning.fleetstream.exception;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


public class ConflictException extends RuntimeException {
    public ConflictException(String message) { super(message); }
}
