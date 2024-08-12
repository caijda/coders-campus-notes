package com.coderscampus.lesson5;

public class Person implements Comparable<Person> {
	private String name;
	private Integer height;
	
	public Person (String name, Integer height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}

	@Override
	public int compareTo(Person that) {
		//Ascending height
//		if (this.height.compareTo(that.height) == 0) {
//			return this.name.compareTo(that.name);
//		}else {
//			return this.height.compareTo(that.height);
//		}
		
		//Descending height
		if (this.height.compareTo(that.height) == 0) {
			return this.name.compareTo(that.name); //name in ascending order
		}else {
			return that.height.compareTo(this.height); //height in descending order
		}
		
		//this is another way to solve the sorting problem, its just more code.
//		if (this.height > that.height) {
//			return -1;
//		}else if (this.height.equals(that.height)) {
//			return this.name.compareTo(that.name);
//		} else {
//			return 1;
//		}
	}
}
