package com.company;



public class Main {

    public static void main(String[] args) {

        Location location = new Location("Ontario");

        location.addGoods("HeadPhone");

        location.addNewCustomerGoods("HeadPhone","Legible Salami",'M',45690);
        location.addNewCustomerGoods("HeadPhone","Tim",'M',45690);
        location.addNewCustomerGoods("HeadPhone","Joe",'M',45690);

       location.addGoods("EarPod");

       location.addNewCustomerGoods("EarPod","Bola",'F',89500);
       location.addNewCustomerGoods("EarPod","Mia",'F',89500);
       location.addNewCustomerGoods("EarPod","Jemima",'F',89500);

       location.addTransactions("HeadPhone","Legible Salami",'M',85690);
       location.addTransactions("HeadPhone","Legible Salami",'M',53690);
       location.addTransactions("HeadPhone","Joe",'M',4690);

       location.addTransactions("EarPod","Jemima",'F',79600);
       location.addTransactions("EarPod","Mia",'F',43500);

       location.listCustomers("HeadPhone",true);
       location.listCustomers("EarPod",true);
    }
}
