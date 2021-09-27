package com.company;

public class Worker extends Employee {

    public Worker(String name, String surname, Integer experience) {
        super(name, surname, experience);
    }

    @Override
    public void setPOST() {
        this.post = POST.WORKER;
    }

    @Override
    public void findName() {

    }
}
