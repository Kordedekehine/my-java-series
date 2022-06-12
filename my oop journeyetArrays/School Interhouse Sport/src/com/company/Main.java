package com.company;

public class Main {

    public static void main(String[] args) {



        LennonSchool olu = new LennonSchool("olu");
        LennonSchool tade = new LennonSchool("tade");
        LennonSchool korede = new LennonSchool("korede");
        LennonSchool bolu = new LennonSchool("bolu");
        LennonSchool godwin = new LennonSchool("godwin");
        LennonSchool jibola = new LennonSchool("jibola");
        LennonSchool ayinde = new LennonSchool("ayinde");
        LennonSchool dolapo = new LennonSchool("dolapo");


        Interhouse<LennonSchool> redHouse = new Interhouse<>("Red House");
        redHouse.addParticipants(olu);
        redHouse.addParticipants(tade);
        redHouse.addParticipants(dolapo);
        redHouse.addParticipants(ayinde);

        Interhouse<LennonSchool> blueHouse = new Interhouse<>("Blue House");
        blueHouse.addParticipants(korede);
        blueHouse.addParticipants(bolu);
        blueHouse.addParticipants(godwin);

        System.out.println("TODAY FIXTURES");
        redHouse.generateFixtures(blueHouse);
        System.out.println("VS");
        blueHouse.generateFixtures(redHouse);

        System.out.println("-----------");

        Interhouse<LennonSchool> greenHouse = new Interhouse<>("Green House");
        greenHouse.addParticipants(godwin);
        greenHouse.addParticipants(jibola);

        Interhouse<LennonSchool> yellowHouse = new Interhouse<>("Yellow House");
        yellowHouse.addParticipants(ayinde);
        yellowHouse.addParticipants(dolapo);



        redHouse.eventsResult(yellowHouse,"Javelin",6,4);
        blueHouse.eventsResult(greenHouse,"Racing",7,4);
        blueHouse.eventsResult(redHouse,"Skipping",6,2);




        System.out.println("points");
        System.out.println(blueHouse.ranking());
        System.out.println(redHouse.ranking());
        System.out.println(greenHouse.ranking());
        System.out.println(yellowHouse.ranking());

        System.out.println("Comparison");
        System.out.println(blueHouse.compareTo(greenHouse));
        System.out.println(redHouse.compareTo(redHouse));

        SchoolsChart<Interhouse<LennonSchool>> note = new SchoolsChart<>("Secondary schools");
        note.addOverall(redHouse);
        note.addOverall(blueHouse);
        note.addOverall(greenHouse);
        note.addOverall(yellowHouse);

        note.showCharts();


    }
}
