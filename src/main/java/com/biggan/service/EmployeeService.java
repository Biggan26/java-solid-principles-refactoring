package com.biggan.service;

import com.biggan.model.Employee;
import com.biggan.repository.EmployeeRepository;

public class EmployeeService {

    private final EmployeeRepository repository = new EmployeeRepository();

    public void addEmployee(Employee employee) {
        repository.add(employee);
    }

    public void viewEmployees() {
        repository.getAll().forEach(System.out::println);
    }
}