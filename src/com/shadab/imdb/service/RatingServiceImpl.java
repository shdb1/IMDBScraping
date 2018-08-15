package com.shadab.imdb.service;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.shadab.imdb.constants.IMDBContants;
import com.shadab.imdb.util.HTMLParser;
import com.shadab.imdb.util.HttpUtil;

@Service
public class RatingServiceImpl implements RatingService{

	@Override
	public String getMovieUniqueID(String movieName) {
		// TODO Auto-generated method stub
		String URL = formURLForIM(movieName);
		String movieUniqueID = null;
		try {
			System.out.println("URL:"+URL);
			movieUniqueID =	HttpUtil.doHTTPGetID(URL);
		} catch (IOException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}
		System.out.println("movieUniqueID:"+movieUniqueID);
		return movieUniqueID;
		
	}

	@Override
	public String formURLForIM(String movieName) {
		// TODO Auto-generated method stub
		movieName=movieName.replaceAll("\\s+","_");
		System.out.println("new name:   "+movieName);
		String url = IMDBContants.SUGGESTION_BASE_URL+movieName.charAt(0)+"/"+movieName+IMDBContants.SEARCH_EXTENSION;
		return url;
	}

	@Override
	public String getMoviePageByUniqueID(String uniqueID) {
		// TODO Auto-generated method stub
		
		String data = HTMLParser.parseHTMLFromURL(IMDBContants.TITLE_BASE_URL+uniqueID+IMDBContants.TITLE_URL_QSTR);
		return getMovieRank(data);
		
	}
	
	@Override
	public String getMovieRank(String parsedData) {
		
		String rating = IMDBContants.DEFAULT_RATING;
		 Scanner scanner = new Scanner(parsedData);
		  while (scanner.hasNextLine()) {
		    String line = scanner.nextLine();
		    if(line.contains("/10")) {
		    	rating=line.split("/10")[0];
		    	break;
		    }
		    }
		return rating;
		// TODO Auto-generated method stub
		
	}

}
