package com.company;

public class Piggyvest {
    private double Savings;
    private double deposit;
    private double withdrawal;
    private double piggyCharge;
    private double balance;

    public void setSavings(double savings) {
        this.Savings = savings;
    }

    public double getSavings(){
        return this.Savings;
    }


    public void deposit(double deposit){
      this.Savings += deposit;
        System.out.println("You have Successfully deposited " +deposit + ". Your balance is now " +this.Savings);
    }


    public void withdrawal(double withdrawal){
        if (withdrawal >= this.Savings){
            System.out.println("Sorry! insufficient fund");
        }else if ( this.Savings >= withdrawal){
         this.Savings -= withdrawal;
            System.out.println("You have successfully withdraw the sum of " +withdrawal + ". Your balance is now " +this.Savings);
        }else
            System.out.println("null");

    }


    public void piggyCharge(double piggyCharge){
        this.piggyCharge -= this.Savings;
        System.out.println("Piggyvest has deducted its monthly " +piggyCharge + " Balance now " +this.piggyCharge + "charges. Thanks for your compliance");
    }

}
