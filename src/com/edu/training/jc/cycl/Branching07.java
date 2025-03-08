package com.edu.training.jc.cycl;

/**
 * Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
 * значениях a, b, c и х
 */

public class Branching07 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double x;
		double ans;

		a = 1;
		b = 69;
		c = -69;
		x = 0;

		if (x == 0) { // в задачах на ветвления используем их максимально
			ans = c;
		} else {
			ans = Math.abs(a * x * x + b * x + c);
		}

		if (ans < 0) {
			ans = ans * -1;
		}

		System.out.print("Итог = " + ans);
	}
}
