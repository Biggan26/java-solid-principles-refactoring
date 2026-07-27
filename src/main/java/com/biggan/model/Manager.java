
package com.biggan.model;

import com.biggan.interfaces.Manageable;
import com.biggan.interfaces.Workable;

public class Manager extends Employee implements Workable, Manageable {

    public Manager(String name, String department, double salary) {
        super(name, department, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing the team.");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " approved the project.");
    }
}