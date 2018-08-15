package com.shadab.imdb.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shadab.imdb.model.Rating;

public interface IMDBAPI {
	 @RequestMapping("/movies/getrating")
	    public Rating getRating(@RequestParam(value="name", defaultValue="ravan") String name);

}
