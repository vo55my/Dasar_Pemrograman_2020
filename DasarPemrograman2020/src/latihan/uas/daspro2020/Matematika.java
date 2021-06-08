package latihan.uas.daspro2020;

import java.util.Scanner;

public class Matematika {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai : ");
		int nilai = sc.nextInt();
		
		for (int i = 0; i <= nilai; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("0");
			}
			System.out.println();
		}
	}
}