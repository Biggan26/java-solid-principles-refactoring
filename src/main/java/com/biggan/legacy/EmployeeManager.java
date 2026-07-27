package com.biggan.legacy;
//intentionally written bad code in this file for project testing puspose
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private List<String> employees = new ArrayList<>();

    public void manageEmployee(int choice, String name, String department, double salary) {

        if (choice == 1) {

            employees.add(name + "," + department + "," + salary);
            System.out.println("Employee Added Successfully.");

        } else if (choice == 2) {

            for (String employee : employees) {
                System.out.println(employee);
            }

        } else if (choice == 3) {

            for (int i = 0; i < employees.size(); i++) {

                if (employees.get(i).contains(name)) {

                    employees.set(i, name + "," + department + "," + salary);
                    System.out.println("Employee Updated Successfully.");
                }
            }

        } else if (choice == 4) {

            employees.removeIf(employee -> employee.contains(name));
            System.out.println("Employee Deleted Successfully.");

        } else {

            System.out.println("Invalid Choice.");
        }
    }
}