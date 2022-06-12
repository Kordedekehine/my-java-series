package com.company;

public class submit {

    public static void main(String[] args) {
        System.out.println("hello");
        Submit();
        System.out.println("account registered");
        Submit("korede","1234");
    }
//form filling
    static boolean Submit() {
        String Username = "default";
        String Password = "default";
        String Age = "default";
        String Gender = "default";
        String Address = "default";
        int age = 0;

        return true;
    }


    static boolean Submit(String Username,String Password) {
        String username = Username;
        String password = Password;
        int age = 0;
        String gender = "default";
        String address = "default";
        return true;
    }
    static boolean Submit(String Username,String Password, int Age) {
        String username = Username;
        String password = Password;
        int age = Age;
        String gender = "default";
        String address = "default";
        return true;
    }
    static boolean Submit(String Username,String Password, int Age,String Gender) {
        String username = Username;
        String password = Password;
        int age = 0;
        String gender = Gender;
        String address = "default";
        return true;
    }
    static boolean Submit(String Username,String Password, int Age,String Gender, String Address) {
        String username = Username;
        String password = Password;
        int age = 0;
        String gender = Gender;
        String address = Address;
        return true;
    }

}
