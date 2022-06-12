package com.company;

public class secondHigh {
    //create a second method called "calculate high score position"..
    // it should be sent one argument only,which is the player score/name.then it should return an int.
    //the return data is if the score is greater than 1000..
    // return 1..return 2 if the score is greater than 500 and less than 1000.
    //return 3 if the score is greater than 100 and lesser than 500. return 4 in all other cases
    //call both methods and display the result of the following scores..1500,900,400 and 50..
static void displayHighScoreposition(String playername,int position){
    System.out.println(playername + "  manage to get to the num " + position +   " at the high score table" );
}
static int CalculateHighScore(int playerscore){
    if (playerscore > 1000){
        return 1;
    }else if (playerscore > 500 && playerscore < 1000){
        return 2;
    }else if (playerscore > 100 && playerscore < 500){
        return 3;
    }else
        return 4;
}

    public static void main(String[] args) {
        CalculateHighScore(1500);
        int position = CalculateHighScore(505);
        displayHighScoreposition("Bola",+position);
    }
    //1ASSIGNMENT...write a method that perform an additional operation and the method should return the result
    // .the addititional operator must be able to perform
    //if i pass in 2 parameter,it should perform..including 3,4,5 parameter
    //2 create a method called calcfeetAndInchesToCentemetres..it need to have 2 parameters..fit is the first parameter,while inches is the second.
    //we should validate the first pararmeter if fit is greater than or equal to 0
    //we should validate second parameter that inches is greater than 0 or less than or equal to 12
    //returm -1 if either of the above is not true
    //if the parameter are valid then calculate how many centemetre comprise the fit and inches pass to the method and return that value
    //create a second method of the same name but with only one parameter
    //inch is the parameter,validate thatt it is greater than or equal to 0,return -1 if its not true.but if valid calculate how many fit in the inches
    //and then here is the tricky part.call the other overloaded method passing the correct fit and inch calculated so that it can calculate correctly.
    //int ,use double for your datatype ..one inch = 2.5 and one fit = 12 inches
    //calling overloaded method just require you to use the right number of parameter
}





