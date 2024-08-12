package com.coderscampus.unit3;

import java.util.Scanner;
//import java.util.Random;

public class Unit3 {

	public static void main(String[] args) {
		// Exercises
//		System.out.println("Type a number between 50 and 300:");

		// Creating a Method exercise
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		Method method = new Method();
//		scanner.close();

		// Loop Until Valid Input is Received exercise.
//		Loop method = new Loop();
//		method.setInt();

//		System.out.println("The number you typed in was: " + method.getInt());

		//Random number generation
//		Random random = new Random();
//
//		for (int i = 0; i < 20; i++) {
//			System.out.println("Random number is " + random.nextInt(10));
//		}
		
		//Compound interest calculator
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your starting investment:");
		String  stringInvestment = scanner.nextLine();
		System.out.println("Type in your interest rate:");
		String stringInterestRate = scanner.nextLine();
		
		Double investment = Double.parseDouble(stringInvestment);
		Double interestRate = Double.parseDouble(stringInterestRate);
		
		InterestRateCalculator calculator = new InterestRateCalculator();
		
		calculator.calculator(investment, interestRate);
		scanner.close();
	}
}
