package com.shadab.imdb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.shadab.imdb")
public class IMDBAppStarter {
	
	public static void main(String[] args) {
		SpringApplication.run(IMDBAppStarter.class,args);
	}

}
