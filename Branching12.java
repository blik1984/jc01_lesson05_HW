package com.edu.training.jc.cycl;

/**
 * Даны три действительных числа. Возвести в квадрат те из них, значения которых
 * неотрицательны, и в четвертую степень — отрицательные.
 */

public class Branching12 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = -0.65482;
		b = 687422525;
		c = 0;

		if (a >= 0) {
			a = a * a;
		} else {
			a = Math.pow(a, 4);
		}
		if (b >= 0) {
			b = b * b;
		} else {
			b = Math.pow(b, 4);
		}
		if (c >= 0) {
			c = c * c;
		} else {
			c = Math.pow(c, 4);
		}
		System.out.println(a + "\n" + b + "\n" +  c);
	}

}
