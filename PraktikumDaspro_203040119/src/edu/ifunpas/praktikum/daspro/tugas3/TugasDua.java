package edu.ifunpas.praktikum.daspro.tugas3;

import java.util.Scanner;

public class TugasDua {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");
		int angka = sc.nextInt();
		
		switch (angka) {
		case 00: System.out.println("Tengah Peuting"); break;
		case 1: System.out.println("Tumorek"); break;
		case 2: System.out.println("Janari Leutik"); break;
		case 3: System.out.println("Janari Gede"); break;
		case 4: System.out.println("Kongkorongok Hayam"); break;
		case 5: System.out.println("Balebat"); break;
		case 6: System.out.println("Carangcang Tihang"); break;
		case 7: System.out.println("Meletek Panon Poe"); break;
		case 8: System.out.println("Ngaluluh Taneuh"); break;
		case 9: System.out.println("Haneut Moyan"); break;
		case 10: System.out.println("Rumangsang"); break;
		case 11: System.out.println("Pecat Sawed"); break;
		case 12: System.out.println("Tangage"); break;
		case 13: System.out.println("Lingsir"); break;
		case 14: System.out.println("Kalangkang Satangtung"); break;
		case 15: System.out.println("Mengok"); break;
		case 16: System.out.println("Tunggang Gunung"); break;
		case 17: System.out.println("Sariak Layung"); break;
		case 18: System.out.println("Sareupna"); break;
		case 19: System.out.println("Harieum Beungeut"); break;
		case 20: System.out.println("Sareureuh Budak"); break;
		case 21: System.out.println("Tumoke"); break;
		case 22: System.out.println("Sareureuh Kolot"); break;
		case 23: System.out.println("Indung Peuting"); break;
		default: System.out.println("Angka diluar Wanci Sunda");
		}
	}
}