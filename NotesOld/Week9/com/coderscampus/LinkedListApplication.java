package com.coderscampus;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {
	
	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<Integer>();
		
		//LinkedList
		//Head = 1
		//Tail = 0
		// (10
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		printList(numbers);
		
		numbers.remove(0);
		printList(numbers);
		
		numbers.remove((Integer)30);
		printList(numbers);
		
	}

	private static void printList(List<Integer> numbers) {
		for(Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("");
	}
	
}
