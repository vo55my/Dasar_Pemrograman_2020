package latihan.uas.daspro2020;

import java.util.Scanner;

public class BilanganBulat {

	static Scanner sc = new Scanner(System.in);
	static int a, b;
	
	public static void bilanganBulat () {
		System.out.print("Masukkan Bilangan Bulat a : ");
		a = sc.nextInt();
		System.out.print("Masukkan Bilangan Bulat b : ");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println("Nilai a Lebih Besar dari Nilai b");
		} else if (b > a) {
			System.out.println("Nilai b Lebih Besar dari Nilai a");
		} else if (a == b) {
			System.out.println("Nilai a Sama Dengan Nilai b");
		} else {
			System.out.println("Nilai tidak termasuk bilangan bulat");
		}
	}
	
	public static void main (String [] args) {
		bilanganBulat();
	}
}