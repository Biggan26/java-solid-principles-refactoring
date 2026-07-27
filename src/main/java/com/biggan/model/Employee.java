/*
==========================================================
File Name : Employee.java

Purpose:
This is the parent class of all employee types.
It contains the common properties shared by every employee.

Why this class?
Instead of repeating the same fields in every employee type,
we keep the common information in one parent class.

SOLID Principle:
✔ Liskov Substitution Principle (LSP)

Project Layer:
Model Layer
==========================================================
*/

package com.biggan.model;

public class Employee {

    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}