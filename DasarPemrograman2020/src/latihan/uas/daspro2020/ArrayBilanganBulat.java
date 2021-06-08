package latihan.uas.daspro2020;

import java.util.Scanner;

public class ArrayBilanganBulat {

	static int [] arrAngka = new int [10];
	static Scanner sc = new Scanner(System.in);
	
	public static void inputAngka() {
		for (int angka = 0; angka < arrAngka.length; angka++) {
			System.out.print("Masukkan Angka ke - " + angka + " : ");
			arrAngka[angka] = sc.nextInt();
		}
	}
	
	public static void outputAngka() {
		System.out.println("");
		for (int angka = 0; angka < arrAngka.length; angka++) {
			System.out.println("Angka ke - " + angka + " adalah " + arrAngka[angka]);
		}
	}
	
	public static void cariArray() {
		
	}
	
	public static void main (String [] args) {
		inputAngka();
		outputAngka();
	}
}