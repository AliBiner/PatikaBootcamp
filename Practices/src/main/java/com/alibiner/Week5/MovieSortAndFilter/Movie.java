package com.alibiner.Week5.MovieSortAndFilter;

import java.util.List;

public class Movie implements Comparable<Movie>{
    private String name;
    private int releaseYear;
    private String category;
    private double IMDBScore;

    public Movie(String name, int releaseYear, String category, double IMDBScore) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.category = category;
        this.IMDBScore = IMDBScore;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getCategory() {
        return category;
    }

    public double getIMDBScore() {
        return IMDBScore;
    }

    public List<Movie> filterByCategory(List<Movie> movieList, String category){
        if (this.category.equals(category))
            movieList.add(this);
        return movieList;
    }

    @Override
    public int compareTo(Movie other) {
        int imdbCompare = Double.compare(other.IMDBScore,this.IMDBScore);
        int releaseYearCompare = Integer.compare(this.releaseYear,other.releaseYear);
        if (imdbCompare== 0)
            return releaseYearCompare;
        return imdbCompare;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", category='" + category + '\'' +
                ", IMDBScore=" + IMDBScore +
                '}';
    }
}
