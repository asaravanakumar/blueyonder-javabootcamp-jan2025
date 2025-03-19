package com.labs.sboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        log.info("Custom Health Check called...");
        // Perform custom health checks
        boolean isHealthy = checkSomeService();

        if (isHealthy) {
            return Health.up().withDetail("CustomService", "Service is running").build();
        } else {
            return Health.down().withDetail("CustomService", "Service is down").build();
        }
    }

    private boolean checkSomeService() {
        // Custom logic to check service health
        return true; // or false based on actual health check
    }
}

