package com.company;

import java.util.ArrayList;

public class Branch {
private String name;
ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }


  public boolean addNewCustomer(String customerName, double initialAmount){
        if (findContact(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
  }

  public boolean addTransaction(String customerName, double initialAmount){
        Customer existingCustomer = findContact(customerName);
        if (existingCustomer != null){
           existingCustomer.addTransactions(initialAmount);
           return true;
        }
        return false;
  }

    private Customer findContact(String searchContact){
        for (int i = 0; i < this.customers.size(); i++){
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(searchContact));
            return customer;
        }
        return null;
    }
}
