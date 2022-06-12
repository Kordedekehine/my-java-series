package com.company;

public class hitNkill {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);  //change string to int
        String result = "miss"; //if insert any number then it should miss
        for (int cell : locationCells){ //cell should search through the location cell and hold its components
            if (guess == cell) { // if any of the guess is equal to the variable the cell is holding
                result = "hit"; // return hit
                numOfHits++; //remember the default variable of numOfHits is 0, so when it it should add 1 as in count
                break; //once it counts then it should break
            }
        } // out of the loop
        if (numOfHits == locationCells.length) { //if num of hit is equal to the length of the cell
            result = "kill";  //then it should return kill
        }
        System.out.println(result);
        return result;
   } // close method
} // clos

