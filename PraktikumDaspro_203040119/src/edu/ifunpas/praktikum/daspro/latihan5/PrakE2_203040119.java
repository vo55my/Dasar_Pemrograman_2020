package edu.ifunpas.praktikum.daspro.latihan5;

import java.util.Scanner;

public class PrakE2_203040119 {

	static Scanner sc = new Scanner(System.in);
			
	public static void sapaDunia () {
		System.out.println("Hello Dunia");
	}
	
	public static void tulisNama () {
		System.out.print("Masukkan Nama : ");
		String nama = sc.next();
		System.out.println("Nama Saya Adalah " + nama);
	}
	
	public static void main (String [] args) {
		sapaDunia();
		tulisNama();
	}
}