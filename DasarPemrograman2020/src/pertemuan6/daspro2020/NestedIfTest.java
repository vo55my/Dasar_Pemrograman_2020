package pertemuan6.daspro2020;

import java.util.Scanner;

public class NestedIfTest {

	public static void main (String [] args) {
		
		/*
		 * Nested if merupakan pembuatan if dengan multi-level pengkondisian
		 * Dengan kata lain bagaimana membuat pengkondisian didalam suatu pengkondisian
		 * Contoh :
		 * if (Syarat_1) {
		 * 
		 * 		if (Syarat_2) {
		 * 			Statement true;
		 * 		} else {
		 * 			Statement false;
		 * 		}
		 * } else {
		 * 		Statement false;
		 * }
		 */
		
		Scanner sc = new Scanner(System.in);
		int bilangan = sc.nextInt();
		System.out.print("Masukan nilai diantara 0-100 : ");
		if ((bilangan >= 0) && (bilangan <= 100)) { // Seleksi bilangan 0-100
			if (bilangan % 2 == 0) { // Modulus (sisa bagi) -> jika habis = Genap
				System.out.println("Bilangan Genap");
			} else { // Jika tidak habis sisa baginya -> Ganjil
				System.out.println("Bilangan Ganjil");
			}
		} else { // Jika tidak termasuk
			System.out.println("Bukan bilangan bulat 0-100");
		}
	}
}