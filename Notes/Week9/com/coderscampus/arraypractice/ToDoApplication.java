package com.coderscampus.arraypractice;

public class ToDoApplication {

	public static void main(String[] args) {
		Chores chores = new Chores();
		
		chores.addItem("Wash Dishes");
		chores.addItem("Fold Laundry");
		chores.addItem("Code for an Hour");
		chores.displayList();
		
		chores.removeItem("Wash Dishes");
		
		chores.updateItem("Code for an Hour", "Code All Day");
	}

}
