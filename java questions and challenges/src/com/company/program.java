package com.company;
import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        // develop a game closing option.press q to quit and c to continue.

  Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game.press q or Q to quit ");
        String response = scanner.next();

        if (response.equals("Q") || response.equals("q")){
            System.out.println("You quit the game");
        }else if (response.equals("c") || response.equals("C")) {
            System.out.println("You continue the game");
        }else
            System.out.println("Please press q to quit or c to continue");


    }
}