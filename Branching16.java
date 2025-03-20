package com.edu.training.jc.cycl;

/**
 * На плоскости ХОY задана своими координатами точка А. Указать, где она
 * расположена (на какой оси или в каком координатном угле).
 */

public class Branching16 {

	public static void main(String[] args) {

		double x;
		double y;

		x = 0;
		y = 7;

		if (x == 0 && y == 0) {
			System.out.println("Точка лежит в начале координат");
		} else if (x == 0) {
			System.out.println("Точка лежит на оси Х");
		} else if (y == 0) {
			System.out.println("Точка лежит на оси Y");
		} else if (x > 0 && y > 0) {
			System.out.println("Точка лежит в первой четверти");
		} else if (x < 0 && y > 0) {
			System.out.println("Точка лежит во второй четверти");
		} else if (x < 0 && y < 0) {
			System.out.println("Точка лежит в третьей четверти");
		} else if (x > 0 && y < 0) {
			System.out.println("Точка лежит в четвертой четверти");

		} else {
			System.out.println("Точка лежитно это не точно");

		}

	}

}
