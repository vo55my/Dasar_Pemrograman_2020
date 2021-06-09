package pertemuan5.daspro2020;

import java.util.Scanner;

public class ElseIfStatement {

	public static void main (String [] args) {
		
		/*
		 * Kita akan mempelajari multi cause effect, biasa disebut else if statement
		 * Formatnya adalah :
		 * if (boolean1) {
		 *  Statement true1
		 *  } else if (boolean2) {
		 *  Statement true2
		 *  } else if (boolean3) {
		 *  Statement true3
		 *  } ... boolean ke-n
		 *  
		 *  Kita akan buat program indeks nilai
		 *  Jika nilai >= 80 hasilnya A
		 *  >= 65 B
		 *  >= 50 C
		 *  >= 35 D
		 *  else E
		 */
		
		Scanner sc = new Scanner(System.in);
		int nilai = sc.nextInt();
		
		if (nilai >= 80) {
			System.out.println("A");
		} else if (nilai >= 65) {
			System.out.println("B");
		} else if (nilai >= 50) {
			System.out.println("C");
		} else if (nilai >= 35) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}