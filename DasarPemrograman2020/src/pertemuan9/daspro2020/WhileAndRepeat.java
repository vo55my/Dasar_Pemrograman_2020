package pertemuan9.daspro2020;

import java.util.Scanner;

public class WhileAndRepeat {

	/*
	 * while dan repeat (do while) memiliki karakteristik yang sama
	 * dibedakan dari letak pengecekan syarat
	 * while diawal (sebelum mengeksekusi statement)
	 * do while diakhir (setelah mengeksekusi statement)
	 * 
	 * format : 
	 * do {
	 * 		statement
	 * 		baris statement pengubah, agar memungkinkan berhenti pengulangan
	 * } while (syarat);
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int angkatan = sc.nextInt();
		while (angkatan == 2020) {
			System.out.println("Angkatan 2020 da best");
			angkatan = sc.nextInt();
		}
		
		System.out.println("----------REPEAT---------");
		
		do {
			System.out.println("Angkatan 2020 da best");
			angkatan = sc.nextInt();
		} while (angkatan == 2020);
	}
}