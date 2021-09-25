package com.company;

public enum POST {

    WORKER(2),
    DIRECTOR(4);

    protected int coefficient;

    POST (int coefficient) {
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }

}
