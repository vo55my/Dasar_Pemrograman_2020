package latihan.uts.daspro2020;

import java.util.Scanner;

public class NomorDua {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kehadiran : ");
		int kehadiran = sc.nextInt();
		System.out.print("Nilai Akhir : ");
		int nilaiAkhir = sc.nextInt();
		
		if ((kehadiran >= 0) && (kehadiran <= 100)) {
			if (kehadiran >= 70) {
				if ((nilaiAkhir >= 0) && (nilaiAkhir <= 100)) {
					if (nilaiAkhir > 80) {
						System.out.println("Anda Mendapat A");
					} else if (nilaiAkhir > 65) {
						System.out.println("Anda Mendapat B");
					} else if (nilaiAkhir > 50) {
						System.out.println("Anda Mendapat C");
					} else if (nilaiAkhir > 35) {
						System.out.println("Anda Mendapat D");
					}
				}
			} else {
				System.out.println("Anda Mendapat E");
			}
		} else {
			System.out.println("Bilangan diluar himpunan 0 - 100");
		}
	}
}