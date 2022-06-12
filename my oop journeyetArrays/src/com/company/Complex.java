package com.company;

public class Complex {
    private int sum;
    private int difference;
    private int multiplication;

    public void setSum(int a,int b) {
        this.sum = sum;
        sum = a  + b;
        System.out.println("The sum of " + a + " and " + b + " is equal to " +sum );
    }

    public void setDifference(int a,int b) {
        this.difference = difference;
        difference = a - b;
        System.out.println("The difference of " + a + " and " + b + " is equal to " +difference );
    }

    public void setMultiplication(int a,int b) {
        this.multiplication = multiplication;
        multiplication = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is equal to " +multiplication );
    }

    public int getSum() {
        return sum;
    }

    public int getDifference() {
        return difference;
    }

    public int getMultiplication() {
        return multiplication;
    }
}
