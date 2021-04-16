package edu.ifunpas.praktikum.daspro.latihan5;

import java.util.Scanner;

public class PrakE5_203040119 {

	static Scanner sc = new Scanner(System.in);
	static double PHI = 3.14;
	
	public static double luasLingkaran () {
		System.out.print("Masukkan Jari-Jari : ");
		double jari2 = sc.nextDouble();
		double luas = PHI * (jari2*jari2);
		return luas;
	}
	
	public static void main (String [] args) {
		double hasil = luasLingkaran();
		System.out.println(hasil);
	}
}