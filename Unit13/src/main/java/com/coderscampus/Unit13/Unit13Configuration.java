package com.coderscampus.Unit13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.Unit13.domain.User;

@Configuration
public class Unit13Configuration {
	
	
		//for illustration purposes only for connections to a real-life database
//	@Bean
//	public Datasource datasource () {
//		Datasource db = new Datasource();
//		db.setconnectionString("https://gibberish.sd;lfkja;lskdjff");
//		db.setUsername("dev01blahblah");
//		
//		return db;
//	}
	
	@Bean
	public FileSerive fileservice () {
		return new FileService("test.txt");
	}

	@Bean
	public User user () {
		return new User("fae4ever@2kool4u.com", "asdfasdf", "fae");
	}
}
