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
		int prom;

		a = -9;
		b = 5;
		c = 0;
		k = 3;

		if (k == 0) {
			System.out.println("На ноль делить нельзя.");
			return;
		}
		prom = a / k * k;
		if (a == prom) {
			System.out.println("Число " + a + " делится на число " + k + " без остатка");
		}
		prom = b / k * k;
		if (b == prom) {
			System.out.println("Число " + b + " делится на число " + k + " без остатка");
		}
		prom = c / k * k;
		if (c == prom) {
			System.out.println("Число " + c + " делится на число " + k + " без остатка");
		}
	}

}
