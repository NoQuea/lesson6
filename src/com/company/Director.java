package com.company;

import java.util.Arrays;

public class Director extends Employee{

    private Employee[] employees;

    public Director(String name, String surname, Integer experience) {
        super(name, surname, experience);
    }

    public void addWorker(Employee employee){
        if (employees == null){
            employees = new Employee[1];
            employees[0] = employee;
        }else {
            employees = Arrays.copyOf(employees, employees.length+1);
            employees[employees.length-1] = employee;
        }

    }

    @Override
    public void setPOST() {
        this.post = POST.DIRECTOR;
    }

    @Override
    public String toString() {
        return "Директор {" +
                " Рабочие = " + Arrays.toString(employees)  +
                ", Опыт = " + experience +
                ", Зарплата" + printSalary() +
                ", Профессия = " + post +
                ", Имя = '" + name + '\'' +
                ", Фамилия = '" + surname + '\'' +
                '}';
    }

    @Override
    public Integer printSalary() {
        if (employees == null) {
            return super.printSalary();
        }else {
            return super.printSalary()*employees.length;
        }

    }
}
