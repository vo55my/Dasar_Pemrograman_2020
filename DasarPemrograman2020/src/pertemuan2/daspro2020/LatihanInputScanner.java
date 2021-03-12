package pertemuan2.daspro2020;

import java.util.Scanner;

public class LatihanInputScanner {

	public static void main (String [] args) {
	/*
	 * Inputan Scanner
	 * Merupakan inputan keyboard yang lebih modern dari BufferedReader
	 * Utility yang lengkap menyesuaikan tipe data yang digunakan
	 * 
	 * Kapasitas Buffering 1kb
	 * Punya permasalahan menerima inputan spasi
	 * Keamanan kurang aman, tidak diwajibkan menggunakan try catch blok
	 */
	
	Scanner scInput = new Scanner(System.in);
	
	String sNRP, sNama;
	int iNilai;
	double dIPK;
	
//	sNRP = scInput.next();
	sNama = scInput.nextLine();
//	iNilai = scInput.nextInt();
//	dIPK = scInput.nextDouble();
	
//	System.out.println("NRP : " + sNRP + "Nama : " + sNama + "Nilai : " + iNilai + "IPK : " + dIPK);
	
	System.out.println(sNama);
	}
}