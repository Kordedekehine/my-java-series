package com.company;

public class InchFeet {
    //2 create a method called calcfeetAndInchesToCentemetres..it need to have 2 parameters..feet is the first parameter
    // ,while inches is the second.
    //we should validate the first parameter if feet is greater than or equal to 0
    //we should validate second parameter that inches is greater than 0 or less than or equal to 12
    //return -1 if either of the above is not true
    //if the parameter are valid then calculate how many centimetre comprises the feet and inches pass to the method and return that value
    //create a second method of the same name but with only one parameter
    //inch is the parameter,validate that it is greater than or equal to 0,return -1 if its not true.but if valid calculate how many
    // feet in the inches
    //and then here is the tricky part.call the other overloaded method passing the correct feet and inch calculated so that
    // it can calculate correctly.
    //int ,use double for your datatype ..one inch = 2.5 and one fit = 12 inches
    //calling overloaded method just require you to use the right number of parameter
    public static void main(String[] args) {
        calcfeetAndInchesToCentemetres(12,2.54);
        //formular for calculating the amount of centimetres in feet and inches
        double Answer = calcfeetAndInchesToCentemetres(12,2.54)/ 0.1;
        System.out.println("the feet and the inches is comprised of " +Answer + " centimetres");
        calcfeetAndInchesToCentemetres(2.5);
        //feet = 12
        double inchInFeet = 12/calcfeetAndInchesToCentemetres(2.5);
        System.out.println("we have " +inchInFeet + " inches inside one feet");
        calcfeetAndInchesToCentemetres(12,4.8);
        double FinalFeetAndInch = calcfeetAndInchesToCentemetres(12,4.8);
        System.out.println("the accurate amount of inches and exact amount of feet is  " + FinalFeetAndInch );
    }

    static double calcfeetAndInchesToCentemetres(double Feet, double Inches) {
        double feet = Feet;
        double inch = Inches;

        if (feet > 0 || feet == 0 || inch > 0 || inch == 12) {
            return Feet + inch; //we may divide it by 0.1 which equals to 1cm
        } else
            return -1;
    }
    static double calcfeetAndInchesToCentemetres(double inch) {
        double Inch = inch;
        if (inch > 0 || inch == 0) {
            return inch;
        }else
            return -1;
    }
}