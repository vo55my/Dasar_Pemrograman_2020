package pertemuan12.daspro2020;

import java.util.Scanner;

public class ContohArray1 {

	/*
	 * Array
	 * adalah struktur data linier atau berurutan
	 * data -> banyak nilai
	 * 
	 * format penulisan akan mirip dengan pembuatan variabel
	 * variabel : 
	 * <tipedata> <nama> = <nilai>;
	 * 
	 * array : 
	 * <tipedata> [] <nama> = new <tipedata> [index];
	 * 
	 * tipedata : String, int, float, double, dkk
	 * 
	 * kita akan buat contoh untuk membuat array yang mengelola nilai nama mahasiswa
	 */
	
	static String [] arrNama = new String [5];
	// kita menyediakan sebuah array dengan nama arrNama, elemennya dari 0-4
	static Scanner sc = new Scanner(System.in);
	
	public static void inputNama() {
		for (int elm = 0; elm < arrNama.length; elm++) {
			System.out.print("Masukkan Nama Mahasiswa ke - " + elm + " : ");
			arrNama[elm] = sc.next();
		}
	}
	
	public static void outputNama() {
		for (int elm = 0; elm < arrNama.length; elm++) {
			System.out.println("Nama Mahasiswa ke - " + elm + " adalah " + arrNama[elm]);
		}
	}
	
	public static void main (String [] args) {
		inputNama();
		outputNama();
	}
}