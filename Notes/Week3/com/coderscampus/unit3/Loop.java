package com.coderscampus.unit3;

import java.util.Scanner;

public class Loop {
	int input;
	
	void setInt () {	
		Scanner scanner = new Scanner(System.in);
		this.input = scanner.nextInt();
		
		while (input < 50 || input > 300) {
			System.out.println("Oops, that number wasn't between 50 and 300, try again:");
			input = scanner.nextInt();
		}
		
		scanner.close();
	}
	
	Integer getInt() {
		return input;
	}
}
