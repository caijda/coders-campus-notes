package com.coderscampus.unit5;

public class Human {
	//class variable
	static int TEENAGER_AGE = 13;
	static int ADULT_AGE = 19;
	static int SENIOR_AGE = 65;
	//instance variable
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 130 || age < 0) {
			System.out.println("No, that is not a valid age, please set age between 0 and 130.");
			return;
		}
		this.age = age;
	}
	
	public String getStageOfLife() {
		if (age < TEENAGER_AGE) {
			return "Child";
		} else if (age < ADULT_AGE) {
			return "Teenager";
		}else if (age < SENIOR_AGE) {
			return "Adult";
		}else {
			return "Senior";
		}
	}
}
