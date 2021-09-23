package com.company;

public enum POST {

    WORKER("Gosha",2,3),
    SECRETARY("Rita",2,2),
    RIDER("Tom",2, 4),
    DIRECTOR("Tim",4, 10);

    private String name;
    private int coefficient;
    private int experience;

    POST (String name, int coefficient, int experience) {
        this.name = name;
        this.coefficient = coefficient;
        this.experience = experience;

    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }
}
