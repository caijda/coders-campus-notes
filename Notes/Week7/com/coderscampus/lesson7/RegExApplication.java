package com.coderscampus.lesson7;

public class RegExApplication {

	public static void main(String[] args) {
		//"valid" email address: fake.email@gmail.com
		//invalid email address: trevorcraftycodr.com
		//invalid email address: trevor@crafycodr.thisisntarealdomain
		//valid email address: trevor@craftycodr.com
		//valid email address: trevor.page.2@gmail.com
		
		String input = "fake.email@gmail.com";
		boolean matchFound = input.matches("");
		
		System.out.println(matchFound);
	}

}
