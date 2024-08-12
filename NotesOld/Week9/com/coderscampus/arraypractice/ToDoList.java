package com.coderscampus.arraypractice;

import java.util.ArrayList;
import java.util.List;

public interface ToDoList {
	public List<String> toDo = new ArrayList<String>();
	
	public void addItem(String item);
	public void displayList();
	public void updateItem(String oldItem, String newItem);
	public void removeItem(String item);
}
