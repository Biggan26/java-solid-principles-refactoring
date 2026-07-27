package com.biggan.repository;

import com.biggan.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private final List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getAll() {
        return employees;
    }

    public void remove(Employee employee) {
        employees.remove(employee);
    }
}