package com.company;

import java.util.ArrayList;

public class DoList {
    private String Plans;
    private ArrayList<Schedule> schedules;

    public DoList(String Plans) {
        this.Plans = Plans;
        this.schedules = new ArrayList<Schedule>();
    }

    public boolean addNewPlans(Schedule schedule) {
        if (findContact(schedule.getDays()) >= 0) {
            System.out.println("List is on the Schedule already");
            return false;
        }
        schedules.add(schedule);
        return true;
    }

    public void printSchedule() {
        System.out.println(" You have " + schedules.size() + "in your schedule");
        for (int i = 0; i < schedules.size(); i++) {
            System.out.println(i  + 1 + " - " + "--" + schedules.get(i).getDays() + "--" + "\n" + schedules.get(i).getPlans());
        }
    }

    public boolean updateSchedule(Schedule oldDays, Schedule newDays) {
        int foundPlan = findContact(oldDays);
        if (foundPlan >= 0) {
            this.schedules.set(foundPlan, newDays);
            System.out.println(oldDays + " has been replaced with the " + newDays);
            return true;
        }else if (foundPlan < 0)
        System.out.println(oldDays.getDays() + " was not found");
        return false;
    }

    public boolean removeSchedule(Schedule Plan) {
        int foundPlan = findContact(Plan);
        if (foundPlan >= 0) {
            schedules.remove(foundPlan);
            System.out.println(foundPlan +1 + " has been removed");
            return true;
        }
        System.out.println(foundPlan + 1+ " cannot be removed");
        return false;
    }

    public String queryContact(Schedule schedule) {
        if (findContact(schedule) >= 0) {
            return schedule.getDays();
        }
        return null;
    }

    public Schedule queryContact(String name) {
        int foundPlan = findContact(name);
        if (foundPlan >= 0) {
            return this.schedules.get(foundPlan);
        }
        return null;
    }

    public int findContact(String scheduledDay) {
        for (int i = 0; i < this.schedules.size(); i++) {
            Schedule schedule = this.schedules.get(i);
            if (schedules.get(i).equals(scheduledDay)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Schedule schedule) {
        return this.schedules.indexOf(schedule);
    }
}