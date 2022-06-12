package com.company;

public class overloaded {

    //Banking App

    private static int BankTransactions(int Account_balance){
     return Account_balance;
    }
    private static int BankTransaction(int Account_balance,int deposit){
         deposit = Account_balance + deposit;
         return deposit;
    }
    private static int BankTransaction(int Account_balance,int deposit,int withdraw){
        withdraw = Account_balance - withdraw;
        return withdraw;
    }
    private static int BankTransaction(int Account_balance,int deposit,int withdraw,int check_balance){
        check_balance -= Account_balance + deposit;
              return check_balance;
    }
    private static String BankTransaction(){
        return "Thanks for banking with KorexBank";
    }

    public static void main(String[] args) {
       int account_balance = BankTransactions(24000);
        System.out.println("Your Korex account balance is " +account_balance);
        int deposit = BankTransaction(25000,3000);
        System.out.println("Successful! You have succesfully deposited into your Korex account.Now your balance is " +deposit);
        int withdrawal = BankTransaction(24000,3000,12000);
        System.out.println("You have sucessfully withdraw  " +withdrawal);
        int check_balance = BankTransaction(24000,3000,12000,10000);
        System.out.println("Your KorexBank balance is " + check_balance);
        String EXIT = BankTransaction();
        System.out.println("Thanks for banking with KorexBank");
    }
}


