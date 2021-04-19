package edu.ifunpas.praktikum.daspro.tugas5;

import java.util.Scanner;

public class TugasSatu {

static Scanner sc = new Scanner(System.in);
	
	public static int penjumlahan (int a, int b) {
		int hasil = 0;
		hasil = a + b;
		
		return hasil;
	}
	
	public static int pengurangan (int a, int b) {
		int hasil = 0;
		hasil = a - b;
		
		return hasil;
	}
	
	public static int perkalian (int a, int b) {
		int hasil = 0;
		hasil = a * b;
		
		return hasil;
	}
	
	public static double pembagian (int a, int b) {
		double hasil = 0;
		hasil = a / b;
		
		return hasil;
	}
	
	public static double modulus (int a, int b) {
		double hasil = 0;
		hasil = a % b;
		
		return hasil;
	}
	
	public static String menu () {
		String pilihan = "";
		System.out.println("Selamat Datang di Kalkulator Sederhana ini");
		System.out.println("Silahkan memilih menu berikut : ");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println("5. Modulus");
		System.out.println("99. Keluar (Ketik 99)");
		System.out.println("Menu apakah yang akan anda pilih?");
		
		pilihan = sc.next();
		return pilihan;
	}
	
	public static void main (String [] args) {
		String sMenu = menu();
		int pilihan = 1;
		int hasil = 0;
		double dHasil = 0;
		
		
		while (pilihan != 99) {
			System.out.print("Masukkkan Angka 1 = ");
			int angka1 = sc.nextInt();
			System.out.print("Masukkkan Angka 2 = ");
			int angka2 = sc.nextInt();
			switch (sMenu) {
		case "1":
			hasil = penjumlahan (angka1, angka2);
			System.out.println("Hasil = " + hasil);
			System.out.println("");
			break;
		case "2":
			hasil = pengurangan (angka1, angka2);
			System.out.println("Hasil = " + hasil);
			System.out.println("");
			break;
		case "3":
			hasil = perkalian (angka1, angka2);
			System.out.println("Hasil = " + hasil);
			System.out.println("");
			break;
		case "4":
			dHasil = pembagian (angka1, angka2);
			System.out.println("Hasil = " + dHasil);
			System.out.println("");
			break;
		case "5":
			dHasil = modulus (angka1, angka2);
			System.out.println("Hasil = " + dHasil);
			System.out.println("");
			break;
		case "99":
			System.out.println("Selamat Tinggal");
			System.out.println("");
			break;
		default:
			System.out.println("Tidak Tersedia");
			break;
			}
		}
	}
}