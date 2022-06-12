package albumplaylist;


import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

   Album album = new Album("Twice as Tall","Burna Boy");
   album.addSong("Bebo",3.14);
        album.addSong("Time flies",2.14);
        album.addSong("23",4.24);
        album.addSong("Monster",3.54);
        album.addSong("Wonder",3.34);
        album.addSong("Real Life",4.10);
        album.addSong("Weitin dey Sup",4.54);
        albums.add(album);

        album = new Album("MIL", "Wizkid");
        album.addSong("Reckless",2.14);
        album.addSong("Blessing",4.24);
        album.addSong("Essence",3.54);
        album.addSong("Smile",3.34);
        album.addSong("No Stress",4.10);
        album.addSong("Grace",4.54);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("23",playList);
        albums.get(0).addToPlayList("Monster",playList);
        albums.get(0).addToPlayList("Time flies",playList);
        albums.get(0).addToPlayList("Wonder",playList);
        albums.get(1).addToPlayList("Blessing",playList);
        albums.get(1).addToPlayList("Smile",playList);
        albums.get(1).addToPlayList("Grace",playList);
        albums.get(0).addToPlayList(6,playList);
        albums.get(1).addToPlayList(3,playList);

        playSongs(playList);
    }

    public static void playSongs(LinkedList<Song> playList){
        boolean quit = false;
        boolean goingForward = true;
        int choice;
        printMenu();
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0){
            System.out.println("No song in the playList");
            return;
        }else
            System.out.println(listIterator.next().toString() + " is currently playing...");

        while (!quit){

            System.out.println("Enter the option below: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the top of the list");
                        goingForward = true;
                    }
                    break;



                case 3:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Replaying the current song " + listIterator.previous());
                            goingForward = false;
                        }else
                            System.out.println("Reached the top of the list");
                    }else {
                        if (listIterator.hasNext()){
                            System.out.println("Replaying the current song " + listIterator.next());
                            goingForward = true;
                        }else
                            System.out.println("Reached the end of the list");
                    }
                    break;

                case 4:
                    if (playList.size() > 0){
                        listIterator.remove();
                        System.out.println("Song deleted");
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else
                            if (listIterator.hasPrevious()){
                                System.out.println("Now playing " + listIterator.previous());
                            }
                    }
                    break;

                case 5:
                    printList(playList);
                    break;

                case 6:
                    printMenu();
                    break;

                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("\nPress");
        System.out.println("1 - next Song \n" +
                "2 - prev Song \n" +
                "3 - replay Song \n" +
                "4 - delete song \n" +
                "5 - print lists of songs \n" +
                " 6 - print Menu \n" +
                "7 -  quit application");
    }

    public static void printList(LinkedList<Song> playList){
      Iterator iterator = playList.iterator();
      while (iterator.hasNext()){
          System.out.println(iterator.next());
      }

    }
}









