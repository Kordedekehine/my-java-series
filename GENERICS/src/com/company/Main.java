package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
   FootBallPlayer Ojo = new FootBallPlayer("Ojo");
   FootBallPlayer wale = new FootBallPlayer("Wale");
   BaseBallPlayer kola = new BaseBallPlayer("kola");
   SoccerPlayer popo = new SoccerPlayer("Jibade");

   Team<FootBallPlayer> westham = new Team<>("Westham");
   westham.addMembers(Ojo);

        Team<FootBallPlayer> tottenham = new Team<>("Tottenham");
        tottenham.addMembers(wale);

        Team<BaseBallPlayer> england = new Team<>("England");
   england.addMembers(kola);

        BaseBallPlayer tade = new BaseBallPlayer("tade");
        Team<BaseBallPlayer> leeds = new Team<>("Leeds");
        leeds.addMembers(tade);

   Team<SoccerPlayer> barca = new Team<>("Barca");
   barca.addMembers(popo);

   int total = westham.numberOfMembers() + england.numberOfMembers() + barca.numberOfMembers();
       System.out.println(total);

westham.matchResult(tottenham,2,1);
leeds.matchResult(england,4,1);
england.matchResult(leeds,2,9);

        System.out.println("Westham has "+ westham.ranking() + " points");
        System.out.println("Tottenham " + tottenham.ranking() + " points");

        System.out.println(england.getName() + " is ranked " + england.ranking() + " points");
        System.out.println(leeds.getName() + " is ranked " + leeds.ranking() + " points ");

        System.out.println(england.compareTo(leeds));
        System.out.println(leeds.compareTo(england));
    }
}