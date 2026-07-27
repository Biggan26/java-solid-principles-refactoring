# Java SOLID Principles Refactoring

## Overview

This project demonstrates how to refactor a legacy Java application by applying the five SOLID principles. The goal is to transform tightly coupled, difficult-to-maintain code into a clean, modular, and extensible design using Object-Oriented Programming (OOP) best practices.

---

## Project Objectives

- Refactor legacy Java code
- Apply all five SOLID principles
- Improve code maintainability and readability
- Demonstrate clean architecture concepts
- Practice object-oriented design

---

## Technologies Used

- Java 21
- Maven
- IntelliJ IDEA
- Git & GitHub

---

## Project Structure

```
src
└── main
    └── java
        └── com
            └── biggan
                │
                ├── demo
                │   ├── LegacyMain.java
                │   ├── SRPMain.java
                │   ├── OCPMain.java
                │   ├── LSPMain.java
                │   ├── ISPMain.java
                │   └── DIPMain.java
                │
                ├── model
                │   ├── Employee.java
                │   ├── Developer.java
                │   └── Manager.java
                │
                ├── repository
                │   ├── EmployeeRepository.java
                │   └── EmployeeRepositoryImpl.java
                │
                ├── service
                │   ├── EmployeeService.java
                │   └── SearchService.java
                │
                ├── interfaces
                │   ├── Workable.java
                │   └── Manageable.java
                │
                ├── legacy
                │   └── EmployeeManager.java
                │
                ├── exception
                │
                └── Main.java
```

---

## Implemented Principles

### Legacy Code
Initial implementation with tightly coupled code to demonstrate common design problems before refactoring.

### SRP – Single Responsibility Principle
Separated business logic from data storage by introducing dedicated service and repository classes.

### OCP – Open/Closed Principle
Added search functionality without modifying the existing business logic by introducing a separate search service.

### LSP – Liskov Substitution Principle
Demonstrated inheritance using `Employee`, `Manager`, and `Developer`, ensuring child classes can replace their parent class without affecting program behavior.

### ISP – Interface Segregation Principle
Separated responsibilities into smaller interfaces so that each class implements only the behaviors it actually requires.

---

## Features

- Add Employee
- View Employees
- Search by Department
- Search by Salary
- Demonstration of SOLID Principles
- Object-Oriented Design
- Java Stream API
- ArrayList-based Data Storage

---

## Learning Outcomes

Through this project, I learned:

- SOLID Principles
- Object-Oriented Design
- Clean Code Practices
- Layered Architecture
- Java Streams
- Code Refactoring Techniques

---

## Future Improvements

- Apply Dependency Inversion Principle (DIP)
- Integrate a database (MySQL/PostgreSQL)
- Add JUnit test cases
- Implement logging
- Build a REST API using Spring Boot

---

## Author

**G. M. Biggan**

Applied AI Intern @ GoML