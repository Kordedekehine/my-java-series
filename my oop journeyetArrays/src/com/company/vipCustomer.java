package com.company;
//create a new vipCustomer
//it should have 3 fields name,credit limit and email address
//create 3 constructors
//1st should be empty constructors that call the 3 parameters with their default values
//2nd constructor should pass on 2 values it receives and default values to the third
//third constructor should save all fields
//use getter and setter to set the value
public class vipCustomer {
    private String name;
    private double Credit_limit;
    private String email;


    public vipCustomer(){
        this("Default name",5000.00,"default@email.com");
    }
    public vipCustomer(String name, double credit_limit ) {
        this(name,credit_limit,"unknown@email.com");
    }
    public vipCustomer(String name, double credit_limit, String email) {
       this.name = name;
       this.email = email;
       this.Credit_limit = credit_limit;
    }

    public String getName() {

        return name;
    }

    public double getCredit_limit() {

        return Credit_limit;
    }

    public String getEmail() {

        return email;
    }
}
