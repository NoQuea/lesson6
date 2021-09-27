package com.company;

public abstract class Employee extends Person {

    protected int baseRate = 1000;
    protected Integer experience;
    protected POST post;

    public Employee(String name, String surname, Integer experience){

        super(name,surname);
        this.experience = experience;
        setPOST();

    }

    public Integer printSalary() {
        return baseRate * post.getCoefficient() * experience;
    }

    public abstract void setPOST();

    @Override
    public String toString() {
        return " Рабочий {" +
                "Базовая ставка = " + baseRate +
                ", Опыт = " + experience +
                ", Зарплата = " + printSalary() +
                ", Профессия = " + post +
                ", Имя = '" + name + '\'' +
                ", Фамилия = '" + surname + '\'' +
                '}';
    }

    public abstract void findName();
}
