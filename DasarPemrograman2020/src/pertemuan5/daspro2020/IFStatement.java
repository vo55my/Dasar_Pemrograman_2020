package pertemuan5.daspro2020;

import java.util.Scanner;

public class IFStatement {

	public static void main (String [] args) {
		/*
		 * Kita akan membuat contoh program satu cause effect
		 * Sehingga menggunakan if dengan format :
		 * if (boolean expression) {
		 *  Statement yang akan dieksekusi jika true
		 *  }
		 */
		
		Scanner sc = new Scanner(System.in);
		int nilai;
		nilai = sc.nextInt();
		
		if (nilai > 60) {
			System.out.println("Anda Lulus");
		}
	}
}