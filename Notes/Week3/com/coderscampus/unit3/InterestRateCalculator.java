package com.coderscampus.unit3;

public class InterestRateCalculator {
	
	void calculator(Double investment, Double interestRate) {
		for (int i = 0; i < 30; i++) {
			investment = investment*(interestRate + 1.0);
			if ((i + 1) % 5 == 0) {
				System.out.println("After " + (i + 1) + " years, you would have: " + investment);
			}
		}
	}
}
