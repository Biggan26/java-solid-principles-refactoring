/*
==========================================================
File Name : EmployeeService.java

Purpose:
This class contains the business logic of the application.
It does not store employee data directly. Instead, it
communicates with the Repository layer.

Why this class?
Separating business logic from data storage makes the
application easier to maintain and extend.

SOLID Principle:
✔ Single Responsibility Principle (SRP)

Project Layer:
Service Layer
==========================================================
*/

package com.biggan.service;

import com.biggan.model.Employee;
import com.biggan.repository.EmployeeRepository;

public class EmployeeService {

    private final EmployeeRepository repository = new EmployeeRepository();

    public void addEmployee(Employee employee) {
        repository.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {

        if (repository.getAll().isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        repository.getAll().forEach(System.out::println);
    }

    public EmployeeRepository getRepository() {
        return repository;
    }
}