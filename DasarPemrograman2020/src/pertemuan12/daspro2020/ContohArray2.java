package pertemuan12.daspro2020;

import java.util.Scanner;

public class ContohArray2 {

	static String [] arrNama;
	// kita menyediakan sebuah array dengan nama arrNama, elemennya dari 0-4
	static Scanner sc = new Scanner(System.in);
	
	public static void initArray() {
		System.out.print("Masukkan jumlah index yang anda inginkan : ");
		int index = sc.nextInt();
		arrNama = new String [index];
	}
	
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
		initArray();
		inputNama();
		outputNama();
	}
}