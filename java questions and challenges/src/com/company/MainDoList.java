package com.company;

import java.util.Scanner;

public class MainDoList {
    private static Scanner scanner = new Scanner(System.in);
    private static DoList doList = new DoList("MY EVERY DAY PLANS");

    public static void main(String[] args) {
        int option = 0;
        boolean quit = false;
        printInstruction();

        while (!quit){
            System.out.println("\n What plans you've got?");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    doList.printSchedule();
                    break;
                case 2:
                    addPlans();
                    break;
                case 3:
                    updatePlans();
                case 4:
                    removePlans();
                    break;
                case 5:
                    queryPlans();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstruction(){
        System.out.println("\n press");
        System.out.println("\t 0 - To print the Instructions");
        System.out.println("\t 1 - To print the scheduled plans");
        System.out.println("\t 2 - To add new plans");
        System.out.println("\t 3 - To update the scheduled plans");
        System.out.println("\t 4 - To remove the scheduled plans");
        System.out.println("\t 5 - To query the scheduled plans");
        System.out.println("\t 6 - To quit the process");
    }
    public static void addPlans(){
        System.out.println("Enter the day of the week of the plan");
        String DAY = scanner.nextLine();
        System.out.println("scribble down the plan");
        String PLAN = scanner.nextLine();
        Schedule mySchedule = Schedule.createPlans(DAY,PLAN);

        if (doList.addNewPlans(mySchedule)){
            System.out.println("On the " + DAY + " you planned to " + PLAN);
        }else
        System.out.println("Cannot add plan");
    }
  public static void removePlans(){
      System.out.println("Enter the day plan you wanna remove ");
      String DAY = scanner.nextLine();
      Schedule mySchedule = doList.queryContact(DAY);

      if (doList.removeSchedule(mySchedule)){
          System.out.println(DAY + " plans has been removed");
      }
  }
  public static void updatePlans(){
      System.out.println("Enter the day of plans you wanna update");
      String Day = scanner.nextLine();
      Schedule plans = doList.queryContact(Day);
      if (plans == null){
       //   System.out.println("No plans similar to that very day");
          return;
      }
      System.out.println("Enter the day  you wanna replaced it with");
      String  DAY = scanner.nextLine();
      System.out.println("Scribble down the plans ");
      String PLANS = scanner.nextLine();
      Schedule schedule = Schedule.createPlans(DAY,PLANS);

      if (doList.updateSchedule(plans,schedule)){
          System.out.println("Plans successfully updated");
      }else
          System.out.println("Plans fails to update");
  }
     public static void queryPlans(){
         System.out.println("Enter the day plan you wanna search ");
         String DAY = scanner.nextLine();
         Schedule mySchedule = doList.queryContact(DAY);
         if (mySchedule == null){
             System.out.println("Cannot found contact");
         }else
             System.out.println("Day: " +mySchedule.getDays() + "and the plan is " +mySchedule.getPlans());
     }
}
