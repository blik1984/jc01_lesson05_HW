package com.edu.training.jc.cycl;
/**
 * Вычислить : 1+2+4+8+...+ 2 в 10 степени.
 */

public class Cycl15 {

	public static void main(String[] args) {
		int n = 2;
		int pow = 10;
		int sum = 0;
		for (int i = 0; i<=pow; i++) {
			sum = (int) (sum + Math.pow(n, i));
		}
		System.out.println(sum);
	}
}
