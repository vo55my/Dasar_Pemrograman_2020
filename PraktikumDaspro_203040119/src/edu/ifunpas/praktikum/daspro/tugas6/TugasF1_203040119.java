package edu.ifunpas.praktikum.daspro.tugas6;

import java.util.Scanner;

public class TugasF1_203040119 {

	static Scanner sc = new Scanner(System.in);
	static int [] arrAngka;
	
	public static void inputOutput() {
		for (int angka = 0; angka < arrAngka.length; angka++) {
			System.out.print("Masukkan Angka ke - " + angka + " : ");
			arrAngka[angka] = sc.nextInt();
		}
		
		for (int hasil : arrAngka) {
			System.out.println("Angka : " + hasil);
		}
	}
		
	public static void hasilAkhir() {
	    int sum = 0;
	       
	    for (int num : arrAngka) {
	           sum = sum + num;
	   }
	    System.out.println("Jumlah dari semua elemen Array adalah " + sum);
	       
		if (sum % 2 == 0) {
            System.out.println("Angka " + sum + " adalah Bilangan Genap");
       } else {
            System.out.println("Angka " + sum + " adalah Bilangan Ganjil");
       }
	}
	
	public static void main (String [] args) {
		System.out.print("Masukkan Jumlah data yang akan diinput : ");
		int input = sc.nextInt();
		arrAngka = new int [input];
	
		inputOutput();
		hasilAkhir();
	}
}