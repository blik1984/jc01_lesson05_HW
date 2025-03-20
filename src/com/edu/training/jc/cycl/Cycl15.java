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
			int sum2 = 1;
			if(i == 0) {
				sum2 = 1;
			} else if(i ==1) {
				sum2 = n;
			}else {
				for(int k = 0; k<i; k++) {		//астрологи объявили неделю циклов
					sum2 = sum2 * n;
				}
			}
			sum = sum + sum2;
		}
		System.out.println(sum);
	}
}
