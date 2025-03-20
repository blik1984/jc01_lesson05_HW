package com.edu.training.jc.cycl;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 */

public class Branching14 {

	public static void main(String[] args) {

		int angle1; // считаем что углы даны в целых градусах без минут и секунд.
					// каждый угол не больше 360 градусов и его не нужно приводить в нормальный вид
		int angle2;

		angle1 = 50;
		angle2 = 90;
		if ((angle1 + angle2) >= 180 || angle1 == 0 || angle2 == 0) {
			System.out.println("Такго треугольника не существует");
		} else if ((angle1 + angle2) == 90 || angle1 == 90 || angle2 == 90) {
			System.out.println("Такой треугольник существует и он прямоугольный");
		} else {
			System.out.println("Такой треугольник существует");
		}
	}

}
