package com.company;

import java.text.BreakIterator;
import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Branch> branch = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranch() {
        return this.branch;
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branch.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName,double initialAmount){
        Branch branches = findBranch(branchName);
        if (branches != null){
           return branches.addNewCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addTransaction(String branchName,String customerName,double initialAmount){
        Branch branches = findBranch(branchName);
        if (branches != null){
          return branches.addTransaction(customerName,initialAmount);
        }
        return false;
    }

    private Branch findBranch(String searchBranch) {
        for (int i = 0; i < this.branch.size(); i++) {
            Branch branches = this.branch.get(i);
            if (branches.getName().equals(searchBranch)) {
                return branches;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("Customer detals for branch " + existingBranch.getName());
            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customers : " + branchCustomer.getName() + " - " + (i + 1));

                if (showTransactions) {
                    System.out.println("Transcations : ");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();

                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println(" - " + (j + 1) + " amount = " + transactions.get(j) + "\n");
                    }

                }
            }
            return true;
        } else {
            return false;
        }
    }
}

