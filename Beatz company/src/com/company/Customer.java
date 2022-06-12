package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private char gender;
    ArrayList<Double> transaction = new ArrayList<Double>();

    public Customer(String name,char gender, double price) {
        this.name = name;
        this.gender = gender;
        this.transaction = transaction;
        addTransactions(price);

    }

    public void addTransactions(double price){
        this.transaction.add(price);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
