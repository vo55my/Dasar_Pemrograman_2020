package latihan.uas.daspro2020;

import java.util.Scanner;

public class NilaiUTS {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Masukkan Nilai : ");
		int nilai = sc.nextInt();
	
		if (nilai >= 0 && nilai <= 100) {
			System.out.println("YA");
		} else {
			System.out.println("TIDAK");
		}	
	}
}