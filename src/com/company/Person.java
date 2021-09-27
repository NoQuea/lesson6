package com.company;

public class Person implements findEmployeeName{

    protected String name ;
    protected String surname ;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public void findName(Director director, String name) {
        System.out.println("Имя сотрудика " + this.name);

    }
}
