package com.midnights.kay;

import java.util.ArrayList;
import java.util.Collections;

public class Teams<T extends ChampionsLeague> implements Comparable<Teams<T>> {
    private String name;
    int won = 0;
    int played = 0;
    int loss = 0;
    int draw = 0;

    private ArrayList<T> teams = new ArrayList<T>();

    public Teams(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeams(T team) {
        if (teams.contains(team)) {
            System.out.println("ALREADY ADDED!!");
            return false;
        } else
            teams.add(team);
        System.out.println(team.getName() + " added ");
        return true;
    }

    public void generateFixtures(Teams<?> house) { //we can also make it Teams<T>
        Collections.shuffle(teams);
        for (T to :
                teams) {
            System.out.println(to.getName() + " : " + " --> ");

        }
    }

    public void matchResult(Teams<T> opponent, int ourScore, int thierScore){
        String message;
        if (ourScore > thierScore){
            won++;
            message = " beat ";
        }else if (ourScore == thierScore){
            draw++;
            message = " draw to ";
        }else {
            loss++;
            message = " loss to ";
        }
        played++;
        if (opponent != null){
            System.out.println(this.name + message + opponent.name);
            opponent.matchResult(null,thierScore,ourScore);
        }
    }

    public int numberOfTeams(){
        return teams.size();
    }

    public int ranking(){
       return  (won * 2) + draw;
    }

    @Override
    public int compareTo(Teams<T> arrange) {
        if (this.ranking() > arrange.ranking()){
            return -1;
        }else
            return 1;
    }
}