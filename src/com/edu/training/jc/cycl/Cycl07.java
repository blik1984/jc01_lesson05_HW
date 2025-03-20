package com.edu.training.jc.cycl;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h
 */

public class Cycl07 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;

		a = -18; // считаем что отрезок всегда идёт из отрицательного в положительное и шаг
					// положительный
		b = 9;
		h = 0.5;

		for (double i = a; i <= b; i = i + h) {
			if (i <= 2) {
				System.out.println(-1 * i);
			} else {
				System.out.println(i);
			}
		}
	}
}
