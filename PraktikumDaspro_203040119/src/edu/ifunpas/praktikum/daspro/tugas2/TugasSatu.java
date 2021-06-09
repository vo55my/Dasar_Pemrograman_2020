package edu.ifunpas.praktikum.daspro.tugas2;

import java.util.Scanner;

public class TugasSatu {

	public static void main (String [] args) {
		// Program dengan bahasa java untuk menghitung luas lingkaran dengan jari-jari diinputkan melalui keyboard.
		
        Scanner sc = new Scanner(System.in);
        float phi, r, L, K;
        phi = (float) 3.14;
        
        System.out.print("Masukkan panjang jari - jari (cm) : ");
        r = sc.nextInt();
        
        L = phi * r * r;
        K = phi * r * 2;
        System.out.println("Luas = " + L + " cm");
        System.out.println("Keliling = " + K + " cm");
    }
}