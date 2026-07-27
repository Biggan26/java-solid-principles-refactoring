package com.biggan.main;

import com.biggan.model.Employee;
import com.biggan.service.EmployeeService;

public class SRPMain {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        service.addEmployee(new Employee("Biggan", "AI", 50000));
        service.addEmployee(new Employee("Rahim", "HR", 35000));
        service.addEmployee(new Employee("Karim", "Finance", 42000));

        System.out.println("===== Employee List =====");
        service.viewEmployees();
    }
}