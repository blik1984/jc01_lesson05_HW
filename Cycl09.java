package com.edu.training.jc.cycl;

/**
 * Найти сумму квадратов первых ста чисел.
 */

public class Cycl09 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 100; i++) { // ноль число, потому начинаем от ноля и тогда число 100 не попадает в эту
										// сумму.
			sum = sum + i * i;
		}
		System.out.println(sum);
	}
}
