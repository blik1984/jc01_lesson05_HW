package com.edu.training.jc.cycl;

/**
 * Составить программу, которая определит площадь какого круга меньше.
 */

public class Branching10 {

	public static void main(String[] args) {

		double r1; // в задании не сказано как задаются размеры круга, будем считать что дан радиус
		double r2;
		
		r1 = 9;
		r2 = 3.3;

		if (r1 < r2) {
			System.out.print("Площадь круга 1 меньше");
		} else {
			System.out.print("Площадь круга 2 меньше");
		}
	}
}
