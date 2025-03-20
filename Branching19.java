package com.edu.training.jc.cycl;

/**
 * Подсчитать количество положительных среди чисел а, b, с.
 */

public class Branching19 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int count;

		a = -9;
		b = 9;
		c = 0;
		count = 0;

		if (a >= 0) {
			count++;
		}
		if (b >= 0) {
			count++;
		}
		if (c >= 0) {
			count++;
		}
		System.out.println(count);

	}

}
