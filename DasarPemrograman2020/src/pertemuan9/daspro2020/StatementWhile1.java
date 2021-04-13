package pertemuan9.daspro2020;

import java.util.Scanner;

public class StatementWhile1 {

	/*
	 * Program yang akan memunculkan bilangan bulat selama bilangan tersebut bukan 99
	 * Statement while
	 * Pengulangan yang tidak terprediksi kapan berakhir pengulangannya
	 * karena tidak terukur seperti statement for
	 * format : 
	 * while (syaratBerulang) {
	 * 		statement yang dieksekusi berulang
	 * 		baris statement yang memungkinkan syarat tidak terpenuhi
	 * }
	 * 
	 * variable int
	 * 
	 * berulang selama bil !=99
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int bilangan = sc.nextInt();
		
		while (bilangan != 99) {
			System.out.println(bilangan);
			bilangan = sc.nextInt();		
		}
	}
}