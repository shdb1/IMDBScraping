package com.shadab.imdb.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.shadab.imdb.api.IMDBAPI;
import com.shadab.imdb.model.Rating;
import com.shadab.imdb.service.RatingService;

@RestController
public class MovieRatingController implements IMDBAPI {

	@Autowired
	RatingService ratingService;

	@Override
	public Rating getRating(String name) {
		// TODO Auto-generated method stub
		System.out.println("name to search is:"+name);
		String movieUniqueIDinIMDB = ratingService.getMovieUniqueID(name);
		String rating =ratingService.getMoviePageByUniqueID(movieUniqueIDinIMDB);
		return new Rating(name, rating);
		
	}

}
