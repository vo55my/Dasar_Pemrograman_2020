package edu.ifunpas.praktikum.daspro.latihan5;

import java.util.Scanner;

public class PrakE4_203040119 {

	static Scanner sc = new Scanner(System.in);
	
	public static void sapaDunia () {
		System.out.println("Hello Dunia");
	}
	
	public static void nilaiMhs (String a, int b, double c) {
		System.out.println("Nama Mahasiswa : " + a);
		System.out.println("Nilai Mahasiswa : " + b);
		System.out.println("IPK Mahasiswa : " + c);
	}
	
	public static void main (String [] args) {
		sapaDunia();
		System.out.print("Masukkan Nama : ");
		String nama = sc.next();
		System.out.print("Masukkan Nilai : ");
		int nilai = sc.nextInt();
		System.out.print("Masukkan IPK : ");
		double ipk = sc.nextDouble();
		nilaiMhs (nama, nilai, ipk);
	}
}