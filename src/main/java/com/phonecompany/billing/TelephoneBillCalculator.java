package com.phonecompany.billing;

public class TelephoneBillCalculator {

    public int add(int i, int j) {
        System.out.println("Addition of " + i + "," + j + " is: " + (i + j));
        return i + j;
    }

    public int mul(int i, int j) {
        System.out.println("Multiplication of " + i + "," + j + " is: " + (i * j));
        return i * j;
    }

    public int sub(int i, int j) {
        System.out.println("Subtraction of " + i + "," + j + " is: " + (i - j));
        return i - j;
    }

    public double div(double i, double j) {
        if (j != 0) {
            System.out.println("Division of " + i + "," + j + " is: " + (i / j));
            return i / j;
        } else {
            System.out.println("Division with 0 is not possible");
            return 0;
        }
    }
}