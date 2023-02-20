package net.flicks.client;

import net.flicks.Genre;
import net.flicks.Movie;
import net.flicks.Rating;

class MovieClient {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Shrek", Genre.FANTASY, 2005, Rating.PG);
        Movie movie2 = new Movie("Story", Genre.SCI_FI);

        movie1.setRevenue(491_800_000.03);

        System.out.println(movie1);
        System.out.println(movie2);
    }
}