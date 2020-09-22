package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce48;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class SongPlaylist {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Pesa Nasha Pyar", "Bohemia", 2006);
        album.addSong("D.E.S.I", 4.01);
        album.addSong("Do Dat Dance", 2.59);
        album.addSong("Gangsta Shit", 2.51);
        album.addSong("Veera", 1.15);
        album.addSong("Kali Denali", 3.22);
        album.addSong("Nachiye", 3.54);
        albums.add(album);

        album = new Album("Da Rap Star", "Bohemia", 2009);
        album.addSong("Ek Tera Pyar", 4.36);
        album.addSong("Diwana", 4.57);
        album.addSong("Gunagaar (Sinner)", 4.19);
        album.addSong("Dil", 4.59);
        album.addSong("Charso Bees (420)", 4.20);
        albums.add(album);

        List<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Kali Denali", playList);
        albums.get(0).addToPlaylist("Gangsta Shit", playList);
        albums.get(0).addToPlaylist("Nachiye", playList);
        albums.get(0).addToPlaylist("Future", playList); // Does not exist
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(4, playList);
        albums.get(1).addToPlaylist(5, playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(24, playList); // There is no track 24

        play(playList);
    }

    private static void play(List<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.isEmpty()) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We are at the end of the playlist.");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (!playList.isEmpty()) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong input. Please enter number between 0 to 5");
            }
        }
    }

    private static void printList(List<Song> playList) {
        System.out.println("===========================================");
        for (Song song : playList) {
            System.out.println(song);
        }
        System.out.println("===========================================");

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" + "1 - to play next song\n" + "2 - to play previous song\n"
                + "3 - to replay current song\n" + "4 - list songs in the playlist\n" + "5 - print available actions.\n"
                + "6 - remove current song from the playlist");
    }
}
