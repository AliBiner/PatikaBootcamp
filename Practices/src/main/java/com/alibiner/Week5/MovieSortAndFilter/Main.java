package com.alibiner.Week5.MovieSortAndFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("The Matrix", 1999, "Action", 8.7));
        movieList.add(new Movie("The Godfather", 1972, "Crime", 9.2));
        movieList.add(new Movie("Interstellar", 2014, "Sci-Fi", 8.7)); // IMDb Puanı The Matrix ile aynı
        movieList.add(new Movie("The Dark Knight", 2008, "Action", 9.0));
        movieList.add(new Movie("Pulp Fiction", 1994, "Crime", 8.9));
        movieList.add(new Movie("Forrest Gump", 1994, "Drama", 8.8));
        movieList.add(new Movie("The Lord of the Rings: The Return of the King", 2003, "Fantasy", 9.0)); // IMDb Puanı The Dark Knight ile aynı
        movieList.add(new Movie("Fight Club", 1999, "Drama", 8.8)); // IMDb Puanı Forrest Gump ile aynı
        movieList.add(new Movie("Inception", 2010, "Sci-Fi", 8.8)); // IMDb Puanı Forrest Gump ve Fight Club ile aynı
        movieList.add(new Movie("The Shawshank Redemption", 1994, "Drama", 9.3));
        movieList.add(new Movie("Parasite", 2019, "Thriller", 8.5));
        movieList.add(new Movie("The Green Mile", 1999, "Fantasy", 8.6));
        movieList.add(new Movie("Gladiator", 2000, "Action", 8.5)); // IMDb Puanı Parasite ile aynı
        movieList.add(new Movie("The Prestige", 2006, "Mystery", 8.5)); // IMDb Puanı Parasite ve Gladiator ile aynı
        movieList.add(new Movie("Whiplash", 2014, "Music", 8.5)); // IMDb Puanı diğerleriyle aynı
        movieList.add(new Movie("The Departed", 2006, "Crime", 8.5)); // IMDb Puanı diğerleriyle aynı, yılı The Prestige ile aynı
        movieList.add(new Movie("Se7en", 1995, "Mystery", 8.6)); // IMDb Puanı The Green Mile ile aynı
        movieList.add(new Movie("The Silence of the Lambs", 1991, "Thriller", 8.6)); // IMDb Puanı diğer 8.6'lıklarla aynı
        movieList.add(new Movie("Joker", 2019, "Drama", 8.4));
        movieList.add(new Movie("Avengers: Endgame", 2019, "Action", 8.4)); // IMDb Puanı Joker ile aynı
        System.out.println("Non Sort Array List");
        //Non Sort Arraylist
        for (Movie movie : movieList)
            System.out.println(movie);

        System.out.println("------------------------------");



        System.out.println("Sorted Array List");
        //Sorted arraylist
        Collections.sort(movieList);
        //output sorted arraylist
        for (Movie movie : movieList)
            System.out.println(movie);

        System.out.println("------------------------------");

        System.out.println("Filtered Array List");

        //Filter category
        List<Movie> filteredMovieList = new ArrayList<>();

        for (Movie movie : movieList)
            movie.filterByCategory(filteredMovieList,"Drama");

        for (Movie movie : filteredMovieList)
            System.out.println(movie);

        System.out.println("------------------------------");
        System.out.println("Filtered Array List with Alternative Method");

        List<Movie> filteredMovieList1 = new ArrayList<>();

        filteredMovieList1 =
                movieList.stream().filter(movie -> "Drama".contains(movie.getCategory())).toList();

        for (Movie movie : filteredMovieList1)
            System.out.println(movie);

    }
}
