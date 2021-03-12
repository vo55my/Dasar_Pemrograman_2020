package pertemuan6.daspro2020;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main (String [] args) {
		/*
		 * Membuat layanan menu pembelian paket internet
		 * Menggunakan switch case
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan menu yang ingin anda pilih");
		System.out.println("1. Paket Internet");
		System.out.println("2. Paket Sosmed");
		System.out.println("3. Paket Belajar");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Paket Internet");
			break;
		case 2:
			System.out.println("Paket Sosmed");
			break;
		case 3:
			System.out.println("Paket Belajar");
			break;
		default:
			System.out.println("Menu ini tidak ada");
			break;
		}
	}
}