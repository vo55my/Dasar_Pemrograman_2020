package pertemuan8.daspro2020;

import java.util.Scanner;

public class PengulanganNama {
	
	/*
	 * Program menampilkan nama sebanyak n x karena nama dan banyak pengulangan diinput dari keyboard
	 * 
	 * start = 1
	 * finish = <= n (input keyboard)
	 * process = increment
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Masukan Nama Anda : ");
//		String nama = sc.nextLine();
		System.out.print("Akan Berapa kali Berulang : ");
		int n = sc.nextInt();
		String nama;
		for (int a = 1; a <= n; a++) {
			System.out.print("Masukan Nama Anda : ");
			nama = sc.next();
			System.out.println(nama);
		}
	}
}