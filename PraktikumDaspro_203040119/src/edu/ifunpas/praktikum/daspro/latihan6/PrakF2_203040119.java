package edu.ifunpas.praktikum.daspro.latihan6;

import java.util.Scanner;

public class PrakF2_203040119 {

	public static void main (String [] args) {
		String [] arrNRP = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for (int indeks = 0 ; indeks < arrNRP.length ; indeks++) {
			System.out.print("Masukkan NRP : ");
			arrNRP[indeks] = sc.next();
		}
		
		for (int indeks = 0 ; indeks < arrNRP.length ; indeks++) {
			System.out.println("NRP : " + arrNRP[indeks]);
		}
	}
}