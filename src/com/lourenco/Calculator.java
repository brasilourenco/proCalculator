package com.lourenco;

public class Calculator {
    public Calculator() {

    }

    public double half(double n1) {
        return n1 / 2;
    }

    public double quarter(double n1) {
        return n1 / 4;
    }

    public double theDouble(double n1) {
        return n1 * 2;
    }

    public double triple(double n1) {
        return n1 * 3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double sub(double n1, double n2) {
        return n1 - n2;
    }

    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    public double div(double n1, double n2) {
        if (n2 == 0) {
            System.err.println("ERROR! :(");
            System.err.println("YOU CANNOT DIVIDE BY 0!");
            System.exit(0);
        }
        return n1 / n2;
    }

}
