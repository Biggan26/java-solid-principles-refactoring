
package com.biggan.main;

import com.biggan.interfaces.Manageable;
import com.biggan.interfaces.Workable;
import com.biggan.model.Developer;
import com.biggan.model.Manager;

public class ISPMain {

    public static void main(String[] args) {

        Workable developer = new Developer("Biggan", "AI", 60000);
        Workable managerWork = new Manager("Rahim", "Management", 80000);
        Manageable managerManage = new Manager("Rahim", "Management", 80000);

        developer.work();

        managerWork.work();

        managerManage.manage();
    }
}