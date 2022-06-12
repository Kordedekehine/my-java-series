package com.company;

import java.util.Scanner;

public class GamePlayer {
Scanner scanner = new Scanner(System.in);
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int player1guess = 0;
        int player2guess = 0;
        int player3guess = 0;

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

       boolean player1isRight = false;
        boolean player2isRight = false;
        boolean player3isRight = false;

      int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9 " );

        while (true){
            System.out.println("Number to guess is ??" );
        p1.guess();
        p2.guess();
        p3.guess();
    scanner.close();
       guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player 1 guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player 1 guessed " + guessp3);



            if (guessp1 == targetNumber){
                player1isRight = true;
            }
            if (guessp2 == targetNumber){
                player2isRight = true;
            }

            if (guessp3 == targetNumber){
                player3isRight = true;
            }

            if (player1isRight || player2isRight || player3isRight){
                System.out.println("We have a winner");
                System.out.println("Player one get it right? " +player1isRight);
                System.out.println("Player two get it right? " +player2isRight);
                System.out.println("Player three get it right? " +player3isRight);
            }else
                System.out.println("Players will have to try again");
        }

    }
}
