package com.company;

public class Main {
    public static void main(String[] args) {
        Teams a = new Teams("Group A");
        Teams b = new Teams("Group B");
        Teams c = new Teams("Group C");
        Teams d = new Teams("Group D");

      England chelsea = new England("Chelsea");
      England arsenal = new England("Arsenal");
      England westham = new England("Westham");
      England tottenham = new England("Tottenham");
      Spain barca = new Spain("Barca");
      Spain realMadrid = new Spain("Real Madrid");
      Spain eibar = new Spain("Eibar");
      Spain malmo = new Spain("Malmo");
      Germany bayernMunich = new Germany("Bayern Munich");
      Germany stuggart = new Germany("Stuggart");
      Germany dortmund = new Germany("Dortmund");
      Germany leverkusen = new Germany("Bayern Leverkusen");
      Italy interMilan = new Italy("Inter Milan");
      Italy lazio = new Italy("Lazio");
      Italy juventus = new Italy("Juventus");
      Italy napoli = new Italy("Napoli");

      Additions<Teams> groupA = new Additions<>("Group A");
      groupA.addParticipants(a);
        System.out.println("-----------");
      Teams<England> premier = new Teams<>("Premier League");
      premier.addTeams(chelsea);
      premier.addTeams(arsenal);
      premier.addTeams(westham);
      premier.addTeams(tottenham);
        System.out.println("\n");


        Additions<Teams> groupB = new Additions<>("Group B");
        groupA.addParticipants(b);
        System.out.println("-----------");
        Teams<Spain> laLiga = new Teams<>("La Liga");
        laLiga.addTeams(barca);
        laLiga.addTeams(realMadrid);
        laLiga.addTeams(malmo);
        laLiga.addTeams(eibar);

        Additions<Teams> groupC = new Additions<>("Group C");
        groupA.addParticipants(c);
        System.out.println("-------------");
        Teams<Germany> bundesliga = new Teams<>("Bundesliga");
        bundesliga.addTeams(bayernMunich);
        bundesliga.addTeams(stuggart);
        bundesliga.addTeams(dortmund);
        bundesliga.addTeams(leverkusen);

        Additions<Teams> groupD = new Additions<>("Group D");
        groupD.addParticipants(d);
        System.out.println("-----------");
        Teams<Italy> serieA = new Teams<>("Serie A");
        serieA.addTeams(lazio);
        serieA.addTeams(interMilan);
        serieA.addTeams(napoli);
        serieA.addTeams(juventus);




      System.out.println("FIXTURES");
      premier.generateFixtures(laLiga);
      System.out.println("----");
      laLiga.generateFixtures(premier);
      System.out.println("-----");
      bundesliga.generateFixtures(serieA);
      System.out.println("----");
      serieA.generateFixtures(bundesliga);
      System.out.println("\n");




    }
}
