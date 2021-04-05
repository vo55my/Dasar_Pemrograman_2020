package pertemuan8.daspro2020;

import java.util.Scanner;

public class LatihanDasarFor {
	
	/*
	 * statement for adalah statement untuk pengulangan yang terukur
	 * kata kunci terukur menggunakan kata dari, sampai, sebanyak atau hingga
	 * 
	 * for (start; syarat berulang; inc/dec) {
	 * 		statement yang berulang selama memenuhi syarat
	 * }
	 * 
	 * menampilkan hello world sebanyak 10x
	 * 1. start = sebanyak 10x -> 1 sampai 10, start dari 1
	 * 2. finish = 10, sehingga akan berulang selama <=10
	 * 3. inc/dec = 1 -> 10 , ++
	 * 
	 * harus perhatikan apakah pengulangan positif atau negatif
	 * positif, jika start < finish. sehingga prosesnya adalah ++
	 * negatif, jika start > finish. sehingga prosesnya adalah --
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int a = 1; a <= 10; a++) {
			System.out.println("Hello World "+ a);
		}
		
		System.out.println("-------------------");
		
		for (int b = 10; b >= 1; b--) {
			System.out.println("Hello World "+ b);
		}
	}
}