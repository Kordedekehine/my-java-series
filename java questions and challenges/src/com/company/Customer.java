package com.company;

import java.util.ArrayList;

public class Customer {
private String name;
ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = transactions;
        addTransactions(initialAmount);
    }

    public void addTransactions(double initialAmount){
        this.transactions.add(initialAmount);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
}
