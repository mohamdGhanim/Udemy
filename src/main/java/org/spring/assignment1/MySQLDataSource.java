package org.spring.assignment1;

import org.springframework.stereotype.Component;

/**
 * MySQL implementation of the {@link DataSource} interface.
 * <p>
 * This class is annotated with {@link Component} to allow Spring's component scanning
 * to detect and manage it as a Spring bean within the application context.
 */
@Component
public class MySQLDataSource implements DataSource {
    /**
     * Retrieves a predefined list of email addresses associated with MySQL data source.
     *
     * @return an array of email strings from MySQL
     */
    @Override
    public String[] getEmails() {
        return new String[] {
                "alice@msql.com",
                "bob@msql.com",
                "charlie@msql.com",
                "david@msql.com",
                "eva@msql.com",
                "frank@msql.com",
                "grace@msql.com",
                "hannah@msql.com",
                "ian@msql.com",
                "julia@msql.com"};
    }
}
