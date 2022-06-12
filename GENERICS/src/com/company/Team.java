package com.company;

import java.util.ArrayList;
//the comparable is a functionality implemented so as to override and compare teams that should be at the top
public class Team<T extends Player> implements Comparable<Team<T>>{ //remember upper bounded  is basically for allowing access to superclasses


    //Note in the comparable implementation the team and T means that it should compare teams and the T restrict it
    //to only teams of the same type
    public String name;
     int played = 0;
     int won = 0;
     int loss = 0;
     int tied = 0;


    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addMembers(T player){
        if (members.contains(player)){
            System.out.println("Player " + player.getPlayerName() + " has been added already");
            return false;
        }else
            members.add(player);
        System.out.println(player.getPlayerName() + " has been added to the team " + this.name);
        return true;
    }

    public void matchResult(Team<T> opponent, int ourScore, int thierScore){
        String message;
        if (ourScore > thierScore){
         won++;
         message = " beat ";
        }else if (ourScore == thierScore){
            tied++;
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

    public int ranking(){
        return (won * 2) + tied;
    }

    public int numberOfMembers(){
        return this.members.size();
    }

    @Override
    public int compareTo(Team<T> team) {
    if (this.ranking() > team.ranking()){
        return -1;
    }else
        return 0;

    }
}
