package com.coderscampus.lesson1;

public class Lesson1Application {

	public static void main(String[] args) {
			PhysicsTeacher physicsTeacher = new PhysicsTeacher();
			System.out.println(physicsTeacher.getClasses());
			System.out.println(physicsTeacher.getLevelOfEducation());
			physicsTeacher.teach("Ethan");
			System.out.println("-----");
			
			Teacher compSciTeacher = new CompSciTeacher();
			System.out.println(compSciTeacher.getClasses());
			System.out.println(compSciTeacher.getLevelOfEducation());
			compSciTeacher.teach();
			System.out.println("-----");
			
			Teacher quantumPhysicsTeacher = new QuantumPhysicsTeacher();
			System.out.println(quantumPhysicsTeacher.getClasses());
			System.out.println(quantumPhysicsTeacher.getLevelOfEducation());
			quantumPhysicsTeacher.teach();
	}

}
