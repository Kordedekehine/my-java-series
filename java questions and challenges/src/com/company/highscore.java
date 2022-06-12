package com.company;

public class highscore {
    //create a method called display highscore position..it should have a player name as a parameter.
    // second parameter as a position in the high score table
    //display the players name along with a message
    // like "manage to get to the position" and the position they got and the further message"on the high score table"
    //create a second method called "calculate high score position"..
    // it should be sent one argument only,which is the player score/name.then it should return an int.
    //the return data is if the score is greater than 1000..
    // return 1..return 2 if the score is greater than 500 and less than 1000.
    //return 3 if the score is greater than 100 and lesser than 500. return 4 in all other cases
    //call both methods and display the result of the following scores..1500,900,400 and 50..
    static boolean highScore(String playername,int position,int highscoreTable)  {
        String PlayerName = playername;
        int Position = position;
        int HighScoreTable = highscoreTable ;


        return true;
    }
    static boolean highScore2(String playername,int position,int highscoreTable)  {
        String PlayerName = playername;
        int Position = position;
        int HighScoreTable = highscoreTable ;


        return true;
    }
    static boolean highScore3(String playername,int position,int highscoreTable)  {
        String PlayerName = playername;
        int Position = position;
        int HighScoreTable = highscoreTable ;


        return true;
    }
    //display the players name along with a message
    // like "manage to get to the position" and the position they got and the further message"on the high score table"
    public static void main(String[] args) {
        highScore("Ola",1,1000);
        highScore2("Bola",2,900);
        highScore3("Ojo",3,500);
        System.out.println("Ola manage to get to the first Postition.further message above on the highscore table");
        System.out.println("Bola manage to get to the second Postition.further message above on the highscore table");
        System.out.println("Ojo manage to get to the third Postition.further message above on the highscore table");
    }//the position must be called e.g +position..sout must be part of


}
