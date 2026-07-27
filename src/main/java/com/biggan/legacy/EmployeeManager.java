package com.biggan.legacy;
//intentionally written bad code in this file for project testing puspose
import java.util.ArrayList;

public class EmployeeManager {

    ArrayList<String> employees = new ArrayList<>();

    public void manageEmployee(int choice, String name, String department, double salary) {

        if (choice == 1) {
            employees.add(name + "," + department + "," + salary);
            System.out.println("Employee Added");
        }

        if (choice == 2) {
            for (String emp : employees) {
                System.out.println(emp);
            }
        }

        if (choice == 3) {

            for (int i = 0; i < employees.size(); i++) {

                if (employees.get(i).contains(name)) {

                    employees.set(i, name + "," + department + "," + salary);

                    System.out.println("Employee Updated");
                }
            }
        }

        if (choice == 4) {

            employees.removeIf(emp -> emp.contains(name));

            System.out.println("Employee Deleted");
        }
    }
}