package edu.ifunpas.praktikum.daspro.latihan3;

import java.util.Scanner;

public class PrakC2_203040119 {

	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan Nilai : ");
		int nilai = sc.nextInt();
		
		if (nilai > 60) {
			System.out.println("Selamat Anda Lulus");
		} else {
			System.out.println("Maaf, Anda Harus Mengulang");
		}
	}
}