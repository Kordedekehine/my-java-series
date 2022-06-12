package com.company.assignment;

public class assignment {
   //write a program that prints out all the parameter passed to same method 4 times..anytime passed it should confam amount of the parameter passed
   static boolean Submit() {
       String Username = "default";
       String Password = "default";
       int Age = 0;
       String Gender = "default";


       return true;
   }
    static boolean Submit(String username,String password) {
        String Username = username;
        String Password = password;
        int Age = 0;
        String Gender = "default";


        return true;
    }
    static boolean Submit(String username,String password,int Age) {
        String Username = username;
        String Password = password;
        int age = Age;
        String Gender = "default";


        return true;
    }
    static boolean Submit(String username,String password,int Age,String gender) {
        String Username = username;
        String Password = password;
        int age = Age;
        String Gender = gender;


        return true;
    }

    public static void main(String[] args) {
        Submit();
        Submit("Korede","1234");
        Submit("Korede","1234",32);
        Submit("Korede","1234",32,"Male");
        System.out.println("Sign up later");
        System.out.println("2 out of four parameters which are username and password.Have been successfully registered your username and password! Skip   or  continue?");
        System.out.println("3 out of four parameters which are  Username,password and age has been registered! Skip    or    Continue");
        System.out.println("4 out of four which are  Username,password ,age and gender has been registered!");
    }
//create a method called display highscore position..it should have a player name as a parameter.second parameter as a position in the high score table
    //display the players name along with a message like "manage to get to the position" and the position they got and the further message"on the high score table"
    //create a second method called "calculate high score position"..it should be sent one argument only,which is the player score/name.then it should return an int.
   //the return data is if the score is greater than 1000..return 1..return 2 if the score is greater than 500 and less than 1000.
   //return 3 if the score is greater than 100 and lesser than 500. return 4 in all other cases
    //call both methods and display the result of the following scores..1500,900,400 and 50..

}








