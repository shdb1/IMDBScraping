package com.shadab.imdb.model;

public class Rating {

    public String getMovieName() {
		return movieName;
	}

	public String getRating() {
		return rating;
	}

	private final String movieName;
    private final String rating;

    public Rating(String movieName, String rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    
}