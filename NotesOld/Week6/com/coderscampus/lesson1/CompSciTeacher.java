package com.coderscampus.lesson1;

public class CompSciTeacher extends Teacher {

		public CompSciTeacher() {
			System.out.println("Inside the CompSciTeacher constor");
			this.setClasses("Comp 101, Comp 201");
			this.setLevelOfEducation("Bachelor of Science");
		}
}
