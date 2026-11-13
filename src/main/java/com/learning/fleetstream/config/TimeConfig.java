package com.learning.fleetstream.config;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.fleetstream.exception.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


@org.springframework.context.annotation.Configuration
public class TimeConfig {
    @org.springframework.context.annotation.Bean
    public Clock clock() { return Clock.systemUTC(); }
}
