/*
==========================================================
File Name : OCPMain.java

Purpose:
This class demonstrates the Open-Closed Principle.

EmployeeService remains unchanged.
A new SearchService is introduced to add searching
features without modifying existing business logic.

SOLID Principle:
✔ Open-Closed Principle (OCP)

Project Layer:
Demo / Testing
==========================================================
*/

package com.biggan.main;

import com.biggan.model.Employee;
import com.biggan.service.EmployeeService;
import com.biggan.service.SearchService;

public class OCPMain {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        service.addEmployee(new Employee("Biggan", "AI", 50000));
        service.addEmployee(new Employee("Rahim", "HR", 35000));
        service.addEmployee(new Employee("Karim", "Finance", 45000));

        System.out.println("\n===== All Employees =====");
        service.viewEmployees();

        SearchService searchService = new SearchService();

        System.out.println("\n===== Search By Department =====");
        searchService.searchByDepartment(
                service.getRepository().getAll(),
                "AI"
        );

        System.out.println("\n===== Search By Salary =====");
        searchService.searchBySalary(
                service.getRepository().getAll(),
                40000
        );
    }
}