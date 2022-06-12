package com.company;

public class Count {
    public static void main(String[] args) {
      int number = 5;
      int finishNumber = 20;
      int evenNumbersFound = 0;
      while (number <= finishNumber){
          if (!isEvenNumber(number)){
              number++;
              continue;
          }
          evenNumbersFound++;
          System.out.println(number + " is an even number" );
          number++;

//          int total = 0;
//          total += number;
//          System.out.println("the total number of the even number is " + total);
//          while (total >= 5){
//              break;
//          }
      }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
          //  System.out.println("it is an even number");
            return true;
        } else
           // System.out.println(" an odd number");
            return false;

    }
}