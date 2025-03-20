package com.edu.training.jc.cycl;

/**
 * Составить программу нахождения разности кубов первых двухсот чисел
 */

public class Cycl11 {

	public static void main(String[] args) {

		long sum = 0;

		for (int i = 1; i <= 200; i++) {
			sum = sum - (i * i * i);
		}
		System.out.println(sum);

	}

}
