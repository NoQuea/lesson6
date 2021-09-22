package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pavel");
        person.setSurname("Vorobyev");
        person.FullName();
        Employee worker = new Worker();
        System.out.println(worker.printSalary());
        Employee director = new Director();
        System.out.println(director.printSalary());
    }
}
