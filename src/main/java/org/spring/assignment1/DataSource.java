package org.spring.assignment1;

/**
 * Interface representing a data source for retrieving email addresses.
 * <p>
 * Implementations of this interface provide email data from various underlying sources
 * such as different database engines (e.g., MySQL, PostgreSQL).
 */
public interface DataSource {
    /**
     * Retrieves an array of email addresses.
     *
     * @return an array of email address strings
     */
    public String[] getEmails();
}
