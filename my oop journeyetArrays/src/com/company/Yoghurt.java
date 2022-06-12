package com.company;

 class Yoghurt {
   private String name;
   private String flavorType;
   private String milk;
   private double Price;

   private String addition1Name;
   private double addition1Price;

   private String addition2Name;
   private double addition2Price;

   private String addition3Name;
   private double addition3Price;

   private String addition4Name;
   private double addition4Price;

   private String addition5Name;
   private double addition5Price;



   public Yoghurt(String name, String flavorType,  String milk, double price) {
     this.name = name;
     this.flavorType = flavorType;
     this.milk = milk;
     Price = price;
   }

   public void addYoghurtAddition1(String name, double price){
     this.addition1Name = name;
     this.addition1Price = price;
   }

   public void addYoghurtAddition2(String name, double price){
     this.addition2Name = name;
     this.addition2Price = price;
   }

   public void addYoghurtAddition3(String name, double price){
     this.addition3Name = name;
     this.addition3Price = price;
   }

   public void addYoghurtAddition4(String name, double price){
     this.addition4Name = name;
     this.addition4Price = price;
   }

   public void addYoghurtAddition5(String name, double price){
     this.addition5Name = name;
     this.addition5Price = price;
   }

   public double calcYoghurts(){
     double YoghurtsPrice = this.Price;
     System.out.println(this.name + " Yoghurt  " + this.flavorType + " flavor price is " +this.Price);

     if (addition1Name != null){
       YoghurtsPrice += addition1Price;
       System.out.println("Added " +this.addition1Name + " for an extra " +this.addition1Price);
     }

     if (addition2Name != null){
       YoghurtsPrice += addition2Price;
       System.out.println("Added " +this.addition2Name + " for an extra " +this.addition2Price);
     }

     if (addition3Name != null){
       YoghurtsPrice += addition3Price;
       System.out.println("Added " +this.addition3Name + " for an extra " +this.addition3Price);
     }

     if (addition4Name != null){
       YoghurtsPrice += addition4Price;
       System.out.println("Added " +this.addition4Name + " for an extra " +this.addition4Price);
     }

     if (addition5Name != null){
       YoghurtsPrice += addition5Price;
       System.out.println("Added " +this.addition5Name + " for an extra " +this.addition5Price);
     }
     return YoghurtsPrice;
   }

   public static void main(String[] args) {
     Yoghurt yoghurt = new Yoghurt("S.Korede","Vanilla","Refined Milk",5.00);
     yoghurt.addYoghurtAddition1("Cream",1.00);
     yoghurt.addYoghurtAddition2("fruities",2.14);
     System.out.println("Total purchase is " +yoghurt.calcYoghurts());

     Yoghurt yoghurt1 = new Yoghurt("S.Korede","Strawberry","Refined Milk",5.00);
     System.out.println("Total purchase is " +yoghurt1.calcYoghurts());

     ZeroYoghurt zeroYoghurt = new ZeroYoghurt("S.Korede Zero",4.50);
     zeroYoghurt.addZeroAddition1("Honey",1.25);
     zeroYoghurt.addZeroAddition2("ZeroCream",1.00);
     System.out.println("Total purchase is " +zeroYoghurt.calcYoghurts());

     DeluxeYoghurt deluxeYoghurt = new DeluxeYoghurt();
     deluxeYoghurt.addYoghurtAddition1("cream",1.00);
     System.out.println("Total purchase is " +deluxeYoghurt.calcYoghurts());
   }
 }
