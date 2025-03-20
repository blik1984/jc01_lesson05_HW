package com.edu.training.jc.cycl;

/**
 * Составить таблицу значений функции y = 5 - x 2 /2 на отрезке [-5; 5] с шагом
 * 0.5.
 */

public class Cycl13 {

	public static void main(String[] args) {
		System.out.println("x    y");
		for (double i = -5; i <= 5;) {
			double k = 5 - (i * i / 2);
			System.out.println(i + "    " + k);
			i = i + 0.5;
		}
	}

}
