
package com.biggan.main;

import com.biggan.model.Developer;
import com.biggan.model.Employee;
import com.biggan.model.Manager;
import com.biggan.service.EmployeeService;

public class LSPMain {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        Employee employee1 = new Manager("Biggan", "Management", 70000);
        Employee employee2 = new Developer("Rahim", "Software", 55000);
        Employee employee3 = new Developer("Karim", "AI", 60000);

        service.addEmployee(employee1);
        service.addEmployee(employee2);
        service.addEmployee(employee3);

        System.out.println("\n===== Employee List =====");
        service.viewEmployees();
    }
}