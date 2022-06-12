package com.company;

import java.util.ArrayList;

public class Schedule {
    private String Days;
    private String plans;

    public Schedule(String days, String plans) {
        this.Days = days;
        this.plans = plans;
    }

    public String getDays() {
        return Days;
    }

    public String getPlans() {
        return plans;
    }

    public static Schedule createPlans(String days, String plans){
        return new Schedule(days,plans);
    }

    ArrayList<String> scheduleList = new ArrayList<String>();

    public ArrayList<String> getScheduleListList() {
        return scheduleList;
    }

    public void storeContacts(String names) {
        scheduleList.add(names);
    }

    public void printContactList() {
        System.out.println("You have " + scheduleList.size() + " Contacts in your list.");
        for (int i = 0; i < scheduleList.size(); i++) {
            System.out.println(i + " - " + scheduleList.get(i));
        }
    }
}
