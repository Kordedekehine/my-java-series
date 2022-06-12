package com.company;

public class ZeroYoghurt extends Yoghurt{
    private String zeroYoghurt1Name;
    private double zeroYoghurt1Price;

    private String zeroYoghurt2Name;
    private double zeroYoghurt2Price;

    public ZeroYoghurt(String name, double price) {
        super("S.Korede", "ZeroSugar Brand Type", "Natural Milk", price);
    }

    public void addZeroAddition1(String name, double price){
        this.zeroYoghurt1Name = name;
        this.zeroYoghurt1Price = price;
    }

    public void addZeroAddition2(String name, double price){
        this.zeroYoghurt2Name = name;
        this.zeroYoghurt2Price = price;
    }

    @Override
    public double calcYoghurts() {
        double YoghurtPrice = super.calcYoghurts();

        if (zeroYoghurt1Name != null){
            YoghurtPrice += this.zeroYoghurt1Price;
            System.out.println("Added " + zeroYoghurt1Name +" for an extra " + zeroYoghurt1Price);
        }

        if (zeroYoghurt2Name != null){
            YoghurtPrice += this.zeroYoghurt2Price;
            System.out.println("Added " + zeroYoghurt2Name +" for an extra " + zeroYoghurt2Price);
        }
        return YoghurtPrice;
    }
}
