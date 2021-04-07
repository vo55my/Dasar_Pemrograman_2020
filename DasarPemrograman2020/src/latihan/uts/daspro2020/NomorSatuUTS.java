package latihan.uts.daspro2020;

import java.util.Scanner;

public class NomorSatuUTS {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int panjang, tinggi, luas;
		
		System.out.print("Masukkan Panjang : ");
		panjang = sc.nextInt();
		System.out.print("Masukkan Tinggi : ");
		tinggi = sc.nextInt();
		
		luas = panjang * tinggi;
		System.out.println("Panjang = " + panjang);
		System.out.println("Tinggi = " + tinggi);
		System.out.println("Luas Persegi = " + luas);
	}
}