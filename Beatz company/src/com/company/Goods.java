package com.company;

import java.util.ArrayList;

public class Goods {
    private String name;
    ArrayList<Customer> theCustomers = new ArrayList<Customer>();

    public Goods(String name) {
        this.name = name;
        this.theCustomers = theCustomers;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getTheCustomers() {
        return theCustomers;
    }

    public boolean addNewCustomer(String customerName, char gender, double pricePaid){
        if (findCustomer(customerName) == null){
            this.theCustomers.add(new Customer(customerName,gender,pricePaid));
            return true;
        }
        return false;
    }

   public boolean addPricePaid(String customerName,  char gender, double pricePaid){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransactions(pricePaid);
            return true;
        }
        return false;
   }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.theCustomers.size(); i++){
            Customer checkCustomer = theCustomers.get(i);
            if (checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
    }
}
