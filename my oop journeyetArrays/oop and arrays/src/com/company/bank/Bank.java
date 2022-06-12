package com.company.bank;


import com.company.Customer;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);

        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;

    }

    // Show all the customer name and transaction for each customer for a particular
    // branch

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("Customer details for branch " + existingBranch.getName());
            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customers : " + branchCustomer.getName() + " - " + (i + 1));

                if (showTransactions) {
                    System.out.println("Translations : ");
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












