package pertemuan11.daspro2020;

import java.util.Scanner;

public class LatihanMethodParameter {

	//Variabel global = variabel yang berada di dalam kelas tapi di luar main/method
	static int c;
	
	/*
	 * Subprogram biasa disebut juga dengan nama method
	 * bagian logika program yang dipecah menjadi bagian-bagian terpisah, sesuai dengan perannya
	 * Subprogram memiliki dua macam yaitu
	 * procedure
	 * bersifat introvert
	 * hasil dari proses yang dilakukan hanya akan dimunculkan dalam dirinya sendiri
	 * 
	 * function
	 * bersifat ekstrovert
	 * hasilnya akan diserahkan ke pemanggil
	 * 
	 * format memiliki kesamaan
	 * 
	 * public static [tipedata] [namaMethod] () {
	 * 		return value; hanya untuk function
	 * }
	 * 
	 * tipedata jika procedure pasti akan menggunakan void, yang berarti kosong
	 * sehingga procedure tidak menggunakan return value
	 * 
	 * function menggunakan tipedata yang umum, contohnya adalah String, int dkk-
	 * sehingga menggunakan return value
	 * 
	 * parameter adalah variabel yang berfungsi sebagai media pengirim nilai dari pemanggil ke procedure/function
	 */
	
	//procedure penjumlahan (procedure)
	public static void oprPenjumlahan (int bil1, int bil2) {	
		c = bil1 + bil2;
		System.out.println("Hasil : " + c);
	}
	
	public static void main (String [] args) {
	//variabel yang ada disini merupakan variabel lokal main
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		oprPenjumlahan(a,b);
		int hasil = oprPengurangan(a,b);
		System.out.println(hasil);
	}
	
	//procedure pengurangan (function)
	public static int oprPengurangan (int a, int b) {
		c = a - b;
		return c;
	}
}