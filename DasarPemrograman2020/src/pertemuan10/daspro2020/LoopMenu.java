package pertemuan10.daspro2020;

import java.util.Scanner;

public class LoopMenu {

	/*
	 * kita akan membuat sebuah program yang akan menampilkan layanan menu
	 * menu tersebut akan seperti menu pada isi ulang pulsa
	 * menu nya adalah :
	 * 1. Isi ulang pulsa
	 * 2. isi ulang kuota internet
	 * 3. Paket internet
	 * 0. Keluar
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu = 1;
		while (menu != 0) {
			System.out.println("Silahkan pilih menu berikut : ");
			System.out.println("1. Isi ulang pulsa");
			System.out.println("2. isi ulang kuota internet");
			System.out.println("3. Paket internet");
			System.out.println("0. Keluar");
			menu = sc.nextInt();
			switch (menu) {
			case 1 : System.out.println("Isi ulang pulsa berhasil"); break;
			case 2 : System.out.println("Isi ulang kuota internet berhasil"); break;
			case 3 : System.out.println("Paket internet telah anda pilih"); break;
			case 4 : System.out.println("Selamat Tinggal"); break;
			default : System.out.println("Menu belum tersedia"); break;
			}
		}
	}
}