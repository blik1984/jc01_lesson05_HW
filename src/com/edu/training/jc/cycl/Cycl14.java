package com.edu.training.jc.cycl;

/**
 * Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */

public class Cycl14 {

	public static void main(String[] args) {

		int n = 25;
		double result = 0;

		for (int i = 1; i <= n; i++) {
			result = result + (double) 1 / i;
			System.out.println("1/" + i);
		}
		System.out.println(result);
	}
}
