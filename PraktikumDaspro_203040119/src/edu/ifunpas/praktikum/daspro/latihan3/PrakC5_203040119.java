package edu.ifunpas.praktikum.daspro.latihan3;

import java.util.Scanner;

public class PrakC5_203040119 {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Masukkan Nilai Akhir Kuliah : ");
		int nilai = sc.nextInt();
		
		if (nilai < 0 || nilai > 100) {
			System.out.println("Input Nilai antara 0 - 100");
		}
		
		if (nilai >= 85 && nilai <= 100) {
			System.out.println("LULUS");
			System.out.println("GRADE A");
		} else if (nilai >= 75 && nilai < 85) {
			System.out.println("LULUS");
			System.out.println("GRADE B");
		} else if (nilai >= 60 && nilai < 75) {
			System.out.println("LULUS");
			System.out.println("GRADE C");
		} else if (nilai >= 45 && nilai < 60) {
			System.out.println("GAGAL");
			System.out.println("GRADE D");
		} else {
			System.out.println("GAGAL");
			System.out.println("GRADE E");
		}
	}
}