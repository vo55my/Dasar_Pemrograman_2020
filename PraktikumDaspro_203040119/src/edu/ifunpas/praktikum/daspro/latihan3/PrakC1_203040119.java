package edu.ifunpas.praktikum.daspro.latihan3;

import java.util.Scanner;

public class PrakC1_203040119 {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Masukkan Nilai : ");
		int nilai = sc.nextInt();
		
		if (nilai > 90) {
			System.out.println("Selamat Anda Mendapatkan Nilai A");
		}
	}
}