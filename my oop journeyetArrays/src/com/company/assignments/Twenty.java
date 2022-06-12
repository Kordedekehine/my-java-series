package com.company.assignments;

import com.company.Triangle;

import java.util.Scanner;

public class Twenty {
    public static void main(String[] args) {
        //   System.out.println(Perimeter(4,6,8));
        //    System.out.println(Area(7,9));
        Triangle object = new Triangle();
        char Exit_Status;
        do {
            System.out.println("Calculate the perimeter or area of Triangle \n");

            Scanner scanner = new Scanner(System.in);
            System.out.println("To Calculate Perimeter press P || To calculate Area press A");

            char Option = scanner.next().charAt(0);
            {
                double l;
                double b;
                double h;
                if (Option == 'P') {
                    System.out.println(" Enter the length");
                    l = scanner.nextDouble();

                    System.out.println("Enter the breadth");
                    b = scanner.nextDouble();

                    System.out.println("Enter the height");
                    h = scanner.nextDouble();

                    System.out.println(" The Perimeter of the Triangle is : ");
                    double Perimeter = l + b + h;
                    System.out.println(Perimeter);
                } else if (Option == 'A') {
                    System.out.println("Enter the length");
                    l = scanner.nextDouble();

                    System.out.println("Enter the breadth");
                    b = scanner.nextDouble();

                    System.out.println("The Area of the triangle is : ");
                    double Area = l * b;
                    System.out.println(Area);
                } else {
                    System.out.println("Enter P || A only");
                }
                System.out.println("Do you want to Continue Enter Y or stop by pressing N");
                Exit_Status = scanner.next().charAt(0);
            }
        }

            while
            (Exit_Status == 'Y') ;

    }
}




//    public static int Perimeter(int l,int b,int h){
//        int perimeter = l+b+h;
//        return perimeter;
//    }
//    public static int Area(int l,int b){
//        int Area = l * b;
//        return Area;
//    }
//
//        }
//    }