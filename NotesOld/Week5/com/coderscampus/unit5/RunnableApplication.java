package com.coderscampus.unit5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RunnableApplication {
	// static belongs to the class, not an instantiation of the class
	// non-static belongs to the instance of the class, not the class itself
	int someNumber = 10;

	public static void main(String[] args) throws IOException {
//		RunnableApplication staticObject = new RunnableApplication();
//		
//		if (staticObject.someNumber > 11) {
//			System.out.println("Say something");
//		}
//		
//		Human aChild = new Human();
//		aChild.age = 12;
//		System.out.println(aChild.getStageOfLife());
//		
//		Human anAdult = new Human();
//		anAdult.age = 19;
//		System.out.println(anAdult.getStageOfLife());

//		Human ashleyMay = new Human();
//		ashleyMay.setAge(-1);
//		ashleyMay.setAge(150);
//		ashleyMay.setAge(28);
//		System.out.println(ashleyMay.getStageOfLife());

//		UserService userService = new UserService();
//		User ashleyUser = userService.createUser("ashley@craftycodr.com", "password123");
//		System.out.println(ashleyUser);

		// Arrays allow us to store multiple objects or primatives into one variable
		// note: an array is a type of Data structure

//		UserService userService = new UserService();
//		User[] users = new User[13];
//		
//		for (int i = 0; i < 13; i++) {
//			users[i] = userService.createUser("user" + (i+1), "password" + (i+1));
//		}

//		UserService userService = new UserService();
//		UserPOJO newUserPOJO = new UserPOJO(null, null, null);
//		String[] input = new String[3];
//		input[0] = "aUsernameHere";
//		input[1] = "aPasswordHere";
//		input[2] = "sombodiesName";
//		newUserPOJO = userService.createUserPOJO(input);

//		for(String arg:args) {
//			System.out.println(arg);
//			
//		String[] numbersArray = arg.split(",");
//			for (String number: numbersArray) {
//				System.out.println(number);
//			}
//		}

//		UserService userService = new UserService();
//		String input = "exampleUsername,examplePassword,exampleName";
//		String[] array = userService.parseText(input);

		// Exception Example
//		String someString = null;
//		try {
//			String[] stringArray = someString.split(",");
//			System.out.println(stringArray);
//		} catch (NullPointerException e) {
//			System.out.println("Oops, there was a null pointer exception");
//		}

		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line;
			while ((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			System.out.println("Closing file reader");
			fileReader.close();
		}
	}
}
