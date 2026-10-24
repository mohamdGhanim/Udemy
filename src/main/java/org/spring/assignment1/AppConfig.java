package org.spring.assignment1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Java-based configuration class for the application context.
 * <p>
 * Annotated with {@link Configuration} to define this class as a source of bean definitions,
 * and {@link ComponentScan} to automatically scan and register components within the
 * {@code org.spring.assignment1} package.
 */
@Configuration
@ComponentScan(basePackages = "org.spring.assignment1")
public class AppConfig {
}
