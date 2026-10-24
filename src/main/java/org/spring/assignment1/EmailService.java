package org.spring.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Service class responsible for sending and processing emails retrieved from a {@link DataSource}.
 * <p>
 * Managed as a Spring bean using {@link Component}. It utilizes setter-based dependency injection
 * via {@link Autowired} to inject the configured {@link DataSource} implementation.
 */
@Component
public class EmailService {
    private DataSource dataSource;

    /**
     * Injects the {@link DataSource} dependency via setter injection.
     *
     * @param dataSource the {@link DataSource} implementation to be injected
     */
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Retrieves emails from the injected {@link DataSource}, filters out duplicate addresses,
     * and prints each distinct email address to standard output.
     */
    public void sendEmail(){
        Arrays.stream(dataSource.getEmails()).distinct().forEach(System.out::println);
    }
}
