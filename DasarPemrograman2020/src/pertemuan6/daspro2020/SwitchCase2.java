package pertemuan6.daspro2020;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main (String [] args) {
		/*
		 * Switch case jika multi selection
		 * Contoh terdapat 7 bulan yang memiliki jumlah hari 31
		 * Sehingga 7 bulan tersebut bisa kita buat satu baris case
		 */
		
		Scanner sc = new Scanner(System.in);
		int bulan = sc.nextInt();
		
		switch (bulan) {
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12: System.out.println("Jumlah hari 31"); break;
		
		case 4: case 6:
		case 9: case 11: System.out.println("Jumlah hari 30"); break;
		
		case 2: System.out.println("Jumlah hari antara 28 atau 29 jika kabisat"); break;
		
		default: System.out.println("Bulan hanya ada 12"); break;
		}
	}
}