
package com.biggan.model;

import com.biggan.interfaces.Workable;

public class Developer extends Employee implements Workable {

    public Developer(String name, String department, double salary) {
        super(name, department, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is developing software.");
    }
}