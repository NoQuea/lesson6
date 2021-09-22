package com.company;

public class Person{

    private String name ;
    private String surname ;

    public void FullName(){
        this.name = name;
        this.surname = surname;
        System.out.println("Your Full Name is : "+ name +" "+ surname);
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Error");
        }else {
            this.name = name;
        }
    }

    public void setSurname(String surname) {
        if (surname.isEmpty()){
            System.out.println("Error");
        }else {
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
