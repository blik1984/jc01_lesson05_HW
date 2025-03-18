package com.edu.training.jc.cycl;

/**
 * Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */

public class Branching08 {

	public static void main(String[] args) {

		int num1 = -455;
		int num2 = 8741618;

		if (Math.abs(num1) > (Integer.MAX_VALUE / Math.abs(num1)) || Math.abs(num2) > (Integer.MAX_VALUE / Math.abs(num2))) {
			System.out.println("Посчитать невозможно");
		} else if (num1 == num2) {
			System.out.println("Числа равны");
		} else if (num1 * num1 < num2 * num2) {
			System.out.println("Квадрат числа  " + num1 + " наименьшйи"); // другой вариант это взять модули чисел и сравнить их
		} else {
			System.out.println("Квадрат числа  " + num2 + " наименьшйи");
		}

	}

}
