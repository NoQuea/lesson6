package com.company;

public abstract class  Employee {

       private int baseRate = 1000;

    public int printSalary() {

         return baseRate * getPOST().getCoefficient() * getPOST().getExperience();

    }
    public abstract POST getPOST();

}
