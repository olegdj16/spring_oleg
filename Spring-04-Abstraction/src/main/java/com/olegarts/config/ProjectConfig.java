package com.olegarts.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * The `ProjectConfig` class is a Spring configuration class that enables component scanning.
 * It uses the `@Configuration` annotation to indicate that it is a source of bean definitions.
 * The `@ComponentScan` annotation tells Spring to scan the specified package for components.
 *
 *<p></p>
 * The `basePackages` attribute of the `@ComponentScan` annotation specifies the base packages
 * to scan for Spring components. This ensures that Spring can find and register all the components
 * within the specified package and its sub-packages.
 */
@Configuration
@ComponentScan(basePackages = "com.olegarts")
public class ProjectConfig {
}
