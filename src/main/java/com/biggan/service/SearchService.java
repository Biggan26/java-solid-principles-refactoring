/*
==========================================================
File Name : SearchService.java

Purpose:
This class is responsible only for searching employees.
Instead of adding search methods inside EmployeeService,
we create a separate service.

Why this class?
If new search features are needed later, we can simply
extend this class without modifying EmployeeService.

SOLID Principle:
✔ Open-Closed Principle (OCP)

Project Layer:
Service Layer
==========================================================
*/

package com.biggan.service;

import com.biggan.model.Employee;

import java.util.List;

public class SearchService {

    public void searchByDepartment(List<Employee> employees, String department) {

        employees.stream()
                .filter(employee ->
                        employee.getDepartment().equalsIgnoreCase(department))
                .forEach(System.out::println);
    }

    public void searchBySalary(List<Employee> employees, double salary) {

        employees.stream()
                .filter(employee ->
                        employee.getSalary() >= salary)
                .forEach(System.out::println);
    }
}