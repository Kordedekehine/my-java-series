package com.company;

public class dialogue {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScore(400);
        displayHighScore("tim",highScorePosition);

         highScorePosition = calculateHighScore(900);
        displayHighScore("Kola",highScorePosition);

         highScorePosition = calculateHighScore(1500);
        displayHighScore("bala",highScorePosition);

         highScorePosition = calculateHighScore(50);
        displayHighScore("ruth",highScorePosition);
    }

     public static void displayHighScore(String playerName, int highScorePosition){
         System.out.println(playerName + " managed to get to the position " +highScorePosition + " on the highScore table");
     }
     public static int calculateHighScore(int playerScore){
         if (playerScore >= 1000){
           return 1;
         }else if (playerScore > 500 && playerScore < 1000){
             return 2;
         }else if (playerScore > 100 && playerScore < 500){
             return 3;
         }else
             return 4;
     }

    }

