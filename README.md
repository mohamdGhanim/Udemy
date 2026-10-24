# Spring Framework & Spring Boot Practice

This repository contains practical exercises, assignments, and project solutions developed while following the Udemy course **[Spring 7 & Spring Boot 4 for Beginners (Includes 8 Projects)](https://www.udemy.com/course/learn-spring-boot/)**.

---

## About the Course & Instructor

### Course Overview
- **Course Title:** Spring 7 & Spring Boot 4 for Beginners (Includes 8 Projects)
- **Course Link:** [https://www.udemy.com/course/learn-spring-boot/](https://www.udemy.com/course/learn-spring-boot/)


### Instructor: Ramesh Fadatare (Java Guides)
- **Instructor:** [Ramesh Fadatare](https://www.udemy.com/user/ramesh-fadatare/) – Software Engineer, founder of **Java Guides**, Udemy Instructor Partner, and VMware Spring Certified Professional.


### What the Course Covers
- **Spring Core & Framework Fundamentals:** Inversion of Control (IoC), Dependency Injection (DI), Spring Beans, Bean Scopes, and Java-based Annotation Configuration.
- **Spring Boot Essentials:** Auto-configuration, Spring Initializr, Starter Dependencies, and Actuator.
- **RESTful Web Services & Spring MVC:** Designing and building CRUD REST APIs following best practices.
- **Data Persistence:** Spring Data JPA, Hibernate, Entity Relationships, and database integration (MySQL, PostgreSQL).
- **Security:** Spring Security (Authentication, Authorization, and JWT).
- **Full-Stack & Reactive Integration:** Thymeleaf, React JS, and Spring WebFlux.
- **DevOps & Containerization:** Building executable JARs, Maven/Gradle build tools, and Docker integration.

---

## Assignments & Exercises

### Assignment 1: Spring Core & Dependency Injection

#### Context
Demonstrates core Spring IoC (Inversion of Control) and Dependency Injection (DI) using Java-based configuration and annotations.

#### Goal
- Configure a Spring application context with `@Configuration` and `@ComponentScan`.
- Decouple components using a `DataSource` interface with multiple implementations (`MySQLDataSource`, `PostgresSQLDataSource`).
- Manage dependency injection via setter injection (`@Autowired`) in `EmailService`.
- Handle bean selection conflicts when multiple candidates exist using `@Primary`.
- Retrieve and run beans using `AnnotationConfigApplicationContext`.
