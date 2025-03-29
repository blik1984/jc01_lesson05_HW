package com.edu.training.jc.cycl;

/**
 * Определить, делителем каких чисел а, b, с является число k.
 */

public class Branching20 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int k;

		a = -9;
		b = 5;
		c = 0;
		k = 3;

		if (k == 0) {
			System.out.println("На ноль делить нельзя.");
			return;
		}
		if (a%k == 0) {
			System.out.println("Число " + a + " делится на число " + k + " без остатка");
		}
		if (b%k == 0) {
			System.out.println("Число " + b + " делится на число " + k + " без остатка");
		}
		if (c%k == 0) {
			System.out.println("Число " + c + " делится на число " + k + " без остатка");
		}
	}

}
