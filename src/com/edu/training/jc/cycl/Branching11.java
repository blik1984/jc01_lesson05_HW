package com.edu.training.jc.cycl;

/**
 * Составить программу, которая определит площадь какого треугольника больше.
 */

public class Branching11 {

	public static void main(String[] args) {

		// Пускай треугольник задан длиной трёх сторон
		// Пускай строны заданы таким образом, что треугольник точно существует (сумма
		// двух сторон всегда больше третьей и все строны больше 0)

		double a1;
		double b1;
		double c1;
		double p1;
		double area1;
		double a2;
		double b2;
		double c2;
		double p2;
		double area2;
		a1 = 23.5;
		b1 = 26;
		c1 = 24;
		a2 = 19;
		b2 = 15.5;
		c2 = 14;
		p1 = (a1 + b1 + c1) / 2;
		p2 = (a2 + b2 + c2) / 2;
		area1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
		area2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));
		if (area1 == area2) {
			System.out.println("Площади треугольников равны");
		} else if (area1 > area2) {
			System.out.println("Площадь треугольника 1 больше");
		} else {
			System.out.println("Площадь треугольника 2 больше");
		}
	}
}
