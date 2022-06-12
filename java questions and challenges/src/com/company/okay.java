package com.company;

import java.util.Locale;

public class okay {
    /*  public static void main(String[] args) {
          int num = 0;
          do {
              System.out.println(num);
              num++;

              if (num == 5) {
                  break;
              }

          }
          while (num <= 10);
      } */
    /* public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        while (num1 <= 5 && num2<=10) {

            System.out.println("2 * " + num1 + "=" + +num2);
            num1++;
            num2++;
        }
    } */
 /* public static void main(String[] args) {
      for( int num = 1; num<=5; num++){

          int num2 = 3;
          System.out.println(num2 +"*" + num+ "=" +num2*num );
      }
      int statement = 2;

      switch (statement){
          case 1:
              System.out.println("Yeah you right");
              break;
          case 2:
              System.out.println("You may be wrong");
              break;
          default:
              System.out.println("error");
      }
  } */
    public static void main(String[] args) {
        char alphabet = 'A';
        switch (alphabet) {  //sometimes we cant just get the right keyword ,so it is right to change our switch statement toLowercase..only applicable to string
            case 'a':
                System.out.println(alphabet + " is correct");
                break;
            case 'b':
                System.out.println("B is correct");
                break;
            case 'c':
                System.out.println("C is correct");
                break;
            case 'd':
                System.out.println("D is correct");
                break;
            case 'e':
                System.out.println("E is correct");
                break;
            default:
                System.out.println("Message not found");

        }
        String Days = "Tuesday";
        switch (Days.toLowerCase(Locale.ROOT)) {
            case "monday":
                System.out.println(Days);
                break;
            case "tuesday":
                System.out.println("Tuesday");
                break;
            case "wednesday":
                System.out.println("wednesday");
                break;
            default:
                System.out.println("oopppss!");

        }
        for (int num = 1; num <= 10; num++) {

            int num2 = 4;
            System.out.println(num2 + " * " + num + " = " + num2 * num);
        }
        //using the for statement,call the calculateInterest with method with
        //using the amount of 10000 as an interestRate of 2,3,4,5,6,7,8 and 9
        //and print to the console window
        for (int IR = 2; IR <= 9; IR++) { //count forward

            double calculateInterest = 10000;
            System.out.println("10000 at " + IR + "% is = " + IR * calculateInterest / 100);
        }
        for (int IR = 9; IR >= 2; IR--) {  //count backward

            double calculateInterest = 10000;
            System.out.println("10000 at " + IR + "% is = " + IR * calculateInterest / 100);
        }

    }


}


