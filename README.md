# Student Management System

A web-based Student Management System built with Spring Boot, Thymeleaf, and H2 Database.

## Features

- View all students in a clean, responsive interface
- Add new students with validation
- Edit existing student information
- Delete students from the system
- In-memory H2 database for quick setup and testing

## Technologies Used

- Java 17
- Spring Boot 3.0
- Spring Data JPA
- Thymeleaf
- H2 Database
- Bootstrap 5
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven

### Running the Application

1. Clone the repository
2. Open a terminal in the project directory
3. Run `mvn spring-boot:run`
4. Access the application at http://localhost:8080/students

### H2 Database Console

The H2 in-memory database console is available at http://localhost:8080/h2-console with these credentials:
- JDBC URL: `jdbc:h2:mem:student_db`
- Username: `sa`
- Password: ` ` (empty)

## Project Structure

- `controller` - Contains the web controllers
- `entity` - Contains the JPA entity classes
- `repository` - Contains Spring Data JPA repositories
- `service` - Contains business logic and service interfaces
- `service/impl` - Contains service implementations
- `resources/templates` - Contains Thymeleaf templates

## Future Enhancements

- User authentication and role-based access
- Student attendance tracking
- Course management
- Grade and assessment management
