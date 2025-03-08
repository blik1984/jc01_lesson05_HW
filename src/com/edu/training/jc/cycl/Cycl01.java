package com.edu.training.jc.cycl;

/**
 * Необходимо вывести на экран числа от 1 до 5.
 */

public class Cycl01 {

	public static void main(String[] args) {

		int num = 0;

		while (num < 1 || num > 4) {
			num = (int) (10.0 * Math.random());
		}
		if (num == 1) {
			for (int i = 1; i < 5; i++) {
				System.out.print(i);
			}
		} else if (num == 2) {
			int[] nums = { 1, 2, 3, 4 };
			for (int nm : nums) {
				System.out.print(nm);
			}
		} else if (num == 3) {
			int x = 1;
			do {
				System.out.print(x);
				x++;
			} while (x < 5);
		} else if (num == 4) {
			int x = 1;
			while (x < 5) {
				System.out.print(x);
				x++;
			}
		}
		System.out.print("     - способ №" + num);
	}
}
