package com.company;
//our appication will help Bill to select type of burgers, some of the additional items to be added to the burgers and pricing.
//we want to create base hamburger and other types of hamburger that are popular in bills stores
//the base class of the hamburger should have the following items.
//bread roll type, meat type and additions (things like lettuce,tomato,carrot etc ) that
//the customer select to be added to the burger, and each got prices that will be added to that of the burger
// so we need a way to track everything and get the total price of each purchase
//This burger has a based price and additions price separately
//create a hamburger class to deal with all of the above
//the constructor should only include the breadRollType,meat and price.
//Also create two extra varieties of hamburger ( classes ) to cater for
//a) Healthy Hamburger (on a brown rye bread roll) , plus two additional items can be added.
//The healthy hamburger can have a total of 6 items additions in total
//hint : you probably want to add two additional items in this new class, not the base class ,
//since the 2 additions only appropriate for this new class
//b) Deluxe Hamburger - comes with drinks and chips as additions, but no extra additions are allowed.
//hint: you have to find a way to automatically add these new additions at the time the deluxe hamburger object is created
//and then prevent other additions being added.
//All the 3 classes should have a method that can be called anytime to show the base price of the hamburger
//plus all additionals, each showing the additional name , and additional price and a grand total for the burger
//for the two additional classes , this may require you to be looking at the base class for pricing and then adding totals
// onto that.

 class Hamburger {
     private String Name;
     private String Bread_roll_type;
     private String Meat_type;
     private double  Price;

     private String addition1Name;
     private double addition1Price;

     private String addition2Name;
     private double addition2Price;

     private String addition3Name;
     private double addition3Price;

     private String addition4Name;
     private double addition4Price;


     public Hamburger(String name ,String bread_roll_type, String meat_type, double price) {
         Name = name;
         Bread_roll_type = bread_roll_type;
         Meat_type = meat_type;
         Price = price;
     }

public void addHamburgerAddition1(String name, double price){
         this.addition1Name = name;
         this.addition1Price = price;
}

     public void addHamburgerAddition2(String name, double price){
         this.addition2Name = name;
         this.addition2Price = price;
     }

     public void addHamburgerAddition3(String name, double price){
         this.addition3Name = name;
         this.addition3Price = price;
     }

     public void addHamburgerAddition4(String name, double price){
         this.addition4Name = name;
         this.addition4Price = price;
     }

     public double itemizeHamburger(){
         double HamburgerPrice = this.Price;
         System.out.println(this.Name + "hamburger" + " on a " + this.Bread_roll_type + " roll "
                 + " price is " + this.Price);

         if (this.addition1Name != null){
             HamburgerPrice += this.addition1Price;
             System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price );
         }

         if (this.addition2Name != null){
             HamburgerPrice += this.addition2Price;
             System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price );
         }

         if (this.addition3Name != null){
             HamburgerPrice += this.addition3Price;
             System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price );
         }

         if (this.addition4Name != null){
             HamburgerPrice += this.addition4Price;
             System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price );
         }
         return HamburgerPrice;
     }

     public static void main(String[] args) {
         Hamburger hamburger = new Hamburger("Igbalode", "white", "Sausage", 3.56);
         double Price = hamburger.itemizeHamburger();
         hamburger.addHamburgerAddition1("Lettuce",0.32);
         hamburger.addHamburgerAddition2("Tomato",0.43);
         hamburger.addHamburgerAddition3("Curry", 0.12);
         hamburger.addHamburgerAddition4("egg",0.22);
         System.out.println("Total purchase is " + hamburger.itemizeHamburger());



         HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
         healthyBurger.addHamburgerAddition1("Dry fish",5.67);
         healthyBurger.addHealthAddition2("Panla",2.43);
         System.out.println("Total purchase is " + healthyBurger.itemizeHamburger());

         DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
         deluxeHamburger.itemizeHamburger();
     }

 }
