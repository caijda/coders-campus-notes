package com.coderscampus.lesson1;

public class Teacher {
	private String classes;
	private String levelOfEducation;
	
	public Teacher(){
		System.out.println("Inside the Teacher constor");
		this.classes = "No classes assigned";
		this.levelOfEducation = "No education assigned";
	}
	
	public void teach() {
		System.out.println("I am a teacher and I teach!");
	}
	
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getLevelOfEducation() {
		return levelOfEducation;
	}
	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
}
