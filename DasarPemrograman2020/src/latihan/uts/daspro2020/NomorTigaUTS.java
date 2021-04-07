package latihan.uts.daspro2020;

import java.util.Scanner;

public class NomorTigaUTS {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int golongan = 0;
		double tunjangan = 0.02;
		
		System.out.print("Masukkan Golongan : ");
		golongan = sc.nextInt();
		
		switch (golongan) {
		case 1:
			System.out.println("Golongan 1 dengan gaji pokok Rp. 2.000.000 mendapatkan bonus Rp. 0, totalnya adalah : " + (2000000 * tunjangan + 0));
			break;
		case 2:
			System.out.println("Golongan 2 dengan gaji pokok Rp. 2.500.000 mendapatkan bonus Rp. 100.000, totalnya adalah : " + (2500000 * tunjangan + 100000));
			break;
		case 3:
			System.out.println("Golongan 3 dengan gaji pokok Rp. 3.000.000 mendapatkan bonus Rp. 200.000, totalnya adalah : " + (3000000 * tunjangan + 200000));
			break;
		case 4:
			System.out.println("Golongan 4 dengan gaji pokok Rp. 4.000.000 mendapatkan bonus Rp. 300.000, totalnya adalah : " + (4000000 * tunjangan + 300000));
			break;
		default:
			System.out.println("Bukan Golongan");
			break;
		}
	}
}