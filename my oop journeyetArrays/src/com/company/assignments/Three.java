package com.company.assignments;

public class Three {
    //A shop will give discount of 10% if the cost of purchased quantity is more than 1000.Ask user for quantity
    //suppose , one unit will cost 100. Judge and print total cost for user
    public static void main(String[] args) {
     DiscountTen(1100);
    }

     static void DiscountTen(double originalPrice){
        if (originalPrice > 1000){
            double percentCut = originalPrice/100 * 10;
            double discount =  originalPrice - percentCut;
            System.out.println("Discount considered! Your purchase is "  +discount);
        }else
            System.out.println("The price is "  +originalPrice );


    }
}
