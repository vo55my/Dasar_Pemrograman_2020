package latihan.uas.daspro2020;

import java.util.Scanner;

public class NilaiAkhir {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Jumlah Mahasiswa : ");
        int n = sc.nextInt();
        System.out.println();
        
        for (int a = 1; a <= n; a++) {
        System.out.print("NRP : ");
		String nrp = sc.next();
		System.out.print("Nilai UTS : ");
		double uts = sc.nextDouble();
		System.out.print("Nilai UAS : ");
		double uas = sc.nextDouble();
		System.out.print("Nilai Praktikum : ");
		double praktikum = sc.nextDouble();
		System.out.print("Nilai Tugas : ");
		double tugas = sc.nextDouble();
		
		double nilai = hitungNilaiAkhir(uts, uas, praktikum, tugas);
		System.out.println();
		System.out.println("NRP : " + nrp);
		System.out.println("Nilai UTS : " + uts);
		System.out.println("Nilai UAS : " + uas);
		System.out.println("Nilai Praktikum : " + praktikum);
		System.out.println("Nilai Tugas : " + tugas);
		System.out.print("Nilai Akhir = " + nilai + "\n Sehingga menghasilkan index ");
		hitungGrade(nilai);
		System.out.println();
        }
	}
	
	public static double hitungNilaiAkhir (double uts, double uas, double praktikum, double tugas) {
		double nilai = (uts * 30/100) + (uas * 30/100) + (praktikum * 25/100) + (tugas * 15/100);
		
		return nilai;
	}
		
	public static void hitungGrade (double nilai) {
		if (nilai >= 85) {
			System.out.println("A");
		} else if (nilai >= 70) {
			System.out.println("B");
		} else if (nilai >= 55) {
			System.out.println("C");
		} else if (nilai >= 30) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}
}