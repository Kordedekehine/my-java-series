package com.company;

import java.util.ArrayList;

public class ToDoList {
    private String List;
    ArrayList<Schedule> mySchedules;

    public ToDoList(String list) {
        List = list;
        this.mySchedules = new ArrayList<Schedule>();
    }

    public void printSchedule(){
        System.out.println("Schedule list contains " + this.mySchedules.size() + " Days plan");
        for (int i = 0; i < this.mySchedules.size(); i ++){
            System.out.println("Day = " +this.mySchedules.get(i).getDays() + " Plans = " + this.mySchedules.get(i).getPlans());
        }
    }

    public boolean addPlans(Schedule schedule){
        if (findPlans(schedule) >= 0){
            System.out.println("Plans is already scheduled");
            return false;
        }
        this.mySchedules.add(schedule);
        return true;
    }

    public boolean removePlans(Schedule schedule){
        int foundPlanDay = findPlans(schedule);
        if (foundPlanDay < 0){
            System.out.println("Plans cannot be defined");
            return false;
        }
        this.mySchedules.remove(schedule);
        System.out.println("Plans successfully removed");
        return false;
    }

    public boolean updateDayPlan(Schedule oldSchedule, Schedule newSchedule){
        int foundPlanDay = findPlans(oldSchedule);
        if (foundPlanDay < 0){
            System.out.println(oldSchedule.getDays() + " plans cannot be found");
            return false;
        }
        this.mySchedules.set(foundPlanDay,newSchedule);
        System.out.println(oldSchedule.getDays() + " plans has been updated");
        return true;
    }

    private int findPlans(Schedule schedule){
        return mySchedules.indexOf(schedule);
    }

    private int findPlans(String scheduleDay){
     for (int i = 0; i < this.mySchedules.size(); i++){
         Schedule schedule = this.mySchedules.get(i);
         if (schedule.getDays().equals(scheduleDay)){
             return i;
         }
     }
     return -1;
    }

    public Schedule checkPlans(String planDay){
        int foundPlanDay = findPlans(planDay);
        if (foundPlanDay >= 0){
            return this.mySchedules.get(foundPlanDay);
        }
        return null;
    }

    public String checkPlans(Schedule schedule){
        if (findPlans(schedule) >= 0){
            return schedule.getDays();
        }
        return null;
    }
}
