package edu.ifunpas.praktikum.daspro.latihan5;

import java.util.Scanner;

public class PrakE3_203040119 {

	static Scanner sc = new Scanner(System.in);
	
	public static void sapaDunia () {
		System.out.println("Hello Dunia");
	}
	
	public static void tulisNama (String a) {
		System.out.println("Nama Saya Adalah " + a);
	}
	
	public static void main (String [] args) {
		sapaDunia();
		System.out.print("Masukkan Nama : ");
		String nama = sc.next();
		tulisNama(nama);
	}
}