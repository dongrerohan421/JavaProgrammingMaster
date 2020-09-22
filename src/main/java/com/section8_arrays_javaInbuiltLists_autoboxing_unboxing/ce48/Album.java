package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce48;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private static final boolean FALSE = false;
    private static final boolean TRUE = true;
    private String albumName;
    private String artist;
    private int year;
    private List<Song> songs;

    public Album(String albumName, String artist, int year) {
        this.albumName = albumName;
        this.artist = artist;
        this.year = year;
        this.songs = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<Song> getSongs() {
        return songs;
    }

    // add - only add when there's no existing song
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return TRUE;
        }
        return FALSE;
    }

    public Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return TRUE;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return FALSE;
    }

    public boolean addToPlaylist(String title, List<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return TRUE;
        }
        System.out.println("The song " + title + " is not in the album");
        return FALSE;
    }
}
