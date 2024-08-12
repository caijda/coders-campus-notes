package com.coderscampus.lesson1;

public class PhysicsTeacher extends Teacher {
	
		public PhysicsTeacher() {
			System.out.println("Inside the PhysicsTeacher constor");
			this.setClasses("Phys 101, Phys 201");
			this.setLevelOfEducation("Masters of Science");
		}
		
		public void teach() {
			System.out.println("I'm a physics teacher and I teach physics");
		}
		
		public void teach(String teacherName) {
			System.out.println("I'm a physics teacher called " + teacherName + " and I teach physics");
		}
}
