package com.company;

import java.util.Random;
import java.util.Scanner;

public class scatter {

    public static void main(String[] args) {
        // write your code here
//        String[] firstOne = {"mad", "Sharp", "cool", "sad", "bite"};
//
//        String[] secondOne = {"gossip", "bad", "post", "fickle", "bail"};
//
//        String[] ThirdOne = {"Shoot", "took", "blast", "myopic", "heal"};


        Random random = new Random();
        int numberToGuess = random.nextInt(1000);
        int numberOfTries = 0;

        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false){
            System.out.println("Guess a number between 1 and 1000 : " );
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess){
                win = true;
            }
            else if (guess < numberToGuess){
                System.out.println("Your guess is too low");
            }
            else if (guess > numberToGuess){
                System.out.println("Your guess is too high");
            }
        }
        System.out.println("You Win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries");
    }
}


