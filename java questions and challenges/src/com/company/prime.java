package com.company;

public class prime {
    public static void main(String[] args) {
      boolean primeNumbers =  isPrime(2);
      boolean EvenNumbers = even(20);



    }
     static boolean isPrime(int n){ //prime number is a number only divisible by 1 and itself

         if(n == 1){ // if n is equal to 1,then print out is not a prime number..should be false
             System.out.println(n + " is not a prime Number");
             return false;
         }
      for (int i=2; i <= n/2 ; i++){ //if i = 2,then if i is lesser than the N value divided by 2,then loop forward till it got there
          if(n % i == 0){ //if the value remainder 0,then print false
              System.out.println(n + " is not a prime Number");
              return false;
          }
      }
         System.out.println(n + " is a prime Number"); //if it has one remainder then print a prime number
         return true;
     }
     static boolean even(int e){

        if(e % 2 == 0){
            System.out.println(e + " is an even number");
            return true;
        }else
            System.out.println(e + " is an odd number");
        return false;
     }

}
