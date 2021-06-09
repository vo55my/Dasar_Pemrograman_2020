package pertemuan11.daspro2020;

import java.util.Scanner;

public class LatihanHitungGrade {

	/*
	 * kita akan mencoba menggunakan function untuk menghitung nilai grade mata kuliah
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nilai Praktikum : ");
		double praktikum = sc.nextDouble();
		System.out.print("Nilai UTS : ");
		double uts = sc.nextDouble();
		System.out.print("Nilai UAS : ");
		double uas = sc.nextDouble();
		
		double nilai = hitungNilaiAkhir(praktikum, uts, uas);
		System.out.print("Nilai Total = " + nilai + "\n Sehingga menghasilkan index ");
		hitungGrade(nilai);
	}
	
	public static double hitungNilaiAkhir (double praktikum, double uts, double uas) {
		double nilai = (praktikum * 30/100) + (uts * 30/100) + (uas * 40/100);
		return nilai;
	}
		
	public static void hitungGrade (double nilai) {
		if (nilai >= 80) {
			System.out.println("A");
		} else if (nilai >= 65) {
			System.out.println("B");
		} else if (nilai >= 50) {
			System.out.println("C");
		} else if (nilai >= 35) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}