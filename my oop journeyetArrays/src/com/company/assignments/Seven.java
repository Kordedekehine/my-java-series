package com.company.assignments;

public class Seven {

    public static void main(String[] args) {
        System.out.println("checking for upper and lowercase....");
 CharacterChecker('A');
    }
    public static void CharacterChecker(char word){
        if (Character.isLowerCase(word)){
            System.out.println("Done! character is lowercase");
        }else if (Character.isUpperCase(word)){
            System.out.println("Done!character is uppercase");
        }else
            System.out.println("Done!mixed character");
    }
}
