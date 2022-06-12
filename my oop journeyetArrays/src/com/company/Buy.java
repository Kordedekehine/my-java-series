package com.company;

public class Buy {
    private String name;
    private int Price;

    private String addName1;
    private int addPrice1;

    public Buy(String name, int price) {
        this.name = name;
        Price = price;
    }

    public void choice1(String name, int price){
        this.addName1 = name;
        this.addPrice1 = price;
    }

    public double calculateGoods(){
        double goodsPrice = this.Price;
        System.out.println(this.name + " current cart purchase is " +this.Price);

        if (addName1 != null){
            goodsPrice += addPrice1;
            System.out.println("Added! " + this.addName1 + " at the rate of " +this.addPrice1);
        }
        return  goodsPrice;
    }

    public static void main(String[] args) {
        Buy buy = new Buy("Ayepe",0);
        buy.choice1("rice",12);
        System.out.println(buy.calculateGoods());
    }

}
