package com.midnights.kay;

import java.util.ArrayList;

public class Additions<T extends Teams>{
    private String name;

    ArrayList<T> overall = new ArrayList<>();

    public Additions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addParticipants(T few){
        if (overall.contains(few)){
            System.out.println("ALREADY ADDED");
            return false;
        }else
            overall.add(few);
        System.out.println(few.getName() + " has been added");
        return true;
    }

//    public void generateFixtures(Additions<T> house) {
//        Collections.shuffle(overall);
//        for (T to :
//                overall) {
//            System.out.println(to.getName() + " : " + " picked");
//
//        }
//    }


}
