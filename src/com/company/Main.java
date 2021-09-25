package com.company;

public class Main {

    public static void main(String[] args) {

        Employee worker1 = new Worker("Tim","Reik",1);
        Employee worker2 = new Worker("Tom","Redins",3);
        Employee worker3 = new Worker("Kim","Jointer",2);

        Employee director1 = new Director("Bob","Nerin",12);
        Employee director2 = new Director("Gena","Gorin",9);

        ((Director)director1).addWorker(worker1);
        ((Director)director1).addWorker(worker2);
        ((Director)director2).addWorker(worker3);

        ((Director)director1).addWorker(director2);

        System.out.println(director1);


    }
}
