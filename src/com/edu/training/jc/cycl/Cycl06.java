package com.edu.training.jc.cycl;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Cycl06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		long sum = 0;

		System.out.println("Введите  число");
		while (num <= 0) {
			while (!sc.hasNextInt()) { // для того чтобы работало для ЛЮБОГО числа нужно BigInteger использовать или
										// самим сочинять сложение огромных чисел через какой-нибудь arrayList, а мы
										// такого ещё не знаем
				System.out.println("Ввод неверный. Введите число ");
				sc.nextLine();
			}
			num = sc.nextInt();
			sc.nextLine();
			if (num < 0) {
				System.out.println("Ввод неверный. Введите числo ");
			}
		}

		for (int i = 1; i < num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
