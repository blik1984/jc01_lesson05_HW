package com.edu.training.jc.cycl;

/**
 * С помощью оператора while напишите программу определения суммы всех нечетных
 * чисел в диапазоне от 1 до 99 включительно.
 */

public class Cycl05 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num < 100) {
			sum = sum + num;
			num = num + 2;
		}
		System.out.println(sum);
	}

}
