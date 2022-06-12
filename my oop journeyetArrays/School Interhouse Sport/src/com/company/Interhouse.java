package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Interhouse <T extends Students <Students>>  implements Comparable<Interhouse<T>>{
    private String name;
    int won = 0;
    int loss = 0;
    int draw = 0;
    int played = 0;

    ArrayList<T> participants = new ArrayList<>();

    public Interhouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void generateFixtures(Interhouse<T> house){
        Collections.shuffle(participants);
        for (T to:
             participants) {
            System.out.println(to.getStudentName() + " : " + " picked");

        }
//        System.out.println("ANOTHER HOUSE");
//        Collections.shuffle(participants);
//        for (T so:
//             participants) {
//           String t2 = so.getStudentName();
//            System.out.println(t2 );
//        }
    }



    public boolean addParticipants(T houses){
        if (participants.contains(houses)){
            System.out.println(houses.getStudentName() + " already exists on the list " + this.name);
            return false;
        }else
            participants.add(houses);
        System.out.println(houses.getStudentName() + " just got added to the list " + this.name);
        return true;
    }


    public void eventsResult(Interhouse<T> Opponents, String typeOfSport, int homeTeamScore, int opponentScore){
        String message;
        if (homeTeamScore > opponentScore){
            won++;
            message = " beat ";
        }else if (homeTeamScore == opponentScore){
            draw++;
            message = " draw to ";
        }else {
            loss++;
            message = " lost to ";
        }
        played++;
        if (Opponents != null){
            System.out.println(this.name + message + Opponents.getName() + " in " + typeOfSport);
            Opponents.eventsResult(null, typeOfSport,opponentScore,homeTeamScore);
        }
    }

    public int numberOfParticipants(){
        return participants.size();
    }

    public int ranking(){
        return (won * 2) + draw;
    }

    @Override
    public int compareTo(Interhouse<T> houses) {
        if (this.ranking() > houses.ranking()){
            return -1;
        }else if (this.ranking() < houses.ranking()){
            return 1;
        }
        return 0;
    }


}
