package com.shadab.imdb.service;

public interface RatingService {
	
	public String formURLForIM(String movieName);
	public String getMovieUniqueID(String movieName);
	public String getMoviePageByUniqueID(String uniqueID);
	public String getMovieRank(String parseddata);

}
