package com.biggan.main;

import com.biggan.legacy.EmployeeManager;

public class Main {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        manager.manageEmployee(1, "Biggan", "AI", 50000);
        manager.manageEmployee(1, "Rahim", "HR", 35000);

        manager.manageEmployee(2, "", "", 0);

        manager.manageEmployee(3, "Rahim", "Finance", 45000);

        manager.manageEmployee(2, "", "", 0);

        manager.manageEmployee(4, "Biggan", "", 0);

        manager.manageEmployee(2, "", "", 0);
    }
}