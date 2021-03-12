package pertemuan2.daspro2020;

import java.util.Scanner;

public class LatihanOperasiBoolean {

	public static void main (String [] args) {
		// Untuk int
		
		Scanner sc = new Scanner(System.in);
/*		int a, b;
		System.out.println("Masukan Nilai A : ");
		a=sc.nextInt();
		System.out.println("Masukan Nilai B : ");
		b=sc.nextInt();
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
*/		
		// Untuk String
		String huruf1, huruf2;
		System.out.println("Masukan Huruf 1 : ");
		huruf1=sc.next();
		System.out.println("Masukan Huruf 2 : ");
		huruf2=sc.next();
		
		// Penggunaan ignoreCase perlu diperhatikan, apakah perlu membedakan huruf besar dan kecil
		System.out.println(huruf1.compareToIgnoreCase(huruf2)<0);
		System.out.println(huruf1.compareTo(huruf2)<0);
		System.out.println(huruf1.compareToIgnoreCase(huruf2)>0);
		System.out.println(huruf1.compareTo(huruf2)>0);
		System.out.println(huruf1.equalsIgnoreCase(huruf2));
		System.out.println(huruf1.equals(huruf2));
		System.out.println(!huruf1.equalsIgnoreCase(huruf2));
		System.out.println(!huruf1.equals(huruf2));
	}
}