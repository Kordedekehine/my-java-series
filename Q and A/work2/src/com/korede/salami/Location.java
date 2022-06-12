package com.korede.salami;

import java.util.ArrayList;

public class Location {
    private String name;
    ArrayList<Goods> orderedGood = new ArrayList<Goods>();

    public Location(String name) {
        this.name = name;
        this.orderedGood = orderedGood;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Goods> getOrderedGood() {
        return orderedGood;
    }

  public boolean addGoods(String goods){
        if (findGoods(goods) == null){
            this.orderedGood.add(new Goods(goods));
            return true;
        }
        return false;
  }

public boolean addNewCustomerGoods(String goods,String customerName, char gender, double pricePaid){
        Goods findGoodsOrderer = findGoods(goods);
        if (findGoodsOrderer != null){
            return findGoodsOrderer.addNewCustomer(customerName,gender,pricePaid);
        }
        return false;
}

public boolean addTransactions(String goods,String customerName, char gender, double pricePaid){
        Goods findGoodsOrderer = findGoods(goods);
        if (findGoodsOrderer != null){
            return findGoodsOrderer.addPricePaid(customerName,gender,pricePaid);
        }
        return false;
}

    private Goods findGoods(String goodsName){
       for (int i = 0; i < this.orderedGood.size(); i++){
           Goods cartedGoods = orderedGood.get(i);
           if (cartedGoods.getName().equals(goodsName)){
               return cartedGoods;
           }
       }
       return null;
    }

    public boolean listCustomers(String GoodsName, boolean showTransactions) {
        Goods goods = findGoods(GoodsName);
        if (goods != null) {
            System.out.println("Customer detals for  " + goods.getName());
            ArrayList<Customer> branchCustomers = goods.getTheCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i + 1) + "--" + branchCustomer.getName() + " - "  +
                        " orders transactions are:");

                if (showTransactions) {
                    System.out.println("Transcations : ");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();

                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println(" - " + (j + 1) + " amount = " + transactions.get(j));
                    }

                }
            }
            return true;
        } else {
            return false;
        }
    }
}
