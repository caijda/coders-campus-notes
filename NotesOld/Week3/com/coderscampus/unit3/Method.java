package com.coderscampus.unit3;

public class Method {
	int input; 
	
	Integer getInt(String input) {
		this.input = Integer.parseInt(input);
		
		if (this.input > 50 && this.input < 300) {
			return this.input;
		} else {
			return null;
		}
	}
}
