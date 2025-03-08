package com.edu.training.jc.cycl;

import java.util.Scanner;

/**
 * Составить программу сравнения введенного числа а и цифры 3. Вывести на экран
 * слово «yes», если число а меньше 3; если больше, то вывести слово «no».
 */

public class Branching03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num1 = 3;
		double num2;
		
		System.out.println("Введите  число: ");
		
		while (!sc.hasNextDouble()) {
			System.out.println("Ввод неверный. Введите число ");
			sc.nextLine();
		}
		
		num2 = sc.nextDouble();
		
		if (num1 > num2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}

}
