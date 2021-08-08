package latihan.uas.daspro2020;

import java.util.Scanner;

public class Segitiga {

	double alas, tinggi;
	
	void BacaSegitiga () {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan Alas : ");
		alas = sc.nextDouble();
		System.out.print("Masukkan Tinggi : ");
		tinggi = sc.nextDouble();
	}
	
	void TulisSegitiga () {
		System.out.println("Alas : " + alas + " , Tinggi : " + tinggi);
	}
	
	double Luas() {
		double Luas = 1/2 * alas * tinggi;
		return Luas;
	}
}