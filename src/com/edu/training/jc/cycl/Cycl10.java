package com.edu.training.jc.cycl;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycl10 {

	public static void main(String[] args) {
		long sum = 1;

		for (int i = 1; i <= 200; i++) { // ноль всё ещё число, но если его брать, то и считать ничего не нужно.
			if (Long.MAX_VALUE / (i * i) > sum) {
				sum = sum * (i * i);
			} else {
				System.out
						.print("Авария, мы такое не умеем посчитать. Досчитали до числа " + (i-1) + " и получилось у нас ");
				break;
			}
		}
		System.out.println(sum);
	}
}
