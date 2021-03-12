package pertemuan6.daspro2020;

import java.util.Scanner;

public class TernaryTest {

	public static void main (String [] args) {
		/*
		 * Ternary biasanya digunakan sebagai statement pengganti if-else
		 * Merupakan satu baris logical yang menghasilkan dua kemungkinan
		 * Formatnya adalah : 
		 * [variabel_penampung_hasil] = [syarat] ? [true statement] : [false_statement]
		 * Sehingga jika kita memiliki if-else seperti berikut
		 * 
		 * if (Expression1) {
		 * 	variabel = Expression2;
		 * } else {
		 * 	variabel = Expression3;
		 * }
		 * 
		 * Maka Ternary nya menjadi 
		 * variabel = Expression1 ? Expression2 : Expression3
		 */
		
		Scanner sc = new Scanner(System.in);
		int nilai = sc.nextInt();
		String kelulusan = (nilai > 65) ? "Lulus" : "Tidak Lulus";
		System.out.println(kelulusan);
	}
}