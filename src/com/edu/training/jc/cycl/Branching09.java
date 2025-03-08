package com.edu.training.jc.cycl;

/**
 * Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
 * равносторонним.
 */

import java.util.Scanner;

public class Branching09 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] nums = new double[3];

		for (int i = 1; i < 4; i++) {
			System.out.println("Введите  длину стороны " + i + ": ");
			while (!sc.hasNextDouble()) {
				System.out.println("Ввод неверный. Введите число ");
				sc.nextLine();
			}

			nums[i - 1] = sc.nextDouble();
		}
		if (nums[0] == nums[1] && nums[0] == nums[2]) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник неравносторонний");

		}

	}

}
