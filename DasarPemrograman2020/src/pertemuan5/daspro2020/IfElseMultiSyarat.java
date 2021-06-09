package pertemuan5.daspro2020;

import java.util.Scanner;

public class IfElseMultiSyarat {

	public static void main (String [] args) {
		
		/*
		 * Kita akan membuat pengkondisian if dengan multi syarat
		 * Multi Syarat = suatu blok yang memiliki syarat > 1
		 * akan menggunakan operator AND atau OR
		 * AND adalah operator yang dinyatakan true jika dan hanya jika semua syarat terpenuhi
		 * OR adalah operator yang dinyatakan true hanya dengan salah satu syarat terpenuhi
		 * AND -> &&
		 * OR -> ||
		 */
		
		Scanner sc = new Scanner(System.in);
		String username, password;
		username = sc.next();
		password = sc.next();
		
		if ((username.equalsIgnoreCase("admin")) && (password.equalsIgnoreCase("abcd1234"))) {
			System.out.println("Selamat Datang Admin");
		} else {
			System.out.println("Maaf, Username atau Password anda salah");
		}
		
		String jenisKelamin = sc.next();
		
		if ((username.equalsIgnoreCase("pria")) && (password.equalsIgnoreCase("wanita"))) {
			System.out.println("Berhasil");
		} else {
			System.out.println("Maaf, jenis kelamin anda tidak dikenali");
		}
	}
}