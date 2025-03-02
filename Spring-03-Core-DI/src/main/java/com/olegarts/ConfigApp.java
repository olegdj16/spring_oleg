package com.olegarts;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The `ConfigApp` class is a Spring configuration class that enables component scanning.
 * It uses the `@Configuration` annotation to indicate that it is a source of bean definitions.
 * The `@ComponentScan` annotation tells Spring to scan the specified package for components.
 */
@Configuration
@ComponentScan
public class ConfigApp {
}
