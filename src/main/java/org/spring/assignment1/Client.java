package org.spring.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Client entry point application class demonstrating Spring Core IoC container and Dependency Injection.
 * <p>
 * Bootstraps the {@link AnnotationConfigApplicationContext} using {@link AppConfig},
 * obtains the {@link EmailService} bean from the container, and triggers its {@link EmailService#sendEmail()} method.
 */
public class Client {
    /**
     * Application entry point method.
     *
     * @param args command-line arguments passed to the application
     */
    static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail();
    }
}
