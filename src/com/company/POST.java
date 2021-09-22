package com.company;

public enum POST {

    WORKER(2, 3),
    DIRECTOR(4, 10);

    private int coefficient;
    private int experience;

    POST (int coefficient, int experience) {
        this.coefficient = coefficient;
        this.experience = experience;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getExperience() {
        return experience;
    }
}
