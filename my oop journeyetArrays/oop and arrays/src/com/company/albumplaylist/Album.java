package com.company.albumplaylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
private String albumName;
private String artisteName;
ArrayList<Song> mySongs = new ArrayList<Song>();

    public Album(String albumName, String artisteName) {
        this.albumName = albumName;
        this.artisteName = artisteName;
        this.mySongs = mySongs;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            this.mySongs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String name){
        for (int i = 0; i < mySongs.size(); i++){
            Song checkSong = mySongs.get(i);
            if (checkSong.getTitle().equals(name)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int position = trackNumber - 1 ;
        if (position > 0 && position <= this.mySongs.size()){
            playList.add(this.mySongs.get(position));
            return true;
        }
        return false;
    }


    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkTitle = findSong(title);
        if (checkTitle != null){
            playList.add(checkTitle);
            return true;
        }
        return false;
    }
}
