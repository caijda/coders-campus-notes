package com.coderscampus.arraypractice;

public class Chores implements ToDoList {

	@Override
	public void addItem(String item) {
		toDo.add(item);
	}

	@Override
	public void displayList() {
		for(String item : toDo) {
			System.out.println(item);
		}
	}

	@Override
	public void updateItem(String oldItem, String newItem) {
		int i = 0;
		for(String item : toDo) {
			if (item.equals(oldItem)) {
				toDo.set(i, newItem);
			}
			i++;
		}
		displayList();
	}

	@Override
	public void removeItem(String item) {
		toDo.remove(item);
		displayList();
	}

}
