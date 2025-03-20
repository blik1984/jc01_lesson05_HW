package com.edu.training.jc.cycl;

/**
 * Даны целые числа n, m. Если числа не равны, то заменить каждое из них одним и
 * тем же числом, равным большему из исходных, а если равны, то заменить числа
 * нулями.
 */

public class Branching17 {

	public static void main(String[] args) {

		int n;
		int m;
		
		n = -88;
		m= -99;
		
		if (n==m) {
			n = 0;
			m = 0;
		} else if (n > m) {
			m = n;
		}else {
			n = m;
		}
		System.out.println("n = " + n + "\nm = " + m);
	}

}
