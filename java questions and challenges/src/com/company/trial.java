package com.company;
public class trial {
    public static void main(String[] args) {
        //if n is odd,print weird
        //if n is even and in the inclusive range of 2 to 5,print Not weird
        //if n is even and in the inclusive range of 6 to 20,print  weird
        //if n is even and greater than 20, print not weird
    int n = 22;

    if (n % 2 != 0){
        System.out.println("weird");
    }else if (n % 2 == 0){
        if ( n > 2 && n <= 5)
            System.out.println("not weird");
        } else if (n % 2 == 0){
        if (n > 6 && n <= 20 )
            System.out.println("weird");
        }else if (n % 2 == 0 ) {
        if (n > 100)
            System.out.println("not weird");
        }else
            System.out.println("null");

    }

}


