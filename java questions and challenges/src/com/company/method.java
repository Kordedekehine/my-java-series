package com.company;

public class method {

   /* static int multiplyBytwo(int number) { //parameters are added at the back of the method name..it may be more than one and can be seperated with plenty commas
        return number * 2;
    }

    public static void main(String[] args) {
        int result = multiplyBytwo(2);
        System.out.println("The output is " + result); */

    /*  static int sum (int num1 , int num2) { //this is 2 parameters
          return num1 + num2; //we want it to return thats why we did not use void...void does not have return value
      }

      public static void main(String[] args) {
          int result = sum(4,6);
          System.out.println("The output is " +result); */

  //write a program that return a name of a person
  /* static void hello() {
    String name = "kola";
    System.out.println(name);
  }

  public static void main(String[] args) {
   hello();
  } //do it with the non void too */

  /*public static void game(boolean gameover, int score,int level,int bonus) {
    boolean Gameover = true;
   int Score = score ;
    int Level = level ;
    int Bonus = bonus;
    if (gameover) {
      int finalScore = score + (level * bonus);
      System.out.println(" Gameover your final score is : " + finalScore);
    }


  }

  public static void main(String[] args) {
    game(true,400,5,100);
  } */
  public static void main(String[] args) {
    int PlayerPosition = CalculateHighScoreMethod(1500);
    displayHighScoreMethod("badguy",+PlayerPosition);

     PlayerPosition = CalculateHighScoreMethod(900);
    displayHighScoreMethod("Bob" , +PlayerPosition);

    PlayerPosition = CalculateHighScoreMethod(400);
    displayHighScoreMethod("Bella" , +PlayerPosition);

    PlayerPosition = CalculateHighScoreMethod(50);
    displayHighScoreMethod("Nas" , +PlayerPosition);
  }

  public static void displayHighScoreMethod (String PlayerName,int PlayerPosition) {
    String playername = PlayerName;
    int playerposition = PlayerPosition;
    System.out.println( PlayerName + " managed to get into the position " +PlayerPosition + " on the high score table" );
  }
  static int CalculateHighScoreMethod(int PlayerScore) {
    int playerScore = PlayerScore;

    if (playerScore > 1000){
      return 1;
    }else if (playerScore > 500 && playerScore < 1000){
      return 2;
    }else if (playerScore > 100 && playerScore < 500){
      return 3;
    }else
      return 4;
  }

  }

//DO NOT DECLARE 2 PUBLIC CLASS INSIDE A FIELD



  
  //write an application that accept personal info of a person.age/sex/gender/name/skin color/religion...
//write a program that calculates the Bmi(body mass) of a person.using formular..Body mass= weight * height//using void and non void


