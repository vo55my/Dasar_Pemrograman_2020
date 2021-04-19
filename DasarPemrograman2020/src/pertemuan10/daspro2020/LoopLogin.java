package pertemuan10.daspro2020;

import java.util.Scanner;

public class LoopLogin {

	/*
	 * Membuat program login ATM (Pin ATM)
	 * dimana rule nya adalah :
	 * 1. Akan diberi kesempatan untuk mengisi sebanyak 3x percobaan
	 * 2. Jika langsung memasukkan pin yang benar, maka akan keluar dari pengulangan
	 * 3. Jika salah hingga 3x maka akan terjadi pemblokiran
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int pin;
		int loop = 0;
		for (; loop < 3; loop++) {
			System.out.print("Masukkan PIN anda : ");
			pin = sc.nextInt();
			if (pin == 123456) {
				System.out.println("Anda Terverifikasi");
				break;
			}
			System.out.println("Pin anda belum benar, Silahkan mencoba kembali");
		}
		if (loop == 3) {
			System.out.println("Kartu anda telah terblokir");
		}
	}
}