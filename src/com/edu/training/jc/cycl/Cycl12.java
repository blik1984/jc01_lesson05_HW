package com.edu.training.jc.cycl;

/**
 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1
 * Составьте программу нахождения произведения первых 10 членов этой
 * последовательности.
 */

public class Cycl12 {

	public static void main(String[] args) {

		int a = 1;
		long sum = 1L;
		int prom = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(a);
			prom = a;
			sum = sum * prom;
			a = prom + 6;
		}
		System.out.println(sum);
	}

}
