package com.company.assignments.assignments;

public class Sixteen {

    public static void main(String[] args) {
        System.out.println("Perfect Numbers between 1 to 1000 are: ");

        //print all perfect numbers between the given range
        for (int n = 1; n < 1000; n++){
            if (isPerfectNumber(n)){
                System.out.println(n + " is a perfect number");
            }

        }
    }

    //function checks if the given number is perfect or not
    static boolean isPerfectNumber(int num){
        //variable stores the sum of divisors
        int sum = 1;
         //determines all the divisors of the given number and adds them
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                if (i * i != num){
                    sum = sum + i + num/i;
                }else
                    //calculates the sum of factors
                    sum = sum + i;

            }//end of it
        }//end of for
        if (sum == num && num != 1){
            //returns true if both conditions (above) returns true
            return true;
        }else
            //returns false if any condition becomes false
            return false;
    }//end of function
}//driver code
