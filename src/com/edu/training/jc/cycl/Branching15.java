package com.edu.training.jc.cycl;

/**
 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
 * чисел заменить половиной их суммы, а большее — их удвоенным произведением.
 */

public class Branching15 {

	public static void main(String[] args) {

		double a;
		double b;
		double halfSum;
		double doubleProduct;

		a = 66;
		b = -65.33;

		halfSum = (a + b) / 2;
		doubleProduct = a * b * 2;
		if (a < b) {
			a = halfSum;
			b = doubleProduct;
		} else {
			b = halfSum;
			a = doubleProduct;
		}
		System.out.println("a = " + a + ",\nb = " + b + ".");
	}

}
