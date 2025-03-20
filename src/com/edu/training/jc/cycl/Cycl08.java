package com.edu.training.jc.cycl;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h
 */

public class Cycl08 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double h;

		a = -18; // считаем что отрезок всегда идёт из отрицательного в положительное и шаг
					// положительный
		b = 17;
		c = 2;
		h = 0.5;

		for (double i = a; i <= b; i = i + h) {
			if (i != 15) {
				System.out.println(i - c + 6); // порядок изменён относительно задания, т.к. 15 встречаться будет 1 раз
												// и незачем каждый раз это проверять
			} else {
				System.out.println((i + c) * 2);
			}
		}
	}
}
