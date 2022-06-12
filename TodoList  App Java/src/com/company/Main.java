package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
  private static ToDoList toDoList = new ToDoList("Go shopping");

  public static void main(String[] args) {
    int choice = 0;
    printInstructions();
    boolean exit = false;

    while (!exit){
        System.out.println("Enter the option you want to access");
        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 0:
                printInstructions();
                break;
            case 1:
                toDoList.printSchedule();
                break;
            case 2:
                addPlans();
                break;
            case 3:
                removePlans();
                break;
            case 4:
                updatePlans();
                break;
            case 5:
              checkPlans();
              break;
            case 6:
                exit =  true;
              break;
        }
    }
    }

    public static void printInstructions() {
        System.out.println("\n press");
        System.out.println("\t 0 - To print the Instructions");
        System.out.println("\t 1 - To print schedule plans");
        System.out.println("\t 2 - To add new schedule");
        System.out.println("\t 3 - To update the schedule plans");
        System.out.println("\t 4 - To remove the schedule plans");
        System.out.println("\t 5 - To query the schedule plans");
        System.out.println("\t 6 - To quit the process");
    }

    public static void addPlans() {
        System.out.println("Enter the Scheduled day");
        String Day = scanner.nextLine();
        System.out.println("Enter the plans");
        String plan = scanner.nextLine();
        Schedule fixScheduled = Schedule.createSchedule(Day, plan);
        if (fixScheduled == null) {
            System.out.println("No appointment fixed");
            return;
        }
        if (toDoList.addPlans(fixScheduled)) {
            System.out.println("Plans added  Day = " + fixScheduled.getDays() + " Plans is to " +fixScheduled.getPlans());
        }
    }

    public static void removePlans(){
        System.out.println("Enter the day plan you want to change");
        String Day = scanner.nextLine();
        Schedule existingPlan = toDoList.checkPlans(Day);
        if (existingPlan == null){
            System.out.println("Plans cannot be found");
            return;
        }
         if (toDoList.removePlans(existingPlan)){
             System.out.println(existingPlan  + " plan has been removed");
         }
  }

  public static void updatePlans(){
      System.out.println("Enter the Scheduled day you want to modify");
      String Day = scanner.nextLine();
      Schedule existingPlan = toDoList.checkPlans(Day);
      if (existingPlan == null){
          System.out.println("Plans can not be found");
          return;
      }
      System.out.println("Enter the Scheduled day");
      String newDay = scanner.nextLine();
      System.out.println("Enter the plan for the day");
      String newPlan = scanner.nextLine();
      Schedule newSchedule = Schedule.createSchedule(newDay,newPlan);
      if (toDoList.updateDayPlan(existingPlan,newSchedule)){
          System.out.println("Plans Updated " + existingPlan.getDays() + " plan has been updated");
      }
  }
  public static void checkPlans(){
      System.out.println("Enter the day plan you wanna search");
      String Day = scanner.nextLine();
      Schedule existingDay = toDoList.checkPlans(Day);
      if (existingDay == null){
          System.out.println("Scheduled cannot be found");
          return;
      }
      System.out.println("Day of plan is " + existingDay.getDays() + " and the plans is " + existingDay.getPlans());
  }
}
