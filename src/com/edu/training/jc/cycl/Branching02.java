package com.edu.training.jc.cycl;

/**
 * Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на
 * экран слово «yes», в противном случае – слово «no»
 */

public class Branching02 {

	public static void main(String[] args) {
		
		int num1 = -455;
		int num2 = -8741618;

		if (num1 < num2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
