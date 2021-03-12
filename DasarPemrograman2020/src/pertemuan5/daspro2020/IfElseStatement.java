package pertemuan5.daspro2020;

import java.util.Scanner;

public class IfElseStatement {

	public static void main (String [] args) {
		/*
		 * Kita akan membuat contoh program dua cause effect
		 * Sehingga menggunakan if else dengan format :
		 * if (boolean expression) {
		 *  Statement yang akan dieksekusi jika true
		 *  } else {
		 *  Statement yang akan dieksekusi jika false
		 *  }
		 */
		
		Scanner sc = new Scanner(System.in);
		int nilai;
		nilai = sc.nextInt();
		
		if (nilai > 60) { // Himpunan dari 61 - n
			System.out.println("Anda Lulus");
		} else {
			System.out.println("Maaf, Anda Belum Lulus");
		}
	}
}