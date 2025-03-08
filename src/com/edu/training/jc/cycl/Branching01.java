package com.edu.training.jc.cycl;

/**
 * Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на
 * экран цифру 7, в противном случае – цифру 8.
 */

public class Branching01 {

	public static void main(String[] args) {

		int num1 = -455;
		int num2 = -8741618;

		if (num1 < num2) {
			System.out.println("7");
		} else {
			System.out.println("8");
		}

	}

}
