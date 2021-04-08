package edu.ifunpas.praktikum.daspro.latihan4;

public class PrakD4_203040119 {

	public static void main (String [] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}