package com.pragra.abstraction;

public class ComedyMovies extends Movies {
    @Override
    void canWatchOnline() {
        System.out.println("movies can be seen online");
    }

    @Override
    void canWatchInCinema() {
        System.out.println("you can watch movies in cinema ");
    }


    public static void main(String[] args) {
        Movies movies=new ComedyMovies();


    }
}