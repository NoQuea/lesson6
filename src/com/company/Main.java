package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Pavel");
        person.setSurname("Vorobyev");
        person.FullName();
        Employee worker = new Worker();
        System.out.println("Зарплата рабочего состовляеет "+worker.printSalary());
        Employee secretary = new Secretary();
        System.out.println("Зарплата секреторя состовляеет "+secretary.printSalary());
        Employee rider = new Rider();
        System.out.println("Зарплата водителя состовляеет "+rider.printSalary());
        Employee director = new Director();
        System.out.println("Зарплата директора состовляеет "+director.printSalary());
    }
}
