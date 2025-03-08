package com.edu.training.jc.cycl;

/**
 * С помощью оператора while напишите программу вывода всех четных чисел в
 * диапазоне от 2 до 100 включительно.
 */

public class Cycl04 {

	public static void main(String[] args) {

		int num = 0;

		while (num <= 100) {
			System.out.println(num);
			num = num + 2;
		}
	}

}
