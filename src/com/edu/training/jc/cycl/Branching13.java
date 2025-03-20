package com.edu.training.jc.cycl;

/**
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 * которая из точек находится ближе к началу координат.
 */

public class Branching13 {

	public static void main(String[] args) {

		float xA;
		float yA;
		float xB;
		float yB;
		float distanceA;
		float distanceB;

		xA = 0;
		yA = -0;
		xB = -0;
		yB = 0;

		if (xA == 0) {
			distanceA = Math.abs(yA);
		} else if (yA == 0) {
			distanceA = Math.abs(xA);
		} else {
			distanceA = (float) Math.sqrt(xA * xA + yA * yA);
		}
		if (xB == 0) {
			distanceB = Math.abs(yB);
		} else if (yB == 0) {
			distanceB = Math.abs(xB);
		} else {
			distanceB = (float) Math.sqrt(xB * xB + yB * yB);
		}
		if (distanceA > distanceB) {
			System.out.println("Точка В находится ближе к началу координат");
		} else if (distanceA < distanceB) {
			System.out.println("Точка A находится ближе к началу координат");
		} else {
			System.out.println("Расстояния от обеих тчек до начала координат одинаковое");

		}
	}

}
