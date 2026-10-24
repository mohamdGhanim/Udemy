package org.spring.assignment1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * PostgreSQL implementation of the {@link DataSource} interface.
 * <p>
 * Marked with {@link Component} to register it as a Spring bean, and {@link Primary}
 * to designate it as the preferred bean to be injected when multiple {@link DataSource}
 * beans are present in the application context.
 */
@Component
@Primary
public class PostgresSQLDataSource implements DataSource {
    /**
     * Retrieves a predefined list of email addresses associated with PostgreSQL data source.
     *
     * @return an array of email strings from PostgreSQL
     */
    @Override
    public String[] getEmails() {
        return new String[]{
                "liam@postgres.com",
                "mia@postgres.com",
                "noah@postgres.com",
                "olivia@postgres.com",
                "paul@postgres.com",
                "quinn@postgres.com",
                "rachel@postgres.com",
                "sam@postgres.com",
                "tina@postgres.com",
                "victor@postgres.com"
        };}
}
